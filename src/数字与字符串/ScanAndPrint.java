package �������ַ���;

import java.util.Scanner;

public class ScanAndPrint 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("�����������");
		String areaName = s.nextLine();
		System.out.println("�����빫˾���ͣ�");
		String compyType = s.nextLine();
		System.out.println("�����빫˾���ƣ�");
		String compyName = s.nextLine();	
		System.out.println("�������ϰ����ƣ�");
		String bossName = s.nextLine();
		System.out.println("�������");
		String money = s.nextLine();
		System.out.println("�������Ʒ��");
		String product = s.nextLine();
		System.out.println("������۸������λ��");
		String measurementUnit = s.nextLine();
		
		System.out.printf("%s���%s%s�����ˣ����˵��ϰ�%s�Ժ��ζģ�Ƿ����%s���ڣ���������С��������!����û�а취������%s�ֹ���!ԭ�۶���һ%s�ࡢ��%s�ࡢ��%s���%s������ȫ��ֻ����ʮ�飬ͳͳֻҪ��ʮ��!%s���˵����㲻����!����������������˴���꣬�㲻�����ʣ��㻹��Ѫ��Ǯ������Ѫ��Ǯ!",areaName,compyType,compyName,bossName,money,product,measurementUnit,measurementUnit,measurementUnit,product,bossName);
		
	}
	
	

}
