package ec.edu.service;

import java.util.concurrent.CompletableFuture;

public interface IProcesamientoFacultad {

	
	public Integer calcularDeuda(String cedula,Integer valor);
	public CompletableFuture<Integer> calcularDeudaFuture(String cedula, Integer valor);
	
}
