package br.com.ekan.ekan.documento.Application.api;

import br.com.ekan.ekan.documento.Application.service.DocumentoService;
import br.com.ekan.ekan.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class DocumentoController implements DocumentoAPI {
    private final DocumentoService documentoService;

    @Override
    public DocumentoResponse postDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        log.info("[start] DocumentoController - postDocumento");
        log.info("[idBeneficiario] {} ", idBeneficiario);
        DocumentoResponse documento = documentoService.criaDocumento(idBeneficiario, documentoRequest);
        log.info("[finish] DocumentoController - postDocumento");
        return documento;
    }

    @Override
    public DocumentoDoBeneficiarioDetalhadoResponse getDocumentoDoBeneficiarioPorId(UUID idBeneficiario) {
        log.info("[start] DocumentoController - getDocumentoDoBeneficiarioPorId");
        log.info("[idBeneficiario] {} ", idBeneficiario);
        DocumentoDoBeneficiarioDetalhadoResponse documento = documentoService.getDocumentoDoBeneficiarioPorId(idBeneficiario);
        log.info("[finish] DocumentoController - getDocumentoDoBeneficiarioPorId");
        return null;
    }

}
