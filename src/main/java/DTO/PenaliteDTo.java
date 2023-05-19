package DTO;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PenaliteDTo {

	private Integer id;
	
	private String type_Penalite ;

	private int duree ;

	private int montants;

	private List<PenaliteObtenuDTo> penalite_Obtenu;
}
