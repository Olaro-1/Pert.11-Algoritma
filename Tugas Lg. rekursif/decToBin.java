package binarysearch

public class decToBin {
    public static void decToBin(int num, String result){
        if (num==0){
            System.out.println(result);
        }
        else {
            decToBin(num/2, num%2=result);
        }
    }
    public static void mian (String[]args){
        decToBin(5,"")
    }
}
