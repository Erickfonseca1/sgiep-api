package br.edu.ifpb.sgiep.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "gestor")
public class Gestor extends Usuario{


    @NotNull
    private String matricula;

    @NotNull
    private Boolean ativo;
}
