package prueba;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("prueba/applicationContext.xml");
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
//		Empleados Antonio = contexto.getBean("comercialExperimentado", Empleados.class);
//		Empleados Lucia = contexto.getBean("comercialExperimentado", Empleados.class);
//		
//		if(Antonio==Lucia) {
//			System.out.println("Apuntan al mismo lugar");
//			System.out.println(Antonio + "\n" + Lucia);
//		} else {
//			System.out.println("No apuntan al mismo lugar");
//			System.out.println(Antonio + "\n" + Lucia);
//		}
		
//		Empleados empleado = contexto.getBean("directorFinanciero",Empleados.class);
//		System.out.println(empleado.getTareas());
//		System.out.println(empleado.getInforme());
		
		DirectorFinanciero empleado = contexto.getBean("directorFinanciero",DirectorFinanciero.class);
		
		System.out.println("Email del director: " + empleado.getEmail());

		System.out.println("Nombre de la empresa: " + empleado.getNombreEmpresa());
		contexto.close();
	}

		
}
