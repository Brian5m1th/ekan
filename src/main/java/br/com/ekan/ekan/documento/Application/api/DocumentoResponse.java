package br.com.ekan.ekan.documento.Application.api;

import lombok.Data;
import lombok.Getter;

import java.util.UUID;

@Data
@Getter
public class DocumentoResponse {
    private UUID idDocumento;
}
