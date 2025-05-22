package br.com.ekan.ekan.beneficiario.Application.service;

import br.com.ekan.ekan.beneficiario.domain.Beneficiario;

import java.util.List;

public interface BeneficiarioRepository {


    void salva(Beneficiario beneficiario);

    List<Beneficiario> findByAll();
}

