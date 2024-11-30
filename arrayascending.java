package examples;

public class array {

	public static void main(String[] args) {
		int[] arr = {3,5,7,2,9};
		
		for (int i = 0;i<arr.length - 1;i++)
		{
			for (int j = 0;j<arr.length - 1-i;j++)
			{
				if(arr[j]<arr[j+1])//ascending order
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			
			}
		}
		System.out.print("sorted array:");
		for (int num:arr)
		{
			System.out.print(num + " ");
		}

	}

}
