package br.com.ekan.ekan.beneficiario.infra;

import br.com.ekan.ekan.beneficiario.Application.service.BeneficiarioRepository;
import br.com.ekan.ekan.beneficiario.domain.Beneficiario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

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
}
