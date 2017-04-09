package works;

import java.util.Scanner;

public class num2py{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int Inum = in.nextInt();
		int count=1,S;
		String pinyin="";
		if(Inum <0)
		{
			System.out.print("fu ");
			Inum= -Inum;
		}
		int TempNum=Inum;
		while(TempNum>0)
		{
			TempNum = TempNum/10;
			if(TempNum>0)
			{
				count = count*10;
			}
		}
		while(count>0)
		{	
			
			S = Inum/count;
			Inum  = Inum%count;
			count = count/10;
			switch (S)
			{
				case 0: pinyin="ling";
				break;
				case 1: pinyin="yi";
				break;
				case 2: pinyin="er";
				break;
				case 3: pinyin="san";
				break;
				case 4: pinyin="si";
				break;
				case 5: pinyin="wu";
				break;
				case 6: pinyin="liu";
				break;
				case 7: pinyin="qi";
				break;
				case 8: pinyin="ba";
				break;
				case 9: pinyin="jiu";
				break;
				default:
				break;
			}
			if(count>0)
			{
				System.out.print(pinyin+" ");
			}
			else
			{
				System.out.print(pinyin);
			}
		}
		in.close();
	}
	

}