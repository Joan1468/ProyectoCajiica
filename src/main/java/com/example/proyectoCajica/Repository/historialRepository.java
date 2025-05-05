package com.example.proyectoCajica.Repository;
import com.example.proyectoCajica.Model.historial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface historialRepository extends JpaRepository<historial  , Long>
{
}
