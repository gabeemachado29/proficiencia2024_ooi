package ifpr.pgua.eic.tads.proficiencia2024.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import ifpr.pgua.eic.tads.proficiencia2024.model.entities.Pessoa;

public class Dados {
    
    private static final String FILENAME="dados.txt";


    public ArrayList<Pessoa> carregar(){
        ArrayList<Pessoa> lista = new ArrayList<>();

        try(FileReader fr = new FileReader(FILENAME); BufferedReader br = new BufferedReader(fr)){

            String linha = br.readLine();

            while(linha != null){
                String[] tks = linha.split(";");

                String nome = tks[0];
                String email = tks[1];
                String telefone = tks[2];

                Pessoa p = new Pessoa(nome,email,telefone);

                lista.add(p);
                linha = br.readLine();
            }

            
        }catch(IOException e){
            System.out.println("Arquivo não encontrado!");
        }
        return lista;
    }

    public void salvar(ArrayList<Pessoa> lista){
        try(FileWriter fw = new FileWriter(FILENAME); BufferedWriter bw = new BufferedWriter(fw)){
            for(Pessoa p:lista){
                bw.write(p.toTxt());
                bw.newLine();
            }
        }catch(IOException e){
            System.out.println("Arquivo não encontrado!");
        }
    }
    
}
