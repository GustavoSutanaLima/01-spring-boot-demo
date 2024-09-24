package edu.gusdev.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
		//SpringApplication.run: Bootstraps the application
		/*
		 * O processo de bootstrap envolve a configuração inicial da aplicação, 
		 * incluindo a definição de propriedades essenciais e a preparação 
		 * do ambiente de execução. Isso permite que a aplicação seja configurada 
		 * de maneira flexível e segura, especialmente em ambientes distribuídos
		 */
	}

}
