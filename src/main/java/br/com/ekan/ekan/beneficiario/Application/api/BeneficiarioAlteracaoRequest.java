package br.com.ekan.ekan.beneficiario.Application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@Getter
public class BeneficiarioAlteracaoRequest {
    @NotBlank
    private String nomeBeneficiario;
    @NotBlank
    private String telefone;
    @NotNull
    private LocalDateTime dataNascimento;
}
