package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for (Livro l: livrosList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno =  new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()){
            for (Livro l: livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("Livro 1", "Autor 1", 2023);
        catalogoLivros.adicionarLivros("Livro 2", "Autor 1", 2022);
        catalogoLivros.adicionarLivros("Livro 3", "Autor 2", 2024);
        catalogoLivros.adicionarLivros("Livro 4", "Autor 3", 2023);
        catalogoLivros.adicionarLivros("Livro 5", "Autor 4", 2026);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogoLivros.pesquisaPorAno(2023, 2026));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

    }
}


