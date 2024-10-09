package repository;

import model.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VendedorRepository extends JpaRepository<Vendedor, String> {
    Optional<Vendedor> findByCodigo(String codigo);

}