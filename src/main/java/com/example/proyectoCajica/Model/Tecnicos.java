package com.example.proyectoCajica.Model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tecnicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dependencia;
    private String nombre;


    @OneToMany(mappedBy = "tecnico", cascade = CascadeType.ALL)
    private List<Mantenimiento> mantenimientos;

    @OneToOne
    @JoinColumn(name = "id_Uusario")
    private Usuario usuario;




}
