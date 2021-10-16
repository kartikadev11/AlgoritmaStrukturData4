import java.io.IOException;
import java.util.Scanner;

public class InputOutputSederhana2 {
    public static void main(String[] args) throws IOException {

        /*System.out.println("Masukkan satu huruf kemudian tekan ENTER");
        int myInput;
        myInput = System.in.read();

        System.out.println(("Huruf yang ditekan menjadi ASCII dengan kode = " + myInput));
        */

        Scanner myInput = new Scanner (System.in);
        System.out.println("Masukkan Nama Lengkap = ");
        String namaSaya = myInput.nextLine();
        System.out.println("Nama Lengkap Anda Adalah = " + namaSaya);

        System.out.println("Masukkan nilai ALAS = ");
        double alas = myInput.nextDouble();
        System.out.println("Masukkan nilai TINGGI = ");
        double tinggi = myInput.nextDouble();
        double luasSegitiga = alas * tinggi * 0.5;
        System.out.println("Luas Segitiga Adalah = " + luasSegitiga);

    }

}
