package br.com.alura.Challenger.Forumhub.domain.topico;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.List;

public record DadosListagemTopicos(

        Long id,

        String titulo,

        String mensagem,

        LocalDateTime data,

        String status,

        String autor,

        String curso,

        List<String> reposta
) {
    public DadosListagemTopicos(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getData(), topico.getStatus(), topico.getAutor(), topico.getCurso(), topico.getResposta());
    }
}
