package DTO;

import java.time.Instant;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AgrementObtenuDTo {

	
	private Integer id;
	
	private int numero ;
	
	private Instant date ;

	private String nom_Ministre ;

	private String prenom_Ministre ;

	private int num_Tel_Ministre ;

	private int date_Fin_Agrement ;

	private FraisCycleDTo fraisCyle ;

	private  AgrementDTo agrement ;
	
	private EtablissementDTo etablissement ;

}
