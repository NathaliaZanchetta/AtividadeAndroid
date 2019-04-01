package br.usjt.filaChamados;

import java.util.List;
import java.io.Serializable;

public class Fila implements Serializable{

    private String nome;
    private int iconId;
    private String descricao;
    private List<Chamado> chamados;
    private String status;

    public Fila(String nome, int iconId, String descricao, String status) {
        this.nome = nome;
        this.iconId = iconId;
        this.descricao = descricao;
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    @Override
    public String toString() {
        return "Fila{" +
                "descricao='" + descricao + '\'' +
                '}';
    }

    public List<Chamado> getChamados() {
        return chamados;
    }
    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIconId() {
        return iconId;
    }
    public void setIconId(int iconId) {
        this.iconId = iconId;
    }


}
