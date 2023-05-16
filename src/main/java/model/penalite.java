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
@Table(name="Penalite")
public class penalite extends AbstractEntity{



/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(name="type_Penalite ")
	private String type_Penalite ;

@Column(name="duree")
	private int duree ;

@Column(name="montants")
	private int montants;

@OneToMany(mappedBy="penalite")
	private List<penaliteObtenu> Penalite_Obtenu;
}
