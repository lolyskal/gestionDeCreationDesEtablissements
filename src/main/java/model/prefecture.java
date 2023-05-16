package model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="Prefecture")
public class prefecture extends AbstractEntity {



/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(name="libelle")
	private String libelle ;

@Column(name="chef_Lieu")
	private String chef_Lieu;

@ManyToOne
@JoinColumn(name="idRegionAdministrative")
	private regionAdministrative RegionAdministrative;

@OneToMany(mappedBy ="Prefecture")
   	private List<commune> Commune;
   	

}
