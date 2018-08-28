package HOW2J.接口与继承;
import HOW2J.接口与继承.*;

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
