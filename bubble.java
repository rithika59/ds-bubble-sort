/* bubble sort */


public class bubble{

    static void bsort(int[] arr){
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j =1;j<(n-i);j++){
                if(arr[j-1]>arr[j])
                {
                    arr[j-1] = arr[j-1]+arr[j];
                    arr[j] = arr[j-1]-arr[j];
                    arr[j-1] = arr[j-1] - arr[j]; 
                }
            }
        }
    }


    public static void main(String[] args){
        int arr[] = {3,60,35,2,45,320,5,17,32,90};
        System.out.println("Before Sorting");
        for(int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        bsort(arr);
        System.out.println("After Sorting");
        for(int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();

    }
}