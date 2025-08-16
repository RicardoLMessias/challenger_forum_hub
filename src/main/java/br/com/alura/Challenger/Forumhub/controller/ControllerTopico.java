package br.com.alura.Challenger.Forumhub.controller;

import br.com.alura.Challenger.Forumhub.domain.topico.DadosCadastroTopico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("topicos")
public class ControllerTopico {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroTopico dados){
        System.out.println("teste " + dados);

    }

}
