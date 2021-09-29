import java.util.ArrayList;
import java.util.List;

public class Prato {
    //Atributos da classe
    String nomeDoPrato;
    double vlrDoPrato;
    private List<Ingredientes> ingredientes = new ArrayList<>();

    //Método construtor
    public Prato(){

    }
    public Prato(String nomeDoPrato, double vlrDoPrato, List<Ingredientes> ingredientes) {
        this.nomeDoPrato = nomeDoPrato;
        this.vlrDoPrato = vlrDoPrato;
        this.ingredientes = ingredientes;
    }

    //-----------------------------------------------------------------------------------------------------
    //Getters and Setters
    public String getNomeDoPrato() {
        return nomeDoPrato;
    }

    public void setNomeDoPrato(String nomeDoPrato) {
        this.nomeDoPrato = nomeDoPrato;
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getVlrDoPrato() {
        return vlrDoPrato;
    }

    public void setVlrDoPrato(double vlrDoPrato) {
        this.vlrDoPrato = vlrDoPrato;
    }

    //-----------------------------------------------------------------------------------------------------
    //Método para adicionar ingredientes nos pratos
    public void adicionarIngredientes(Ingredientes ingredientesDoPrato) {
        ingredientes.add(ingredientesDoPrato);
    }

    @Override
    public String toString() {
        StringBuilder retornar = new StringBuilder();
        retornar.append("\t Nome do prato: " + nomeDoPrato +"\n");
        retornar.append("\t Valor do prato: R$" + vlrDoPrato + "\n");
        retornar.append("\t Ingredientes: " + ingredientes + "\n");
        return retornar.toString();
    }
}
