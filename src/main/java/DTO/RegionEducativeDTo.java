package DTO;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RegionEducativeDTo {
	
	private Integer id;
	
	private String libelle;
	
	private String zone_Couverture; 

	private String chef_Lieu;
	
	private List<InspectionDTo>inspection;
}
