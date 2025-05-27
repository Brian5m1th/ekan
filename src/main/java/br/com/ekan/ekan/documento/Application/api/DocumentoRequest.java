package br.com.ekan.ekan.documento.Application.api;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@Getter
public class DocumentoRequest {
    private String nomeDocumento;
    private String descricao;
    private LocalDateTime dataInclusao;
}
