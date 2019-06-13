/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alicia.constantino
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//classe que vai ler o csv
public class ReadCsv {
    public static void main(String[] args){
    ReadCsv obj = new ReadCsv();
    obj.run();

  }//end main

  public void run() {

    String arquivoCSV = "";//inserir aqui arquivo csv
    BufferedReader br = null;
    String linha = "";
    String csvDivisor = ",";
    try {

        br = new BufferedReader(new FileReader(arquivoCSV));
        while ((linha = br.readLine()) != null) {

            String[] acoes = linha.split(csvDivisor); //mudar isso aqui para os nomes das empresas e os preços das ações

            System.out.println("País [code= " + acoes[acoes.length-2] 
                                 + " , name=" + acoes[acoes.length-1] + "]");

        }//end while

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }//end catch
        }//end if
    }//end finally
  }// end method run
}//end class
