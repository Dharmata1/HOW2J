package HOW2J.����;

public class TwoDimensionalArrays 
{
	public static void main(String args[])
	{
		int a[][]=new int[5][5];
		int xMax = 0,yMax = 0;
		int maxValue = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				a[i][j] = (int)(Math.random()*100);
				
				if(a[i][j] > maxValue)
				{
					maxValue = a[i][j];
					xMax = i;
					yMax = j;
				}
				
				System.out.print(a[i][j]+"\t");
			}
			
			System.out.println("");			
		}
		
		System.out.println("�ҳ��������ֵ�ǣ�"+maxValue);
		System.out.println("��������["+xMax+"]"+"["+yMax+"]");
	}

}

