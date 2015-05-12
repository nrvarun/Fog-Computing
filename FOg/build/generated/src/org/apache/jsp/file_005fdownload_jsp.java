package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class file_005fdownload_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"EN\" lang=\"EN\" dir=\"ltr\">\r\n");
      out.write("<head profile=\"http://gmpg.org/xfn/11\">\r\n");
      out.write("<title>Corporation | Style Demo</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<meta http-equiv=\"imagetoolbar\" content=\"no\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/layout.css\" type=\"text/css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#apDiv1 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\twidth:250px;\r\n");
      out.write("\theight:131px;\r\n");
      out.write("\tz-index:1001;\r\n");
      out.write("\tleft: 87px;\r\n");
      out.write("\ttop: 109px;\r\n");
      out.write("}\r\n");
      out.write("#apDiv2 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\twidth:280px;\r\n");
      out.write("\theight:115px;\r\n");
      out.write("\tz-index:1001;\r\n");
      out.write("\tleft: 362px;\r\n");
      out.write("\ttop: 128px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"top\">\r\n");
      out.write("<div class=\"wrapper col1\">\r\n");
      out.write("  <div id=\"head\">\r\n");
      out.write("    <h1><a href=\"#\">MyCloud</a><img name=\"\" src=\"images/demo/Untitled-4.png\" width=\"129\" height=\"103\" alt=\"\" /></h1>\r\n");
      out.write("    <div id=\"topnav\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a class=\"active\" href=\"index.jsp\">Home</a></li>\r\n");
      out.write("        <li><a href=\"viewfiles.jsp\">My files</a></li>\r\n");
      out.write("        <li><a href=\"uploadfiles.jsp\">Upload files</a></li>\r\n");
      out.write("        <li><a href=\"passchange.jsp\">Change Password</a></li>\r\n");
      out.write("        <li><a href=\"viewalert.jsp\">View Alert</a></li>\r\n");
      out.write("        <li><a href=\"logout.jsp\"> Logout</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"wrapper col2\">\r\n");
      out.write("  <div id=\"breadcrumb\">\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li class=\"first\"></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"wrapper col4\">\r\n");
      out.write("  <div id=\"container\">\r\n");
      out.write("    <div class=\"clear\">\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <div style=\"position:absolute; left:146px; top:73px; width: 687px; height: 316px;\">\r\n");
      out.write("        <table width=\"720\" height=\"304\" align=\"center\" bgcolor=\"#FFFFFF\" >\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"33\" colspan=\"2\" align=\"center\" class=\"image\"><u><font color=\"#6A006A\" size=\"3\"><em><font color=\"#003E00\" size=\"4\" face=\"Courier New, Courier, mono\"><strong>view \r\n");
      out.write("              files </strong></font></em></font></u></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"40\" height=\"263\">&nbsp;</td>\r\n");
      out.write("            <td width=\"668\"><table width=\"532\"  align=\"center\"  bgcolor=\"#000000\">\r\n");
      out.write("              <tr bgcolor=\"#333333\" >\r\n");
      out.write("                <td width=\"91\" height=\"21\" align=\"center\"><font color=\"#FFFFFF\" size=\"2\">filename</font></td>\r\n");
      out.write("                <td width=\"94\" align=\"center\"><font color=\"#FFFFFF\" size=\"2\">fid</font></td>\r\n");
      out.write("                <td width=\"86\" align=\"center\" ><font color=\"#FFFFFF\" size=\"2\">size</font></td>\r\n");
      out.write("                <td width=\"100\" align=\"center\" ><font color=\"#FFFFFF\" size=\"2\">date</font></td>\r\n");
      out.write("                <td width=\"137\" align=\"center\" ><font color=\"#FFFFFF\" size=\"2\">download</font></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              \r\n");
      out.write("              ");


String fname=null;
String fid=null;
String size=null;
String date=null;
String name=(String)session.getAttribute("un");

try
{
Connection con=null;
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:fogcomputing","sa","varunnr");
PreparedStatement ps=con.prepareStatement("select fname,fid,size,date from fileupload where uname='"+name+"'" );
ResultSet rs=ps.executeQuery();
while (rs.next())
{

fname=rs.getString(1);
fid=rs.getString(2);
size=rs.getString(3);
date=rs.getString(4);


      out.write("\r\n");
      out.write("              <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("                <td height=\"34\" align=\"center\"><strong><em><font color=\"#002851\"> ");
      out.print(fname);
      out.write(" </font></em></strong></td>\r\n");
      out.write("                <td align=\"center\"><strong><em><font color=\"#002851\"> ");
      out.print(fid);
      out.write(" </font></em></strong></td>\r\n");
      out.write("                <td align=\"center\"><strong><em><font color=\"#002851\"> ");
      out.print(size);
      out.write(" </font></em></strong></td>\r\n");
      out.write("                <td align=\"center\"><strong><em><font color=\"#002851\"> ");
      out.print(date);
      out.write(" </font></em></strong></td>\r\n");
      out.write("                <td width=\"137\" align=\"center\"><a href=\"file_download1.jsp?");
      out.print(fid);
      out.write("\"><font color=\"#C60000\" size=\"3\">download</font></a></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              ");



}


}
catch(Exception e)
{
out.println(e.getMessage());
}


      out.write("\r\n");
      out.write("            </table></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("      </div>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"wrapper col5\">\r\n");
      out.write("  <div id=\"footer\">\r\n");
      out.write("    <div id=\"contactform\">\r\n");
      out.write("      <h2>Contact Us Today !</h2>\r\n");
      out.write("      <p></p>\r\n");
      out.write("      <h2>Mail @ mycloudsite@gmail.com</h2>\r\n");
      out.write("      <h2>Contact : 1800-11-722</h2>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End Contact Form -->\r\n");
      out.write("    <div id=\"compdetails\">\r\n");
      out.write("      <div id=\"officialdetails\">\r\n");
      out.write("        <h2>Company Information !</h2>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li>Company Mycloudsite Ltd</li>\r\n");
      out.write("          <li>Registered in Combatore</li>\r\n");
      out.write("          <li>Company No. 722553 </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"contactdetails\">\r\n");
      out.write("        <h2>Our Contact Details !</h2>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li>MyCloudSite Ltd</li>\r\n");
      out.write("          <li>R S Puram</li>\r\n");
      out.write("          <li>Coimbatore</li>\r\n");
      out.write("          <li>641002</li>\r\n");
      out.write("          <li>Tel: 08754208698</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clear\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End Company Details -->\r\n");
      out.write("    <div id=\"copyright\">\r\n");
      out.write("      <p class=\"fl_left\">Copyright &copy; 2014 - All Rights Reserved </p>\r\n");
      out.write("      <p class=\"fl_right\"><br class=\"clear\" />\r\n");
      out.write("      </p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
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
