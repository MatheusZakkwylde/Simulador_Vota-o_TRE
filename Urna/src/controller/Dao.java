package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.LiberarUrnaTerminal;
import tre.modal.Candidato;
import tre.modal.Secao;

public class Dao {
    /**
     * Metodo candidato prefeito
     * retorna o canidato a prefeito se existe um numero com esse dado
     * @param num
     * @return 
     */
    public static Candidato candidatoPrefeito(String num) {

        try {
            FileInputStream archive = new FileInputStream(FatorConexao.urlTRE());
            ObjectInputStream object = new ObjectInputStream(archive);
            List<Secao> secao = (List<Secao>) object.readObject();
            for (int i = 0; i < secao.size(); i++) {
                for (int j = 0; j < secao.get(i).getCandidatos().size(); j++) {
                    if (secao.get(i).getCandidatos().get(j).getNumero() == Integer.parseInt(num) && secao.get(i).getCandidatos().get(i).getCargo().equals("Prefeito")) {
                        return secao.get(i).getCandidatos().get(j);
                    }
                }
            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {

        }
        return null;
    }
    
    /**
     * Metodo candidato a gobernador
     * retorna um candidato overnador se existe um numero no TRE
     * @param num
     * @return 
     */

    public static Candidato candidatoGonvernador(String num) {

        try {
            FileInputStream archive = new FileInputStream(FatorConexao.urlTRE());
            ObjectInputStream object = new ObjectInputStream(archive);
            List<Secao> secao = (List<Secao>) object.readObject();
            for (int i = 0; i < secao.size(); i++) {
                for (int j = 0; j < secao.get(i).getCandidatos().size(); j++) {
                    if (secao.get(i).getCandidatos().get(j).getNumero() == Integer.parseInt(num) && secao.get(i).getCandidatos().get(i).getCargo().equals("Governador")) {
                        return secao.get(i).getCandidatos().get(j);
                    }
                }
            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {

        }
        return null;
    }

    /**
     * Metodo seta voto do prefeito
     * Se a seção for aque esta salva no arquivo SecaoUrna
     * for igual a seção do candidato e o numero dele e for prefeito.
     * seta valor dele com mais um.
     * @param num 
     */
    public static void setarVotosPrefeito(String num) {

        try {
            FileInputStream archive = new FileInputStream(FatorConexao.urlTRE());
            ObjectInputStream object = new ObjectInputStream(archive);
            List<Secao> secao = (List<Secao>) object.readObject();
            for (int i = 0; i < secao.size(); i++) {
                for (int j = 0; j < secao.get(i).getCandidatos().size(); j++) {
                    //olhe que estou pegando o numero da seção cadastrada pelo usuario e verificando se essa seção do arquivo
                    //urna existe na lista de seção do arquivo do tre. Se sim seta valor se não não tem como dar erro
                    if (secao.get(i).getNumero() == Dao.getUrnaSecao() && secao.get(i).getCandidatos().get(j).getNumero() == Integer.parseInt(num) && secao.get(i).getCandidatos().get(i).getCargo().equals("Prefeito")) {
                        secao.get(i).getCandidatos().get(j).setVotos(secao.get(i).getCandidatos().get(j).getVotos() + 1);
                        salvar(secao);
                    }
                }
            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {

        }

    }

    
    
    
    
    
    
    
    
    /**
     * Metodo setavoto converdador
     * mesma função do seta votos Prefeito
     * @param numCandidato 
     */
  
     public static void setarVotoGovernador(String num) {

        try {
            FileInputStream archive = new FileInputStream(FatorConexao.urlTRE());
            ObjectInputStream object = new ObjectInputStream(archive);
            List<Secao> secao = (List<Secao>) object.readObject();
            for (int i = 0; i < secao.size(); i++) {
                for (int j = 0; j < secao.get(i).getCandidatos().size(); j++) {
                    //olhe que estou pegando o numero da seção cadastrada pelo usuario e verificando se essa seção do arquivo
                    //urna existe na lista de seção do arquivo do tre. Se sim seta valor se não não tem como dar erro
                    if (secao.get(i).getNumero() == Dao.getUrnaSecao() && secao.get(i).getCandidatos().get(j).getNumero() == Integer.parseInt(num)) {
                        secao.get(i).getCandidatos().get(j).setVotos(secao.get(i).getCandidatos().get(j).getVotos() + 1);
                        System.out.println(secao.get(i).getCandidatos().get(j).getVotos());
                        salvar(secao);
                    }
                }
            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {

        }

    } 
    
    
    /**
     * Verificar seção
     * se existe seção no tre cadastrada for igual a passa
     * retorne true, se não false
     * @param num
     * @return 
     */
    public static boolean secaoUrna(String num) {

        try {
            FileInputStream archive = new FileInputStream(FatorConexao.urlTRE());
            ObjectInputStream object = new ObjectInputStream(archive);
            List<Secao> secao = (List<Secao>) object.readObject();

            for (int i = 0; i < secao.size(); i++) {
                if (secao.get(i).getNumero() == Integer.parseInt(num)) {
                    return true;
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    /**
     * Gravar numero da seção login
     * @param numeroSecao 
     */
    public static void urna(String numeroSecao) {
        FileOutputStream caminho = null;
        try {
            Secao secao = new Secao();
            secao.setNumero(Integer.parseInt(numeroSecao));
            caminho = new FileOutputStream(FatorConexao.urlSecaoUrna());
            ObjectOutputStream informacao = new ObjectOutputStream(caminho);
            informacao.writeObject(secao);
            informacao.flush();
            caminho.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                caminho.close();
            } catch (IOException ex) {
                Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Retorna seção passada no login
     * @return 
     */
    public static int getUrnaSecao() {
        FileInputStream archive = null;
        Secao secao = null;
        try {
            archive = new FileInputStream(FatorConexao.urlSecaoUrna());
            ObjectInputStream object = new ObjectInputStream(archive);
            secao = (Secao) object.readObject();
            return secao.getNumero() ;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                archive.close();
            } catch (IOException ex) {
                Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return secao.getNumero();
    }
    
    //apos termina votação ele trava urna e libera terminal.
    public static void travaUrna (){
        FileOutputStream caminho = null;
        try {
            LiberarUrnaTerminal urnaLiberar = new LiberarUrnaTerminal();
            urnaLiberar.setLiberar(false);
            caminho = new FileOutputStream(FatorConexao.urlTerminal_urna());
            ObjectOutputStream informacao = new ObjectOutputStream(caminho);
            informacao.writeObject(urnaLiberar);//escrever objeto na seção
            informacao.flush();
            caminho.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                caminho.close();
            } catch (IOException ex) {
                Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
      /**
       * Método para salvar a seção quando seta o valor do candidatos
       * @param secoes
       * @return 
       */
     private static boolean salvar(List<Secao> secoes) {

        try {
            FileOutputStream caminho = new FileOutputStream(FatorConexao.urlTRE());
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
}
