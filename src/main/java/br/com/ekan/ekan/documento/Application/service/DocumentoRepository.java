package br.com.ekan.ekan.documento.Application.service;

import br.com.ekan.ekan.documento.domain.Documento;

public interface DocumentoRepository {
    Documento salva(Documento documento);
}
