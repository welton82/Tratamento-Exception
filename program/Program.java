package program;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method1();

    }


    public static void method1(){
        System.out.println("Method1 Start");

        method2();

        System.out.println("Method1 END");
    }

    public static void method2(){
        System.out.println("Methodo 2 Start");
        Scanner scan = new Scanner(System.in);
        try{
            String[] vet = scan.nextLine().split(" ");
            int position = scan.nextInt();
            System.out.println(vet[position]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Fim do Programa");
            System.out.println();
            System.out.println(e);
            System.out.println();
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("Erro");
            System.out.println();
            System.out.println(e);
            System.out.println();
            e.printStackTrace();
        }

        scan.close();
        System.out.println("Method 2 end");
    }

}
