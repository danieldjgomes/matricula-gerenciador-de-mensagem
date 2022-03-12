package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.framework.framework.repositoriosImpl.DAO;

import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.dominio.excessoes.RepositorioAlertaIndisponivelException;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.dominio.Alerta;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.repositorio.AlertaRepository;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.framework.dominio.DAO.AlertaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class AlertaRepositoryImpl implements AlertaRepository {

    @Autowired
    private EntityManager em;

    @Override
    public Optional<List<Alerta>> getAlertasPorId(String id) {
        String sql = "SELECT * FROM ALERTA WHERE disciplinaID = ?";
        Query q = em.createNamedQuery(sql, AlertaDAO.class);
        q.setParameter(1,id);
        List<AlertaDAO> alertaDAOS = q.getResultList();
        List<Alerta>  alertas = alertaDAOS.stream().map(AlertaDAO::toDomain).collect(Collectors.toList());

        return Optional.ofNullable(Optional.of(alertas).orElseThrow(RepositorioAlertaIndisponivelException::new));

    }
}
