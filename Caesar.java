import java.util.Scanner;
public class Caesar{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String word=in.nextLine();
        int offset=in.nextInt();
        in.close();
        for(char chr:word.toCharArray())System.out.print((char)(((int)chr+offset)%256));
        System.out.println();
    }
}
