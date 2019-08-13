package br.com.jra.forum.controller.dto;

import br.com.jra.forum.modelo.Topico;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class TopicoDto {

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;



    public TopicoDto(Topico topico) {
        this.id =topico.getId();
        this.titulo = topico.getTitulo();
        this.dataCriacao = topico.getDataCriacao();
        this.mensagem = topico.getMensagem();
    }

    public static List<TopicoDto> converter(List<Topico> topicos) {

        return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public String getMensagem() {
        return mensagem;
    }
}
