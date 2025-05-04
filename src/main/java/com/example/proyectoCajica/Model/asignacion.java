package com.example.proyectoCajica.Model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class asignacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ubicacion;
    private int id_tipo_equipo;
    private int id_Equipo;
    private int id_secretaria;
    private int id_funcionario;
    private int id_tipo_documento;
    private String ubicacion;
    private String prueba;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;








}
