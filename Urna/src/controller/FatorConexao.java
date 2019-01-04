package controller;

public class FatorConexao {
    /** 
     * Método de conexão com o arquivo txt SecaoTerminal
     * @return url 
     */
    public static String urlSecaoUrna() {
        String url = "/home/linuxlite-anonymous/Downloads/Projeto Eleição/arquivo/SecaoUrna.txt";
        return url;
    }
    /**
     * Método de conexão com o arquivo txt do TRE chamada TRE_Dados.txt
     * @return  url
     */
    public static String urlTRE() {
        String url = "/home/linuxlite-anonymous/Downloads/Projeto Eleição/arquivo/TRE_Dados.txt";
        return url;

    }
   
    /**
     * Metodo que interliga urna com terminal
     * no mesmo arquivo sera trabalhado liberar urna e liberar terminal
     * @return 
     */
    public static String urlTerminal_urna() {
    String url = "/home/linuxlite-anonymous/Downloads/Projeto Eleição/arquivo/terminal_urna.txt";
    return url;
    }
}
