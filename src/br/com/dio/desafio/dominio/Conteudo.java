package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public abstract class Conteudo {  //Por ser uma classe abstrata, nao consigo cria-la. Classe criada para implamentação
                                  // atributos e metodos nas classes filhas. "Herança"

    protected static final double XP_PADRAO = 10d;  // static para acessar fora da classe conteudo.
                                                   // Porem por ser protectd apenas as classes filhas poderao acessar.
    private String titulo;
    private String descricao;

    public abstract double calcularXP(); //Todas as minhas classes filhas precisarão ter esse metodo.

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
