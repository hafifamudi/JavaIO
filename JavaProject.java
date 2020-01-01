/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class JavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] array = {"mangga", "apel", "semangka"};
        String[] array2 = new String[3];
        array2[0] = "mangga";
        array2[1] = "apel";
        array2[2] = "jeruk";
        String[][] array3 = {{"Hafif", "Kak yan"}, {"13", "15"}};
        System.out.println("Nama\tUmur");
//        
        int choice = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menambah data ?");
        System.out.println(choice);
        if (choice == 0) {
            String nama = JOptionPane.showInputDialog(null, "masukan nama anda :");
            String umur = JOptionPane.showInputDialog(null, "masukan umur anda :");
        }else{
            System.exit(1);
        }
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
             System.out.print(array3[j][i]+"\t");
        }
            System.out.println();
        }
    }

}
