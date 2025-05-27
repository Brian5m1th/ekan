package br.com.ekan.ekan.beneficiario.Application.service;

import br.com.ekan.ekan.beneficiario.Application.api.BeneficiarioAlteracaoRequest;
import br.com.ekan.ekan.beneficiario.domain.Beneficiario;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioRepository {

    void salva(Beneficiario beneficiario);

    List<Beneficiario> findByAll();

    Beneficiario findById(UUID idBeneficiario);

    void delete(UUID idBeneficiario);
}

