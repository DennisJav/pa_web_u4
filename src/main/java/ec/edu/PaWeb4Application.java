package ec.edu;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import ec.edu.service.IProcesamientoFacultad;
import ec.edu.service.ProcesaminentoFacultadService;

@SpringBootApplication
@EnableAsync
public class PaWeb4Application implements CommandLineRunner{

	
	private static final Logger LOG = LoggerFactory.getLogger(PaWeb4Application.class);

	
	@Autowired
	private IProcesamientoFacultad procesamientoFacultad;
	
	public static void main(String[] args) {
		SpringApplication.run(PaWeb4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		long inicio = System.currentTimeMillis();

//		Integer valor1 = this.procesamientoFacultad.calcularDeuda("123123", 4);
//		Integer valor2 = this.procesamientoFacultad.calcularDeuda("12323", 4);
//		Integer valor3 = this.procesamientoFacultad.calcularDeuda("12313", 4);
//		Integer valor4 = this.procesamientoFacultad.calcularDeuda("12123", 4);
		
		
		CompletableFuture<Integer> valor1 = this.procesamientoFacultad.calcularDeudaFuture("123", 4);
		CompletableFuture<Integer> valor2 = this.procesamientoFacultad.calcularDeudaFuture("133", 4);
		CompletableFuture<Integer> valor3 = this.procesamientoFacultad.calcularDeudaFuture("144", 4);
		CompletableFuture<Integer> valor4 = this.procesamientoFacultad.calcularDeudaFuture("157", 4);
		
		CompletableFuture.allOf(valor1, valor2, valor3, valor4).join();
		
		LOG.info("Valor1: " + valor1);
		LOG.info("Total: " + (valor1.get() + valor2.get() + valor3.get() + valor4.get()));
		long tFinal = System.currentTimeMillis();
		long tiempoTrancurrido = (tFinal - inicio) / 1000;
		LOG.info(tiempoTrancurrido + " Seg");
	}
	
	
	
	

}
