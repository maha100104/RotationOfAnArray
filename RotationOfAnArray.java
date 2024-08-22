public class RotaionOfAnArray
{
    public static void rotate(int arr[],int d,int n)
    {
        for(int i=d;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<d;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
	public static void main(String[] args) {
	    int[] arr = { 1, 2, 3, 4, 5, 6,7 };
        int d = 2;
        int n=arr.length;

        rotate(arr, d,n);
	}
}
/*
output: 3 4 5 6 7 1 2
*/
