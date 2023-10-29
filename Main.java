import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        
        System.out.println("Halo, " + nama + "! Selamat datang ke program Java sederhana ini.");
        
        input.close();
    }
}
