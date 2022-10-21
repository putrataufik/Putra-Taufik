import java.util.Scanner;

public class PutraTaufikSyaharuddin_0806022210003_Alpro_Nomor_2 {
    public static void main(String[] args) {
        System.out.print("Silahkan Input Nilai anda :");
        Scanner n = new Scanner (System.in);
        Double nilai = n.nextDouble();
        if(nilai < 75){
            System.out.println("Tidak Lulus");
        }
        else if (nilai >= 75){
            System.out.println("Lulus");
        }
    }
}
