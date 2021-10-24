package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Fibonach chis=new Fibonach();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int k= sc.nextInt();
        String arr = chis.arrayBuilder(k);
        System.out.println("[0] "+"[1] "+arr);
    }
}
class Fibonach {
    public String arrayBuilder(int a) {
        int[] array = new int[a];
        array[0] = 0;
        array[1] = 1;
        String str = "";
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
            str += "[" + array[i] + "] ";
        }
        return str;
    }
}



