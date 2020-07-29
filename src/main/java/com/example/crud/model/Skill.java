package com.example.crud.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="skill")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
}
