package javaproject;
import java.util.Scanner;
import static javaproject.JavaIOfunction.*;

/**
 *
 * @author Hafif Nur Muhammad
 */
public class javaInputOutput {

    public static void main(String[] args) {
        //membuat objek dari printWriter
        Scanner user_input = new Scanner(System.in);
        System.out.println("==============System I/O pada Java==============");
        System.out.println("1.Input File\n"
                + "2.Output File\n"
                + "3.Copy File");
        System.out.println("Masukan Pilihan Anda");
        System.out.println("=> ");
        String user_choice = user_input.nextLine();

        if (user_choice.equalsIgnoreCase("1")) {
            FileOutput();
            System.out.println();
            System.out.println("Eksekusi Fungsi Berhasil!");

        } else if (user_choice.equalsIgnoreCase("2")) {
            FileInput();
            System.out.println();
            System.out.println("Eksekusi Fungsi Berhasil!");

        } else if (user_choice.equalsIgnoreCase("3")) {
            FileCopy();
            System.out.println();
            System.out.println("Eksekusi Fungsi Berhasil!");

        }
    }
}
