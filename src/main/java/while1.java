
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
public class while1 {

    public static void main(String[] args) {
       
        int counter = 0, s = 0;
        while (counter != 101) {
            s += counter;
            counter++;
        }
        System.out.println(s);
    }

}
