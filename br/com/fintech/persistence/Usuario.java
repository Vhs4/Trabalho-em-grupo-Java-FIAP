package br.com.fintech.persistence;

import br.com.fintech.commons.Genero;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Usuario {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private Genero genero;

    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

    public Usuario (String nome, String sobrenome, String cpf, String rg, Genero genero, int ano, int mes, int dia) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    public void exibirDadosDeUsuario() {
        System.out.printf(this.toString());
    }

    public void atualizarCadastroDeUsuario() {
        System.out.printf("Cadastro de %s atualizado com sucesso", this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("usuario { ");
        sb.append("nome: ").append(this.nome);
        sb.append(", sobrenome: ").append(this.sobrenome);
        sb.append(", cpf: ").append(this.cpf);
        sb.append(", rg: ").append(this.rg);
        sb.append(", dataNascimento: ").append(this.dataNascimento.format(dateTimeFormatter));
        sb.append(", genero: ").append(this.genero);
        sb.append("}");

        return sb.toString();
    }

}