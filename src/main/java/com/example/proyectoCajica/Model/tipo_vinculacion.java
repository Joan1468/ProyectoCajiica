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
public class tipo_vinculacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipovinculacion;
    private String funcionario;
    private String Contratista;

    @OneToMany(mappedBy = "tipoVinculacion", cascade = CascadeType.ALL)
    private List<Usuario> usuarios;


}
