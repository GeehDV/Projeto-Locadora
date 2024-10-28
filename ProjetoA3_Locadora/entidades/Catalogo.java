package entidades;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

// Classe que representa um catálogo de filmes
public class Catalogo {
    private List<Filme> filmes;
}

// Métodos de busca e filtragem
public Catalogo() {
    filmes = new ArrayList<>();
}   

public void adicionarFilme(Filme filme) {
    filmes.add(filme);
}

public List<Filme> buscarPorTitulo(String titulo)() {
    return filmes.stream()
        .filter(filme -> filme.getTitulo().equals(titulo))
        .collect(Collectors.toList());
}
public List<Filme> buscarPorGenero(String titulo)() {
    return filmes.stream()
        .filter(filme -> filme.getGenero().equals(titulo))
        .collect(Collectors.toList());
}
