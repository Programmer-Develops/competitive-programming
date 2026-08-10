import java.util.*;

class Calc {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int X = Input.nextInt();
        int Y = Input.nextInt();

        System.out.println("Sum = " + Add(X,Y));
        System.out.println("Multiplication = " + Mul(X,Y));
        Sub(X,Y);
        Div(X,Y);
    }

    static int Add(int X, int Y) {
        int Z = X + Y;
        return Z;
    }

    static void Sub(int X, int Y) {
        int Z = X - Y;
        System.out.println("Subtraction = " + Z);
    }

    static int Mul(int X, int Y) {
        int Z = X * Y;
        return Z;
    }

    static void Div(int X, int Y) {
        int Z = X / Y;
        System.out.println("Division = " + Z);
    }
}