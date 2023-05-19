package DTO;

import java.util.List;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class FraisCycleDTo {

	private Integer id;
	
	private int code ;
	
	private String libelle ;

	private String prix_Cycle_Enseignemant;

	private List<AgrementObtenuDTo> agrementObtenu; 
}
