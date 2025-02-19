package io.github.gabriela_venancio.libraryapi;

import io.github.gabriela_venancio.libraryapi.model.Autor;
import io.github.gabriela_venancio.libraryapi.repository.AutorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class LibraryapiApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(LibraryapiApplication.class, args);
		AutorRepository repository = context.getBean(AutorRepository.class);
		ExemploSalvaRegistro(repository);
	}
	public static void ExemploSalvaRegistro(AutorRepository autorRepository){
		Autor autor = new Autor();
		autor.setNome("jose");
		autor.setNacionalidade("brasileira");
		autor.setDataNascimento(LocalDate.of(1999, 5,2));

		var autorSalvo = autorRepository.save(autor);
		System.out.println("autor savlo :" + autorSalvo);
	}

}
