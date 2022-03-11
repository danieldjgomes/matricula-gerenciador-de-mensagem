package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.repositorio;

import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.dominio.Alerta;

import java.util.List;
import java.util.Optional;

public interface AlertaRepository {

    public Optional<List<Alerta>> getAlertasPorId(String id);
}
