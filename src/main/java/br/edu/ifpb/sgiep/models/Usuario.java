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

    @NotNull
    private String tipoUsuario;
}
