import java.util.Scanner;
public class Solution{

    public static Boolean isPrime(int number){

        if(number == 1 || number == 0){
            return true;
        }

        for(int i = 2; i < number/2; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        
        int number;
        System.out.print("Enter number: ");
        number = console.nextInt();

        Boolean answer;
        answer = isPrime(number);

        System.out.println(answer);
    }
}