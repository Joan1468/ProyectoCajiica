package com.example.proyectoCajica.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Inventarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_inventario;
    private String Serial;
    private LocalDate fechaAdquisicion;

    @OneToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;





}
