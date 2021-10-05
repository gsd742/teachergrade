package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
    System.out.println("total marks? ");
    double total = input.nextDouble();
    System.out.println("how many marks? ");
    double mark = input.nextDouble();
    if (mark>=(total*0.8)){
        System.out.print("A");
    }
    else if (mark>=(total*0.7)&&mark<=(total*0.79)){
        System.out.println("B");
        }
    else if (mark>=(total*0.6)&&mark<=(total*0.69)){
        System.out.println("C");
        }
    else if (mark>=(total*0.5)&&mark<=(total*0.59)){
            System.out.println("D");
        }
    else if (mark>=(total*0.4)&&mark<=(total*0.49)){
            System.out.println("E");
        }
    else if (mark < (total*0.4)){
        System.out.println("U");
        }
    }
}
