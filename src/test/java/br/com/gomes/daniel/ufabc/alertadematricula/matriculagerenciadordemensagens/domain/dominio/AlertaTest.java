package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.dominio;

import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.dominio.excessoes.EmailInvalidoException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class AlertaTest {

    @Test
    public void deveCriarEmail(){
        Alerta alerta = new Alerta();
        alerta.setEmail(new Email("teste.email@teste.com.br"));
        Assert.assertEquals(alerta.getEmail().getCorpo(), "teste.email@teste.com.br");
    }

    @Test
    public void naoDeveCriarEmail(){
        Assert.assertThrows(EmailInvalidoException.class, () ->{
            Alerta alerta = new Alerta();
            alerta.setEmail(new Email("teste.email@"));
        });
    }
}
