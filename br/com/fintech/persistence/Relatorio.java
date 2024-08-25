package br.com.fintech.persistence;

import br.com.fintech.commons.TipoRelatorio;

import java.time.LocalDate;

public class Relatorio {

    private Long idRelatorio;
    private LocalDate dataGeracao;
    private TipoRelatorio tipo;

    public Relatorio() {}

    public Relatorio(Long idRelatorio, TipoRelatorio tipo) {
        this.idRelatorio = idRelatorio;
        this.dataGeracao = LocalDate.now();
        this.tipo = tipo;
    }

    public void gerarRelatorio() {
        System.out.println("Gerando relatório do tipo: " + tipo + " em " + dataGeracao);
    }

    public void imprimirDetalhes() {
        System.out.println("Relatório ID: " + idRelatorio + ", Tipo: " + tipo + ", Data de Geração: " + dataGeracao);
    }

}