package br.com.ekan.ekan.beneficiario.Application.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class BeneficiarioController implements BeneficiarioAPI {

    @Override
    public BeneficiarioResponse cadastrarBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[start] BeneficiarioController - cadastrarBeneficiario");
        log.info("[beneficiarioRequest] {}", beneficiarioRequest);
        log.info("[finish] BeneficiarioController - cadastrarBeneficiario");
        return null;
    }
}
