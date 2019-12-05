
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
public class dowhile1 {

    public static void main(String[] args) {

        int s = 0, counter = 0;

        do {
            s += counter;
            counter++;
        } while (counter != 101);
        System.out.println(s);
    }
}
