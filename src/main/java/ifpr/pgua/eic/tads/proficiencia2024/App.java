package ifpr.pgua.eic.tads.proficiencia2024;

import java.util.ArrayList;

import ifpr.pgua.eic.tads.proficiencia2024.model.Dados;
import ifpr.pgua.eic.tads.proficiencia2024.model.Repository;
import ifpr.pgua.eic.tads.proficiencia2024.model.entities.Pessoa;
import io.github.hugoperlin.navigatorfx.BaseAppNavigator;
import io.github.hugoperlin.navigatorfx.ScreenRegistryFXML;

/**
 * JavaFX App
 */
public class App extends BaseAppNavigator {

    private Dados dados = new Dados();
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private Repository repository = new Repository(dados, pessoas);

    @Override
    public void init() throws Exception {
        super.init();
        repository.carregar();
    }


    @Override
    public String getHome() {
        return "PRINCIPAL";
    }


    @Override
    public String getAppTitle() {
        // TODO Auto-generated method stub
        return "Cadastro";
    }

    @Override
    public void registrarTelas() {
        registraTela("PRINCIPAL", new ScreenRegistryFXML(App.class, "principal.fxml", o->new Principal(repository)));
    }

}