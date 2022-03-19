package ec.edu.paralelo.hilos.paralelo;

import java.util.List;

public class CajeroHilo {

    private String nombre;
    private List<Integer> clientes;

   
    

    public CajeroHilo() {
		
	}

	public CajeroHilo(String nombre, List<Integer> clientes) {
        this.nombre = nombre;
        this.clientes = clientes;
    }

    //Metodos Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getClientes() {
        return clientes;
    }

    public void setClientes(List<Integer> clientes) {
        this.clientes = clientes;
    }
	
	
}
