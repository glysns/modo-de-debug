package open.digytal;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import open.digytal.model.cadastros.*;
import open.digytal.model.correntista.Agencia;
import open.digytal.model.correntista.Conta;

import java.time.LocalDate;

public class Sistema {
    public static void main(String[] args) throws Exception {
        Conta contaGleyson = consultarContaGleyson();

        //a partir de agora, você estará utilizando as classes
        //da biblioteca Jackson

        ObjectMapper conversor = new ObjectMapper();

        String json = conversor.writeValueAsString(contaGleyson);

        System.out.println("O json do objeto conta com as respectivas dependencias é:");
        System.out.println(json);

    }

    //imagina que esta conta já está em seu banco de dados
    static Conta consultarContaGleyson(){
        Cadastro gleyson = new Cadastro();
        gleyson.setNome("GLEYSON SAMPAIO");
        gleyson.setCpf("618.677.980-77");
        //gleyson.setDataNascimento(LocalDate.of(1990, 8, 8));
        gleyson.setSexo(Sexo.MASCULINO);
        gleyson.setEstadoCivil(EstadoCivil.CASADO);
        Telefone telefone = new Telefone();
        telefone.setDdi(55);
        telefone.setDdd(11);
        telefone.setNumero(945608767L);
        telefone.setTipo(TelefoneTipo.WHATSAPP);
        gleyson.setTelefone(telefone);

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
        agencia.setCnpj("45.875.986/0001-27");

        Conta conta = new Conta();
        conta.setNumero("76509-3");
        conta.setSaldo(5238.19);
        conta.setAgencia(agencia);
        conta.setCadastro(gleyson);

        return conta;
    }
    /*


        // pretty print - json lindão visualmente
        String json = conversor.writerWithDefaultPrettyPrinter().writeValueAsString(contaGleyson);

        //usar padrão americano para conversão dos campos data e hora com LocalDate e LocalTime
        conversor.registerModule(new JavaTimeModule());
        conversor.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

     */
}