package com.dsa.bitwiseop;

import static java.lang.Math.pow;

public class ConversionOfBinaryAndDecimal {
    public static void main(String[] args) {
        long binaryNum = 1100010000;
        System.out.println("Decimal Number = " + binaryToDecimal(binaryNum));

        int decimalNum = 784;
        System.out.println("Binary Number = " + decimalToBinary(decimalNum));
    }

    static int binaryToDecimal(long binaryNum ){
        int decimalNum = 0;
        int i = 0;
        while (binaryNum != 0){
            long rem = binaryNum % 10;
            decimalNum+= (int) (rem * pow(2,i));
            binaryNum = binaryNum /10;
            i++;
        }
        return decimalNum;
    }

    public static long decimalToBinary(int decimalNum){
        long binaryNum = 0;
        int i = 0;
        while (decimalNum != 0){
            int rem = decimalNum % 2;
            binaryNum = (long) (binaryNum + rem * pow(10,i));
            decimalNum = decimalNum/2;
            i++;
        }
        return binaryNum;
    }

}
