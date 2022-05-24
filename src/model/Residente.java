package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "residente")
public class Residente extends Medico{
	
//	@Id
//	@OneToOne
//	@JoinColumn(name = "crm")
//	@NotNull
//	private String medicoCRM;
	
	@Column(name="instituicao_Ensino", length = 50)
	@NotNull
	private String instituicao_Ensino;
	
	@Column(name="ano_ingresso")
	@NotNull
	private int ano_ingresso;
	
	
	
//	public String getMedicoCRM() {
//		return medicoCRM;
//	}
//
//	public void setMedicoCRM(String medicoCRM) {
//		this.medicoCRM = medicoCRM;
//	}

	public String getInstituicao_Ensino() {
		return instituicao_Ensino;
	}



	public void setInstituicao_Ensino(String instituicao_Ensino) {
		this.instituicao_Ensino = instituicao_Ensino;
	}

	public int getAno_ingresso() {
		return ano_ingresso;
	}

	public void setAno_ingresso(int ano_ingresso) {
		this.ano_ingresso = ano_ingresso;
	}

	@Override
	public String toString() {
		return "Residente [medicoCRM=" + ", Instituicao_Ensino=" + instituicao_Ensino + ", ano_ingresso="
				+ ano_ingresso + "]";
	}
}
