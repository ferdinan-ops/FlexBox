import java.util.Scanner;
import javax.swing.JOptionPane;

//class utama
public class KonversiBilangan {
    // global variabel
    static String name;// object
    static String kelamin;// object
    static int bilDes;// variable

    // method-method
    public static void Biner(int n) {
        if (n > 1) {
            Biner(n / 2);
        }
        System.out.print(n % 2);
    }

    public static void Hexa(int n) {
        char[] daftarHexa = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        if (n > 0) {
            Hexa(n / 16);
            System.out.print(daftarHexa[n % 16]);
        }
    }

    public static void Oktal(int n) {
        char[] daftarOktal = { '0', '1', '2', '3', '4', '5', '6', '7' };
        if (n > 0) {
            Oktal(n / 8);
            System.out.print(daftarOktal[n % 8]);
        }
    }

    public static void inputDes() {
        System.out.print("Masukkan Bilangan Desimal = ");
        Scanner inputan = new Scanner(System.in);
        bilDes = inputan.nextInt();
        // return bilDes;
    }

    public static void tampilBiner() {
        inputDes();
        System.out.print("Binernya adalah ");
        Biner(bilDes);
    }

    public static void tampilHexa() {
        inputDes();
        System.out.print("Hexanya adalah ");
        Hexa(bilDes);
    }

    public static void tampilOktal() {
        inputDes();
        System.out.print("Oktalnya adalah ");
        Oktal(bilDes);
    }

    public static int inpBil() {
        System.out.println("=========================="
                + "\nYey, Selamat datang " + kelamin + " " + name + ",");
        System.out.println("Silahkan memilih Menu Konversi "
                + "Bilangan ke : " +
                "\n1. Biner \n2. Hexa \n3. Oktal \n4. Exit");
        System.out.print("Masukkan Angka Menu = ");
        Scanner inputan = new Scanner(System.in);
        int pilmenu = inputan.nextInt();
        return pilmenu;
    }

    public static void menU(int pil) {
        System.out.println("\033"); // clean sreen
        switch (pil) {
            case 1:
                tampilBiner();
                break;
            case 2:
                tampilHexa();
                break;
            case 3:
                tampilOktal();
                break;
            case 4:
                System.out.println("Terimakasih sudah mampir :)");
                System.exit(0);
                break;
            default:
                System.out.println("(Maaf. Pilih angka 1-4 saja)");
                break;
        }
        System.out.println("\033");
    }

    public static void main(String arg[]) {
        name = JOptionPane.showInputDialog("Masukkan nama Anda : ");// menampilkan input dialog untuk memasukkan nama
        // menampilkan Option Dialog untuk memilih jenis kelamin
        String[] choices = { "Perempuan", "Laki-Laki", "Quit" };

        String Perempuan = "Perempuan";
        String Laki = "Laki-Laki";
        while (true) {
            int response = JOptionPane.showOptionDialog(
                    null, "Apa jenis kelamin Anda ?" // Pesan
                    , "Jenis Kelamin" // Judul di Tittlebar
                    , JOptionPane.YES_NO_OPTION // Tipe Option
                    , JOptionPane.QUESTION_MESSAGE // Tipe Pesan
                    , null, choices, "Quit" // Default button
            );
            switch (response) {
                case 0:
                    kelamin = Perempuan;
                    break;
                case 1:
                    kelamin = Laki;
                    break;
                default:
                    kelamin = "Tidak Ada";
            }
            do {
                menU(inpBil());
            } while (true);
        }
    }
}