package br.com.ekan.ekan.documento.Application.service;

import br.com.ekan.ekan.beneficiario.Application.service.BeneficiarioService;
import br.com.ekan.ekan.documento.Application.api.DocumentoController;
import br.com.ekan.ekan.documento.Application.api.DocumentoRequest;
import br.com.ekan.ekan.documento.Application.api.DocumentoResponse;
import br.com.ekan.ekan.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Log4j2
@Service
public class DocumentoApplicationService implements DocumentoService {
    private final BeneficiarioService beneficiarioService;
    private final DocumentoRepository documentoRepository;

    @Override
    public DocumentoResponse criaDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        log.info("[start] DocumentoApplicationService - criaDocumento");
        beneficiarioService.buscarBeneficiarioPorId(idBeneficiario);
        Documento documento = documentoRepository.salva(new Documento(idBeneficiario, documentoRequest));
        log.info("[finish] DocumentoApplicationService - criaDocumento");
        return new DocumentoResponse(documento.getIdDocumento());
    }
}
