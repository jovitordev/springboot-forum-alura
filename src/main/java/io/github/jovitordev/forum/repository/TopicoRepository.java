package io.github.jovitordev.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.jovitordev.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	List<Topico> findByCursoNome(String nomeCurso);

}
