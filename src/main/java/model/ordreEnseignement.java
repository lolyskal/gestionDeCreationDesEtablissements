package model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true )
@Entity
@Table(name="OrdreEnseignement")
public class ordreEnseignement extends AbstractEntity {
	

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(name = "numero" )
	private int numero ;

@Column(name = "libelle" )
	private String libelle ;

@OneToMany(mappedBy="OrdreEnseignement")
	private List<etablissement> Etablissement ;
	
	
		

}
