package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.text.ParseException.*;
import java.sql.*;
import java.lang.*;
import databaseconnection.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public final class file_005finsert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("     ");

		  java.util.Date now = new java.util.Date();
	 String DATE_FORMAT1 = "yyyy-MM-dd";
	 SimpleDateFormat sdf1 = new SimpleDateFormat(DATE_FORMAT1);
	 String un=(String)session.getAttribute("un");

     String ds = sdf1.format(now);
	  String fn=request.getParameter("fn");
	   String fid=request.getParameter("fid");
	    String file1=request.getParameter("file1");
	   String f="C:\\project\\fileupload\\";
String f1=f+file1;
File ff= new File(f1);
		  double size=ff.length();
		  double  size1=size/1024;
		  double size2=Math.round(size1*100.0)/100.0;
		  String size3=Double.toString(size2);
		  session.setAttribute("filesize",size3);
	
		  
String u="0";
String a="0";
		   FileInputStream fis;
			try
{
Connection con=null;
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:fogcomputing","sa","varunnr");

PreparedStatement ps=con.prepareStatement("insert into fileupload (uname,fname,fid,files,size,date,au,uau)  values (?,?,?,?,?,?,?,?)");
fis=new FileInputStream(ff);
ps.setString(1,un);
ps.setString(2,fn);
ps.setString(3,fid);

ps.setBinaryStream(4, (InputStream)fis, (int)(ff.length()));
ps.setString(5,size3);
ps.setString(6,ds);
ps.setString(7,u);
ps.setString(8,a);
ps.executeUpdate();
response.sendRedirect("upload_success.jsp");
}
catch(Exception e)
{
out.println(e.getMessage());
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
