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

public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_equipo;
    private String hostname;
    private String tipo_Equipo;
    private String modelo;
    private String serial;
    private String placa;
    private LocalDate fecha_Fabricacion;
    private String estado_Equipo;
    private String nombre_Equipo;
    private String ipv4;
    private String  ipv6;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "tipo_equipo_id")
    private tipo_equipo tipoEquipo;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;


    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<Mantenimiento> mantenimientos;

    @OneToOne(mappedBy = "equipo", cascade = CascadeType.ALL)
    private hv_equipos hojaVidaEquipo;

    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<asignacion> asignacion;






}

