import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    //Atributos
    private List<Prato> pratos = new ArrayList<>();

    //Método construtor
    public Cardapio() {
        this.pratos = pratos;
    }

    //Getters and Setters
    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }

    //Método para inclusão de pratos no cardapio
    public void adicionarPratos(Prato pratosDoCardapio){
        pratos.add(pratosDoCardapio);
    }

    @Override
    public String toString(){
        StringBuilder retornar = new StringBuilder();
        retornar.append("Quantidade de pratos do dia: " + pratos.size());
        retornar.append("\n Os pratos são: " + pratos);
        return retornar.toString();
    }

}
