/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author jeffe
 */
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Criar perfis de usuário com permissões
        PerfilUsuario perfilAdmin = new PerfilUsuario(1L, "Administrador", Arrays.asList("CRIAR", "EDITAR", "EXCLUIR"));
        PerfilUsuario perfilComum = new PerfilUsuario(2L, "Usuário Comum", Arrays.asList("VISUALIZAR"));

        // Criar usuários e associá-los aos perfis
        Usuario usuario1 = new Usuario(1L, perfilAdmin, "Carlão Pressão", "1234", LocalDateTime.now(), true);
        Usuario usuario2 = new Usuario(2L, perfilComum, "Junin ruindade pura", "abcd", LocalDateTime.now(), true);

        // Criar sessões para esses usuários
        Sessao sessao1 = new Sessao(1L, usuario1, "tokente");
        Sessao sessao2 = new Sessao(2L, usuario2, "tofrio");

        // Criar logs de auditoria
        LogAuditoria log1 = new LogAuditoria(1L, usuario1, "Login realizado", LocalDateTime.now(), "404.404.0.1");
        LogAuditoria log2 = new LogAuditoria(2L, usuario2, "Acesso negado", LocalDateTime.now(), "505.505.0.2");

        // Exibe as informações no terminal
        System.out.println(" PERFIS ");
        System.out.println(perfilAdmin);
        System.out.println(perfilComum);

        System.out.println("\n USUÁRIOS ");
        System.out.println(usuario1);
        System.out.println(usuario2);

        System.out.println("\n SESSÕES ");
        System.out.println(sessao1);
        System.out.println(sessao2);

        System.out.println("\n LOGs DE AUDITORIA ");
        System.out.println(log1);
        System.out.println(log2);
    }

}

