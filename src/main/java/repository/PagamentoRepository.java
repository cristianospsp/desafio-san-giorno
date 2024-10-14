package repository;

import model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

    boolean existsByCodigoCobranca(String codigoCobranca);

}
