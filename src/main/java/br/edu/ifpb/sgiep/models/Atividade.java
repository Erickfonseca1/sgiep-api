package br.edu.ifpb.sgiep.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "atividade")
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeAtividade;
    private String descricao;
    private LocalDateTime dataHora;
    private String local;

    @ManyToMany(mappedBy = "atividades")
    private Set<Cidadao> cidadaos;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @ManyToOne
    @JoinColumn(name = "id_modalidade_esportiva")
    private ModalideEsportiva modalidadeEsportiva;
}
