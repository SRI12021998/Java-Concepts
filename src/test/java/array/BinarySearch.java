package array;

public class BinarySearch 
{

	public static void main(String[] args) 
	{
		int[] arr = {114, 121, 131, 138, 144, 158, 178, 182, 183, 199,
                203, 204, 205, 208, 216, 227, 229, 248, 259, 279,
                280, 299, 303, 322, 330, 333, 336, 338, 342, 355,
                358, 360, 363, 367, 368, 388, 393, 399, 409, 428,
                435, 443, 449, 455, 457, 460, 475, 479, 483, 503,
                514, 522, 553, 562, 566, 574, 583, 594, 597, 616,
                634, 640, 642, 658, 661, 680, 707, 708, 710, 734,
                735, 739, 740, 747, 748, 755, 763, 770, 772, 777,
                788, 839, 846, 848, 850, 851, 854, 863, 865, 868,
                870, 876, 881, 883, 890, 900, 930, 941, 953, 955};
		int index=BinarySearch.binarySearch(arr, 503);
		System.out.println("Index of "+arr[index]+" - "+index);
		
		int maxVal=max(arr);
		System.out.println(maxVal);
	}
	public static int binarySearch(int[]input, int find)
	{
		int min=0;
		int max=input.length-1;
		int avg=max/2;
		int target=find;
		while(min<=max)
		{
			if(target==input[avg])
			{
				return avg;
			}
			else if(target<input[avg])
			{
				max=avg-1;
				avg=(min+max)/2;
			}
			else if (target>input[avg])
			{
				min=avg+1;
				avg=(min+max)/2;
			}
		}
		return -1;
		
	}
	
	public static int max(int arr[])
	{
		int imax=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(imax<arr[i])
			{
				imax=arr[i];
			}
		}
		return imax;
	}
}
