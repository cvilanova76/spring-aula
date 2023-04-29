package br.com.ccvn.aulaspringpesquisa.model.entidades;

import java.util.ArrayList;
import java.util.List;

import br.com.ccvn.aulaspringpesquisa.model.enums.GeneroFilmes;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pesquisa {

    @EqualsAndHashCode.Include
    @Getter
    private Integer id;
    
    @Getter
    @Setter
    private String nome;
    
    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String sexo;

    @Getter
    @Setter
    private String estadoCivil;

    @Getter
    @Setter
    private List<GeneroFilmes>generosFilme = new ArrayList<>();


    
}