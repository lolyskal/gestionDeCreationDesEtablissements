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
@Table(name="regionAdministrative")
public class RegionAdministrative extends AbstractEntity {



/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
@Column(name="libelle")
	private String libelle ;

@Column(name="capital")
	private String capital;

@Column(name="chef_Lieu_Region")
	private String chef_Lieu_Region ;

@OneToMany(mappedBy="regionAdministrative")
private List<Prefecture> prefecture;



}
