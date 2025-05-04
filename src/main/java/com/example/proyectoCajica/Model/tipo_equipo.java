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
public class tipo_equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipo_equipo;
    private String portatil;
    private String computadorEscritorio;
    private String impresora;
    private String servidor;
    private String Switch;
    private String accessPoint;
    private String router;
    private String ups;
    private String escaner;
    private String plotter;
    private String proyectorVideoBeam;
    private String telefono;
    private String tablet;
    private String fotocopiadora;
    private String nas;
    private String monitor;
    private String televisor;
    private String reguladorVoltaje;
    private String celular;


    @OneToMany(mappedBy = "tipoEquipo", cascade = CascadeType.ALL)
    private List<Equipo> Equipo;


}
