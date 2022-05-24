package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bebe")
public class Bebe {
	
	@Id
	@Column(name = "cpf_bebe", length = 11)
	@NotNull
	private String cpf_bebe;
	
	@Column(name = "nome" , length = 60)
	@NotNull
	private String nome;
	
	@Column(name = "data_nasc")
	@NotNull
	private LocalDate data_nasc;
	
	@Column(name = "altura")
	@NotNull
	private long altura;
	
	@ManyToOne(targetEntity = Mae.class)
	@JoinColumn(name= "cpf_mae")
	@NotNull
	private Mae maeID_Mae;
	
	public String getId_bebe() {
		return cpf_bebe;
	}
	public void setId_bebe(String cpf_bebe) {
		this.cpf_bebe = cpf_bebe;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(LocalDate data_nasc) {
		this.data_nasc = data_nasc;
	}
	public long getAltura() {
		return altura;
	}
	public void setAltura(long altura) {
		this.altura = altura;
	}
	public Mae getMaeID_Mae() {
		return maeID_Mae;
	}
	public void setMaeID_Mae(Mae maeID_Mae) {
		this.maeID_Mae = maeID_Mae;
	}
	
	@Override
	public String toString() {
		return "Bebe [id_bebe=" + cpf_bebe + ", nome=" + nome + ", data_nasc=" + data_nasc + ", altura=" + altura
				+ ", maeID_Mae=" + maeID_Mae + "]";
	}

	
	
}
