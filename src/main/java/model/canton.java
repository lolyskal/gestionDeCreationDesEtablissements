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
@Table(name="Canton")
public class canton extends AbstractEntity {


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(name="code")
	private int code ;

@Column(name="libelle")	
	private String libelle;

@ManyToOne
@JoinColumn(name= "idCommune")
	private commune Commune ;

@OneToMany(mappedBy="Canton")

	private List<etablissement> Etablissement;
}
