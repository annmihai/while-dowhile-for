
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amiha
 */
public class for1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = {};
        int counter = 0;
        ar = new int[32000];
        for (int i = 0; i < 32600; i++) {
            System.out.print("a=");
            int a = sc.nextInt();
            if (a != 0) {
                ar[i] = a;
                counter++;
            } else {
                break;
            }
        }
        for (int i = 0; i <= counter; i++) {
            if(ar[i]==0) continue;
            System.out.print(ar[i] + " ");
        }
    }
}
