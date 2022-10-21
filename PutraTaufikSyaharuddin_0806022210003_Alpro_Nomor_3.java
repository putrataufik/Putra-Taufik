import java.util.Scanner;
public class PutraTaufikSyaharuddin_0806022210003_Alpro_Nomor_3 {
    public static void main(String[] args) {
        int input;
        int angka;
        System.out.print("Masukan Angka: ");
        Scanner n = new Scanner (System.in);
        input = n.nextInt();
        angka = input % 2;
        if (angka == 0){
            System.out.println("Genap");
        }
        else if (angka != 0 ){
            System.out.println("Ganjil");
        }
    }
}
