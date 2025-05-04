package com.example.proyectoCajica.Model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.ToOne;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class historial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha_Asignacion;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;




}
