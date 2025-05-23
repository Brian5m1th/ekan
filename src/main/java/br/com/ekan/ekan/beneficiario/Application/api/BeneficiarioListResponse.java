package br.com.ekan.ekan.beneficiario.Application.api;

import br.com.ekan.ekan.beneficiario.domain.Beneficiario;
import lombok.Data;
import lombok.Getter;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Data
@Getter
public class BeneficiarioListResponse {
    private UUID idBeneficiario;
    private String nomeBeneficiario;
    private String telefone;
    private Beneficiario beneficiario;

    public static List<BeneficiarioListResponse> converte(List<Beneficiario> beneficiarioList) {
        return beneficiarioList.stream()
                .map(BeneficiarioListResponse::new)
                .collect(Collectors.toList());
    }

    public BeneficiarioListResponse(Beneficiario beneficiario ) {
        this.idBeneficiario = beneficiario.getIdBeneficiario()  ;
        this.nomeBeneficiario = beneficiario.getNomeBeneficiario();
        this.telefone = beneficiario.getTelefone();
    }

}
