package ec.edu.uce.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {


    @Id
    @Column(name = "paci_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_paciente")
    @SequenceGenerator(name= "sec_paciente", sequenceName = "sec_paciente", allocationSize = 1)
	private Integer id;
    @Column(name = "paci_cedula")
	private String cedula;
    @Column(name = "paci_nombre")
	private String nombre;
    @Column(name = "paci_apellido")
	private String apellido;
    @Column (name = "paci_genero")
	private String genero;
    @Column(name = "paci_numero_iess")
	private String numeroIess;
    
    
    //MEtodos set y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNumeroIess() {
		return numeroIess;
	}
	public void setNumeroIess(String numeroIess) {
		this.numeroIess = numeroIess;
	}
	
    //
    
    
	
}