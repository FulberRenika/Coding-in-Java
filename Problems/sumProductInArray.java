/*A Java program that takes an array of integers 
and creates a new array containing the maximum value between the sum of digits 
and the product of digits for each element.*/

import java.util.*;
public class sumProductInArray
{
    public static int product(int n){
        if(n==0){
            return 0;
        }
        int product=1;
        int temp=n;
        while(n>0){
            temp=n%10;
            product=product*temp;
            n=n/10;
        }
        return product;
    }
    public static int sum(int n){
        int sum=0;
        int temp=n;
        while(n>0){
            temp=n%10;
            sum=sum+temp;
            n=n/10;
        }
        return sum;
    }
    public static int[] function(int[] arr){
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(sum(arr[i])>product(arr[i])){
                ans[i]=sum(arr[i]);
            }
            else{
                ans[i]=product(arr[i]);
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(function(arr)));
	}
}