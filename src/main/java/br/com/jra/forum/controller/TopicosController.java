package br.com.jra.forum.controller;

import br.com.jra.forum.controller.dto.TopicoDto;
import br.com.jra.forum.modelo.Curso;
import br.com.jra.forum.modelo.Topico;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<Topico> lista(){

        Topico topico = new Topico("Duvidas","Como mudar o nome do endpoint",new Curso("Spring","teste"));

        return  Arrays.asList(topico, topico, topico);


    }

    @RequestMapping("/topicoDto")
    public List<TopicoDto> lista1(){
        Topico topico = new Topico("Sugestão","Mudança da cor",new Curso("Java","Programação"));

        return TopicoDto.converter(Arrays.asList(topico, topico));
    }
}
