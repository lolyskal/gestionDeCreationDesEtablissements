package DTO;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import model.Agrement;

@Builder
@Data

public class AgrementDTo {
	
	private Integer id;
	private int code ;

	private int numero_Agrement ;

	private String libelle ;

	private int duree ;

	private List<AgrementObtenuDTo> agrementObtenu ;
	
	public AgrementDTo FromEntity(Agrement agrement) {
		
		if (agrement == null) {
			
			return null;
		// TODO throw an exception
		}
		
		return AgrementDTo.builder()
				.id(agrement.getId())
				.code(agrement.getCode())
				.numero_Agrement(agrement.getNumero_Argument())
				.libelle(agrement.getLibelle())
				.duree(agrement.getDuree())
				.builder();

	}

	private static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}

}
