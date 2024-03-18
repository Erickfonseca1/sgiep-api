package br.edu.ifpb.sgiep.models;


import jakarta.persistence.*;

@Entity
@Table(name = "inscricao")
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Cidadao cidadao;

    @ManyToOne
    @JoinColumn(name = "id_atividade")
    private Atividade atividade;

    private String status;
}
