package service.Reajuste;

import model.Funcionario;
import service.Reajuste.IValidacaoReajuste;
import util.ValidacaoException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeReajuste implements IValidacaoReajuste {
    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long dataDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if(dataDesdeUltimoReajuste <= 6) {
            throw new ValidacaoException("Intervalo entre reajustes é no minimo de seis meses");
        }
    }
}