package ec.edu.paralelo.hilos.paralelo;

import java.util.Arrays;


public class MainHilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long tiempoInicial = System.currentTimeMillis();
		

		CajeroHilo cajero1 = new CajeroHilo("Dennis", Arrays.asList(2,2,3,4,1));
		CajeroHilo cajero2 = new CajeroHilo("Javier", Arrays.asList(1,2,2));
		CajeroHilo cajero3 = new CajeroHilo("Lizeth", Arrays.asList(2,1,2,1));
		
		System.out.println("Hilo Principal: "+Thread.currentThread().getName());
		
		GestorAtencionHilo  gestor1 = new GestorAtencionHilo(cajero1,tiempoInicial);
		GestorAtencionHilo  gestor2 = new GestorAtencionHilo(cajero2,tiempoInicial);
		GestorAtencionHilo  gestor3 = new GestorAtencionHilo(cajero3,tiempoInicial);
		
		gestor1.start(); //procesar
		gestor2.start();
		gestor3.start();
		
		System.out.println("Hilo principal 2: "+Thread.currentThread().getName());
		
		long tiempoFinal = System.currentTimeMillis();
		
		long tiempoTranscurrido = (tiempoFinal-tiempoInicial)/1000;
		System.out.println(tiempoTranscurrido + "seg");
		System.out.println("Termino");
	}

	
	//programa 1 --- 38seg
	
}
