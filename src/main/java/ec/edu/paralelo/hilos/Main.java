package ec.edu.paralelo.hilos;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long tiempoInicial = System.currentTimeMillis();
		

		Cajero cajero1 = new Cajero("Dennis", Arrays.asList(1,2,3,4,5));
		Cajero cajero2 = new Cajero("Javier", Arrays.asList(1,1,3,4,5));
		Cajero cajero3 = new Cajero("Lizeth", Arrays.asList(1,2,2,4,5));
		
		
		
		GestorAtencion  gestor1 = new GestorAtencion();
		GestorAtencion  gestor2 = new GestorAtencion();
		GestorAtencion  gestor3 = new GestorAtencion();
		
		gestor1.procesar(cajero1,tiempoInicial);
		gestor2.procesar(cajero2,tiempoInicial);
		gestor3.procesar(cajero3,tiempoInicial);
		
		long tiempoFinal = System.currentTimeMillis();
		
		long tiempoTranscurrido = (tiempoFinal-tiempoInicial)/1000;
		System.out.println(tiempoTranscurrido + "seg");
		
		
	}

}
