package br.com.alura.Challenger.Forumhub.domain.topico;

import java.time.LocalDateTime;
import java.util.List;

public record DadosDetalhamentoTopico(

        Long id,

        String titulo,

        String mensagem,

        String autor,

        String curso


) {

    public DadosDetalhamentoTopico (Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getAutor(), topico.getCurso());

    }


}
