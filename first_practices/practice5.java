
import java.util.Scanner;
public class practice5{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String arr1 = sc.next();
        char[] arr = arr1.toCharArray();

        int ans = 0;
        for (int i=0; i<n; i++){
            if (arr[i]=='O'){
                // 규칙 2 검사 
                if (i-1>=0 && arr[i-1]=='O'){
                    ans=-1;
                    break;
                }
                ans++;
            }
            else if (arr[i]=='X'){
                // 규칙 2 검사
                if (i-2>=0 && arr[i-1]=='X' && arr[i-2]=='X'){
                    ans=-1;
                    break;
                }
            }
            else if (arr[i]=='?'){
                if (i>=1){
                    // 앞에가 O면 무조건 X
                    if (arr[i-1]=='O'){
                        arr[i]='X';
                        // + 규칙 2
                        // 여기선 할필요 x
                    }
                    else if (arr[i-1]=='X'){
                        if (i+1<n && arr[i+1]=='X'){
                            arr[i]='O';
                            ans++;
                        }
                        else if (i+1<n && arr[i+1]=='O'){
                            // 앞x뒤o 
                            arr[i]='X';
                            // 규칙 2 검사
                            if (i-2>=0 && arr[i-2]=='X'){
                                ans=-1;
                                break;
                            }
                        }
                        // 추가
                        else if (i-2>=0 && arr[i-1]=='X' && arr[i-2]=='X'){
                            arr[i]='O';
                            ans++;
                        }
                        // 하이라이트 부분
                        else if (i+1<n && arr[i+1]=='?'){
                            if (i+1==n-1){
                                ans++;
                                break;
                            }

                            int t = i+2;
                            int step = 2;
                            boolean end=false;
                            while (arr[t]=='?'){
                                t++;
                                step++;
                                if (t==n){
                                    end=true;
                                    break;
                                }
                            }

                            if (end){
                                int a = 1;
                                for (int j=i; j<=t-1; j++){
                                    if (a%2!=0){
                                        arr[j]='O';
                                        ans++;
                                    }
                                    else{
                                        arr[j]='X';
                                        
                                    }
                                    a++;
                                }
                                i=t-1;
                                continue;
                            }
                            else if ((step%2==0 && arr[t]=='X') || (step%2!=0 && arr[t]=='O')){
                                int a = 1;
                                for (int j=i; j<=t-1; j++){
                                    if (a%2!=0){
                                        arr[j]='X';
                                        
                                    }
                                    else{
                                        arr[j]='O';
                                        ans++;
                                    }
                                    a++;
                                }
                                i=t-1;
                                continue;
                            }
                            else if ((step%2==0 && arr[t]=='O') || (step%2!=0 && arr[t]=='X')){
                                int a = 1;
                                for (int j=i; j<=t-1; j++){
                                    if (a%2!=0){
                                        arr[j]='O';
                                        ans++;
                                    }
                                    else{
                                        arr[j]='X';
                                        
                                    }
                                    a++;
                                }
                                i=t-1;
                                continue;
                            }
                            
                            // ? 짝수 기준 에 X면 XOXO... 뒤에 O면 OXOX... 으로 채워짐
                            // ? 홀수 기준 뒤에 X면 OXOX... 뒤에 O면 XOXO... 으로 채워짐
                            // 마지막까지 ?면 그냥 OXOX...
                        // 하이라이트 부분 끝
                        }
                    else{   // last index (i=n-1)
                        arr[i]='O';
                        ans++;
                    }

                    }
                }
                // i=0 맨처음
                else{
                    if (i+1<n && arr[i+1]=='O'){
                        arr[i]='X';
                    }
                    else if (i+1<n && arr[i+1]=='X'){
                        arr[i]='O';
                        ans++;
                    }
                    else if (i+1<n && arr[i+1]=='?'){
                        arr[i]='O';
                        ans++;
                    }
                    else{// n=1
                        arr[i]='O';
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
        
    }
}

