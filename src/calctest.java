import java.util.Scanner;
public class calctest {
    public static void main(String[] args) {
        int operator, n1,n2;
        System.out.println("1 - add \n 2 - subtract \n 3 -multiply \n 4 - divide ");
        System.out.println("Choose Operator: ");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("Enter first number:");
        n1 = sc.nextInt();
        System.out.println("Enter second number:");
        n2 = sc.nextInt();

        int result = 0;
        switch (operator) {
            case 1:
                result = n1 + n2;

                break;
            case 2:
                if(n1<n2){
                    int n3 = n1;
                    n1=n2;
                    n2=n3;
                }
                result = n1 - n2;

                break;
            case 3:
                result = n1 * n2;

                break;

            case 4:
                if (n2==0){
                    System.out.println("n2 must greater than zero");
                    return;
                }
                result = n1 / n2;
                break;

            default:
                System.out.println("Entered operator is not valid");
                return;
        }
        System.out.println("Result is :" + result);

    }
}
