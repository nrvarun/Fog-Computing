package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import org.apache.poi.hwpf.HWPFDocument;;

public final class file_005fdownload1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");

        String fname=null,type=null,docfpath=null;
	String fid=(String)session.getAttribute("fid");	
        docfpath=(String)session.getAttribute("fpath");
			
try
{
 String dfpath=null;
 Connection con=null;
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 con=DriverManager.getConnection("jdbc:odbc:fogcomputing","sa","varunnr");
 PreparedStatement ps=con.prepareStatement("select fname,dfpath from fileupload where fid ='"+fid+"' ");
 ResultSet rs=ps.executeQuery();
 if(rs.next())
   {
    fname=rs.getString("fname");
    dfpath=rs.getString("dfpath");
    session.setAttribute("fname",fname);
    session.setAttribute("dfpath",dfpath);
   }
}
catch(Exception e)
     {
      out.println(e.getMessage());
     }
type=fname.substring(fname.lastIndexOf(".")+1, fname.length());
if(type=="txt")
  {
    File txtfile = new File(docfpath);
    String dectxt="D:\\project\\decoys\\"+fname;
    File decoy = new File(dectxt);
    FileOutputStream fout = new FileOutputStream(decoy);
    FileReader fileReader = new FileReader(txtfile);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    StringBuffer stringBuffer = new StringBuffer();
    String data,mdata;
    String line;
    while ((line = bufferedReader.readLine()) != null) 
          {
  	    stringBuffer.append(line);
	    stringBuffer.append("\n");
	  }
	    fileReader.close();
	    System.out.println("Contents of file:");
            data=stringBuffer.toString();
	    System.out.println(data);
            mdata=data.replaceAll("a","m").replaceAll("b","n").replaceAll("c","o").replaceAll("d","p").replaceAll("f","r").replaceAll("g","s").replaceAll("h","t").replaceAll("i","o").replaceAll("j","w"). replaceAll("k","x").replaceAll("l","y") .replaceAll("m","z");
     if(!decoy.exists())
       {
        decoy.createNewFile();
       }  
       decoy.mkdirs();                                 
      byte[] contentInBytes = mdata.getBytes();
      fout.write(contentInBytes);
      fout.flush();
      fout.close();
  }
//else if((type=="doc")||(type=="DOC")||(type=="docx")||(type=="DOCX"))
//       {
//        
//        File docfile = new File(docfpath);
//        FileInputStream fin = new FileInputStream(docfile);
//        HWPFDocument doc = new HWPFDocument(fin);
//        
//        doc.getRange().replaceText("a","m");
//        doc.getRange().replaceText("b","n");
//        doc.getRange().replaceText("c","o");
//        doc.getRange().replaceText("d","p");
//        doc.getRange().replaceText("e","q");
//        doc.getRange().replaceText("f","r");
//        doc.getRange().replaceText("g","s");
//        doc.getRange().replaceText("h","t");
//        doc.getRange().replaceText("i","u");
//        doc.getRange().replaceText("j","v");
//        doc.getRange().replaceText("k","w");
//        doc.getRange().replaceText("l","x");
//        doc.getRange().replaceText("m","y");
//        doc.getRange().replaceText("n","z");
//        
//        String dest = "C:\\project\\decoys\\"+fname;
//        File fdec =  new File(dest);
//        if(!fdec.exists())
//          {
//           fdec.createNewFile();
//          }
//        FileOutputStream fout = new FileOutputStream(dest);
//        doc.write(fout);
//        fout.close();
//        System.out.println("Success...");
//        fin.close();
//       }
response.sendRedirect("count1.jsp");

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
