import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aplicacao {
    // Colecao de produtos
    private ArrayList<Produto> estoque;

    // Inicializacao da colecao
    public Aplicacao() {
        estoque = new ArrayList<>();
        estoque.add(new Produto(111,"Aviao",11111.11,11.11));
        estoque.add(new Produto(222,"Computador",22222.22,22.22));
        estoque.add(new Produto(333,"Carne",33.33,3.33));
        estoque.add(new Produto(444,"TV",4444.44,44.44));
        estoque.add(new Produto(555,"Web Cam",555.55,5.55));
        estoque.add(new Produto(666,"Tomate",66.66,66.66));
        estoque.add(new Produto(777,"Tablet",777.77,77.77));
    }

    public void executa() {
        // Desafio 1: mostrar todos os dados dos produtos do estoque
        System.out.println("\n====================");
        System.out.println("1: Mostrar todos os dados dos produtos do estoque");



        // Desafio 2: mostrar todos codigos dos produtos do estoque
        System.out.println("\n====================");
        System.out.println("2: Mostrar todos codigos dos produtos do estoque");



        // Desafio 3: mostrar todos precos dos produtos do estoque
        System.out.println("\n====================");
        System.out.println("3: Mostrar todos precos dos produtos do estoque");



        // Desafio 4: mostrar o somatorio de preco de todos os produtos do estoque
        System.out.println("\n====================");
        System.out.println("4: Mostrar o somatorio de preco de todos os produtos do estoque");



        // Desafio 5: mostrar a quantidade de produtos do estoque
        System.out.println("\n====================");
        System.out.println("5: Mostrar a quantidade de produtos do estoque");



        // Desafio 6: mostrar os produtos do estoque com preco acima de 1000.00
        System.out.println("\n====================");
        System.out.println("6: Mostrar os dados os produtos do estoque com preco acima de 1000.00");
        estoque.stream().filter(p -> p.getPreco() > 1000).forEach(p -> System.out.println(p));



        // Desafio 7: mostrar os nomes dos produtos do estoque com preco abaixo de 100.00
        System.out.println("\n====================");
        System.out.println("7: Mostrar os nomes dos produtos do estoque com preco abaixo de 100.00");


        // Desafio 8: mostrar a media de precos dos produtos do estoque com preco entre 100.00 e 1000.00
        System.out.println("\n====================");
        System.out.println("8: Mostrar a media de precos dos produtos do estoque com preco entre 100.00 e 1000.00");



        // Desafio 9: mostrar os codigos e nomes dos produtos com imposto acima de 40%
        System.out.println("\n====================");
        System.out.println("9: Mostrar os codigos, nomes e imposto dos produtos com imposto acima de 40%");



        // Desafio 10: criar uma lista com os produtos de preco acima de 1000.00
        // Depois imprime os produtos desta nova lista
        System.out.println("\n====================");
        System.out.println("10: Criar uma lista com os codigos e nomes dos produtos de preco acima de 1000.00");
        System.out.println("Depois imprime dados desta nova lista");



    }
    
}
