import java.util.*; 
class cd {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int n = Input.nextInt();
        System.out.println(countd(n));
    }

    public static int countd(int a) {
        // int count = 0;
        // // count integers in input a
        // while(a != 0) {
        //     count += 1;
        //     a = a/10;
        // }  
        // return count;

        if (a <= 0) return 0;

        return 1 + countd(a/10);
    }
}