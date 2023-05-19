package model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true )
@Entity
@Table(name="regionEducative")
public class RegionEducative extends AbstractEntity {
	

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
@Column(name="libelle")
	private String libelle;

@Column(name= "zone_Couverture")
	private String zone_Couverture; 

@Column(name= "chef_Lieu")
	private String chef_Lieu;

@OneToMany(mappedBy="regionEducative")
	private List<Inspection>inspection;

}
