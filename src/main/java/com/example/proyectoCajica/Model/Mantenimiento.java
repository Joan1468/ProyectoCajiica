
package com.example.proyectoCajica.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Mantenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Mantenimiento;
    private String descripcion;
    private String observaciones;
    private String correctivo;
    private String preventivo;


    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnicos tecnico;

}