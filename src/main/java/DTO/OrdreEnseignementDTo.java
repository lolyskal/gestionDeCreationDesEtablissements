package DTO;

import java.util.List;


import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;
import model.Etablissement;


@Builder
@Data
public class OrdreEnseignementDTo {

	private Integer id;
	
	private int numero ;

	private String libelle ;

	private List<EtablissementDTo> etablissement ;
	

}
