import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        

        int[] arr = new int[]{10,20,30,40,50};

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
            

        }
        
        System.out.println();
        System.out.println(arr.length);

        
        Scanner sc = new Scanner(System.in);
        String s = "Hello";
        
        // s=객체를 가리키는 참조 변수
        // new=객체를 만든다
        // String=클래스
        // new String(~~)=객체 만들기 -> 새 객체가 만들어짐

        int[] arr2 = new int[5];
        arr2[0]=10;
        arr2[1]=20;
        int[] arr3 = arr2;
        arr3[0]=6;
        System.out.println(arr3[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[1]);
        System.out.println(arr2[1]);


        int[][] arr4 = new int[3][5];
        for (int i=0; i<3; i++){
            for (int j=0; j<5; j++){
                arr4[i][j]=sc.nextInt();
            }
        }

        for (int i=0; i<3; i++){
            for (int j=0; j<5; j++){
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
        }
    }   
}