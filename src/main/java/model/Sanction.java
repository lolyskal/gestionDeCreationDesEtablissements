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
@Table(name="sanction")
public class Sanction extends AbstractEntity {
	


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
@Column(name="code_Sanction")	
	private int code_Sanction;

@Column(name="libelle")
	private String libelle;

@OneToMany(mappedBy="sanction")
	private List<SanctionObtenu> sanctionObtenu;

}
