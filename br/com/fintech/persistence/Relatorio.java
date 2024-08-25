package br.com.fintech.persistence;

import br.com.fintech.commons.TipoRelatorio;

import java.time.LocalDate;

public class Relatorio {

    private Long idRelatorio;
    private LocalDate dataGeracao;
    private TipoRelatorio tipo;

    // Construtor padrão
    public Relatorio() {}

    // Construtor com parâmetros
    public Relatorio(Long idRelatorio, TipoRelatorio tipo) {
        this.idRelatorio = idRelatorio;
        this.dataGeracao = LocalDate.now();
        this.tipo = tipo;
    }

    // Método para gerar o relatório
    public void gerarRelatorio() {
        System.out.println("Gerando relatório do tipo: " + tipo + " em " + dataGeracao);
    }

    // Método para imprimir detalhes do relatório
    public void imprimirDetalhes() {
        System.out.println("Relatório ID: " + idRelatorio + ", Tipo: " + tipo + ", Data de Geração: " + dataGeracao);
    }

}