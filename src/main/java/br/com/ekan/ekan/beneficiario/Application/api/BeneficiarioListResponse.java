package br.com.ekan.ekan.beneficiario.Application.api;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;

import java.util.UUID;

@Data
@Getter
public class BeneficiarioListResponse {
    private UUID idBeneficiario;
    private String nomeBeneficiario;
    private String telefone;

}
