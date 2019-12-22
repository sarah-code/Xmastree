

import java.util.*;
import java.io.*;

public class Xmastree {
	public int treeLength = 20;
	public int treewidth = 20;


	public void drawTree()
	{
		
		for (int x = 0; x < treeLength; x++)
		{
			for (int y=0 ; y < treewidth -1; y++)
			{
				System.out.print(" ");
			}
			for (int starz = 0; starz < (2 * x + 1); starz ++)
			{
				leaves();
			}
			System.out.println();
		}
		
	}
	public void leaves()
	{
		String typOfLeaves [] = {"x", "*", "O", "+"};
		int ran = (int) ((Math.random() * ((3 - 0) + 1)) + 0);
		System.out.print(typOfLeaves[ran]);
	}
	public static void main (String argv[])
	{
		Xmastree xt = new Xmastree();
		xt.drawTree();
	}
}
