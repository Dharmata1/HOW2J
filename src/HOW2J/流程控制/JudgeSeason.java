package HOW2J.���̿���;
import java.util.Scanner;

public class JudgeSeason 
{
	public static void main(String args[])
	{
		Scanner sIn = new Scanner(System.in);	
		System.out.println("�������·�");
		int month = sIn.nextInt();
		
		switch(month)
		{
            case 1:
            case 2:
            case 3:
                System.out.println("����");
            	break;
            case 4:
            case 5:
            case 6:
                System.out.println("����");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("����");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("����");
                break;
            default:
                System.out.println("�Ƿ�����");

		}
	}

}
