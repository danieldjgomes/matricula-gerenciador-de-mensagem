package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.framework;

import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.dominio.excessoes.InfraestruturaException;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.repositorios.construtor.mensageria.ConstrutorDeFilas;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class EstruturadorDeProjeto {

    @Autowired
    private ConstrutorDeFilas construtorDeFilas;

    @PostConstruct
    public void construirFilas() {
        try {
            construtorDeFilas.construir();
            log.info("As filas foram construidas.");
        } catch (Exception e) {
            throw new InfraestruturaException("Nao foi possivel construir as filas");
        }

    }


}
