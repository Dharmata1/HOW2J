package HOW2J.��Ͷ���;

public enum TestEnum 
{
	TANK,
	WIZARD,
	ASSASSIN,
	ASSIST,
	WARRIOR,
	RANGED,
	PUSH,
	FARMING
}

class PrintEnum
{
    public static void main(String args[])
    {
    	for (TestEnum testEnum:TestEnum.values())
    	{
            switch(testEnum)
            {
                case TANK:
                	System.out.println("̹��");
                	break;
                case WIZARD:
                	System.out.println("��ʦ");
                	break;
                case ASSASSIN:
                	System.out.println("�̿�");
                	break;
                case ASSIST:
                	System.out.println("����");
                	break;
                case WARRIOR:
                	System.out.println("��ս");
                	break;
                case RANGED:
                	System.out.println("Զ��");
                	break;
                case PUSH:
                	System.out.println("�ƽ�");
                	break;
                case FARMING:
                	System.out.println("��Ұ");
                	break;
            }   		
    	}  	
    }
}