import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0, total = 0;
        //////// find sum of odds (tek) numbers you entered
        for (int i=0;i<=num; i++ ){
            System.out.print("Enter numbers : ");
            num = input.nextInt();
            if(num>0){
                if(num%2==1){
                    total+=num;
                }
            }else {
                System.out.println("odds numbers you entered  sum is: "+ total);
            }

        }

        //////// find sum of divisible 2 and 4 you entered
        for (int i = 0; i <= num; i++) {
            System.out.print("Enter numbers : ");
            num = input.nextInt();
            if (num % 2 == 0 ) {
                if (num%4==0){
                    total += num;
                }

            } else {
                System.out.println("Sum of divisible 2 and 4 is :" + total);
            }
        }

    }
}