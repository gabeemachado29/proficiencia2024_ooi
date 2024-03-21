package ifpr.pgua.eic.tads.proficiencia2024.model;

import java.util.ArrayList;

import ifpr.pgua.eic.tads.proficiencia2024.model.entities.Pessoa;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;

public class Repository {
    
    private ArrayList<Pessoa> pessoas;
    private Dados dados;

    public Repository(Dados dados){
        this.dados = new Dados();
    }

    public void carregar(){
        //carregar os dados do arquivo
    }

    public void salvar(){
        dados.salvar(pessoas);
    }

    public void cadastrar(String nome, String email, String telefone){

        Pessoa pessoa = new Pessoa(nome, email, telefone);
        pessoas.add(pessoa);
    }

    public ArrayList<Pessoa> listar(){
        return pessoas;
    }

}
