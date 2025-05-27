package br.com.ekan.ekan.beneficiario.infra;

import br.com.ekan.ekan.beneficiario.Application.service.BeneficiarioRepository;
import br.com.ekan.ekan.beneficiario.domain.Beneficiario;
import br.com.ekan.ekan.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioInfraRepository implements BeneficiarioRepository {
    private final BeneficiarioSpringDataJpaRepository beneficiarioSpringDataJpaRepository;

    @Override
    public void salva(Beneficiario beneficiario) {
        beneficiarioSpringDataJpaRepository.save(beneficiario);
    }

    @Override
    public List<Beneficiario> findByAll() {
        List<Beneficiario> beneficiarioList = beneficiarioSpringDataJpaRepository.findAll();
        return beneficiarioList;
    }

    @Override
    public Beneficiario findById(UUID idBeneficiario) {
        Beneficiario beneficiario = beneficiarioSpringDataJpaRepository.findByIdBeneficiario(idBeneficiario)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND,"Cliente não encontrado"  ));
        return beneficiario;
    }

    @Override
    public void delete(UUID idBeneficiario) {
        log.info("[start] BeneficiarioApplicationService - delete");
        log.info("[finish] BeneficiarioApplicationService - delete");
    }
}
