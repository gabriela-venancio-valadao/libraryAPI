package io.github.gabriela_venancio.libraryapi.repository;

import io.github.gabriela_venancio.libraryapi.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {

}
