package JDBC;

   
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;  

public class TestJDBC {
    public static void main(String[] args) {
  
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
  
            // ���������ݿ��Connection����
            // ������Ҫ�ṩ��
            // ���ݿ������ڵ�ip:127.0.0.1 (����)
            // ���ݿ�Ķ˿ںţ� 3306 ��mysqlר�ö˿ںţ�
            // ���ݿ����� how2java
            // ���뷽ʽ UTF-8
            // �˺� root
            // ���� admin
  
            Connection c = DriverManager
                    .getConnection(
                            "jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                            "root", "admin");
  
            System.out.println("���ӳɹ�����ȡ���Ӷ��� " + c);
            
            // ע�⣺ʹ�õ��� java.sql.Statement
            // ��Ҫ��С��ʹ�õ��� com.mysql.jdbc.Statement;
            Statement s = c.createStatement();
            
            System.out.println("��ȡ Statement���� " + s);
            
            String sql = "insert into hero values(null,"+"'��Ī'"+","+313.0f+","+50+")";
            s.execute(sql);
  
            System.out.println("ִ�в������ɹ�"); 
            
            for (int i = 0 ; i < 100; i++)
            {
            	String sql1 = "insert into hero values(null," + "'Ӣ��"+i+"'"  + "," + 313.0f + "," + 50 + ")";
            	s.execute(sql1);
            }            
                          
            System.out.println("ִ��100���������ɹ�"); 
            
  
        } 
        catch (ClassNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        catch (SQLException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        /*finally
        {
        	if (s != null)
        	{
        		try
        		{
        			s.close();
        		}
        		catch(SQLException e)
        		{
        			e.printStackTrace();
        		}
        	}
        	
        	if (c != null)        	{
        		try
        		{
        			c.close();
        		}
        		catch(SQLException e)
        		{
        			e.printStackTrace();
        		}
        	}
        }*/
  
    }
}