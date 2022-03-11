package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.dominio.excessoes;

public class CriptografiaException extends DadosInvalidosException {
    public CriptografiaException(String mensagemDeErro) {
        super(mensagemDeErro);
    }
}
