/**
 * @author sarah-code
 * @version 1.0
 * This programme generates a christmas tree with the measurements
 * treeLength and treeWidth. 
 * 
 * Should look like this with treeLength = 15 and treeWidth=15
 *                *
 *               *xx
 *              **xx*
 *             xxx*x**
 *            *x****x**
 *           x*x**x*x**x
 *          xx*x*x*****xx
 *         **x**xxxxx*xxxx
 *        x*x*x****xxx***x*
 *       *x*xxxxx**xxxx*x**x
 *      *xxx**x***x*x*****x**
 *     x*****x*xxx*xxx**x*x***
 *    ***xxx*xx**x*x*xx**xx***x
 *   x*xx*xxxxxx**xxxxx**xx*xxxx
 *  xx**xx*xx**x***x*x*x**xx*x**x
 *            |||||
 *            |||||
 *            |||||
 *            |||||
 *            |||||
 * ===============================
 * Merry Xmas and a happy new year 2020.
 * ===============================
 * 
 * @param treeLength (describes the length of the tree)
 * 			treeWidth (describes the width of the half image
 */

import java.util.*;
import java.io.*;

public class Xmastree {
	public int treeLength = 15;
	public int treeWidth = 15;


	public void drawTree()
	{
		
		for (int x = 0; x < treeLength; x++)
		{
			for (int y=0  ; y < treeWidth-x ; y++)
			{
				System.out.print(" ");
			}
			for (int starz = 0; starz < (2 * x + 1); starz ++)
			{
				leaves();
			}
			
			System.out.println();
		}
		for (int x = 0; x < treeLength / 3; x++)
		{
			for (int y=0  ; y < treeWidth*85/100 ; y++)
			{
				System.out.print(" ");
			}
			for (int trunk = 0; trunk < treeWidth/3; trunk++ )
			{
				trunk();
			}
			System.out.println();
		}
		for (int g=0; g <= treeWidth*2; g++)
		{
			System.out.print("=");
		}
		System.out.println();
		System.out.print("Merry Xmas and a happy new year 2020.");
		System.out.println();
		for (int g=0; g <= treeWidth*2; g++)
		{
			System.out.print("=");
		}
	}
	public void leaves()
	{
		String typOfLeaves [] = {"x", "*"};
		int ran = (int) ((Math.random() * ((1 - 0) + 1)) + 0);
		System.out.print(typOfLeaves[ran]);
	}
	public void trunk()
	{
		System.out.print("|");
	}
	public static void main (String argv[])
	{
		Xmastree xt = new Xmastree();
		xt.drawTree();
	}
}
