package br.com.ekan.ekan.beneficiario.domain;

import br.com.ekan.ekan.beneficiario.Application.api.BeneficiarioRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;


@ToString
@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Beneficiario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID", name = "id", updatable = false, unique = true, nullable = false)
    private UUID idBeneficiario;
    @NotNull
    private String nomeBeneficiario;
    @NotNull
    private String telefone;
    private LocalDateTime dataNascimento;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;

    public Beneficiario(BeneficiarioRequest request) {
        this.nomeBeneficiario = request.getNomeBeneficiario();
        this.telefone = request.getTelefone();
        this.dataNascimento = request.getDataNascimento();
        this.dataInclusao = request.getDataInclusao();
    }
}