package service.Promocao;

import service.Reajuste.IReajusteTributavel;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements IReajusteTributavel {
    private BigDecimal Valor;
    private LocalDate Data;
    private BigDecimal Promocao;

    public Promocao(BigDecimal valor, BigDecimal promocao) {
        this.Valor = valor;
        this.Promocao = promocao;
        this.Data = LocalDate.now();
    }

    @Override
    public BigDecimal Valor() {
        return this.Valor;
    }

    @Override
    public LocalDate Data() {
        return this.Data;
    }

    @Override
    public BigDecimal ValorImposto() {
        return this.Promocao.multiply(new BigDecimal("0.1"));
    }
}
