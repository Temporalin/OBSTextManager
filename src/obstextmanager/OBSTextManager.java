/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obstextmanager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Andres
 */
public class OBSTextManager {
    
    public static void writeText(String file,String text){
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter(file+".txt"));
            out.write(text);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        writeText("prueba","prueba");
    }
    
}
