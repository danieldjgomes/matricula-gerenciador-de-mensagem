package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.framework.framework.repositoriosImpl.servicos.SQL;

import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.dominio.excessoes.CriptografiaException;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Criptografador {

    public static String paraSha256(String mensagem){
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(mensagem.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException e) {
            throw new CriptografiaException("Não foi possivel converter para SHA-256");
        }

    }
}
