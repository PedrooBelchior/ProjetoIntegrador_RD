package br.com.pi.projeto_RD.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.math.BigInteger;

@Data
public class StatusProdutoDTO {

    private BigInteger idStatusProduto;
    private String dsStatusProduto;

}
