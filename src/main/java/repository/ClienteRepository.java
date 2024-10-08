package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByEmail(String email);
}
