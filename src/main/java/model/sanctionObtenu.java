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
@Table(name="SanctionObtenu")
public class sanctionObtenu extends AbstractEntity {


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(name="date")
	private int date ;

@Column(name="motif")
	private String motif;

@ManyToOne
@JoinColumn(name="IdEtablissement")
	private etablissement Etablissement;

@ManyToOne
@JoinColumn(name="idSanction")
	private sanction Sanction;

}
