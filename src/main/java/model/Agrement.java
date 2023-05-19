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
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="agrement")
public class Agrement extends AbstractEntity {
	


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id

@Column(name= "code")	
	private int code ;

@Column(name= "numero_Agrement")
	private int numero_Agrement ;

@Column(name= "libelle")
	private String libelle ;

@Column(name= "duree")
	private int duree ;

@OneToMany(mappedBy="agrement")	
	private List<AgrementObtenu> agrementObtenu ;

}
