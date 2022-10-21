import java.util.Scanner;
public class PutraTaufikSyaharuddin_0806022210003_Alpro_Nomor_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan Nama Anda : ");
        String input_nama = input.nextLine();
        System.out.println("Masukan Kelamin (p/l) : ");
        char input_kelamin = input.next().charAt(0);
        System.out.println("Masukan Status (y/t)") ;
        char input_status = input.next().charAt(0);

        if (input_status == 'y' &&  input_kelamin == 'l' || input_status == 't' &&  input_kelamin == 'l' ){
            System.out.print("Hello, Mr. " + input_nama);
        }
        else if (input_status == 'y' && input_kelamin == 'p'){
            System.out.println("Hello, Mrs. "+ input_nama);
        }
        else if (input_status == 't' && input_kelamin == 'p'){
            System.out.println("Hello, Ms. "+ input_nama);
        }
        
    }
}
