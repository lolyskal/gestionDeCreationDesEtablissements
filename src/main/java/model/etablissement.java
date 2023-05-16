package model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name="Etablisement")
public class etablissement extends AbstractEntity {
	

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(name="nom_Etablissement")
	private String nom_Etablissement ;
	
@Column(name="type_Etablissement")
	private String type_Etablissement;
	
@Column(name="nom_Promoteur")
	private String nom_Promoteur ;
	
@Column(name=" prenom_Promoteur")
	private String prenom_Promoteur;
	
@Column(name="type_Promoteur ")
	private String type_Promoteur ;
	
@Column(name="num_Tel_Promoteur ")
    private int num_Tel_Promoteur ; 
    
@Column(name="address_Promoteur")
    private String address_Promoteur;
    
@Column(name="email_Promoteur")
    private String email_Promoteur ;
    
@Column(name="superficie_Etablissement")
    private int superficie_Etablissement;
    
@Column(name="nombre_Batiment")
    private int nombre_Batiment;
    
@Column(name="nombre_En_Dur")
    private int nombre_En_Dur;
    
@Column(name="nature_Batiment")
    private String nature_Batiment ;
    
@Column(name="nombre_Classe")
    private int nombre_Classe;
    
@Column(name="nombre_Eleve")
    private int nombre_Eleve ;
    
@Column(name="nombre_Enseignant_Vacataire")
    private int nombre_Enseignant_Vacataire ;
    
@Column(name="nombre_Enseignant_Permanent")
    private int nombre_Enseignant_Permanent ;
    
@Column(name="nombre_Enseignant_Contractuel")
    private int nombre_Enseignant_Contractuel ;
    
@Column(name="nombre_Total_Enseignant")
    private int nombre_Total_Enseignant ;
    
@Column(name="nombre_Atelier")
    private int nombre_Atelier ;
    
@Column(name="nombre_Laboratoire")
    private int nombre_Laboratoire ;
    
@Column(name="nombre_Salle_Machine")
    private int nombre_Salle_Machine;
    
@Column(name="nombre_Filliere")
    private int nombre_Filliere;
    
    
@ManyToOne 
@JoinColumn(name="idOrdreEnseignement")
    private ordreEnseignement OrdreEnseignement;
    
@OneToMany(mappedBy="Etablissement")
    private List<cycleEnseignement> CycleEnseignement;
    
@ManyToOne 
@JoinColumn(name="idCanton")
	private canton Canton;

@ManyToOne 
@JoinColumn(name="idInspection")
	private inspection Inspection ;

@OneToMany(mappedBy="Etablissement")
	private List<penaliteObtenu> PenaliteObtenu;
    
@OneToMany(mappedBy="Etablissement")	
	private List<sanctionObtenu> SanctionObtenu;
	
@OneToMany(mappedBy="Etablissement")	
	private List<agrementObtenu> AgrementObtenu;	
}

