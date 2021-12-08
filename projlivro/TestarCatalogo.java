public class TestarCatalogo {
    public static void main(String[] args){
        Livro livro = new Livro("O pequeno principe","Fabula", "capa dura", "amarelo", 80, false);
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal","Aventura", "capa mole", "azul", 264, false);
        Livro livro3 = new Livro("Coraline","Terror Infantil", "capa dura", "branca", 160, false);
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.getLivros().add(livro);
        catalogo.getLivros().add(livro2);
        catalogo.getLivros().add(livro3);
        catalogo.listarLivros();
        catalogo.adicionar();
        catalogo.buscar();
        catalogo.remover();
        catalogo.listarLivros();
    }
}
