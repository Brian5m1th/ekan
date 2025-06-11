package br.com.ekan.ekan.documento.Application.service;

import br.com.ekan.ekan.documento.Application.api.DocumentoDoBeneficiarioDetalhadoResponse;
import br.com.ekan.ekan.documento.Application.api.DocumentoRequest;
import br.com.ekan.ekan.documento.Application.api.DocumentoResponse;
import br.com.ekan.ekan.documento.domain.Documento;

import java.util.UUID;

public interface DocumentoService {

    DocumentoResponse criaDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest);

    DocumentoDoBeneficiarioDetalhadoResponse getDocumentoDoBeneficiarioPorId(UUID idBeneficiario);
}
