package com.asm.pfe.pfeback.persistance.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "T_EXERCICE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Exercice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private int nbrSerie;
    private String nomExercie;
    private int note;
    @OneToMany(mappedBy = "exercice", cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<Serie> series=new ArrayList<>();
    @OneToMany(mappedBy = "exercice", cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<HistoriqueExercice> historiqueExercices=new ArrayList<>();
    @ManyToOne
    @JoinColumn(name ="TYPE_EXERCICE_ID" ,referencedColumnName = "ID")
    private  TypeExercice typeExercice;
}
