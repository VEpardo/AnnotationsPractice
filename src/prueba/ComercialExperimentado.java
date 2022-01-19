package prueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {

	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		super();
		this.nuevoInforme = nuevoInforme;
	}

	@Override
	public String getTareas() {
		return "Vender";
	}

	@Override
	public String getInforme() {
		//return "Informe generado por el comercial";
		
		return nuevoInforme.getInformeFinanciero();
	}
	
	
	private CreacionInformeFinanciero nuevoInforme;

}
