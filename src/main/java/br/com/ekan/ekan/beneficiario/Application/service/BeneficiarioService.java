package br.com.ekan.ekan.beneficiario.Application.service;

import br.com.ekan.ekan.beneficiario.Application.api.BeneficiarioRequest;
import br.com.ekan.ekan.beneficiario.Application.api.BeneficiarioResponse;

public interface BeneficiarioService {

    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
}
