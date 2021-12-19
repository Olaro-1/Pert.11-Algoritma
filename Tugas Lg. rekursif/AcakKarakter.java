import java.util.Scanner;

public class AcakKarakter {
    public static void Kombinasi(String x, int b, int c){
        if(b==0)
            System.out.println(x+ " ");
        else 
            for(int i=97;i<97+c;i++)
                Kombinasi(x+(char) i,b-1,c);
                
    }
    public static void main (String[] args) {
        System.out.print("Masukan Jumlah Karakter : ");
        Scanner masuk=new Scanner (System.in);
        int mix=masuk.nextInt();
        Kombinasi("",mix,mix);
        System.out.println(" ");
    }
}
