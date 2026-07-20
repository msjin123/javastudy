import java.util.Scanner;

public class practice4 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // char[] balls = new char[n];
        // for (int t=0; t<n; t++){
        //     balls[t] = sc.next().charAt(0);
        // }
        
        String balls1 = sc.next();
        char[] balls = balls1.toCharArray();

        // 1. R 전부 왼쪽으로
        int ans=500001;
        int c1=0;
        boolean jump=false;
        for (int i=0; i<n; i++){
            if (jump && balls[i]=='R') c1++;

            if (balls[i]=='B'){
                jump=true;
            }
        }
        ans=Math.min(ans,c1);
        // 2. B 전부 왼쪽으로
        c1=0;
        jump=false;
        for (int i=0; i<n; i++){
            if (jump && balls[i]=='B') c1++;

            if (balls[i]=='R'){
                jump=true;
            }
        }
        ans=Math.min(ans,c1);
        // 3. R 전부 오른쪽으로
        c1=0;
        jump=false;
        for (int i=n-1; i>=0; i--){
            if (jump && balls[i]=='R') c1++;

            if (balls[i]=='B'){
                jump=true;
            }
        }
        ans=Math.min(ans,c1);
        // 4. B 전부 오른쪽으로
        c1=0;
        jump=false;
        for (int i=n-1; i>=0; i--){
            if (jump && balls[i]=='B') c1++;

            if (balls[i]=='R'){
                jump=true;
            }
        }
        ans=Math.min(ans,c1);

        System.out.println(ans);

        
    }

}
