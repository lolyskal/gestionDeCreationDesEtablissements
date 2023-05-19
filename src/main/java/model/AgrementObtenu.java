package model;

import java.time.Instant;


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
@Table(name="agrementObtenu")
public class AgrementObtenu extends AbstractEntity {
	

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id	

@Column(name = "numero" )	
	private int numero ;
	
@Column(name ="date" )
	private Instant date ;
	
@Column(name = "nom_Ministre")
	private String nom_Ministre ;

@Column(name = "prenom_Ministre")
	private String prenom_Ministre ;

@Column(name = "num_Tel_Ministre")
	private int num_Tel_Ministre ;

@Column(name = "date_Fin_Agrement")
	private int date_Fin_Agrement ;

@ManyToOne 
@JoinColumn(name="IdFraisCycle")
	private FraisCycle fraisCyle ;

@ManyToOne 
@JoinColumn(name="IdAgrement")
	private  Agrement agrement ;

@ManyToOne 
@JoinColumn(name="IdEtablissement")
	private Etablissement etablissement ;

}
