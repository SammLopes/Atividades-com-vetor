import java.util.Arrays;

public class ListaSequecial {
    private double[] notas = new double[5];
    private int totElementos = 0;

    
    public ListaSequecial() {

    }
    //Criamos o construtor para reber a notas dos alunos e charmos elas no toString da classe Aluno
    public ListaSequecial(double nota1, double nota2, double nota3, double nota4, double nota5) {
        adiciona(nota1);
        adiciona(nota2);
        adiciona(nota3);
        adiciona(nota4);
        adiciona(nota5);
    }

    public void adiciona(double nota) {
        notas[totElementos] = nota;
        totElementos++;
    }

    public void garanteEspaco() {
        if (totElementos == notas.length) {
            double[] novoVetor = new double[notas.length * 2];
            for (int i = 0; i < notas.length; i++) {
                novoVetor[i] = notas[i];
            }
            notas = novoVetor;
        }
    }

    public int tamanho() {
        return totElementos;
    }

    public void retornaNota(int posicao) {
        int pos = posicao - 1;
        if (pos < tamanho()) {
            System.out.println(notas[pos]);
        } else {
            System.out.println("Posiçao maior que o vetor");
            System.out.println("Digite uma posição valida");
        }
    }

    public void contem(double nota) {
        int n = 0;
        for (int i = 0; i < tamanho(); i++) {
            if (notas[i] == nota) {
                n = n + 1;
            }
        }
        if (n >= 1) {
            System.out.println("Contem nota!!!");
        } else {
            System.out.println("Não contem nota!!!");
        }
    }

    public double soma() {
        double soma = 0;
        for (int i = 0; i < tamanho(); i++) {
            soma += notas[i];
        }
        return soma;
    }
    public void alterNota(double nota, int posicao){
        
        this.notas[posicao] = nota;
    }
    public double mediaNotas() {

        double media = soma() / notas.length;

        return media;

    }
   
    public String resultado() {
        if (mediaNotas() > 7) {
            return "Aluno Aprovado!!!!!";
        } else {
            return "Aluno reprovado!!!!!!";
        }
    }

    public String mediaNotasStr() {
        double notas = mediaNotas();
        return String.format("%.2f", notas);
    }

    public void mostrar() {
        for (int i = 0; i < tamanho(); i++) {
            System.out.println(notas[i] + " , ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ListaSequecial [notas=" + Arrays.toString(notas) + "]";
    }

}
