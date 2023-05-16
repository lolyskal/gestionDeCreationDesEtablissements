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
@Table(name="FraisCyle")
public class fraisCycle extends AbstractEntity{


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(name="code")
	private int code ;

@Column(name="libelle")	
	private String libelle ;

@Column(name="prix_Cycle_Enseignemant")	
	private String prix_Cycle_Enseignemant;

@OneToMany(mappedBy="FraisCyle")

	private List<agrementObtenu> AgrementObtenu; 
}
