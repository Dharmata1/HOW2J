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
  
            // 建立与数据库的Connection连接
            // 这里需要提供：
            // 数据库所处于的ip:127.0.0.1 (本机)
            // 数据库的端口号： 3306 （mysql专用端口号）
            // 数据库名称 how2java
            // 编码方式 UTF-8
            // 账号 root
            // 密码 admin
  
            Connection c = DriverManager
                    .getConnection(
                            "jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                            "root", "admin");
  
            System.out.println("连接成功，获取连接对象： " + c);
            
            // 注意：使用的是 java.sql.Statement
            // 不要不小心使用到： com.mysql.jdbc.Statement;
            Statement s = c.createStatement();
            
            System.out.println("获取 Statement对象： " + s);
            
            String sql = "insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")";
            s.execute(sql);
  
            System.out.println("执行插入语句成功"); 
            
            for (int i = 0 ; i < 100; i++)
            {
            	String sql1 = "insert into hero values(null," + "'英雄"+i+"'"  + "," + 313.0f + "," + 50 + ")";
            	s.execute(sql1);
            }            
                          
            System.out.println("执行100条插入语句成功"); 
            
  
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