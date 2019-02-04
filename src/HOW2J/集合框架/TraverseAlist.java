package HOW2J.集合框架;
import java.util.ArrayList;
import java.util.Iterator;

public class TraverseAlist 
{
	public static void main(String args[])
	{
		ArrayList test = new ArrayList();
		
		for (int i = 0 ; i<= 24 ; i++)
		{
			test.add(new Test("Hero "+i));
		}
		
        //第二种遍历，使用迭代器
        System.out.println("--------使用while的iterator-------");
        Iterator<Test> it= test.iterator();
        //从最开始的位置判断"下一个"位置是否有数据
        //如果有就通过next取出来，并且把指针向下移动
        //直到"下一个"位置没有数据
        while(it.hasNext()){
            Test t = it.next();
            int a = Integer.parseInt(t.name.substring(5, t.name.length()));
            if (0 == a%8)
            {
            	it.remove();
            }
        }
        
        
        //迭代器的for写法
        System.out.println("--------使用for的iterator-------");
        for (Iterator<Test> iterator = test.iterator(); iterator.hasNext();) {
            Test t = (Test) iterator.next();
            System.out.println(t.name);
        }
		
		
	}
}

class Test
{
	public String name;
	
	Test(String name)
	{
		this.name = name;
	}
}
