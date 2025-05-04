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
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Usuario;
    private String nombre;
    private String username;
    private String password;
    private String correo;
    private String rol;
    @ManyToOne
    @JoinColumn(name = "id_tipo_vinculacion")
    private tipo_vinculacion Tipo_vinculacion;

    @ManyToOne
    @JoinColumn(name = "tipo_documento_id")
    private tipo_documento tipoDocumento;

    @ManyToOne
    @JoinColumn(name = "tipo_vinculacion_id")
    private tipo_vinculacion tipoVinculacion;

    @ManyToOne
    @JoinColumn(name = "secretaria_id")
    private secretarias secretaria;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<asignacion> asignacion;
}
