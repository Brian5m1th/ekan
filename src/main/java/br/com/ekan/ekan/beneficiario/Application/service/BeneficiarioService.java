package br.com.ekan.ekan.beneficiario.Application.service;

import br.com.ekan.ekan.beneficiario.Application.api.BeneficiarioAlteracaoRequest;
import br.com.ekan.ekan.beneficiario.Application.api.BeneficiarioListResponse;
import br.com.ekan.ekan.beneficiario.Application.api.BeneficiarioRequest;
import br.com.ekan.ekan.beneficiario.Application.api.BeneficiarioResponse;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioService {

    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);

    List<BeneficiarioListResponse> buscarTodosBeneficiarios();

    void patchAlteraBeneficiario(UUID idBeneficiario, BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest);
}
