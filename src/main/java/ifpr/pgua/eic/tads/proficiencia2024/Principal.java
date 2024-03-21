package ifpr.pgua.eic.tads.proficiencia2024;


import ifpr.pgua.eic.tads.proficiencia2024.model.Repository;
import ifpr.pgua.eic.tads.proficiencia2024.model.entities.Pessoa;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Principal {

    private Repository repository;
    
    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtTelefone;

    @FXML
    private ListView<Pessoa> listaPessoas;
    
    public Principal(Repository repository){
        this.repository = repository;
    }

    @FXML
    public void cadastrar() {
        String nome = txtNome.getText();
        String email = txtEmail.getText();
        String telefone = txtTelefone.getText();
        
        Pessoa pessoa = new Pessoa(nome, email, telefone);
        repository.cadastrar(nome, email, telefone);

        listar();
    }

    @FXML
    public void listar() {
        repository.listar();
    }
}
