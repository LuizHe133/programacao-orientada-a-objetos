public class Livro extends Material 
{
    private String autor;

    public Livro(String titulo, int anoPublicacao, String autor) 
    {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    public void descricao()
    {
        System.out.println("=== Livro ===");
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Autor: " + autor);
    }
}
