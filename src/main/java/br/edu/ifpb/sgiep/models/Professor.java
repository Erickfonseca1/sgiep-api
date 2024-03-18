package br.edu.ifpb.sgiep.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "professor")
public class Professor extends Usuario{

    @NotNull
    private Boolean ativo;

    @NotNull
    private String modalidade;

    @NotNull
    private String matricula;

    @OneToMany(mappedBy = "professor")
    private Set<Atividade> atividades;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Chamado> chamados;
}
