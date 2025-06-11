package br.com.ekan.ekan.documento.Application.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Getter
public class DocumentoDoBeneficiarioDetalhadoResponse {
    private String nomeDocumento;
    private String descricao;
    private LocalDateTime dataInclusao;
}
