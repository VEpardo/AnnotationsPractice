package prueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;


@Component
@Scope("prototype")
public class ComercialExperimentado implements Empleados {

	//creacion del bean
//	@PostConstruct
//	public void ejecutaDespuesCreacion() {
//		System.out.println("Ejecuta tras creacion de Bean");
//	}
//	
//	//apagado contenedor spring
//	@PreDestroy
//	public void ejecutaAntesDestruccion() {
//		System.out.println("Ejecuta antes de la destruccion");
//	}
	
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
	@Qualifier("informeFinancieroTrim4")
	private CreacionInformeFinanciero nuevoInforme;

}
