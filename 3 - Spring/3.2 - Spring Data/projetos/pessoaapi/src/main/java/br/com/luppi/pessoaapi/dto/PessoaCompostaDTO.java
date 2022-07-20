package br.com.luppi.pessoaapi.dto;

import br.com.luppi.pessoaapi.entity.TipoPet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaCompostaDTO {
    private String nome;
    private String email;
    private String nomePet;
    private TipoPet tipoPet;
}
