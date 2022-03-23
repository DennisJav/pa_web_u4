package ec.edu.uce.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Table(name = "estudiante")
@Entity
public class Estudiante {

    @Id
    @Column(name = "estu_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_estudiante")
    @SequenceGenerator(name= "sec_estudiante", sequenceName = "sec_estudiante", allocationSize = 1)
    private Integer id;

    @Column(name = "estu_nombre")
    private String nombre;

    @Column(name = "estu_apellido")
    private String apellido;

    
    
    
    public Estudiante() {

	}

	public Estudiante(Integer id, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	//Metodos GET y SET
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}