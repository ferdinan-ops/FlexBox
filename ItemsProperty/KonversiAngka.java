import javax.swing.*;

public class KonversiAngka {
    public static void main(String[] args) {
        String angka = JOptionPane.showInputDialog("Masukkan Angka (0-10):");
        int bilangan = Integer.parseInt(angka);
        System.out.println("");

        switch (bilangan) {
            case 0:
                System.out.println(angka + " = Nol");
                break;
            case 1:
                System.out.println(angka + " = Satu");
                break;
            case 2:
                System.out.println(angka + " = Dua");
                break;
            case 3:
                System.out.println(angka + " = Tiga");
                break;
            case 4:
                System.out.println(angka + " = Empat");
                break;
            case 5:
                System.out.println(angka + " = Lima");
                break;
            case 6:
                System.out.println(angka + " = Enam");
                break;
            case 7:
                System.out.println(angka + " = Tujuh");
                break;
            case 8:
                System.out.println(angka + " = Delapan");
                break;
            case 9:
                System.out.println(angka + " = Sembilan");
                break;
            case 10:
                System.out.println(angka + " = Sepuluh");
                break;
            default:
                System.out.println("Lain-lain");
                break;
        }
    }
}
