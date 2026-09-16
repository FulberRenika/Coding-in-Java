import java.util.*;
public class firstLastOccurance{
    public static int[] firstLastOccurance(int[] arr, int target){
        int left=0;
        int right=arr.length-1;
        int first=-1;
        int last=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                first=mid;
                right=mid-1;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        left=0;
        right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                last=mid;
                left=mid+1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return new int[]{first,last};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(Arrays.toString(firstLastOccurance(arr,target)));
    }
}
