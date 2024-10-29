package py.edu.facitec.clase1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import py.edu.facitec.clase1.model.Suscrito;
														 //Entidad   tipo de dato del pk
public interface SuscritoRepository extends JpaRepository<Suscrito, Long>{

}
