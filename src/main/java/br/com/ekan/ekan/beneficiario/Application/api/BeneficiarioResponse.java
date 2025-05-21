package br.com.ekan.ekan.beneficiario.Application.api;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class BeneficiarioResponse {
    private UUID idBeneficiario;
}
