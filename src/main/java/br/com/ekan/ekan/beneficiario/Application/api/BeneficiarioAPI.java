package br.com.ekan.ekan.beneficiario.Application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/beneficiario")
public interface BeneficiarioAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    BeneficiarioResponse postBeneficiario(@Valid @RequestBody BeneficiarioRequest beneficiarioRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<BeneficiarioListResponse> getBeneficiario();

    @GetMapping("/{idBeneficiario}")
    @ResponseStatus(code = HttpStatus.OK)
    BeneficiarioDetalhadoResponse getBeneficiarioPorId(@PathVariable @Valid UUID idBeneficiario);

    @PatchMapping("/{idBeneficiario}")
    @ResponseStatus(code = HttpStatus.OK)
    void patchAlteraBeneficiario(@PathVariable UUID idBeneficiario, @Valid @RequestBody BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest);
}
