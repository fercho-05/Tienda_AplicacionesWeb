
package com.tienda.repository;

import com.tienda.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fernando
 */

@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long> {
    Persona findByNombre(String nombre); //Así se hace para buscar un findByColumna, con esto el entiende en que columna va a buscar, se asume que es unico el nombre
}
