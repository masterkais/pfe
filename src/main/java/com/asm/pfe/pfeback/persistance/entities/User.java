package com.asm.pfe.pfeback.persistance.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "T_USER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "U_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String adress;
    private String fax;
    private String email;
    private String ville;
    private boolean active;
    private LocalDateTime dateNaissanced;
    private LocalDateTime dateCreated;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Group> groups=new ArrayList<>();
    @Column(name = "U_USER_NAME")
    private String userName;
    @Column(name = "U_PASSWORD")
    private String password;
    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Exercice> excercices=new ArrayList<>();
    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Groupe> groupes=new ArrayList<>();
    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Salle> salles=new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<ActivitesCollectives> activitesCollectives=new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<Abonnement> abonnements=new ArrayList<>();

    public User(Long id, String nom, String prenom, String adress, String fax, String email, String ville, boolean active, LocalDateTime dateNaissanced, LocalDateTime dateCreated,String userName, String password) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
        this.fax = fax;
        this.email = email;
        this.ville = ville;
        this.active = active;
        this.dateNaissanced = dateNaissanced;
        this.dateCreated = dateCreated;
        this.groups = null;
        this.userName = userName;
        this.password = password;
        this.excercices = null;
        this.groupes = null;
        this.salles = null;
        this.activitesCollectives = null;
        this.abonnements = null;
    }
}

