import java.util.Scanner;
import java.util.Random;
public class Gamble {
	public static void main(String[] args) throws InterruptedException{
		int num[]=new int[7],val[]=new int[7],score=0;
		Random rnd=new Random();
		boolean rep,bonus=false;
		for(int x=0;x<7;){
			num[x]=input("Enter number "+(x+1)+": ");
			rep=false;
			if(num[x]>0&&num[x]<=49){for(int y=0;y<x;y++)if(num[x]==num[y])rep=true;}
			else rep=true;
			if(!rep)x++;
		}
		System.out.println("The numbers are:");
		for(int x=0;x<7;){
			val[x]=rnd.nextInt(49)+1;
			rep=false;
			for(int y=0;y<x;y++)if(val[x]==val[y])rep=true;
			if(!rep){
			    if(x>0)System.out.print(", ");
			    System.out.print(val[x]);
			    Thread.sleep(1000);
			    x++;
			 }
		}
		System.out.println();
		for(int x=0;x<6;x++)for(int n:num)if(n==val[x])score++;
		for(int n:num)if(n==val[6])bonus=true;
		System.out.print("You won £");
		switch(score){
		    case 3:System.out.println("10");break;
		    case 4:System.out.println("100");break;
		    case 5:if(bonus)System.out.println("100,000");else System.out.println("10,000");break;
		    case 6:System.out.println("1,000,000");break;
		    default:System.out.println("0");break;
		}
	}
	public static int input(String msg){
		System.out.print(msg);
		Scanner in=new Scanner(System.in);
		int put=-1;
		try{put=in.nextInt();}catch(Exception problem){}
		return put;
	}
}
