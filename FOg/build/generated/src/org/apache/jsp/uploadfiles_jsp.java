package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class uploadfiles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\twidth:431px;\r\n");
      out.write("\theight:150px;\r\n");
      out.write("\tz-index:1001;\r\n");
      out.write("\tleft: 300px;\r\n");
      out.write("\ttop: 70px;\r\n");
      out.write("}\r\n");
      out.write("#apDiv3 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\twidth:340px;\r\n");
      out.write("\theight:147px;\r\n");
      out.write("\tz-index:1001;\r\n");
      out.write("\tleft: 336px;\r\n");
      out.write("\ttop: 98px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"top\">\r\n");
      out.write("<div class=\"wrapper col1\">\r\n");
      out.write("  <div id=\"head\">\r\n");
      out.write("    <h1><a href=\"#\">MyCloud</a><img name=\"\" src=\"images/demo/Untitled-4.png\" width=\"129\" height=\"103\" alt=\"\" /></h1>\r\n");
      out.write("    <div id=\"topnav\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a  href=\"userhome.jsp\">Home</a></li>\r\n");
      out.write("        <li><a href=\"viewfiles.jsp\">My files</a></li>\r\n");
      out.write("        <li><a  class=\"active\" href=\"file_upload.jsp\">Upload files</a></li>\r\n");
      out.write("        <li><a href=\"changepass.jsp\">Change Password</a></li>\r\n");
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
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <div id=\"apDiv3\">\r\n");
      out.write("        <FORM enctype=\"multipart/form-data\" action=\"upload.jsp\" method=\"post\">\r\n");
      out.write("        <table  id=\"upload\" width=\"95%\" height=\"73\" border=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"24\" colspan=\"2\" align=\"center\"> Choose File To Upload</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"51%\" height=\"21\" align=\"right\">Upload</td>\r\n");
      out.write("            <td width=\"49%\"><input id=\"fileup\" name=\"file\" type=\"file\" /></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"20\">&nbsp;</td>\r\n");
      out.write("            <td><input type=\"submit\" value=\"Send File\" /></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        </FORM>\r\n");
      out.write("      </div>\r\n");
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
      out.write("\r\n");
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
