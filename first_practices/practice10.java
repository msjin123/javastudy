import java.util.Scanner;
import java.util.Arrays;
class Data{
    String level;
    int number;
    int intlevel;
    
    Data(String level,int number,int intlevel){
        this.level=level;
        this.number=number;
        this.intlevel=intlevel;
    }

}


public class practice10 {
    
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        // B5=1 ~ R1=30  
        Data arr[] = new Data[n]; // 객체를 가리키는 참조들의 배열
        for (int t=0; t<n; t++){
            String li;
            int si;
            int li_int;
            li=sc.next();
            si=sc.nextInt();
            
            li_int = level_c(li.charAt(0)) + 6-(li.charAt(1)-'0');
            // Data() 안에 생성자 함수가 없을 때 : 직접 생성
            
            // arr[t] = new Data(); // 처음에 new Data[n] 은 Data를 가리키는 참조들을 만든 거라 
            //                      // 여기서 새 객체를 먼저 생성
            // arr[t].level = li;
            // arr[t].number = si;
            // arr[t].intlevel = li_int;

            // 생성자 활용
            arr[t] = new Data(li,si,li_int);
        }

        Arrays.sort(arr, (a,b) -> {
            if (a.intlevel!=b.intlevel)
                return Integer.compare(a.intlevel,b.intlevel);
            return Integer.compare(a.number,b.number);

            });

        for (int i=0; i<n; i++){
            System.out.println(arr[i].level+ ' ' + arr[i].number);
        }
    }
    public static int level_c(char a){
        if (a=='B') return 0;
        else if (a=='S') return 5;
        else if (a=='G') return 10;
        else if (a=='P') return 15;
        else if (a=='D') return 20;
        else if (a=='R') return 25;
        
        return -1;
    }


}

