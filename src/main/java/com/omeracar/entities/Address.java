package com.omeracar.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="adress")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @OneToOne(mappedBy = "adress")//iliskinin sahibi degil
    private Customer customer;


}
