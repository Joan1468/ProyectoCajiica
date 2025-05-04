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
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_funcionario;

    @ManyToOne
    @JoinColumn(name = "id_secretaria")
    private secretarias secretarias;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private List<Usuario> usuarios;

}



