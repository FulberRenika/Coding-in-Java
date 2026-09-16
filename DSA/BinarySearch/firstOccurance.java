import java.util.*;

public class firstOccurance{
    public static int firstOccurance(int[] arr, int target){ 
        if(arr.length==0) { 
            return -1; 
        } 
        int st=0; 
        int end=arr.length-1; 
        while(st<end){ 
            int mid=st+(end-st)/2; 
            if(arr[mid]>=target){ 
                end=mid; 
            } 
            else{ 
                st=mid+1; 
            } 
        } 
        if(arr[st]==target){ 
            return st; 
        } 
        return -1; 
    }
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        int[] arr=new int[n]; 
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt(); 
        } 
        int target=sc.nextInt(); 
        System.out.println(firstOccurance(arr,target)); 
    }
}
