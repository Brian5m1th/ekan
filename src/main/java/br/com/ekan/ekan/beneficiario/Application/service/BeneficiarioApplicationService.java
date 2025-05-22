package br.com.ekan.ekan.beneficiario.Application.service;

import br.com.ekan.ekan.beneficiario.Application.api.BeneficiarioListResponse;
import br.com.ekan.ekan.beneficiario.Application.api.BeneficiarioRequest;
import br.com.ekan.ekan.beneficiario.Application.api.BeneficiarioResponse;
import br.com.ekan.ekan.beneficiario.domain.Beneficiario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Log4j2
@Service
public class BeneficiarioApplicationService implements BeneficiarioService {
    private final BeneficiarioRepository beneficiarioRepository;

    @Override
    public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[start] BeneficiarioApplicationService - criaBeneficiario");
        Beneficiario beneficiario = new Beneficiario(beneficiarioRequest);
        beneficiarioRepository.salva(beneficiario);
        log.info("[finish] BeneficiarioApplicationService - criaBeneficiario");
        return BeneficiarioResponse.builder()
                .idBeneficiario(beneficiario.getIdBeneficiario())
                .build();
    }

    @Override
    public List<BeneficiarioListResponse> buscarTodosBeneficiarios() {
        log.info("[start] BeneficiarioApplicationService - buscarTodosBeneficiarios");
        List<Beneficiario> beneficiarioList = beneficiarioRepository.findByAll();
        log.info("[finish] BeneficiarioApplicationService - buscarTodosBeneficiarios");
        return BeneficiarioListResponse.converte(beneficiarioList);
    }

}
