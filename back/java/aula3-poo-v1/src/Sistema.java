import cadastros.*;
import correntista.Agencia;
import correntista.Conta;

import java.time.LocalDate;

public class Sistema {
    public static void main(String[] args) {
        Cadastro gleyson = new Cadastro();
        gleyson.setNome("GLEYSON SAMPAIO");
        gleyson.setCpf("618.677.980-77");
        gleyson.setDataNascimento(LocalDate.of(1990, 7, 8));

        Endereco endereco = new Endereco();
        endereco.setBairro("Angelim");
        endereco.setCep("64041-700");
        endereco.setLogradouro("Rua Pranchita");
        endereco.setNumero("386");

        Cidade cidade = new Cidade();
        cidade.setNome("Teresina");

        Conta contaCorrente = new Conta();
        contaCorrente.setNumero("76509-");

        Agencia agencia = new Agencia();
        agencia.setNumero("3345-0");

        Sexo.MASCULINO.toString();
        Uf.MA.toString();
        EstadoCivil.CASADO.toString();
    }
}
