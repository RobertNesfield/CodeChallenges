import java.util.Scanner;
import java.util.Random;
public class Gamble {
	public static void main(String[] args){
		int num[]=new int[7],val[]=new int[7],score=0;
		Random rnd=new Random();
		boolean rep;
		for(int x=0;x<7;){
			num[x]=input("Enter number "+(x+1)+": ");
			rep=false;
			if(num[x]>0&&num[x]<=49){for(int y=0;y<x;y++)if(num[x]==num[y])rep=true;}
			else rep=true;
			if(!rep)x++;
		}
		for(int x=0;x<7;){
			val[x]=rnd.nextInt(49)+1;
			rep=false;
			for(int y=0;y<x;y++)if(val[x]==val[y])rep=true;
			if(!rep)x++;
		}
		for(int v:val)for(int n:num)if(n==v)score++;
	}
	public static int input(String msg){
		System.out.print(msg);
		Scanner in=new Scanner(System.in);
		int put=-1;
		try{put=in.nextInt();}catch(Exception problem){}
		return put;
	}
}
