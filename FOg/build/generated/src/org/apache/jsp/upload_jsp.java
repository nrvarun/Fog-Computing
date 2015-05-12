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
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.text.ParseException;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

String saveFile="";
int fids=0;
//to get the content type information from JSP Request Header
String contentType = request.getContentType();
/*
 here we are checking the content type is not equal to Null and
 as well as the passed data from mulitpart/form-data is greater than or
 equal to 0
*/
if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0)) 
{
 DataInputStream in = new DataInputStream(request.getInputStream());

//we are taking the length of Content type data
 int formDataLength = request.getContentLength();
 byte dataBytes[] = new byte[formDataLength];
 int byteRead = 0;
 int totalBytesRead = 0;

//this loop converting the uploaded file into byte code
 while(totalBytesRead < formDataLength) 
      {
       byteRead = in.read(dataBytes, totalBytesRead,formDataLength);
       totalBytesRead += byteRead;
      }
 String file = new String(dataBytes);
//for saving the file name
 saveFile = file.substring(file.indexOf("filename=\"") + 10);
 saveFile = saveFile.substring(0, saveFile.indexOf("\n"));
 saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1,saveFile.indexOf("\""));
 int lastIndex = contentType.lastIndexOf("=");
 String boundary = contentType.substring(lastIndex + 1,contentType.length());
 int pos;
//extracting the index of file
 pos = file.indexOf("filename=\"");
 pos = file.indexOf("\n", pos) + 1;
 pos = file.indexOf("\n", pos) + 1;
 pos = file.indexOf("\n", pos) + 1;
 int boundaryLocation = file.indexOf(boundary, pos) - 4;
 int startPos = ((file.substring(0, pos)).getBytes()).length;
 int endPos = ((file.substring(0, boundaryLocation)).getBytes()).length;
// creating a new file with the same name and writing the content in new file
 saveFile="C:/project/fileupload/"+saveFile;
 File ff = new File(saveFile);
 FileOutputStream fileOut = new FileOutputStream(ff);
 fileOut.write(dataBytes, startPos, (endPos - startPos));
 fileOut.flush();
 fileOut.close();

      out.write('\r');
      out.write('\n');

ResultSet rs = null;
Statement st = null;
Connection con=null;
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:fogcomputing","sa","varunnr");
st=con.createStatement();
rs=st.executeQuery("select max(fid) from fileupload");
if(rs.next())
  {
   int id=rs.getInt(1);
   if(id==0)
     {
      fids=1;
     }
     else
       {
        fids=id+1;
       }
     }   

      out.write('\r');
      out.write('\n');

PreparedStatement psmnt = null;
File f = new File(saveFile);
FileInputStream fis = new FileInputStream(f);

java.util.Date now = new java.util.Date();
String DATE_FORMAT1 = "yyyy-MM-dd";
SimpleDateFormat sdf1 = new SimpleDateFormat(DATE_FORMAT1);

double size=ff.length();
double  size1=size/1024;
double size2=Math.round(size1*100.0)/100.0;
String size3=Double.toString(size2);
session.setAttribute("filesize",size3);

String un=(String)session.getAttribute("un");
String ds = sdf1.format(now);
String fn=f.getName();
String fpath=f.getAbsolutePath();
String u="0";
String a="0";

try 
{
 Connection con1=null;
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 con=DriverManager.getConnection("jdbc:odbc:fogcomputing","sa","varunnr");
 psmnt = con.prepareStatement("insert into fileupload (uname,fname,fid,fpath,size,date,au,uau) values(?,?,?,?,?,?,?,?)");
 
 psmnt.setString(1,un);
 psmnt.setString(2,fn);
 psmnt.setInt(3,fids);
 psmnt.setString(4,fpath);
 //psmnt.setBinaryStream(4, (InputStream)fis, (int)(f.length()));
 psmnt.setString(5,size3);
 psmnt.setString(6,ds);
 psmnt.setString(7,u);
 psmnt.setString(8,a);
 int s = psmnt.executeUpdate();
 if(s>0) 
 {
  System.out.println("Uploaded successfully !");
  response.sendRedirect("upload_success.jsp");
 }
 else
 {
  System.out.println("unsucessfull to upload file.");
 }
}
catch(Exception e)
      {
       e.printStackTrace();
      }
}

      out.write('\r');
      out.write('\n');
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
