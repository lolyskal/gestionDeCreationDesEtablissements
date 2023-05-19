package DTO;


import java.util.List;

import lombok.Builder;
import lombok.Data;

import model.Etablissement;


@Builder
@Data
public class CantonDTo {
	
	private Integer id;
	
	private int code ;
	
	private String libelle;

	private CommuneDTo commune ;

	private List<EtablissementDTo> etablissement ;
}