package service.Reajuste;

import model.Funcionario;

import java.math.BigDecimal;

public interface IValidacaoReajuste {
    void validar(Funcionario funcionario, BigDecimal aumento);
}
