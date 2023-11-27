package service.Reajuste;

import model.Funcionario;
import service.Reajuste.IValidacaoReajuste;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {
    private List<IValidacaoReajuste> validacoes;

    public ReajusteService(List<IValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustesSalario(Funcionario funcionario, BigDecimal aumento) {
        this.validacoes.forEach(v -> v.validar(funcionario, aumento));

        BigDecimal salarioReajustado = funcionario.salarioAtual().add(aumento);
        funcionario.reajustarSalario(salarioReajustado);
    }
}
