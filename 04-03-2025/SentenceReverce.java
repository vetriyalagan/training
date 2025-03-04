import java.util.*;
import java.util.Scanner;
class Reverce{
    Scanner in = new Scanner(System.in);
    String a;
    void display(){
        System.out.print("ENTER THE SENTENCE :");
        a =in.nextLine();
    String[] words = a.split("\\s+");
		Collections.reverse(Arrays.asList(words));
		String b = String.join(" ", words);
		System.out.println(b);
    }
}
class SentenceReverce{
    public static void main(String[] args){
        Reverce obj = new Reverce();
        obj.display();
    }
}





