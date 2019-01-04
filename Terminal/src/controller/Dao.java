package controller;

import tre.modal.Eleitor;
import tre.modal.Secao;
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

public class Dao {

    /**
     * Metodo que verifica se a seção digitada pelo usuario existe no arquivo
     * TRE_Dados.txt.
     *
     * @param numeroSecao recebe como paramentro o numero da seção.
     * @return se existe retorne secao, se não retorne null.
     */
    public static List<Secao> secaoExiste(String numeroSecao) {
        try {
            FileInputStream caminho = new FileInputStream(FatorConexao.urlTRE());
            ObjectInputStream informacao = new ObjectInputStream(caminho);
            List<Secao> listSecao = (List<Secao>) informacao.readObject();

            for (int i = 0; i < listSecao.size(); i++) {
                if (listSecao.get(i).getNumero() == Integer.parseInt(numeroSecao)) {
                    return listSecao;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Método que salvar a seção quando usuário loga
     *
     * @param numSecao recebe o numero da seção
     * @return retorna true se consigue salvar, se não retorna false.
     */
    public static boolean SetSecaoTerminal(String numSecao) {
        try {
            Secao secao = new Secao();
            secao.setNumero(Integer.parseInt(numSecao));

            FileOutputStream caminho = new FileOutputStream(FatorConexao.urlSecaoTerminal(), false);
            ObjectOutputStream informacao = new ObjectOutputStream(caminho);
            informacao.writeObject(secao);//escrever objeto
            informacao.flush();
            caminho.close();

        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
        return true;
    }

    /**
     * Método getSecaoTerminal Responsavel por retorna a seçao cadastrada no
     * sistema na hora de logar
     *
     * @return numero do seção do terminal
     */
    public static int getSecaoTerminal() {
        FileInputStream caminho = null;
        Secao secao = null;

        try {
            caminho = new FileInputStream(FatorConexao.urlSecaoTerminal());
            ObjectInputStream informacao = new ObjectInputStream(caminho);
            secao = (Secao) informacao.readObject();
            return secao.getNumero();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                caminho.close();
            } catch (IOException ex) {
                Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return secao.getNumero();
    }

    /**
     * Método de busca eleitor
     *
     * @param titulo recebe um titulo para ver se ele existe no arquivo
     * TRE_Dados
     * @return Se sim retorna o eleitor do mesmo titulo. Se não retorna null
     */
    public static Eleitor Titulo(String titulo) {

        try {
            FileInputStream caminho = new FileInputStream(FatorConexao.urlTRE());
            ObjectInputStream informacao = new ObjectInputStream(caminho);

            List<Secao> ListSecao = (List<Secao>) informacao.readObject();

            for (int i = 0; i < ListSecao.size(); i++) {
                if (ListSecao.get(i).getNumero() == getSecaoTerminal()) {
                    for (int j = 0; j < ListSecao.get(i).getEleitor().size(); j++) {
                        if (ListSecao.get(i).getEleitor().get(j).getTitulo().equals(titulo)) {
                            return ListSecao.get(i).getEleitor().get(j);
                        }
                    }
                }
            }
        } catch (ClassNotFoundException ex) {
            return null;
        } catch (IOException ex) {
            return null;
        }
        return null;
    }

    /**Metodo que escrever no arquivo terminal_urna.txt o objeto libearrUrna
     * com o variavel setada como true liberando a urna
     * @param liberarUrna recebe o objeto e escreve ele no arquivo 
     */
    public static boolean liberarUrna(LiberarUrnaTerminal liberarUrna) {
        FileOutputStream caminho = null;
        try {
            caminho = new FileOutputStream(FatorConexao.urlTerminal_urna());
            ObjectOutputStream informacao = new ObjectOutputStream(caminho);
            informacao.writeObject(liberarUrna);//escrever objeto na seção
            informacao.flush();
            caminho.close();
            return true;
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
        return false;
    }
    
    
    public static Eleitor votoVotou(String titulo) {
        try {
            FileInputStream caminho = new FileInputStream(FatorConexao.urlTRE());
            ObjectInputStream informacao = new ObjectInputStream(caminho);

            List<Secao> ListSecao = (List<Secao>) informacao.readObject();

            for (int i = 0; i < ListSecao.size(); i++) {
                if (ListSecao.get(i).getNumero() == getSecaoTerminal()) {
                    for (int j = 0; j < ListSecao.get(i).getEleitor().size(); j++) {
                        if (ListSecao.get(i).getEleitor().get(j).getTitulo().equals(titulo)) {
                            ListSecao.get(i).getEleitor().get(j).setStatus("VOTOU");
                            salvar(ListSecao);
                        }
                    }
                }
            }

        } catch (ClassNotFoundException ex) {
            return null;
        } catch (IOException ex) {
            return null;
        }
        return null;
    }
    
    /**
     * Metodo justificar voto
     * pega a seção dele e o titilo e pucha para ele ser justificado
     * @param secao
     * @param titulo
     * @return 
     */
    public static Eleitor TituloJustificar(String secao, String titulo) {

        try {
            FileInputStream caminho = new FileInputStream(FatorConexao.urlTRE());
            ObjectInputStream informacao = new ObjectInputStream(caminho);

            List<Secao> ListSecao = (List<Secao>) informacao.readObject();

            for (int i = 0; i < ListSecao.size(); i++) {
                if (ListSecao.get(i).getNumero() == Integer.parseInt(secao)) {
                    for (int j = 0; j < ListSecao.get(i).getEleitor().size(); j++) {
                        if (ListSecao.get(i).getEleitor().get(j).getTitulo().equals(titulo) && ListSecao.get(i).getNumero() == Integer.parseInt(secao)) {
                            return ListSecao.get(i).getEleitor().get(j);
                        }
                    }
                }
            }
        } catch (ClassNotFoundException ex) {
            return null;
        } catch (IOException ex) {
            return null;
        }
        return null;
    }

    /**
     * metodo justificar eleitor
     * se clicar em justificar o valor do eleitor com aquele titlo conrespondente e colocado como justificado
     * @param titulo
     * @return 
     */
    public static boolean justificar(String titulo) {

        FileInputStream caminho = null;
        try {
            caminho = new FileInputStream(FatorConexao.urlTRE());
            ObjectInputStream informacao = new ObjectInputStream(caminho);
            List<Secao> ListSecao = (List<Secao>) informacao.readObject();
            for (int i = 0; i < ListSecao.size(); i++) {
                for (int j = 0; j < ListSecao.get(i).getEleitor().size(); j++) {
                    if (ListSecao.get(i).getEleitor().get(j).getTitulo().equals(titulo) && ListSecao.get(i).getEleitor().get(j).getStatus().equals("APTO")) {
                        ListSecao.get(i).getEleitor().get(j).setStatus("JUSTIFICOU");
                        return salvar(ListSecao);
                    }

                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                caminho.close();
            } catch (IOException ex) {
                Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    /**
     * Metodo usado para salvar as seções em outros metodos do dao
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
