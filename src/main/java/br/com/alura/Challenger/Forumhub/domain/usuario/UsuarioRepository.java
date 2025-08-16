package br.com.alura.Challenger.Forumhub.domain.usuario;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {


    UserDetails findByLogin(String login);
}
