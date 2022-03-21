package ec.edu.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ProcesaminentoFacultadService implements IProcesamientoFacultad{

	private static final Logger LOG = LoggerFactory.getLogger(ProcesaminentoFacultadService.class);
	@Override
	@Async
	public Integer calcularDeuda(String cedula, Integer valor) {
		// TODO Auto-generated method stub
		LOG.info("prcesando: "+cedula);
		
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		LOG.info("Finalizo: " + cedula);
		return valor;
	}

	@Override
	@Async
	public CompletableFuture<Integer> calcularDeudaFuture(String cedula, Integer valor) {
		LOG.info("Procesando: " + cedula);
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		LOG.info("Finalizo: " + cedula);
		return CompletableFuture.completedFuture(valor);
	}

}
