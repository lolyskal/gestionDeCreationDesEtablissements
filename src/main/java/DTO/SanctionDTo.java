package DTO;

import java.util.List;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class SanctionDTo {
	
	private Integer id;
	
	private int code_Sanction;

	private String libelle;

	private List<SanctionObtenuDTo> sanctionObtenu;
}
