package br.com.ekan.ekan.beneficiario.Application.api;


import br.com.ekan.ekan.beneficiario.Application.service.BeneficiarioRepository;
import br.com.ekan.ekan.beneficiario.Application.service.BeneficiarioService;
import br.com.ekan.ekan.beneficiario.domain.Beneficiario;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioController implements BeneficiarioAPI {
    private final BeneficiarioService beneficiarioService;

    @Override
    public BeneficiarioResponse postBeneficiario(@Valid @RequestBody BeneficiarioRequest beneficiarioRequest) {
        log.info("[start] BeneficiarioController - postBeneficiario");
        BeneficiarioResponse criaBeneficiario = beneficiarioService.criaBeneficiario(beneficiarioRequest);
        log.info("[finish] BeneficiarioController - postBeneficiario");
        return criaBeneficiario;
    }

    @Override
    public List<BeneficiarioListResponse> getBeneficiario() {
        log.info("[start] BeneficiarioController - getBeneficiario");
        List<BeneficiarioListResponse> beneficiarios = beneficiarioService.buscarTodosBeneficiarios();
        log.info("[finish] BeneficiarioController - getBeneficiario");
        return beneficiarios;
    }

    @Override
    public BeneficiarioDetalhadoResponse getBeneficiarioPorId(UUID idBeneficiario) {
        log.info("[start] BeneficiarioController - getBeneficiarioPorId");
        Beneficiario beneficiarioPorId = beneficiarioService.buscarBeneficiarioPorId(idBeneficiario);
        log.info("[finish] BeneficiarioController - getBeneficiarioPorId");
        return new BeneficiarioDetalhadoResponse(beneficiarioPorId);
    }

    @Override
    public void patchAlteraBeneficiario(UUID idBeneficiario, BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest) {
        log.info("[start] BeneficiarioController - patchAlteraBeneficiario");
        beneficiarioService.patchAlteraBeneficiario(idBeneficiario, beneficiarioAlteracaoRequest);
        log.info("[finish] BeneficiarioController - patchAlteraBeneficiario");
    }

    @Override
    public void deletaBeneficiario(UUID idBeneficiario) {
        log.info("[start] BeneficiarioController - deletaBeneficiario");
        beneficiarioService.deleta(idBeneficiario);
        log.info("[finish] BeneficiarioController - deletaBeneficiario");
}
