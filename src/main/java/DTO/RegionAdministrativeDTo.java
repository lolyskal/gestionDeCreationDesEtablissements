package DTO;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RegionAdministrativeDTo {

	private Integer id;
	
	private String libelle ;

	private String capital;

	private String chef_Lieu_Region ;

    private List<PrefectureDTo> prefecture;
}
