//Classe para podermos criar o no para realiarmos a lista encadeada, atribuindo como atributos uma variavel aluno que se deseja armazanar e a variavel do tipo no proximo para apontar para o proximo elemento da lista.
public class No {
    private Aluno aluno;
    private No proximo = null;
   
    
   public No(Aluno aluno) {
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return " [aluno=" + aluno + "]";
    }

    
}
