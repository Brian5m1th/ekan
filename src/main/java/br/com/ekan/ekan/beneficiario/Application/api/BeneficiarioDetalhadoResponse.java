package br.com.ekan.ekan.beneficiario.Application.api;

import br.com.ekan.ekan.beneficiario.domain.Beneficiario;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@Getter
public class BeneficiarioDetalhadoResponse {
    private String nomeBeneficiario;
    private String telefone;
    private LocalDateTime dataNascimento;
    private LocalDateTime dataInclusao;

    public BeneficiarioDetalhadoResponse(Beneficiario beneficiario) {
        this.nomeBeneficiario = beneficiario.getNomeBeneficiario();
        this.telefone = beneficiario.getTelefone();
        this.dataNascimento = beneficiario.getDataNascimento();
        this.dataInclusao = beneficiario.getDataInclusao();
    }
}
