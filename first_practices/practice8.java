import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class practice8{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(n1);
        list.add(n2);
        list.add(n3);

        Collections.sort(list);
        int max1=0;
        int min1=0;
        int a1,a2;
        a1 = list.get(1)-list.get(0);
        a2 = list.get(2)-list.get(1);

        if (a1<a2){
            if (a1==1){
                if (a2==2){
                    min1=1;
                    max1=1;
                }
                else{
                    min1=2;
                    max1=a2-1;
                }
            }
            // a1-1
            else{
                min1 = Math.min(2,a1-1); // a1=2일때 min1=1, 나머지 전부 2
                max1 = a2-1; 
            }
        }
        else{
            if (a2==1){
                if (a1==2){
                    min1=1;
                    max1=1;
                }
                else if (a1==1){
                    min1=0;
                    max1=0;
                }
                else{
                    min1=2;
                    max1=a1-1;
                }
            }
            else{
                min1 = Math.min(2,a2-1); // a2=2 일때 min1=1, 나머지 전부 2
                max1 = a1-1;
            }
        }

        System.out.println(min1);
        System.out.println(max1);

    }
}