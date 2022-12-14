package sh.surge.fulgure.fulgure_brasil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import sh.surge.fulgure.fulgure_brasil.repository.QuestaoRepository;
import sh.surge.fulgure.fulgure_brasil.repository.UsuarioRepository;

@SpringBootApplication
@RestController
public class FulgureBrasilApplication {

	public static void main(String[] args) {
		QuestaoRepository.init();
		UsuarioRepository.init();
		SpringApplication.run(FulgureBrasilApplication.class, args);
	}

}
