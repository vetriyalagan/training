/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Bitwiseternary
{
	public static void main(String[] args) {
		int a=492,b=333,c=a&b,d=a|b,e=a^b;
		System.out.println("c:" +(a&b));
		System.out.println("d:"+(a|b));
		System.out.println("e:"+(a^b));
		System.out.println("a>=b:"+(a>=b));
		int m=(a>b&&a>c)?a:(b>c)?b:c;
	System.out.println("m:"+m);
	}
}