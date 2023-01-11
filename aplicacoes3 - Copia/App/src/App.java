/*Alunos:Alessandro Santos Agliberto Luz, Breno Falcão, Bruno Kuster, Pedro Souza,Erick Dutra, Samuel Venturini */
/*Classe principal onde é chamado as outras classes do codigo  */
public class App {
  public static void main(String[] args) throws Exception {
   //Instanciação e declaração de um objeto do tipo lista encadeada para poder acessar os metodos dentro da classe ListaEncadeada
    ListaEncadeada lista = new ListaEncadeada();
   // Instanciação e declaração dos objetos do tipos aluno com os atributos de nome matricula, as cinco notas dos alunos, e no construtor da classe tem a chamada do metodo para calcular a media de cada aluno e mostra se o mesmo esta reprovado ou aprovado.
    Aluno aluno1 = new Aluno(1002, "joa", new ListaSequecial(
        7.3, 8.4, 9.6, 2.4, 8.5));
    Aluno aluno2 = new Aluno(1003, "Mary", new ListaSequecial(
        7.3, 9.4, 4.6, 7.4, 1.5));
    Aluno aluno3 = new Aluno(1004, "Jone", new ListaSequecial(
        7.3, 8.4, 9.6, 2.4, 8.5));
    Aluno aluno4 = new Aluno(1005, "Peter", new ListaSequecial(
        7.3, 8.4, 9.6, 2.4, 8.5));
    Aluno aluno5 = new Aluno(1006, "Jane", new ListaSequecial(
        7.3, 8.4, 9.6, 2.4, 8.5));
    Aluno aluno6 = new Aluno(1007, "Parker", new ListaSequecial(
        7.3, 8.4, 9.6, 2.4, 8.5));
    Aluno aluno7 = new Aluno(1008, "Miles", new ListaSequecial(
        7.3, 8.4, 9.6, 2.4, 8.5));

    // Aqui e feita adição dos elementos de forma encadeada adicionando o elemento no inicio
    lista.adicionar(aluno1);
    lista.adicionar(aluno2);
    lista.adicionar(aluno3);
    lista.adicionar(aluno4);
    lista.adicionar(aluno5);
    lista.adicionar(aluno6);
    lista.adicionar(aluno7);
    //lista.mostrar();
    //lista.removeInicio();
    System.out.println("==========================================");
   // lista.mostrar();
    //System.out.println("======================================");
   // lista.adicionar(aluno7);
   // lista.mostrar();
    //System.out.println("==========================================");
    //System.out.println(lista.buscar(1008));
    
    // lista.adicionaMeio(aluno7, 2);
    //lista.removeMeio(1008);
    //aluno1.getNotas().alterarNotaAluno(1002,2);
    //lista.limpar();
    //System.out.println("=====");
    
    //lista.altAluno(5.2, 2, 1003);

    lista.mostrar();
    // lista.soma();
    // lista.mediaNotas();
    // lista.resultado();
    // lista.contem(10);
    // lista.retornaNota(5);
    // lista.garanteEspaco();
    // lista.mostrar();

  }
}
