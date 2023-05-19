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
@Table(name="penalite")
public class Penalite extends AbstractEntity{



/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
@Column(name="type_Penalite ")
	private String type_Penalite ;

@Column(name="duree")
	private int duree ;

@Column(name="montants")
	private int montants;

@OneToMany(mappedBy="penalite")
	private List<PenaliteObtenu> penalite_Obtenu;
}
