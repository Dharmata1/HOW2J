package HOW2J.�ӿ���̳�;
import HOW2J.�ӿ���̳�.*;

public class AnonymousClass extends AbstractClass
{
	AnonymousClass a = new AnonymousClass()
	{
		public boolean disposable()
		{
			return false;
		}
	};	
	
	public boolean disposable()
	{
		return false;
	}
}
