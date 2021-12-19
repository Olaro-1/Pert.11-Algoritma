public class BinarySearch {
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
        int arr[] = {2,5,8,10,14,32, 35, 41, 67, 88, 90, 101, 109};  
        int key = 10;  
        int last=arr.length-1;  
        int result = binarySearch(arr,0,last,key);  
        if (result == -1)  
            System.out.println("Data Element Tidak Ditemukan!");  
        else  
            System.out.println("Data Element Ditemukan Pada Indeks ke- "+result);  
    }  
}  

