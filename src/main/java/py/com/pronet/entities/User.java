package py.com.pronet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	private String appelido;
	
	public User() {
		
	}
	
	public User(String nombre, String appelido) {
		super();
		this.nombre = nombre;
		this.appelido = appelido;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAppelido() {
		return appelido;
	}

	public void setAppelido(String appelido) {
		this.appelido = appelido;
	}

	

}
