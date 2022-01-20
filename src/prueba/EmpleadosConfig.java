package prueba;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("prueba")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {

	@Bean
	public CreacionInformeFinanciero informeFinancieroDeptoCompras(){
		return new InformeFinancieroDeptoCompras();
	}
	
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDeptoCompras());
	}
}
