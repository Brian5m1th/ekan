package br.com.ekan.ekan.beneficiario.Application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseBody
@RequestMapping("/v1/beneficiario")
public interface BeneficiarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    BeneficiarioResponse cadastrarBeneficiario(BeneficiarioRequest beneficiarioRequest);
}