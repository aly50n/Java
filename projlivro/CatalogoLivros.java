import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoLivros{
  Scanner input = new Scanner(System.in);
  private ArrayList<Livro> livros = new ArrayList<Livro>();
  
  public CatalogoLivros(){}
  public CatalogoLivros(ArrayList livros){
    this.livros = livros;
  }

  public void adicionar(){
    Livro livro = new Livro();
    System.out.println("Digite os dados do livro que deseja adicionar: ");
    System.out.print("Digite o titulo do livro: ");
    livro.setTitulo(input.nextLine());
    System.out.print("Digite o genero do livro: ");
    livro.setGenero(input.nextLine());
    System.out.print("Digite o tipo de capa do livro: ");
    livro.setTipoCapa(input.nextLine());
    System.out.print("Digite a cor do livro: ");
    livro.setCorCapa(input.nextLine());
    System.out.print("Digite a quantidade de paginas do livro: ");
    livro.setQntPaginas(input.nextInt()); 
    input.nextLine();
    livro.setAberto(false);
    livros.add(livro);
  }

  public void remover(){
    System.out.print("Digite o titulo do livro que deseja remover: ");
    this.livros.remove(this.getLivro(input.nextLine()));
  }

  public void buscar(){
    System.out.print("Digite o titulo do livro que deseja buscar: ");
    String titulo = input.nextLine();
    for(Livro livro: livros){
      if(livro.getTitulo().equals(titulo)){
          livro.status();
          break;
      }
    }
    System.out.println("Livro nao encontrado.");
  }

  public void listarLivros(){
    for(Livro livro: livros){
      livro.status();
    }
  }
  public Livro getLivro(String titulo){
    for(Livro livro: livros){
      if(livro.getTitulo().equals(titulo)){
          return livro;
      }
    }
    return null;
  }
  public ArrayList<Livro> getLivros() {
      return livros;
  }
  public void setLivros(ArrayList<Livro> livros) {
      this.livros = livros;
  }
}