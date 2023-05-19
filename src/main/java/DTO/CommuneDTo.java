package DTO;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CommuneDTo {

	private Integer id;
	
	private int no_Commune ;

	private String libelle ;

	private PrefectureDTo prefecture ;

	private List<CantonDTo> canton;

}
