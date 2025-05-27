package br.com.ekan.ekan.documento.infra;

import br.com.ekan.ekan.documento.Application.service.DocumentoRepository;
import br.com.ekan.ekan.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class DocumentoInfraRepository implements DocumentoRepository {
    private final DocumentoSpringDataJpaRepository documentoSpringDataJpaRepository;

    @Override
    public Documento salva(Documento documento) {
        Documento Salva =  documentoSpringDataJpaRepository.save(documento);
        return Salva;
    }
}
