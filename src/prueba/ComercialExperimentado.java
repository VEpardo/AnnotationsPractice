package prueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {

	public ComercialExperimentado() {
		
	}
	
//	@Autowired
//	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
//		super();
//		this.nuevoInforme = nuevoInforme;
//	}

//	@Autowired
//	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}

	@Override
	public String getTareas() {
		return "Vender";
	}

	@Override
	public String getInforme() {
		//return "Informe generado por el comercial";
		
		return nuevoInforme.getInformeFinanciero();
	}
	
	@Autowired
	private CreacionInformeFinanciero nuevoInforme;

}
