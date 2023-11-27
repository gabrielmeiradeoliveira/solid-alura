package service.Promocao;

import model.Cargo;
import model.Funcionario;
import util.ValidacaoException;

public class PromocaoService {
    public void promover(Funcionario funcionario, boolean metaBatida) {
        Cargo cargoAtual = funcionario.cargoAtual();

        if(cargoAtual == Cargo.GERENTE) {
            throw new ValidacaoException("Gerentes não podem ser promovidos");
        }

        if(metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionario não bateu a meta");
        }
    }
}
