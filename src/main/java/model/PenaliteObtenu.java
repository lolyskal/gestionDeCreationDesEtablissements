package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true )
@Entity
@Table(name="penaliteObtenu")
public class PenaliteObtenu extends AbstractEntity {



/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
@Column(name="type_Penalite")
	private String type_Penalite;

@Column(name="duree")
	private int duree;

@Column(name="montants")
	private int montants;

@ManyToOne
@JoinColumn(name="IdPenalite")
	private Penalite penalite ;

@ManyToOne
@JoinColumn(name="IdEtablissement")
	private Etablissement etablissement ;

}
