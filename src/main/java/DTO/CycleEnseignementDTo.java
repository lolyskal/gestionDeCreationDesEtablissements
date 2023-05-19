package DTO;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CycleEnseignementDTo {
	
	private Integer id;
	
	private int code;

	private String libelle ;


	private EtablissementDTo etablissement;

}
