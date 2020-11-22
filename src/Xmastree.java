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

import static java.lang.String.format;
import static java.time.Year.of;

import java.time.Year;


import java.io.*;

public class Xmastree {
	public static int treeLength = 15;
	public static int treeWidth = 15;


	public static void drawTree()
	{
		
		for (int x = 0; x < treeLength; x++)
		{
			for (int y=0  ; y < treeWidth-x ; y++)
			{
				var i = (int) ((Math.random() * ((5 - 1) + 1)) + 1);
				
				starGeneration(i);
				
			}
			int limit = 2 * x + 1;
			System.out.print(limit);
			for (int leave = 0; leave < limit; leave ++)
			{
				leaves();
				//starGeneration(limit);
			}
			
			for (int i= treeWidth+1 ; i > 0; i++ )
			{
				starGeneration(i);
			}
			
			
			
			System.out.println();
		}
		for (int x = 0; x < treeLength / 3; x++)
		{
			for (int y=0  ; y < treeWidth*90/100 ; y++)
			{
				System.out.print(" ");
			}
			for (int trunk = 0; trunk < treeWidth/3; trunk++ )
			{
				trunk();
			}
		
			System.out.println();
		}
		for (int g=0; g <= treeWidth*3; g++)
		{
			System.out.print("=");
		}
		System.out.println();
		System.out.print(format("'Tis the time of the year! \n Merry Xmas %s and a happy new year %s.", of(2020), Year.of(2021)));
		System.out.println();
		for (int g=0; g <= treeWidth*3; g++)
		{
			System.out.print("=");
		}
	}
	private static void starGeneration(int i) {
		switch(i)
		{
		//case 3: System.out.print("*");break;
		case 1: System.out.print(" ");break;
		case 3: System.out.print(" ");break;
		case 2: System.out.print("°");break;
		case 4: System.out.print(" ");break;
		case 5: System.out.print(" ");break;
		}
		
	}
	public static void leaves()
	{
		String typOfLeaves [] = {"x", "*"};
		int ran = (int) ((Math.random() * ((1 - 0) + 1)) + 0);
		System.out.print(typOfLeaves[ran]);
	}
	public static void trunk()
	{
		System.out.print("|");
	}
	public static void main (String argv[])
	{
	drawTree();
		
	}
}
