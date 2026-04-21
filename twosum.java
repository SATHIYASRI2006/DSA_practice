import java.util.*;
class twosum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            Arrays.sort(arr);
            sum=arr[n-1]+arr[n-2];
    }
    System.out.print(sum);
}
}
