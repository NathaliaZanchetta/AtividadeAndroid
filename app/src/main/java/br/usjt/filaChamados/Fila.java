package br.usjt.filaChamados;

import java.util.List;
import java.io.Serializable;

public class Fila implements Serializable{

    private int id;
    private String nome;
    private int iconId;
    private List<Chamado> chamados;

    public Fila (int id, String n, int iconId){
        setId(id);
        setNome(n);
        setIconId(iconId);
    }

    public Fila (String n, int i){
        this(0, n, i);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
}
