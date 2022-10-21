/**
 * PutraTaufikSyaharuddin_0806022210003_Alpro_Nomor_4
 */
import java.util.Scanner;
public class PutraTaufikSyaharuddin_0806022210003_Alpro_Nomor_4 {

    public static void main(String[] args) {
        Scanner gaji = new Scanner (System.in);
    System.out.println("Masukan Total Jam Kerja : ");
    Double input = gaji.nextDouble();
    System.out.print("Masukan Jumlah Jam : " );
       if (input <= 40){
        Double gaji_kotor = input * 6;
        System.out.println("Gaji kotor : " + gaji_kotor );
        Double pajak = gaji_kotor*0.1;
        System.out.println("Pajak : " + pajak);
        Double gaji_bersih = gaji_kotor-pajak;
        System.out.println("Gaji Bersih: " + gaji_bersih);
        
       }

       else if (input > 40){
        double jam_bonus = input - 40;
        double gaji_bonus =  jam_bonus * (1.5*6);
        System.out.println("x"+gaji_bonus);
        double gaji_normal = (1.5*6) * 40;
        double gaji_kotorT = gaji_bonus+gaji_normal;
        System.out.println("Gaji Kotor = " + gaji_kotorT);

        if(gaji_kotorT < 250){
            System.out.println("Gaji kotor : " + gaji_kotorT );
            Double pajak = gaji_kotorT*0.1;
            System.out.println("Pajak : " + pajak);
            Double gaji_bersih = gaji_kotorT-pajak;
            System.out.println("Gaji Bersih: " + gaji_bersih);    
       }

        else if(gaji_kotorT > 250){
            System.out.println("Gaji kotor : " + gaji_kotorT );
            Double pajak = gaji_kotorT*0.12;
            System.out.println("Pajak : " + pajak);
            Double gaji_bersih = gaji_kotorT-pajak;
            System.out.println("Gaji Bersih: " + gaji_bersih);
        }

    }
}
}