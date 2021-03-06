package org.Generation.blogPessoal.repository;

import java.util.Optional;

import org.Generation.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	/*
	 * este repositório irá herdar o JpaRepository do tipo Usuario e, tambem, do
	 * tipo primitivo Long
	 */

	public Optional<Usuario> findByUsuario(String usuario);
	// optional pois pode devolver um valor Null

}
