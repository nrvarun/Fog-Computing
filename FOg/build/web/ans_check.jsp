<%@ page  import="java.sql.*"  %>
<%

String name=(String)session.getAttribute("un");
String ans=(String)session.getAttribute("ans");

try
{
Connection con=null;
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:DRIVER={SQL Server};Database=fogcomputing;Server=VARUN\\SQLEXPRESS","sa","varunnr");
PreparedStatement ps=con.prepareStatement("select * from  signup where name='"+name+"' and answer='"+ans+"'");
ResultSet rs=ps.executeQuery();
if(rs.next())
{
 response.sendRedirect("file1_download.jsp");
}
else
{
 response.sendRedirect("file_download.jsp");
}
}
catch(Exception e)
{
 out.println(e.getMessage());
}
%>
