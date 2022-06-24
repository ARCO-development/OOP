public class Frota {
    private Carro [] catalogo;
    //constante
    public static final int MAX = 1000;
    //contador de carros
    private int contador;

    public Frota(){
        catalogo = new Carro[MAX];
        contador = 0;
    }

    //Create
    public boolean criarCarro(String placa, double valor, int ano){
        if(contador < MAX){
            Carro novoCarro = new Carro(placa, valor, ano);
            catalogo[contador] = novoCarro;
            contador++;
            return true;
        }
        return false;
    }

    //Retrieve
    //Retorna uma string com os dados de todos os carros do catalogo
    public String consultaTodosCarros(){
        String texto = "";
        for(int i = 0; i < contador; i++){
            Carro aux = catalogo[i];
            texto += aux.toString() + "\n";
        }
        return texto;
    }




}
