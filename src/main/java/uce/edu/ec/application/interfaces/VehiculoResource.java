package uce.edu.ec.application.interfaces;

import java.util.List;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import uce.edu.ec.application.domain.Vehiculo;
import uce.edu.ec.application.infraestructure.VehiculoRepository;

@Path("/vehiculo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RolesAllowed("admin")

public class VehiculoResource {

    @Inject
    VehiculoRepository repository;

    @GET
    public List<Vehiculo> listar() {
        return repository.listAll();
    }

    @POST
    @Transactional
    public Vehiculo guardar(Vehiculo vehiculo) {
        repository.persist(vehiculo);
        return vehiculo;
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void borrar(@PathParam("id") Long id) {
        boolean eliminar = repository.deleteById(id);

        if (!eliminar) {
            throw new WebApplicationException("Vehiculo no encontrado");
        }
    }
}
