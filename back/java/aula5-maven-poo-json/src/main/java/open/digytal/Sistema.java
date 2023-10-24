package open.digytal;

import open.digytal.model.cadastros.*;
import open.digytal.model.correntista.Agencia;
import open.digytal.model.correntista.Conta;

import java.time.LocalDate;

public class Sistema {
    public static void main(String[] args) {
        Cadastro gleyson = new Cadastro();
        gleyson.setNome("GLEYSON SAMPAIO");
        gleyson.setCpf("618.677.980-77");
        gleyson.setDataNascimento(LocalDate.of(1990, 8, 8));
        gleyson.setSexo(Sexo.MASCULINO);
        gleyson.setEstadoCivil(EstadoCivil.CASADO);

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua Pranchita");
        endereco.setNumero("386");
        endereco.setBairro("Angelim");
        endereco.setCep("64041-700");

        Cidade teresina = new Cidade();
        teresina.setNome("Teresina");
        teresina.setUf(Uf.PI);

        endereco.setCidade(teresina);
        gleyson.setEndereco(endereco);

        Agencia agencia = new Agencia();
        agencia.setNumero("3345-0");

        Conta conta = new Conta();
        conta.setNumero("76509-3");
        conta.setSaldo(5238.19);
        conta.setAgencia(agencia);
        conta.setCadastro(gleyson);
    }
}