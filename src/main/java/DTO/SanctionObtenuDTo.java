package DTO;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SanctionObtenuDTo {

	private Integer id;
	
	private int date ;

	private String motif;

	private EtablissementDTo etablissement;

	private SanctionDTo sanction;

}
