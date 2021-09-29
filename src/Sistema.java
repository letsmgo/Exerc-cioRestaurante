import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //Método para criar prato
    public static Prato criarPrato() {
        String nomeDoPrato = capturarDados("Qual é o nome do prato?").nextLine();
        double precoDoPrato = capturarDados("Qual é o valor do prato?").nextDouble();

        Prato pratoAdicionado = new Prato();
        List listaDeIngredientes = listaDeIngredientes();
        pratoAdicionado.setIngredientes(listaDeIngredientes);
        pratoAdicionado.setNomeDoPrato(nomeDoPrato);
        pratoAdicionado.setVlrDoPrato(precoDoPrato);
        return pratoAdicionado;
    }

    //Método para criar um ingrediente
    public static Ingredientes novoIngrediente() {
        String nomeDoIngrediente = capturarDados("Digite o nome do ingrediente: ").nextLine();
        Ingredientes ingredienteAdicionado = new Ingredientes();
        ingredienteAdicionado.setNomeDoIngrediente(nomeDoIngrediente);
        return ingredienteAdicionado;
    }

    //Método para incluir os ingredientes, que foi solicitado no método anterior
    public static List listaDeIngredientes() {
        List<Ingredientes> listaIngredientes = new ArrayList<>();
        int contador = capturarDados("Quantos ingredientes o prato possui?").nextInt();
        while (contador > 0) {
            listaIngredientes.add(novoIngrediente());
            contador--;
        }
        return listaIngredientes;
    }

    //Método para apresentar o Menu
    public static void menu() {
        System.out.println("Digite 1 para adicionar um prato; ");
        System.out.println("Digite 2 para mostrar o prato; ");
    }

    public static void executarMenu() {
        Cardapio cardapio = new Cardapio();
        boolean opcaoDoMenu = true;
        while (opcaoDoMenu) {
            menu();
            int escolhaMenu = capturarDados("Digite a opção desejada: ").nextInt();
            if (escolhaMenu == 1) {
                cardapio.adicionarPratos(criarPrato());
            } else if (escolhaMenu == 2) {
                System.out.println(cardapio);
            }
        }
    }
}
