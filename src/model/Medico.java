package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.InheritanceType;

@Entity
@Table(name = "medico")
@Inheritance(strategy = InheritanceType.JOINED)
public class Medico {
	
	@Id
	@Column(name = "crm")
	@NotNull
	private String crm;
	
	@Column(name = "nome")
	@NotNull
	private String nome;
	
	@Column(name = "telefone")
	@NotNull
	private String telefone;
	
	@Column(name = "especialidade")
	@NotNull
	private String especialidade;
	
	
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	@Override
	public String toString() {
		return "Medico [crm=" + crm + ", nome=" + nome + ", telefone=" + telefone + ", especialidade=" + especialidade
				+ "]";
	}

	
}
