package Conditionals;

import java.util.Scanner;

public class sidesofatriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first side : ");
        int a = sc.nextInt();
        System.out.println(" Enter second  side : ");
        int b = sc.nextInt();
        System.out.println(" Enter third third : ");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println(" Valid triangle");
        }
        else{
            System.out.println(" Invalid triangle");
        }


    }
}
