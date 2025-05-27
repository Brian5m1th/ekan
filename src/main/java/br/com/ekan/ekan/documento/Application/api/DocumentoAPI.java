package br.com.ekan.ekan.documento.Application.api;

import br.com.ekan.ekan.beneficiario.Application.api.BeneficiarioRequest;
import br.com.ekan.ekan.beneficiario.Application.api.BeneficiarioResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1/beneficiario/{idBeneficiario}/documento")
public interface DocumentoAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    DocumentoResponse postDocumento(@PathVariable UUID idBeneficiario, @Valid @RequestBody DocumentoRequest documentoRequest);
}
