package model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="canton")
public class Canton extends AbstractEntity {


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
@Column(name="code")
	private int code ;

@Column(name="libelle")	
	private String libelle;

@ManyToOne
@JoinColumn(name= "idCommune")
	private Commune commune ;

@OneToMany(mappedBy="Canton")
	private List<Etablissement> etablissement;
}
