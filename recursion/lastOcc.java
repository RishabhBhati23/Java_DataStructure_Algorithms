public class lastOcc{
    
    public static int lastOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }
    
    public static void main(String arrgs[])
    {
        int arr[]={1,4,5,31,2,4,5,2};
        int key=2;


        System.out.println(lastOccurence(arr,key,0));
    }
}