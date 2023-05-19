package DTO;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class PenaliteObtenuDTo {
	
	private Integer id;
	
	private String type_Penalite;

	private int duree;

	private int montants;

	private PenaliteDTo penalite ;

	private EtablissementDTo etablissement ;

}
