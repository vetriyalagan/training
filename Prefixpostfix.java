/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Prefixpostfix
{
	public static void main(String[] args) {
	    int x=10;
		System.out.println(x++ + ++x + ++x + x++ + ++x);
		System.out.println(--x + x++ + ++x + --x + x++);
		System.out.println(--x + --x + --x + --x);
	}
}