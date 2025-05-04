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
public class tipo_documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo_documento;
    private String nombre;// cedula

    @OneToMany(mappedBy = "tipoDocumento", cascade = CascadeType.ALL)
    private List<Usuario> Usuario;

}
