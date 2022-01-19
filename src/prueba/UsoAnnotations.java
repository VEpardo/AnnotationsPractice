package prueba;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("prueba/applicationContext.xml");
	
		Empleados Antonio = contexto.getBean("comercialExperimentado", Empleados.class);
		
		System.out.println(Antonio.getInforme());
		System.out.println(Antonio.getTareas());
		
		contexto.close();
	}

}
