package br.com.alura.Challenger.Forumhub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

public record DadosCadastroTopico(

        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,

        @NotBlank
        String autor,
        @NotBlank
        String curso,

        List<String> reposta
) {

}
