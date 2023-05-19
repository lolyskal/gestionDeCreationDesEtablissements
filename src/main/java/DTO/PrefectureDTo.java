package DTO;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PrefectureDTo {

	
	private Integer id;
	
	private String libelle ;
	
	private String chef_Lieu;

	private RegionAdministrativeDTo regionAdministrative;

   	private List<CommuneDTo> commune;
   	
}
