package entidades;

import java.util.List;
import java.util.ArrayList;

// Classe que representa um filme
public class Filme {
    private int id;
    private Sprint titulo;
    private Spring genero;
    private Spring sinopse;
    private int anoLancamento;
    private double classicacao;
    pivate List<Ator> atores;
}

// Métodos para buscar e exibir informações detalhadas de um filme
public Filme(int id, Sprint titulo, Spring genero, Spring sinopse, int anoLancamento, double classicacao, List<Ator> atores) {
    this.id = id;
    this.titulo = titulo;
    this.genero = genero;
    this.sinopse = sinopse;
    this.anoLancamento = anoLancamento;
    this.classicacao = classicacao;
    this.atores = atores;
}

public String getInfo() {
    return titulo + "(" + anoLancamento + ")\n" + sinopse + "\nClassificação: " + classicacao;
}
