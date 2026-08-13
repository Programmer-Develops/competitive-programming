import java.util.*;

// factorial through recursion in java

class rf {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int facNum = Input.nextInt();

        int result = factorial(facNum);
        System.out.println(result);
    }

    public static int factorial(int num) {
        // with recursion
        if(num == 0 || num == 1)
        {
            return 1;
        }
        return num * factorial(num - 1);

        // for(int i=1; i <= num; i++)
        // {
        //     int fact = 1;
        //     for(int j=1; j <= i; j++)
        //     {
        //         fact = fact * j;
        //     }
        //     System.out.println("Factorial of " + i + " is => " + fact);
        // }
    }
}