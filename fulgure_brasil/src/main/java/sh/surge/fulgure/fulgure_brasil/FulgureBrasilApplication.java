package sh.surge.fulgure.fulgure_brasil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import sh.surge.fulgure.fulgure_brasil.repository.QuestaoRepository;

@SpringBootApplication
@RestController
public class FulgureBrasilApplication {

	public static void main(String[] args) {
		QuestaoRepository.init();
		SpringApplication.run(FulgureBrasilApplication.class, args);
	}

}
