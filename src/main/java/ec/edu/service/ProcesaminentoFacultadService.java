package ec.edu.service;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProcesaminentoFacultadService implements IProcesamientoFacultad{

	private static final Logger LOG = LoggerFactory.getLogger(ProcesaminentoFacultadService.class);
	
	@Override
	public Integer calcularDeuda(String cedula, Integer valor) {
		// TODO Auto-generated method stub
		LOG.info("prcesando: "+cedula);
		
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return valor;
	}

}
