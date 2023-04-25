package com.asm.pfe.pfeback.persistance.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "T_TYPE_EXERCICE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class TypeExercice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "ID")
    private Long id;
    private String nomExercice;
    @OneToMany(mappedBy = "typeExercice", cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<Exercice> exercices=new ArrayList<>();

}