import java.io.*;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare an Array
		double[] data; 
		
		//allocate memory 
		data=new double [10];
		
		int a[]=new int[100];
		
		
		int age []= {12,4,5,2,5};
		
		int ag[]=new int [5];
		ag[0]=12;
		ag[1]=4;
		ag[2]=5;
		
		//iterate array using for loops
		for(int i=0;i<ag.length;i++)
		{
			System.out.println(ag[i]);
		}
		
		//iterate array using for each loop
		System.out.println("by for each loops");
		for(int ec:ag)
		{
			System.out.println(ec);
		}
		
		
		
		//Multidimensional 2d array
		int [][]multi=new int [3][4];
		
		String[][][] s=new String [3][4][2];
		
		//the length will be 3*4 = 12
		
		
		int [][] mul2 = {
			
				{1,2,3},
				{4,5,6},
				{77},
				
		};
		
		for(int i=0;i<mul2.length;i++)
		{
			for(int j=0;j<mul2[i].length;j++)
			{
				System.out.println(mul2[i][j]);
			}
		}
		
		//For Each loop 2d Array
		for(int [] innerArray:mul2)
		{
			for(int v:innerArray)
			{
				System.out.println(v);
			}
		}
		
		//3D Array
		
		int [][][] ar3d= {
				 {
		              {1, -2, 3}, 
		              {2, 3, 4}
		            }, 
		            { 
		              {-4, -5, 6, 9}, 
		              {1}, 
		              {2, 3}
		            } 
			
		};
		
		//3d Array by for each loop
		for(int [][] ar2d:ar3d)
		{
			for(int [] ar1d:ar2d)
			{
				for(int item:ar1d)
				{
					System.out.println(item);
				}
			}
		}
		
		
		
	}

}
