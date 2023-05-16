package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true )
@Entity
@Table(name="PenaliteObtenu")
public class penaliteObtenu extends AbstractEntity {



/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(name="type_Penalite")
	private String type_Penalite;

@Column(name="duree")
	private int duree;

@Column(name="montants")
	private int montants;

@ManyToOne
@JoinColumn(name="IdPenalite")
	private penalite Penalite ;

@ManyToOne
@JoinColumn(name="IdEtablissement")
	private etablissement Etablissement ;

}
