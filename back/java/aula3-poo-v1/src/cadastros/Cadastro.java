package cadastros;

import correntista.Agencia;
import correntista.Conta;

import java.time.LocalDate;
import java.util.Date;

public class Cadastro {
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private Endereco endereco;
    private Conta conta;
    private Agencia agencia;
    private Sexo sexo;
    private EstadoCivil estadoCivil;

    private Cidade cidade;

    private Telefone telefone;
    private TelefoneTipo telefoneTipo;

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public TelefoneTipo getTelefoneTipo() {
        return telefoneTipo;
    }

    public void setTelefoneTipo(TelefoneTipo telefoneTipo) {
        this.telefoneTipo = telefoneTipo;
    }

    private Uf uf;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
