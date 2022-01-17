import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("N sayisini giriniz : ");
        int n=sc.nextInt();
        double result=0.0;
        for (double i =1;i<=n;i++){
            result+=(1/i);
        }
        // 1. Dongu , i=1; result=0+(1/1)=1;
        // 2. Dongu , i=2; result=1+(1/2)=1.5;
        System.out.println(result);
    }

}
