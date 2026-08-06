import java.util.*;
class Main {
    public static void main(String[] args) {
        // int a = 22;
        int n = 10;
        Scanner Sc = new Scanner(System.in);
        // int X = Sc.nextInt();
        // int arr[] = {1,2,4};
        ArrayList<Integer> C = new ArrayList<>();
        // System.out.println(X);
        // System.out.println(arr[0];
        // for(int i=1; i<= n; i++){
        //     System.out.println(i);
        // }
        for(int i=1; i<= 5; i++){
            int b = Sc.nextInt();
            C.add(b);
        }  
        // System.out.println(C);
        int l = C.size();
        // ascending
        for(int i=0; i<l; i++){
            System.out.println(C.get(i));
        }
        
        // dscending
        for(int i=l-1; i>=0; i--){
            System.out.println(C.get(i));
        }
    }
}