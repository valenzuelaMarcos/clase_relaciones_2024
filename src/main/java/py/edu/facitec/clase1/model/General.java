package py.edu.facitec.clase1.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;


//aplicacion de herencias para la persistencia

@MappedSuperclass
public abstract class General {
	
	
	@Id			    //para crear pk de la bd
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long id;

	
	//generar gett sett
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

		//generar tostring
	@Override
	public String toString() {
		return "General [id=" + id + "]";
	}
	
	

}
