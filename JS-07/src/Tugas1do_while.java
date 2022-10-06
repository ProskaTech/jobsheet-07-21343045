/**
 * Created by 21343045_Farraz Hadyan
 */

import java.util.Scanner;

public class Tugas1do_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        int jumlah =0;
        do{
            System.out.println(nama);
            jumlah++;
        }
        while (jumlah < 10);
    }
}
