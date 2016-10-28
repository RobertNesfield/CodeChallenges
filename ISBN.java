import java.util.Scanner;
public class ISBN{
    public static void main(String[] args){
    	String num="";
        Scanner in=new Scanner(System.in);
        while(num.length()!=13)num=in.nextLine();
        in.close();
        int tot=0;
        for(int x=0;x<num.length();x++)tot+=((int)num.charAt(x)-48)*(2*(x%2)+1);
        System.out.print("ISBN is");
        if(tot%10!=0)System.out.print("n't");
        System.out.println(" valid");
    }
}
