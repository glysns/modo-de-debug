import cadastros.*;
import correntista.Agencia;
import correntista.Conta;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.List;

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
    public static void escreverLayoutDelimitado(List<Cadastro> cadastros) {
        System.out.println("***** - LAYOUT DELIMITADO - *****");

        try {
            StringBuilder conteudo = new StringBuilder();

            for (Cadastro cadastro : cadastros) {
                conteudo.append(cadastro.getNome()).append(";");
                conteudo.append(cadastro.getCpf()).append(";");
                conteudo.append(cadastro.getDataNascimento()).append(";");
                conteudo.append(cadastro.getEndereco().getBairro()).append(";");
                conteudo.append(cadastro.getEndereco().getCep()).append(";");
                conteudo.append(cadastro.getEndereco().getLogradouro()).append(";");
                conteudo.append(cadastro.getEndereco().getNumero()).append(";");
                conteudo.append(cadastro.getCidade().getNome()).append(";");
                conteudo.append(cadastro.getConta().getNumero()).append(";");
                conteudo.append(cadastro.getAgencia().getNumero()).append(";");
                conteudo.append(cadastro.getSexo()).append(";");
                conteudo.append(cadastro.getUf()).append(";");
                conteudo.append(cadastro.getEstadoCivil()).append(";");
                conteudo.append(System.lineSeparator());
            }
            System.out.println(conteudo.toString());

            Path arquivoDestino = Paths.get("C:\\arquivo-csv\\cadastros-modelo-delimitado.csv");

            Files.write(arquivoDestino, conteudo.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

