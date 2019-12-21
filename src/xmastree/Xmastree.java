package xmastree;

import java.util.*;
import java.io.*;
import java.math.*;



public class Xmastree {
	public int treeLength = 20;
	public int treewidth = 10;
	
	public int rnd2 =(int)(Math.random()*((30-1)+1))+1;
	public void drawTree()
	{
		Range intRange = new Range(Integer.class, new Integer(1), new Integer(5)); 
		System.out.print("/033c");
		for (int x : Range (1,30,2))
		{
			int rnd2 =(int)(Math.random()*((rnd2-1)+1))+1;
			leaves();
			for (int x = 0; x < treeLength; x++)
			{
				leaves();
			}
		}
	}
	public void leaves()
	{
		System.out.println("*");
	}
	public static void main (String argv[])
	{
		Xmastree xt = new Xmastree();
		xt.drawTree();
	}
}
