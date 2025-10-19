/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

import java.time.LocalDateTime;

/**
 *
 * @author jeffe
 */
public class Usuario {
    private Long id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String senha;
    private LocalDateTime ultimoLogin;
    private boolean ativo;

    public Usuario(Long id, PerfilUsuario perfil, String nomeUsuario, String senha, LocalDateTime ultimoLogin, boolean ativo) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.ultimoLogin = ultimoLogin;
        this.ativo = ativo;
    }

    public Long getId() { 
        return id; 
    }
    
    public void setId(Long id) { 
        this.id = id; 
    }

    public PerfilUsuario getPerfil() { 
        return perfil; 
    }
    
    public void setPerfil(PerfilUsuario perfil) { 
        this.perfil = perfil; 
    }

    public String getNomeUsuario() { 
        return nomeUsuario; 
    }
    public void setNomeUsuario(String nomeUsuario) { 
        this.nomeUsuario = nomeUsuario; 
    }

    public String getSenha() { 
        return senha; 
    }
    
    public void setSenha(String senha) { 
        this.senha = senha; 
    }

    public LocalDateTime getUltimoLogin() { 
        return ultimoLogin; 
    }
    
    public void setUltimoLogin(LocalDateTime ultimoLogin) { 
        this.ultimoLogin = ultimoLogin; 
    }

    public boolean isAtivo() { 
        return ativo; 
    }
    
    public void setAtivo(boolean ativo) { 
        this.ativo = ativo; 
    }

    @Override
    public String toString() {
    return "\nUsuário {" +
           "\n   ID: " + id +
           "\n   Nome: " + nomeUsuario +
           "\n   Perfil: " + perfil.getDescricao() +
           "\n   Ativo: " + ativo +
           "\n   Último login: " + ultimoLogin +
           "\n}";
    }
}
