package Pattern.com;

import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if((col == row)){
                    System.out.print("*"+"\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        scn.close();
    }
}
