package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.framework.framework.repositoriosImpl.DAO;

import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.dominio.Mensagem;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.dominio.NotificarCadastrado;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.repositorios.mensagens.EnviarMensagemNotificarCadastrados;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.framework.framework.repositoriosImpl.servicos.SQL.Criptografador;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EnviarMensagemNotificarCadastradosImpl implements EnviarMensagemNotificarCadastrados {

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void enviar(Mensagem<NotificarCadastrado> notificarCadastradoMensagem) {
        this.rabbitTemplate.convertAndSend(notificarCadastradoMensagem.getFila(),notificarCadastradoMensagem.getConteudo());
        log.info("Foi realizada a notificacao para o usuario " + Criptografador.paraSha256(notificarCadastradoMensagem.getConteudo().getDestinatario())  + " para a disciplina " + notificarCadastradoMensagem.getConteudo().getDisciplina().getNome() + "foi enviada para a fila " + notificarCadastradoMensagem.getFila());
    }


}
