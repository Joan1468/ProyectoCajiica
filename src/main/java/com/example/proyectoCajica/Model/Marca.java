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
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;              // Ej: "HP", "Dell", "Lenovo"
    private String paisOrigen;          // Ej: "Estados Unidos", "China"
    private String descripcion;         // Descripción general de la marca
    private String sitioWeb;            // URL del sitio web oficial
    private String contactoSoporte;

    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
    private List<Equipo> Equipo;



}
