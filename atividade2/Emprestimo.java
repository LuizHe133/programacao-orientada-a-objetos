public class Emprestimo 
{
    private Pessoa pessoa;
    private ItemEmprestavel itememprestavel;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Pessoa pessoa, ItemEmprestavel itememprestavel, String dataEmprestimo, String dataDevolucao) 
    {
        this.pessoa = pessoa;
        this.itememprestavel = itememprestavel;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirDetalhes() 
    {
        System.out.println("\n=== Detalhes do Item ===");
        System.out.println("Data do Empréstimo: " + dataEmprestimo);
        System.out.println("Data de Devolução: " + dataDevolucao);
        System.out.println("\nInformações da Pessoa:");
        pessoa.exibirInfo();
        System.out.println("\nInformações do Item:");
        material.descricao();
    }
}
