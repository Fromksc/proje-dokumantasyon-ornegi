import java.util.Scanner;

public class ceviri {

    public static void main(String[] args) {
        
        String[] ingilizceKelimeler = {
            "apple", "book", "cat", "dog", "elephant",
            "fish", "grape", "house", "ice", "juice"
        };
        String[] turkceKelimeler = {
            "elma", "kitap", "kedi", "köpek", "fil",
            "balık", "üzüm", "ev", "buz", "meyve suyu"
        };
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nÇevirisini öğrenmek istediğiniz kelimeyi girin: ");
        String arananKelime = scanner.nextLine();
        boolean bulundu = false;
        
        for (int i = 0; i < 10; i++) {
            if (ingilizceKelimeler[i].equalsIgnoreCase(arananKelime)) {
                System.out.println(arananKelime + " kelimesinin Türkçe karşılığı: " + turkceKelimeler[i]);
                bulundu = true;
                break;
            }
        }

        if (!bulundu) {
            for (int i = 0; i < 10; i++) {
                if (turkceKelimeler[i].equalsIgnoreCase(arananKelime)) {
                    System.out.println(arananKelime + " kelimesinin İngilizce karşılığı: " + ingilizceKelimeler[i]);
                    bulundu = true;
                    break;
                }
            }
        }
        
        if (!bulundu) {
            System.out.println(arananKelime + " kelimesi sözlükte bulunamadı.");
        }
        
        scanner.close();
    }
}