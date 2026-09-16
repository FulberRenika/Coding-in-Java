import java.util.*;
public class firstLastOccurance{
    public static int[] firstLastOccurance(int[] arr, int target){
        int left=0;
        int right=arr.length-1;
        int first=-1;
        int last=-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]>=target){
                first=mid;
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]<=target){
                last=mid;
                left=mid;
            }
            else{
                right=mid-1;
            }
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
        System.out.println(firstLastOccurance(arr,target));
    }
}