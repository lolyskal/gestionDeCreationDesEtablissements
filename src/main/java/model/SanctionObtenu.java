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
@Table(name="sanctionObtenu")
public class SanctionObtenu extends AbstractEntity {


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
@Column(name="date")
	private int date ;

@Column(name="motif")
	private String motif;

@ManyToOne
@JoinColumn(name="IdEtablissement")
	private Etablissement etablissement;

@ManyToOne
@JoinColumn(name="idSanction")
	private Sanction sanction;

}
