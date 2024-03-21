package ifpr.pgua.eic.tads.proficiencia2024.model;

import java.util.ArrayList;

import ifpr.pgua.eic.tads.proficiencia2024.model.entities.Pessoa;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;

public class Repository {
    
    private ArrayList<Pessoa> pessoas;
    private Dados dados;

    public Repository(Dados dados, ArrayList<Pessoa> pessoas){
        this.dados = new Dados();
        this.pessoas = new ArrayList<>();
    }

    public void carregar(){
        dados.carregar();
    }

    public void salvar(){
        dados.salvar(pessoas);
    }

    public void cadastrar(String nome, String email, String telefone){
        Pessoa pessoa = new Pessoa(nome, email, telefone);
        pessoas.add(pessoa);
        salvar();
    }

    public ArrayList<Pessoa> listar(){
        carregar();
        return pessoas;
    }

}
