package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.framework.dominio.DAO;

import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.dominio.Alerta;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.dominio.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "ALERTA")
public class AlertaDAO {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "disciplinaID")
    private String disciplinaID;

    private String email;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Date criacao;

    private Date encerramento;


    public Alerta toDomain() {
        Alerta alerta = new Alerta();
        alerta.getEmail().setCorpo(this.email);
        alerta.setIdDisciplina(this.disciplinaID);
        alerta.setStatus(this.status);
        return alerta;
    }

}


