package io.github.jovitordev.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.jovitordev.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
