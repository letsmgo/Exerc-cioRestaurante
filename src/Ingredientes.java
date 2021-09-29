public class Ingredientes {
    private String nomeDoIngrediente;

    //Método construtor
    public Ingredientes() {
        this.nomeDoIngrediente = nomeDoIngrediente;
    }

    //Getters and Setters
    public String getNomeDoIngrediente() {
        return nomeDoIngrediente;
    }

    public void setNomeDoIngrediente(String nomeDoIngrediente) {
        this.nomeDoIngrediente = nomeDoIngrediente;
    }

    @Override
    public String toString() {
        StringBuilder retornar = new StringBuilder();
        retornar.append(nomeDoIngrediente);
        return retornar.toString();
    }

}
