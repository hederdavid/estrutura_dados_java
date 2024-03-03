package pilha.estatica;

public class Main {
    public static void main(String[] args) {
        PilhaEstatica pilha = new PilhaEstatica();
        pilha.empilhar("Instituto");
        pilha.empilhar("Federal");
//        System.out.println("Espiar: " + pilha.topo());
        pilha.empilhar("de");
        pilha.empilhar("Educação");
        pilha.empilhar("Ciência");
        pilha.empilhar("e");
//        System.out.println("Espiar: " + pilha.topo());
//        Object conteudo = pilha.desempilhar();
//        System.out.println(conteudo);
//        pilha.desempilhar();
        pilha.empilhar("Tecnologia");
        pilha.empilhar("da");
        pilha.empilhar("Bahia");
//        pilha.empilhar(pilha.desempilhar());
//        pilha.empilhar(conteudo);
        System.out.println("Pilha="+pilha.imprimir());
    }
}
