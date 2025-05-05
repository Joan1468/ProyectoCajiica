package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Model.historial;
import com.example.proyectoCajica.Repository.historialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class historialService {

    @Autowired
    public historialRepository historialRepository;

    public historial guardar(historial historial) {
        return historialRepository.save(historial);
    }

    public List<historial> listar() {
        return historialRepository.findAll();
    }

    public void eliminar(long id) {
        historialRepository.deleteById(id);
    }

    public Optional<historial> buscarPorId(long id) {
        return historialRepository.findById(id);
    }

    public List<historial> guardarTodos(List<historial> historiales) {
        return historialRepository.saveAll(historiales);
    }
}
