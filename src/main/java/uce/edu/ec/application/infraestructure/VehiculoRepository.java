package uce.edu.ec.application.infraestructure;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.ec.application.domain.Vehiculo;

@ApplicationScoped
public class VehiculoRepository implements PanacheRepository<Vehiculo>{
    
}
