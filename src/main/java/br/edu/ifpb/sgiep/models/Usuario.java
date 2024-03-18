package br.edu.ifpb.sgiep.models;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@MappedSuperclass
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;
    private String sexo;

    @NotNull
    private String cpf;

    @NotNull
    private String email;
    private String senha;
    private String telefone;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    @NotNull
    private String tipoUsuario;
}
