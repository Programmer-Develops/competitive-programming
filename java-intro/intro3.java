import java.util.*;

// factorial through recursion in java

// class rf {
//     public static void main(String[] args) {
//         Scanner Input = new Scanner(System.in);
//         int facNum = Input.nextInt();

//         int result = factorial(facNum);
//         System.out.println(result);
//     }

//     public static int factorial(int num) {
//         // with recursion
//         if(num == 0 || num == 1)
//         {
//             return 1;
//         }
//         return num * factorial(num - 1);

//         // for(int i=1; i <= num; i++)
//         // {
//         //     int fact = 1;
//         //     for(int j=1; j <= i; j++)
//         //     {
//         //         fact = fact * j;
//         //     }
//         //     System.out.println("Factorial of " + i + " is => " + fact);
//         // }
//     }
// }


// Sum with recursion in java

class ra {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = Input.nextInt();

        for(int i = 1; i <= n; i++) {
            int ele = Input.nextInt();
            arr.add(ele);
        }
        System.out.println(asum(arr));
    }

    public static int asum(ArrayList<Integer> arr) {
        // with recursion
        if(arr.size() == 0) {
            return 0;
        }
        int lastElement = arr.get(arr.size() - 1);   // get the last element of the array
        arr.remove(arr.size() - 1); // remove the last element of the array
        return lastElement + asum(arr); // call the function again with the remaining elements of the array

        // int sum = 0;
        // for(int i=0; i < arr.size(); i++) {
        //     sum += arr.get(i);
        // }
        // return sum;
    }
}