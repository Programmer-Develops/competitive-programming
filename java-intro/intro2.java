import java.util.*;

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
class AD {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int X = Input.nextInt();
        Increasing(X);
        Decreasing(X);
    }

    public static void Increasing(int X) {
        for(int i=1; i <= X; i++)
        {
            System.out.println("Increasing => " + i);
        }
    }

    public static void Decreasing(int X) {
        for(int i=X; i >= 1; i--)
        {
            System.out.println("Decreasing => " + i);
        }
    }
}