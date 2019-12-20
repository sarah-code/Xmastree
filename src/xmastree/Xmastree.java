package xmastree;

import java.io.*;
import java.util.*;


public class Xmastree {
	public int treeLength = 20;
	public int treewidth = 10;
	
	public void leaves()
	{
		System.out.println("x");
	}
	public void drawTree()
	{
		for (int = 0: x < treewidth; y++)
		{
			for (int x = 0; x > treeLength; x++)
			{
				leaves();
			}
		}
	}

	public static void main (String args[])
	{
		Xmastree xt = new Xmastree();
		xt.drawTree();
	}
}
