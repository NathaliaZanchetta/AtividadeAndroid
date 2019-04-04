package br.usjt.filaChamados;

import java.util.Date;
import java.io.Serializable;

public class Chamado implements Serializable {

    private int idChamado;
    private Fila fila;
    private String descricao;
    private Date dataAbertura;
    private Date dataFechamento;
    private String status;

    public Chamado(int idChamado, Fila fila, String descricao, Date date, Date date1, String status) {

    }


    public int getIdChamado() {

        return idChamado;
    }

    public void setIdChamado(int idChamado) {

        this.idChamado = idChamado;
    }

    public Fila getFila() {
        return fila;
    }

    public void setFila(Fila fila) {

        this.fila = fila;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public Date getDataAbertura() {

        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {

        this.dataAbertura = dataAbertura;
    }

    public Date getDataFechamento() {

        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {

        this.dataFechamento = dataFechamento;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

}
