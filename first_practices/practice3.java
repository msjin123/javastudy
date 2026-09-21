import java.io.*;
import java.util.*;
public class practice3 {
    
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        // Scanner sc = new Scanner(System.in);
        
        // int n = sc.nextInt();
        int n = Integer.parseInt(br.readLine());
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++){
            // int bi = sc.nextInt();
            int bi = Integer.parseInt(st.nextToken());
            arr1[i] = bi;
        }
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++){
            int si = Integer.parseInt(st.nextToken());
            arr2[i] = si;
        }
        

        long[] arr3 = new long[n+1];
        long sum=0;
        for (int i=n-1; i>=0; i--){
            if (arr2[i]!=-1){
                arr3[i] = sum;
                sum = sum + arr2[i];
            }
            else{
                arr3[i] = sum;
            }
        }
        // for (int i=0; i<n; i++){
        //     System.out.print(arr3[i]+" ");

        // }
        // System.out.println();
        char arr4[] = new char[n];
        long spent_money = 0;
        for (int i=0; i<n; i++){
            
            // 사도 괜찮은가

            if (arr1[i]!=-1 && spent_money+arr1[i]<=arr3[i]){
                arr4[i]='B';
                spent_money+=arr1[i];
            }
            // 사는건 불가능, 냅두는건 가능한가
            else if (spent_money<=arr3[i]){
                arr4[i]='N';
            }
            // 무조건 팔아야함
            // 이 상황에서 arr2[i]=-1 인 경우는 존재하지 않음.
            else{
                arr4[i]='S';
                spent_money-=arr2[i];
            }
            
        }

        // for (int i=0; i<n; i++){
        //     System.out.print(arr4[i]);
        // }
        System.out.print(new String(arr4));
    }
}
