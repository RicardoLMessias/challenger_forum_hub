package br.com.alura.Challenger.Forumhub.domain.topico;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Table(name ="topicos")
@Entity(name = "Topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensagem;
    private LocalDateTime data;
    private String status;
    private String autor;
    private String curso;
    @ElementCollection
    private List <String> resposta = new ArrayList<>();

    private Boolean ativo;


    public Topico (DadosCadastroTopico dados){
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.data = LocalDateTime.now();
        this.status = "aberto";
        this.autor = dados.autor();
        this.curso = dados.curso();
        this.resposta = new ArrayList<>();
        this.ativo = true;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public String getAutor() {
        return autor;
    }

    public String getCurso() {
        return curso;
    }

    public List<String> getResposta() {
        return resposta;
    }

    public void atualizarInformacoes(@Valid DadosAtualizacaoTopico dados) {
        if (dados.mensagem()!= null) {
            this.mensagem = dados.mensagem();
        }
        if (dados.titulo()!= null) {
            this.titulo = dados.titulo();
        }
        if (dados.curso()!= null) {
            this.curso = dados.curso();
        }
        if (dados.autor()!= null) {
            this.autor = dados.autor();
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
