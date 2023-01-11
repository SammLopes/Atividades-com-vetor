//Classe onde sera armazenado os alunos da lista
  public class Aluno {
   
    private ListaSequecial notas;
    private int matricula;
    private String nome;

    //Modificamos o toString para mostrar os resultado na tela
    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + nome + ", notas=" + notas.toString() + ", media = "+notas.mediaNotasStr()+", resultado = "+notas.resultado()+"]";
    }
   
    public Aluno(int matricula, String nome,ListaSequecial notas) {       
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    public ListaSequecial getNotas() {
        return notas;
    }

    public ListaSequecial setNotas(ListaSequecial notas) {
       return this.notas = notas;
    }
}
