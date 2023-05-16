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
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="Agrement")
public class agrement extends AbstractEntity {
	


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(name= "code")	
	private int code ;

@Column(name= "numero_Agrement")
	private int numero_Agrement ;

@Column(name= "libelle")
	private String libelle ;

@Column(name= "duree")
	private int duree ;

@OneToMany(mappedBy="Agrement")	
	private List<agrementObtenu> AgrementObtenu ;

}
