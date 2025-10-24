package logical;

import java.util.HashMap;
import java.util.Iterator;

public class BinaryTree 
{
	public static boolean TreeConstructor(String[] strArr)
	{
		boolean output=true;
		int[][]kv=new int[strArr.length][2];
		for(int i = 0; i < strArr.length; i++)
		{
			String temp=strArr[i];
			temp=temp.replaceAll("[()]", "");
			String [] pair=temp.split(",");
			for(int j=0; j<2; j++)
			{
				kv[i][j]=Integer.parseInt(pair[j].trim());
			}
		}
		HashMap<Integer,Integer> validity=new HashMap<>();
		
		for (int i = 0; i < kv.length; i++) 
		{
            for (int j = 0; j < kv[i].length; j++) 
            {
            	if(j==1)
            	{
            		validity.put(kv[i][j], (validity.getOrDefault(kv[i][j], 0)+1));
            	}
//                System.out.print(kv[i][j] + " ");
            }
//            System.out.println();
        }
//		System.out.println(validity);
		Iterator <Integer> itr=validity.values().iterator();
		while(itr.hasNext())
		{
			if(itr.next()>2)
			{
				output=false;
				break;
			}
		}
		return output;
		
	}
	public static void main(String[] args) 
	{
		String [] input= {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"};
		System.out.println(TreeConstructor(input));
	}

}
