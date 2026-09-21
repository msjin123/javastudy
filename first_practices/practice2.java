import java.util.Scanner;
public class practice2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        char[] ar1 = new char[n];
        char[] ar2 = new char[n];
        
        for (int i=0; i<n; i++){
            ar1[i]=sc.next().charAt(0);
            ar2[i]=sc.next().charAt(0); 
        }

        int m = sc.nextInt();
        char[] ansar = new char[m];
        for (int i=0; i<m; i++){
            char a = sc.next().charAt(0);
            
            for (int j=0; j<n; j++){
                if (a==ar1[j]){
                    a=ar2[j];
                    break;
                }
            }
            ansar[i]=a;

        }
        for (int i=0; i<ansar.length; i++){
            System.out.print(ansar[i]);
        }
        sc.close();
    }
}
