package HOW2J.���̿���;
import java.util.Scanner;

public class BmiJudge 
{
	public static void main(String args[])
	{
		Scanner sIn = new Scanner(System.in);
		
		System.out.println("���������(m):");		
		double height = sIn.nextDouble();
		
		System.out.println("����������(kg):");		
		double weight = sIn.nextDouble();
		
		double bmi = weight/(height*height);
		System.out.printf("��ǰ��BMI��%.6f\18n",bmi);
				
		if (bmi < 18.5)
		{
			System.out.println("����״̬�ǣ����ع���");
		}
		else if ((bmi >= 18.5)&&(bmi < 24))
		{
			System.out.println("����״̬�ǣ�������Χ");
		}
		else if ((bmi >= 24)&&(bmi < 27))
		{
			System.out.println("����״̬�ǣ����ع���");
		}
		else if ((bmi >= 27)&&(bmi < 30))
		{
			System.out.println("����״̬�ǣ���ȷ���");
		}
		else if ((bmi >= 30)&&(bmi < 35))
		{
			System.out.println("����״̬�ǣ��жȷ���");
		}
		else
		{
			System.out.println("����״̬�ǣ��ضȷ���");
		}
		
	}

}
