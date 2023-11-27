package service.Reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anuenio implements IReajuste {
    private BigDecimal valor;
    private LocalDate data;
    private BigDecimal Promocao;

    public Anuenio(BigDecimal valor, BigDecimal promocao) {
        this.valor = valor;
        this.data = LocalDate.now();
        this.Promocao = promocao;
    }
    @Override
    public BigDecimal Valor() {
        return valor;
    }
    @Override
    public LocalDate Data() {
        return data;
    }
}
