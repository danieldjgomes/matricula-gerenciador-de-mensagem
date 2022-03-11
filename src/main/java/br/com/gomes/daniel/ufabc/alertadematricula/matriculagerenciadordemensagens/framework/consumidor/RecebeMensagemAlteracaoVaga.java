package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.framework.consumidor;

import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.repositorios.servicos.EnviarMensagemNotificarCadastradosService;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.dominio.Disciplina;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RecebeMensagemAlteracaoVaga {

    @Autowired
    private EnviarMensagemNotificarCadastradosService enviarMensagemNotificarCadastradosService;

    @RabbitListener(queues = "${mensageria.rabbit.filas.vagas}")
    public void receber(Disciplina disciplina){
        log.info("Foi atualizada uma vaga para " + disciplina.getNome());
        enviarMensagemNotificarCadastradosService.enviarMensagemNotificacao(disciplina);
    }
}
