package br.edu.ifpb.sgiep.models;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Set;

@Entity
@Table(name = "cidadao")
public class Cidadao extends Usuario{

    private Double altura;
    private Double peso;

    @NotNull
    private String historicoMedico;

    @ManyToMany
    @JoinTable(
        name = "cidadao_atividade",
            joinColumns = @JoinColumn(name = "cidadao_id"),
            inverseJoinColumns = @JoinColumn(name = "atividade_id")
    )
    private Set<Atividade> atividades;
}
