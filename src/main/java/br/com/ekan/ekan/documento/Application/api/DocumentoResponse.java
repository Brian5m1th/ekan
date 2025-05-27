package br.com.ekan.ekan.documento.Application.api;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class DocumentoResponse {
    private UUID idDocumento;

}
