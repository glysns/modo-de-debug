import cadastros.*;
import correntista.Agencia;
import correntista.Conta;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
    public static void main(String[] args) {
        Cadastro gleyson = new Cadastro();
        gleyson.setNome("GLEYSON SAMPAIO");
        gleyson.setCpf("618.677.980-77");
        gleyson.setDataNascimento(LocalDate.of(1990, 7, 8));

        gleyson.getEndereco().setBairro("Angelim");
        gleyson.getEndereco().setCep("64041-700");
        gleyson.getEndereco().setLogradouro("Rua Pranchita");
        gleyson.getEndereco().setNumero("386");

        gleyson.getCidade().setNome("Teresina");

        gleyson.getConta().setNumero("76509-");

        gleyson.getAgencia().setNumero("3345-0");

        gleyson.setSexo(Sexo.MASCULINO);
        gleyson.setUf(Uf.PI);
        gleyson.setEstadoCivil(EstadoCivil.CASADO);

        List<Cadastro> cadastros = new ArrayList<>();
        cadastros.add(gleyson);

        escreverLayoutDelimitado(cadastros);
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
