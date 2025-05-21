package br.com.ekan.ekan.beneficiario.Application.api;

import br.com.ekan.ekan.beneficiario.Application.service.BeneficiarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
