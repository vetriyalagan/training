class Bobblesort
{
    static void bubbleSort(int[]arr,int n){
        int i,j,temp;
        boolean swap;
        for(i=0;i<n-1;i++){
            swap=false;
            for(j =0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    static void printArray(int[]arr,int n){
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
	public static void main(String[] args) {
	    int[]arr = {6,7,3,1,10,5};
	    int n = arr.length;
	    bubbleSort(arr,n);
	    System.out.println("The sorted array : ");
	    printArray(arr,n);
	}
}
