package br.com.alura.Challenger.Forumhub.domain.topico;

import java.time.LocalDateTime;

public record DadosCadastroTopico(
        String titulo,
        String mensagem,
        LocalDateTime data,
        String status,
        String autor,
        String curso
) {

}
