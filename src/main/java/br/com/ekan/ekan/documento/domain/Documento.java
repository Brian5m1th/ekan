package br.com.ekan.ekan.documento.domain;

import br.com.ekan.ekan.documento.Application.api.DocumentoRequest;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@ToString
@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID", name = "idDocumento", updatable = false, unique = true, nullable = false)
    private UUID idDocumento;
    private UUID idBeneficiario;
    private String nomeDocumento;
    private String descricao;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;

    public Documento(UUID idBeneficiario, DocumentoRequest request) {
        this.idBeneficiario = idBeneficiario;
        this.nomeDocumento = request.getNomeDocumento();
        this.descricao = request.getDescricao();
        this.dataInclusao = request.getDataInclusao();
    }
}