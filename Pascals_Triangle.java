import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
		ArrayList<ArrayList<Long>> ans=new ArrayList<>();
		int j;
		for(int i=0;i<n;i++)
		{
			ArrayList<Long> temp=new ArrayList<>();
		
			for(j=0;j<=i;j++)
			{
				if(j==0||j==i) temp.add((long)1);
				else{ 
					long a=ans.get(i-1).get(j-1);
					long b= ans.get(i-1).get(j);
					temp.add(a+b);
			}}
          ans.add(temp);

		}

     return ans;
	}
}
