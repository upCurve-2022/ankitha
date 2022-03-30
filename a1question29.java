//binary search
import java.util.*;
import java.io.*;
class Main{  
    public static int binarySearch(int arr[], int first, int last, int key){  
        if (last>=first){  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){  
            return binarySearch(arr, first, mid-1, key);//search in left subarray  
            }else{  
            return binarySearch(arr, mid+1, last, key);//search in right subarray  
            }  
        }  
        return -1;  
    }  
    public static void main(String args[]){  
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array sze");
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    System.out.println("enter array elements");
	    for(int i=0;i<n;i++)
		 arr[i] = sc.nextInt();
		 System.out.println("enter search Element");
		int key = sc.nextInt();
		Arrays.sort(arr);
        int last=arr.length-1;  
        int result = binarySearch(arr,0,last,key);  
        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }  
}  

