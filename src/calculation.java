
import jdk.dynalink.Operation;

import java.util.Scanner;
public class calculation {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num1,num2,num3;

        // select operators

        System.out.println("+,-,*,/");
        System.out.println("dooro hawl wadeenka beddelka ee aad rabto");
        char operator =input.next().charAt(0);

        // enter num1 and num2

        System.out.println("soo gali num1:");
        num1 = input.nextInt();
        System.out.println("soo gali num2");
        num2 = input.nextInt();

         // switch

         switch (operator){
             case '+':
          System.out.println(num1+"+"+num2+"="+(num1+num2));

          break;
             case '-':
             if (num2<num1)
                 System.out.println(num1+"-"+num2+"="+(num1-num2));
             else{
                 num3=num1;
                 num1=num2;
                 num2=num3;

             System.out.println(num1+"-"+num2+"="+(num1-num2));}

             break;

             case'*':

                 System.out.println(num1+"*"+num2+"="+(num1*num2));

                 break;

             case'/':
                 if (num2!=0)
                     System.out.println(num1+"/"+num2+"="+(num1/num2));
                    else
                        System.out.println("kala qaybiyaha eber lama ogola");

             default:
                    System.out.println("wada shaqayntu waa khalad");


         }

    }
}
