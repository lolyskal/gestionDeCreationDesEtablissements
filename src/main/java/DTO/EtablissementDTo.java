package DTO;

import java.util.List;



import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EtablissementDTo {
	
	private Integer id;

	private String nom_Etablissement ;
	
	private String type_Etablissement;
	
	private String nom_Promoteur ;
	

	private String prenom_Promoteur;
	
	private String type_Promoteur ;
	
    private int num_Tel_Promoteur ; 
    
    private String address_Promoteur;
    
    private String email_Promoteur ;
    
    private int superficie_Etablissement;
    
    private int nombre_Batiment;
    
    private int nombre_En_Dur;
    
    private String nature_Batiment ;
    
    private int nombre_Classe;
    
    private int nombre_Eleve ;
    
    private int nombre_Enseignant_Vacataire ;
    
    private int nombre_Enseignant_Permanent ;
    
    private int nombre_Enseignant_Contractuel ;
    
    private int nombre_Total_Enseignant ;
    
    private int nombre_Atelier ;
    
    private int nombre_Laboratoire ;
    
    private int nombre_Salle_Machine;
    
    private int nombre_Filliere;
    
    
    private OrdreEnseignementDTo ordreEnseignement;
    
    private List<CycleEnseignementDTo> cycleEnseignement;
    
	private CantonDTo Canton;

	private InspectionDTo inspection ;

	private List<PenaliteObtenuDTo> penaliteObtenu;
    	
	private List<SanctionObtenuDTo> sanctionObtenu;
		
	private List<AgrementObtenuDTo> agrementObtenu;
}
