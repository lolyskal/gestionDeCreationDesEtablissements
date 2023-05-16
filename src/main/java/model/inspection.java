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
@Table(name="RegionEducative")
public class inspection extends AbstractEntity{


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(name="numero")	
	private int numero;

@Column(name="libelle")
	private String libelle;

@ManyToOne
@JoinColumn(name="idRegionEducative")
	private regionEducative RegionEducative;

@OneToMany(mappedBy="inspection")
	private List<etablissement> Etablissement ;

}
