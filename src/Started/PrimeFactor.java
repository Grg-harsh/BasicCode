package Started;
import java.util.Scanner;
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 2; i*i <= n; i++){
            while(n%i == 0){
                n = n/i;
                System.out.print(i+"\t");
            }
        }
        if(n != 0){
            System.out.print(n);
        }
        scn.close();
    }
}
