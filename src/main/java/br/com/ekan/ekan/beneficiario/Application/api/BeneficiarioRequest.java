package br.com.ekan.ekan.beneficiario.Application.api;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BeneficiarioRequest {
    private String nomeBeneficiario;
    private String telefone;
    private LocalDateTime dataNascimento;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;
}
