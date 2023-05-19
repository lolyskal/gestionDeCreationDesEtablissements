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
@Table(name="cycleEnseignement")
public class CycleEnseignement extends AbstractEntity{
	

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
@Column(name="code")
	private int code;

@Column(name="libelle")
	private String libelle ;

@ManyToOne
@JoinColumn(name="idEtablissement")
	private Etablissement etablissement;

}
