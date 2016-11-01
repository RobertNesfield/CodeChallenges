import java.util.Scanner;
import java.util.Random;
public class Chance {
	public static void main(String[] args){
		boolean lost=false;
		Random rnd=new Random();
		String prime="(2)(3)(5)(7)(11)(13)(17)(19)(23)(29)";
		int bal=100,betnum,betval,num;
		while(!lost){
			System.out.println("\n\n\n\n\nYou have "+bal+"dollarpoundnotes left.");
			betnum=-1;
			betval=0;
			while(betnum<0||betnum>30)betnum=input("Enter the number between 0 and 30 you want to bet on: ");
			while(betval<1)betval=input("Enter how much you want to bet: ");
			bal-=betval;
			if(betnum%2==0)betval*=2;
			if(betnum%10==0)betval*=3;
			if(prime.contains('('+String.valueOf(betnum)+')'))betval*=5;
			if(betnum<5)betval*=2;
			num=rnd.nextInt(31);
			if(num==betnum){System.out.println("You Win!");bal+=betval;}
			else if(bal<1){System.out.println("You lose!");lost=true;}
			else System.out.println("Should've bet on "+num+"...");;
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
