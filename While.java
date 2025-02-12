/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class While
{
    public static void main(String[] s)
    {
       int n=49635,rem=0,res=0;
       while(n>0)
       {
           rem=n%10;
           n=n/10;
           res=res*10+rem;
       
       }
       System.out.println(res);
    }
}


