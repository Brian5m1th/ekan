package br.com.ekan.ekan.beneficiario.infra;

import br.com.ekan.ekan.beneficiario.domain.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeneficiarioSpringDataJpaRepository extends JpaRepository<Beneficiario, UUID> {
}
