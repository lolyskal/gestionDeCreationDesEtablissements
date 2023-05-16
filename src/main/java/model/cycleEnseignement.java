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
@Table(name="CycleEnseignement")
public class cycleEnseignement extends AbstractEntity{
	

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(name="code")
	private int code;

@Column(name="libelle")
	private String libelle ;

@ManyToOne
@JoinColumn(name="idEtablissement")
	private etablissement Etablissement;

}
