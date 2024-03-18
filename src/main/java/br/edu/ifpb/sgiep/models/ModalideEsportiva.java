package br.edu.ifpb.sgiep.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "modalidade_esportiva")
public class ModalideEsportiva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Campo obrigatório")
    private String nomeModalidade;
    private String descricao;
    @NotBlank(message="Campo obrigatório")
    private int maxParticipantes;
}
