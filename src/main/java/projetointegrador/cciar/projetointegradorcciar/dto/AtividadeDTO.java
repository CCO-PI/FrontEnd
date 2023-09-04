package projetointegrador.cciar.projetointegradorcciar.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
public class AtividadeDTO {
    private Long id;
    private boolean ativo;

    private String nomeAtividade;

    private String descricao;

    private LocalTime horarioCadastro;
}
