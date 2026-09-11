import java.util.*;

public class normalBinarySearch
{
    public static boolean binaryHelp(int[] arr, int start, int end, int target){
        if(start>end){
            return false;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return true;
        }
        if(arr[mid]>target){
            binary(arr,start,mid-1);
        }
        binary(arr,start+1,end);

    }
    public static boolean binary(int[] arr, int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>target){
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		if(binary(arr,target)){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
	}
}
