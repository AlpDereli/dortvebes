import  java.util.Scanner;
public class program {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = take.nextInt();
        for (int i = 0; i<sayi; i++)
        {
            if (i%4==0 || i%5==0)
            {
                System.out.println(i);
            }
        }
    }
}
