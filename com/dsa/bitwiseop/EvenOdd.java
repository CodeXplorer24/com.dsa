package com.dsa.bitwiseop;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        if ((num & 1) == 0){  //comparing the binary of num with 000...0001
            System.out.printf("%d is Even",num);
        }
        else {
            System.out.printf("%d is Odd", num);
        }
        ip.close();

    }

}
