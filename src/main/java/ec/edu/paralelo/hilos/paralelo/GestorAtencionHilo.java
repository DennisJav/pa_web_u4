package ec.edu.paralelo.hilos.paralelo;

import java.util.concurrent.TimeUnit;

import ec.edu.paralelo.hilos.Cajero;

public class GestorAtencionHilo extends Thread{

	//identifico el proceso que quiero paralelizar 
	//establecer que los proceso se ejecutan en hilos dif
	private CajeroHilo cajero;
	private long tiempoInicial;
	
	public GestorAtencionHilo(CajeroHilo cajero, long tiempoInicial) {
		super();
		this.cajero = cajero;
		this.tiempoInicial = tiempoInicial;
	}
	
	@Override
	public void run() {
		this.procesar(this.cajero, this.tiempoInicial);
	}

	public void procesar(CajeroHilo cajero, long tiempoInicial) {
		System.out.println("Iniciar atender cajero:  "+cajero.getNombre());
		for(Integer tiempo: cajero.getClientes()) {
		this.atenderCliente(tiempo);
		}
		System.out.println("Finaliazr atender cajero: "+cajero.getNombre());
		
		long tiempoTranscurrido = (System.currentTimeMillis()-tiempoInicial)/1000;
		System.out.println(tiempoTranscurrido + "seg de atencion por : "+cajero.getNombre());
		
		
	}
	
	private void atenderCliente(Integer tiempo) {
		System.out.println("Atendiendo a cliente: "+tiempo);
		System.out.println("Hilo: "+Thread.currentThread().getName());
		try {
			//se demora en la atencion
			TimeUnit.SECONDS.sleep(tiempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//sTreams maneja dde mejor manera las colecciones 
		//tiene mas herramientas
		//
		
	}


	
	
	
	
}
