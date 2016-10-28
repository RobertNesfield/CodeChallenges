import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String word=in.nextLine();
        in.close();
        boolean isP=true;
        int x=0,y=word.length()-1;
        while(x<y&&isP){
        	if(word.charAt(x)!=word.charAt(y))isP=false;
        	x++;
        	y--;
        }
        System.out.print(word+" is");
        if(!isP)System.out.print("n't");
        System.out.println(" a palindrome.");
    }
}
