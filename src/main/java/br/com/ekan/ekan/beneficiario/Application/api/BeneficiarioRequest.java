package br.com.ekan.ekan.beneficiario.Application.api;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;

@Value
@Builder
public class BeneficiarioRequest {
    private String nomeBeneficiario;
    private String telefone;
    private LocalDateTime dataNascimento;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;
}
