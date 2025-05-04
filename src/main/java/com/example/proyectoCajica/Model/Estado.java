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
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id_Estado;
private String Bueno;
private String Regular;
private String Malo;

    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private List<Equipo> equipos;


}
