<%@ page  import="java.sql.*"  %>
<%


String name=(String)session.getAttribute("un");

String pw=(String)session.getAttribute("pw");
try
{
 int ac=0;
Connection con=null;
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:DRIVER={SQL Server};Database=fogcomputing;Server=VARUN\\SQLEXPRESS","sa","varunnr");
PreparedStatement ps=con.prepareStatement("update behaviour set alert_count ='"+ac+"' where uname='"+name+"' ");
ps.executeUpdate();
}
catch(Exception e)
{
out.println(e.getMessage());
}
try
{
Connection con=null;
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:fogcomputing","sa","varunnr");
PreparedStatement ps=con.prepareStatement("update signup set pass='"+pw+"',cpass='"+pw+"' where name='"+name+"' ");
ps.executeUpdate();
}
catch(Exception e)
{
out.println(e.getMessage());
}

 response.sendRedirect("Userlogin.jsp");
 


%>