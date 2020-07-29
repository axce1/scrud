package com.example.crud.model;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="developer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nickname;

    @ManyToMany(fetch = FetchType.EAGER)
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    @JoinTable(
        name="developer_skills",
        joinColumns=@JoinColumn(name="developer_id"),
        inverseJoinColumns=@JoinColumn(name="skill_id"))
    Set<Skill> skills;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="account_id", referencedColumnName = "id")
    Account account;

}
