package controller;

import java.util.ArrayList;
import java.util.List;
import tre.modal.Candidato;
import tre.modal.Eleitor;
import tre.modal.Secao;
import javax.swing.JOptionPane;

public class InicializadorDados {

    public static void main(String[] args) {
            /**//////////DADOS PRIMEIRA SEÇÃO///////////////////////////////**/
            Candidato candidato1 = new Candidato();
            candidato1.setNome("Adailton neves");
            candidato1.setCargo("Prefeito");
            candidato1.setNumero(15);
            
            Candidato candidato2 = new Candidato();
            candidato2.setNome("Maria Dyuzepe");
            candidato2.setCargo("Prefeito");
            candidato2.setNumero(22);
            
            
            Candidato candidato3 = new Candidato();
            candidato3.setNome("Ana Carla Leite");
            candidato3.setCargo("Governador");
            candidato3.setNumero(21110);

            
            Candidato candidato4 = new Candidato();
            candidato4.setNome("Rafael de Lima");
            candidato4.setCargo("Governador");
            candidato4.setNumero(17002);
            
            List<Candidato> candidatos1 = new ArrayList<>();
            candidatos1.add(candidato1);
            candidatos1.add(candidato2);
            candidatos1.add(candidato3);
            candidatos1.add(candidato4);
            
            
             /**////////////DADOS SEGUNDA SEÇÃO/////////////////////////////**/
            Candidato candidato5 = new Candidato();
            candidato5.setNome("Adailton neves");
            candidato5.setCargo("Prefeito");
            candidato5.setNumero(15);
            
            Candidato candidato6 = new Candidato();
            candidato6.setNome("Maria Dyuzepe");
            candidato6.setCargo("Prefeito");
            candidato6.setNumero(22);
            
            Candidato candidato7 = new Candidato();
            candidato7.setNome("Ana Carla Leite");
            candidato7.setCargo("Governador");
            candidato7.setNumero(21110);
            
            Candidato candidato8 = new Candidato();
            candidato8.setNome("Rafael de Lima");
            candidato8.setCargo("Governador");
            candidato8.setNumero(17002);
            
            List<Candidato> candidatos2 = new ArrayList<>();
            candidatos2.add(candidato5);
            candidatos2.add(candidato6);
            candidatos2.add(candidato7);
            candidatos2.add(candidato8);
            
            
             /**/////////DADOS TERCEIRA SEÇÃO////////////////////////////////**/
            Candidato candidato9 = new Candidato();
            candidato9.setNome("Adailton neves");
            candidato9.setCargo("Prefeito");
            candidato9.setNumero(15);
            
            Candidato candidato10 = new Candidato();
            candidato10.setNome("Maria Dyuzepe");
            candidato10.setCargo("Prefeito");
            candidato10.setNumero(22);
            
            Candidato candidato11 = new Candidato();
            candidato11.setNome("Ana Carla Leite");
            candidato11.setCargo("Governador");
            candidato11.setNumero(21110);
            
            Candidato candidato12 = new Candidato();
            candidato12.setNome("Rafael de Lima");
            candidato12.setCargo("Governador");
            candidato12.setNumero(17002);
            
            List<Candidato> candidatos3 = new ArrayList<>();
            candidatos3.add(candidato9);
            candidatos3.add(candidato10);
            candidatos3.add(candidato11);
            candidatos3.add(candidato12);
            
           
            Eleitor eleitor1 = new Eleitor();
            eleitor1.setNome("Adailton Neves");
            eleitor1.setCpf("129.456.759-01");
            eleitor1.setDataNascimento("26/12/1998");
            eleitor1.setTitulo("5555 5555 5555");
            eleitor1.setStatus("APTO");
            
            Eleitor eleitor2 = new Eleitor();
            eleitor2.setNome("Maria Dyuzepe");
            eleitor2.setCpf("123.156.739-05");
            eleitor2.setDataNascimento("25/10/1995");
            eleitor2.setTitulo("6666 6666 6666");
            eleitor2.setStatus("APTO");
            
            Eleitor eleitor3 = new Eleitor();
            eleitor3.setNome("Ana Carla Leite");
            eleitor3.setCpf("148.496.729-01");
            eleitor3.setDataNascimento("22/11/1983");
            eleitor3.setTitulo("7777 7777 7777");
            eleitor3.setStatus("APTO");
            
            Eleitor eleitor4 = new Eleitor();
            eleitor4.setNome("Rafael de Lima");
            eleitor4.setCpf("143.436.799-03");
            eleitor4.setDataNascimento("03/03/1997");
            eleitor4.setTitulo("8888 8888 8888"); 
            eleitor4.setStatus("APTO");
            
            Eleitor eleitor5 = new Eleitor();
            eleitor5.setNome("Vitoria Nobre");
            eleitor5.setCpf("167.456.789-01");
            eleitor5.setDataNascimento("11/11/1810");
            eleitor5.setTitulo("7659 6789 0123");
            eleitor5.setStatus("APTO");
            
            Eleitor eleitor6 = new Eleitor();
            eleitor6.setNome("João Pedro Estevão");
            eleitor6.setCpf("123.456.432-01");
            eleitor6.setDataNascimento("14/04/1998");
            eleitor6.setTitulo("2345 6789 0123");
            eleitor6.setStatus("APTO");
            
            Eleitor eleitor7 = new Eleitor();
            eleitor7.setNome("Clarice Lucena");
            eleitor7.setCpf("124.526.709-04");
            eleitor7.setDataNascimento("15/09/1996");
            eleitor7.setTitulo("2609 6789 0358");
            eleitor7.setStatus("APTO");
            
            Eleitor eleitor8 = new Eleitor();
            eleitor8.setNome("walter ");
            eleitor8.setCpf("147.906.739-01");
            eleitor8.setDataNascimento("15/08/1997");
            eleitor8.setTitulo("1095 3289 0123");
            eleitor8.setStatus("APTO");
            
            Eleitor eleitor9 = new Eleitor();
            eleitor9.setNome("Matheus zakk wylde");
            eleitor9.setCpf("318.456.789-01");
            eleitor9.setDataNascimento("29/03/1996");
            eleitor9.setTitulo("1111 1111 1111");
            eleitor9.setStatus("APTO");
            
            List<Eleitor> eleitores1 = new ArrayList<>();
            List<Eleitor> eleitores2 = new ArrayList<>();
            List<Eleitor> eleitores3 = new ArrayList<>();
            eleitores1.add(eleitor1);
            eleitores1.add(eleitor2);
            eleitores1.add(eleitor3);
            eleitores2.add(eleitor4);
            eleitores2.add(eleitor5);
            eleitores2.add(eleitor6);
            eleitores3.add(eleitor7);
            eleitores3.add(eleitor8);
            eleitores3.add(eleitor9);
            
            
            Secao secao1 = new Secao();
            secao1.setNumero(100);
            secao1.setCandidatos(candidatos1);
            secao1.setEleitor(eleitores1);
            
            Secao secao2 = new Secao();
            secao2.setNumero(200);
            secao2.setCandidatos(candidatos2);
            secao2.setEleitor(eleitores2);
            
            Secao secao3 = new Secao();
            secao3.setNumero(300);
            secao3.setCandidatos(candidatos3);
            secao3.setEleitor(eleitores3);
            
            
            List<Secao> secoes = new ArrayList<>();
            secoes.add(secao1);
            secoes.add(secao2);
            secoes.add(secao3);
            
            
            
            if (Dao.salvar(secoes, false)) {
                JOptionPane.showMessageDialog(null,"cadastro realizado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE, null);
            }
            else{
                JOptionPane.showMessageDialog(null,"Dados renunciado!", "Error", JOptionPane.ERROR_MESSAGE, null);
            }       
    }  
}
