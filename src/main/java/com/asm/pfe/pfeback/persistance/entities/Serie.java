package com.asm.pfe.pfeback.persistance.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "T_SERIE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Serie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "ID")
    private Long id;
    private int chargeKg;
    private int nbrRepition;
    @ManyToOne
    @JoinColumn(name ="EXERCICE_ID" ,referencedColumnName = "ID")
    private  Exercice exercice;

}