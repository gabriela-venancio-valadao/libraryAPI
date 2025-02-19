package io.github.gabriela_venancio.libraryapi.repository;

import io.github.gabriela_venancio.libraryapi.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;



public interface AutorRepository extends JpaRepository<Autor, UUID> {


}
