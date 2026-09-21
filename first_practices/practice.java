

import java.util.Scanner;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();


        int ans = 0;
        for (int num=1; num<=num1; num++){
            boolean five=false;
            if (num/100==5) five=true;
            else if ((num%100)%10==5 && (num%100)/10!=1) five=true;
            if (five) ans++;
        }

        System.out.println(ans);
    }
}

