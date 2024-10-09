package repository;

import model.Cobranca;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CobrancaRepository extends JpaRepository<Cobranca, String> {
    Optional<Cobranca> findByCodigo(String codigo);
}