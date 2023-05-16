package model;

import java.time.Instant;

import org.apache.logging.log4j.util.Strings;

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
@Table(name="AgrementObtenu")
public class agrementObtenu extends AbstractEntity {
	

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(name = "numero" )	
	private int numero ;
	
@Column(name ="date" )
	private Instant date ;
	
@Column(name = "nom_Ministre")
	private Strings nom_Ministre ;

@Column(name = "prenom_Ministre")
	private Strings prenom_Ministre ;

@Column(name = "num_Tel_Ministre")
	private int num_Tel_Ministre ;

@Column(name = "date_Fin_Agrement")
	private int date_Fin_Agrement ;

@ManyToOne 
@JoinColumn(name="IdFraisCycle")
	private fraisCycle FraisCycle ;

@ManyToOne 
@JoinColumn(name="IdAgrement")
	private  agrement Agrement ;

@ManyToOne 
@JoinColumn(name="IdEtablissement")
	private etablissement Etablissement ;

}
