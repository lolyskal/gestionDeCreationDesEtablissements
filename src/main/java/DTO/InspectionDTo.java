package DTO;

import java.util.List;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class InspectionDTo {

	private Integer id;
	
	private int numero;

	private String libelle;

	private RegionEducativeDTo regionEducative;

	private List<EtablissementDTo> etablissement ;

}
