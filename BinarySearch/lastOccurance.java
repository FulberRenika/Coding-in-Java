import java.util.*;
public class lastOccurance{
    public static int lastOccurance(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        int st=0;
        int end=arr.length-1;
        while(st<end){        
            int mid=st+(end-st+1)/2;   // --> +1 added for edge cases - st=0 end=1, mid=1/2=0
            if(arr[mid]<=target){
                st=mid;
            }
            else{
                end=mid-1;
            }
        }
        if(arr[end]==target){
            return end;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(lastOccurance(arr,target));
    }
}