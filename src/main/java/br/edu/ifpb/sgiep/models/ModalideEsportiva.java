package br.edu.ifpb.sgiep.models;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "modalidade_esportiva")
public class ModalideEsportiva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nomeModalidade;
    private String descricao;
}
