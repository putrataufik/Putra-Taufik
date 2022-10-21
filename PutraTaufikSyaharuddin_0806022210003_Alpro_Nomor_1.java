/**
 * SoalNo1
 */
import java.util.Scanner;

public class PutraTaufikSyaharuddin_0806022210003_Alpro_Nomor_1{

    public static void main(String[] args) {
        System.out.println("Konversi Celcius ke Reamur,Fahrenheit,Kelvin");
        System.out.println("Pilih Suhu:");
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Masukan Pilihan anda:");

        Scanner input = new Scanner(System.in);
        char pilihan = input.next().charAt(0);

        if(pilihan == '1'){
            System.out.print("Masukan Nilai Suhu Celcius : ");
            double nilaiC = input.nextDouble();
            double rumusR = 0.8 * nilaiC;
            System.out.println("Suhu Reamur = " + rumusR);
        }
        else if(pilihan == '2'){
           System.out.print("Masukan Nilai Suhu Celsius : ");
           double nilaiC = input.nextDouble();
           double rumusF = (nilaiC * 1.8) + 32;
           System.out.println("Suhu Fahrenheit = " + rumusF);
        }
        else if(pilihan == '3'){
            System.out.println("Masukan Nilai Suhu Celcius : ");
            double nilaiC = input.nextDouble();
            double rumusK = (nilaiC + 273.15);
            System.out.println("Suhu Kelvin = " + rumusK );
        }
        else{
            System.out.println("Pilihan yang anda masukan tidak tersedia");
        }


    
    }
}