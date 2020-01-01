package javaproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author Hafif Nur Muhammad 
 */
public class JavaIOfunction {
     static void FileInput() {
        FileInputStream finput = null;
        int data;
        try {
            //Parameter di Dalam Kelas FileInputStream di Sesuaikan Dengan Lokasi File Anda

            finput = new FileInputStream("/root/programming/dart/textOutput2.txt");
        } catch (FileNotFoundException fnfe) {
            System.out.println("File Tidak di Temukan");
            return;
        }
        try {
            while ((data = finput.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }
        try {
            finput.close();
        } catch (IOException e) {

        }

    }

    static void FileOutput() {
        FileOutputStream foutput = null;
        String data = "testing1 \ntesting2 \ntesting3";

        try {
            //Parameter di Dalam Kelas FileOuputStream di Sesuaikan Dengan Lokasi File Anda
            foutput = new FileOutputStream("/root/programming/dart/textOutput2.txt");
        } catch (IOException e) {
            System.out.println("File Tidak Di Temukan");
            return;
        }

        try {
            for (int i = 0; i < data.length(); i++) {
                foutput.write((int) data.charAt(i));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            foutput.close();
        } catch (IOException e) {
        }
    }

    static void FileCopy() {
        FileInputStream finput = null;
        FileOutputStream foutput = null;
        int data;
        //Membuka File Input
        try {
            finput = new FileInputStream("/root/programming/dart/text1");

        } catch (FileNotFoundException e) {
            System.out.println("File Tidak Di Temukan");
            return; //Keluar Dari Method
        }
        //Membuka File OutPut
        try {
            foutput = new FileOutputStream("/root/programming/textOutput2.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File Tidak Dapat Terbentuk");
            return;//Keluar Dari Method
        }
        //Membaca Data dari File Input
        //Dan Memasukannnya ke Dalam File Output
        try {
            while ((data = finput.read()) != -1) {
                foutput.write(data);
            }
        } catch (Exception e) {
        }
        //Menutup File
        try {
            finput.close();
            foutput.close();
        } catch (IOException e) {
        }
    }
}
