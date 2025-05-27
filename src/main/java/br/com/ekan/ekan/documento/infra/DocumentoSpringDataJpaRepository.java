package br.com.ekan.ekan.documento.infra;

import br.com.ekan.ekan.documento.domain.Documento;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface DocumentoSpringDataJpaRepository extends CrudRepository<Documento, UUID> {
}
