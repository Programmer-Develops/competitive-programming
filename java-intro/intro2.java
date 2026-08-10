import java.util.*;

// Note: public static funcName() {} is a function which can be called without creating an object of the class. It is also called a static method.
//       the public is called there to make the function accessible from anywhere. If we remove public, then the function will be accessible only within the class.
//       if the function called with public static funcName() {}, then it can be called without creating an object of the class. If we remove static, then the function can only be called by creating an object of the class.
//       
//       nextInt() -> for integer input
//       nextLine() -> for string input
//       nextDouble() -> for double input
//       nextFloat() -> for float input
//       next() -> for char input
//       nextBoolean() -> for boolean input


// Calculator
// class Calc {
//     public static void main(String[] args) {
//         Scanner Input = new Scanner(System.in);

//         int X = Input.nextInt();
//         int Y = Input.nextInt();

//         System.out.println("Sum = " + Add(X,Y));
//         System.out.println("Multiplication = " + Mul(X,Y));
//         Sub(X,Y);
//         Div(X,Y);
//     }

//     static int Add(int X, int Y) {
//         int Z = X + Y;
//         return Z;
//     }

//     static void Sub(int X, int Y) {
//         int Z = X - Y;
//         System.out.println("Subtraction = " + Z);
//     }

//     static int Mul(int X, int Y) {
//         int Z = X * Y;
//         return Z;
//     }

//     static void Div(int X, int Y) {
//         int Z = X / Y;
//         System.out.println("Division = " + Z);
//     }
// }


// Increasing/Decreasing Function
// class AD {
//     public static void main(String[] args) {
//         Scanner Input = new Scanner(System.in);
//         int X = Input.nextInt();
//         Increasing(X);
//         Decreasing(X);
//     }

//     public static void Increasing(int X) {
//         for(int i=1; i <= X; i++)
//         {
//             System.out.println("Increasing => " + i);
//         }
//     }

//     public static void Decreasing(int X) {
//         for(int i=X; i >= 1; i--)
//         {
//             System.out.println("Decreasing => " + i);
//         }
//     }
// }


// factorial
// class Fact {
//     public static void main(String[] args) {
//         Scanner Input = new Scanner(System.in);
//         int X = Input.nextInt();
//         fact(X);
//     }

//     public static void fact(int X) {
//         for(int i=1; i <= X; i++)
//         {
//             int fact = 1;
//             for(int j=1; j <= i; j++)
//             {
//                 fact = fact * j;
//             }
//             System.out.println("Factorial of " + i + " is => " + fact);
//         }
//     }
// }


// getting sum of ArrayList
class AS {
    public static void main(String[] args) {
        // int arr[] = [1,2,3,5,6];
        Scanner Input = new Scanner(System.in);
        int n = Input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1; i<=n; i++) {
            arr.add(i);
        }

        aSum(arr);
    }

    public static void aSum(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++ ) {
            sum += arr.get(i);
        }
        System.out.println(sum);
    }

}