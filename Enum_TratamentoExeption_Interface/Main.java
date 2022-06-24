import dados.CadastroPessoas;
import dados.CadastroPessoasArray;
import ui.Agenda;

public class Main {

    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoasArray();
        Agenda agenda = new Agenda(cadastro);
        agenda.executa();
    }

}
