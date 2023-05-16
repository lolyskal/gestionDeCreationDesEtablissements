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
@Table(name="Sanction")
public class sanction extends AbstractEntity {
	


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(name="code_Sanction")	
	private int code_Sanction;

@Column(name="libelle")
	private String libelle;

@OneToMany(mappedBy="Sanction")

	private List<sanctionObtenu> SanctionObtenu;

}
