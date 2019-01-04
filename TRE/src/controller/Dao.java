package controller;

import tre.modal.Secao;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Dao {

    public static boolean salvar(List<Secao> secoes, boolean condicao) {

        try {
            FileOutputStream caminho = new FileOutputStream(FatorConexao.url(), condicao);
            ObjectOutputStream informacao = new ObjectOutputStream(caminho);
            informacao.writeObject(secoes);//escrever objeto na seção
            informacao.flush();
            caminho.close();
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
        return true;
    }

    public static List<Secao> listar() {
        List<Secao> secao = null;

        try {
            FileInputStream archive = new FileInputStream(FatorConexao.url());
            ObjectInputStream object = new ObjectInputStream(archive);
            secao = (List<Secao>) object.readObject();

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {

        }
        return secao;
    }
}
