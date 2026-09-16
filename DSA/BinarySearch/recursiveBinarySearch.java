import java.util.*;

public class recursiveBinarySearch
{
    public static boolean binaryHelp(int[] arr, int start, int end, int target){
        if(start>end){
            return false;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return true;
        }
        else if(arr[mid]>target){
            return binaryHelp(arr,start,mid-1,target);
        }
        else{
            return binaryHelp(arr,mid+1,end,target);
        }

    }
    public static boolean binary(int[] arr, int target){
        int left=0;
        int right=arr.length-1;
        return binaryHelp(arr,left,right,target);
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
