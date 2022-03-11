package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.dominio.excessoes;

public class DadosInvalidosException extends RuntimeException {


    public DadosInvalidosException(String mensagemDeErro) {
        super(mensagemDeErro);
    }
}
