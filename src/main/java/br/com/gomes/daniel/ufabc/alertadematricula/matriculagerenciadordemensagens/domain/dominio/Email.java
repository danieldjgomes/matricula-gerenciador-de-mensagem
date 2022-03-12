package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.dominio;

import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.dominio.excessoes.EmailInvalidoException;

public class Email {

    String corpo;

    public Email(String corpo) {
        if (isCorpoValido(corpo)){
            this.corpo = corpo;
        }
        throw new EmailInvalidoException();
    }

    public String getCorpo() {
        return corpo;
    }

    boolean isCorpoValido(String corpoValido){
       return corpoValido.matches("/^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/");
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }
}
