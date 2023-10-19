import cadastros.*;

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
        gleyson.setDataNascimento(LocalDate.of(1990, 7, 8));
        gleyson.setSexo(Sexo.MASCULINO);
        gleyson.setEstadoCivil(EstadoCivil.CASADO);

        Endereco endereco = new Endereco();
        endereco.setBairro("Angelim");
        endereco.setCep("64041-700");
        endereco.setLogradouro("Rua Pranchita");
        endereco.setNumero("386");

        Cidade teresina = new Cidade();
        teresina.setNome("Teresina");
        teresina.setUf(Uf.PI);
        endereco.setCidade(teresina);

        gleyson.setEndereco(endereco);

        System.out.println(gleyson.getEndereco().getCidade().getUf());
        System.out.println(gleyson.getEndereco().getCidade().getNome()
        );

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

