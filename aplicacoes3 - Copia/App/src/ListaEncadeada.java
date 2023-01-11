
//Classe contruida para criar a lista encadeada 
public class ListaEncadeada {
    /*Atribuimos duas variáveis para indicar o começo e o fim, e ambos recebem o valor nulo, e por ultimos a variavel para armazenar o total de elementos que tem na lista  */
    private No inicio = null;
    private No fim = null;
    private int totElementos = 0;
    
    //Samuel Venturini
    /*Esse é o metodo usado para alterar notas dos alunos buscando o aluno pela matricula e depois ele chama o metodo alterar nota do aluno da lista sequecial para buscar pela posição que se desejar trocar a nota. */
    public void altAluno(double novaNota, int posicao, int matricula){
        No atual = inicio;
        while(atual != null){
            if(atual.getAluno().getMatricula() == matricula){
               Aluno aluno = atual.getAluno();
               ListaSequecial notas = aluno.getNotas();
               notas.alterNota(novaNota, posicao);
               aluno.setNotas(notas);
               break;
            }else{
               atual = atual.getProximo(); 
            }
        }
    
    }
   
    // Metodo que limpa a lista atribuindo a nulo todos os valores da lista. 
    // No caso do java não é necessario, dependendo da complexidade, pois a linguagem tem o Garbage Collector(coletor de lixo)
    public void limpar(){
        for(No atual = this.inicio; atual != null;){
           No proximo = atual.getProximo();
           atual.setAluno(null);
           atual.setProximo(null);
           atual = proximo;
        }
    }

    // Este metodo e feito para buscar o aluno desejado digitando a matricula dele, o metodo compara a matricula de cada aluno com a digitada quando achado o aluno é retornado esse aluno de volta.
    //erick dutra
    public Aluno buscar(int matricula) {
        No atual = inicio;
        while (atual != null) {
            if (atual.getAluno().getMatricula() == matricula) {
                return atual.getAluno();
            } else {
                atual = atual.getProximo();
            }
        }
        return null;
    }

    //Aqui o metodo tem como função remover no inicio os elementos da lista, ele verifica se a lista não esta vazia ao ele atibuio o proximo como o incio.
    // Ale
    public void removeInicio() {
        if (length() == 0) {
            System.out.println("lista vazia!!!");
        } else {
            this.inicio = this.inicio.getProximo();
        }
        totElementos--;
    }

    // Já etse método de remoção realiza a remoção no meio da lista, basta apenas informar a matricula do aluno que se deseja remover a amtricula, ele compara a matricula de cada aluno, quando achado o aluno que se deseja remover ele atribui o proximo do anterior ao proximo do atual. 
    //Bruno Kuster
    public void removeMeio(int matricula){
          No atual = inicio;
          No ante = null;
         // int i =0;
          while(atual != null){
              if(atual.getAluno().getMatricula() == matricula){
                ante.setProximo(atual.getProximo());
                atual =null;
                break;
              }else{
                ante = atual;
                atual = atual.getProximo();
              }
          }
          totElementos--;
    }

    public int length() {
        return totElementos;

    }

    // Este  metodo de de adição no começo da lista, este metodo verifica se a lista ta vazia, se for o caso ele pega o novo no criado e seta nele as variaveis inicio e fim, se não for o caso ele seta o proximo do novo no a variavel que indica o inicio, e depois atribui a o inicio a variavel novoNo
    // Pedro Henrique
    public void adicionar(Aluno aluno) {
        No novoNo = new No(aluno);

        if (totElementos == 0) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            novoNo.setProximo(inicio);
            this.inicio = novoNo;
        }
        totElementos++;
    }

    //Aqui este metodo, adiciona elementos no fim da lista, criando  um novo nó, e setando a variavel fim ao novo No criado, para depois a variavel fim receber o novoNo.
    // Agliberto Luz
    public void adicionaFim(Aluno aluno) {
        No novoNo = new No(aluno);
        this.fim.setProximo(novoNo);
        this.fim = novoNo;
        totElementos++;
    }

    //Esse metodo de adição adiciona o elemento no meio da lista passando o aluno que deseja adicionar e a posição na lista, para isso ele cria um novo no e uma variavel para percorre a lista ate a posição desejada, ao achar a posição ele adiciona o proximo do novoNo ao proximo da variavel atual, e o atual seta o novo No.
    // Breno falcão
    public void adicionaMeio(Aluno aluno, int posicao) {
        No novoNo = new No(aluno);

        No atual = inicio;
        int i = 0;
        while (i <= posicao && atual != null) {
            atual = atual.getProximo();// itera o laço
            i++;
        }
        novoNo.setProximo(atual.getProximo());
        atual.setProximo(novoNo);
        totElementos++;

    }

    public void mostrar() {
        No atual = inicio;

        while (atual != null) {
            System.out.println(atual);
            atual = atual.getProximo();
        }
    }
}
