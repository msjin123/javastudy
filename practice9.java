import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class practice9 {
    

    static int recur(ArrayList<Integer> arr, ArrayList<Integer> store3, int s, int n, int max2, ArrayList<Integer> store3_idx){
        if (s==3){
            int max1 = Collections.max(store3);
            int sum1 = 0;
            for (int a : store3){
                sum1+=a;
            }
            int re1 = sum1-max1;
            if (re1>max1){
                max2 = Math.max(max2,sum1);
            }
            return max2;
        }

       
        for (int i=0; i<n; i++){
            if (s!=0 && i<=store3_idx.get(s-1)) continue;

            store3.add(arr.get(i)); 
            store3_idx.add(i);
            max2 = recur(arr,store3,s+1,n,max2,store3_idx);
            store3.remove(s);
            store3_idx.remove(s);
            // remove() 안에 그냥 숫자넣으면 해당하는 인덱스를 제거함
        }

        return max2;
    }

    



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> arr = new ArrayList<>();

        int n = sc.nextInt();
        for (int t=0; t<n; t++){
            int x = sc.nextInt();
            arr.add(x);
        }

        ArrayList<Integer> store3 = new ArrayList<>();
        ArrayList<Integer> store3_idx = new ArrayList<>();
        int ans = recur(arr,store3,0,n,0,store3_idx);
        System.out.println(ans);
    }
}
