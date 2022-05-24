package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bebe_medico")
public class Bebe_Medico {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "BebeID_Bebe")
	@NotNull
	Bebe BebeID_Bebe;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "MedicoCRM")
	@NotNull
	Medico MedicoCRM;
}
