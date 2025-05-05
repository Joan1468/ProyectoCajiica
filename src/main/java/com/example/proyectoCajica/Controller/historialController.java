package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.historial;
import com.example.proyectoCajica.Service.historialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/historial")
public class historialController {

    @Autowired
    private historialService historialService;

    // Guardar un historial
    @PostMapping
    public historial guardar(@RequestBody historial historial) {
        return historialService.guardar(historial);
    }

    // Listar todos los historiales
    @GetMapping
    public List<historial> listar() {
        return historialService.listar();
    }

    // Buscar historial por id
    @GetMapping("/{id}")
    public Optional<historial> buscarPorId(@PathVariable long id) {
        return historialService.buscarPorId(id);
    }

    // Eliminar un historial por id
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        historialService.eliminar(id);
    }

    // Guardar varios historiales
    @PostMapping("/lista")
    public List<historial> guardarVarios(@RequestBody List<historial> historiales) {
        return historialService.guardarTodos(historiales);
    }
}
