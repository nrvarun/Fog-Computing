package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>My Cloud Index</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<meta http-equiv=\"imagetoolbar\" content=\"no\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/layout.css\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"top\">\r\n");
      out.write("<div class=\"wrapper col1\">\r\n");
      out.write("  <div id=\"head\">\r\n");
      out.write("    <h1><a href=\"#\">MyCloud</a><img name=\"\" src=\"images/demo/Untitled-4.png\" width=\"129\" height=\"103\" alt=\"\" /></h1>\r\n");
      out.write("    <div id=\"topnav\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a class=\"active\" href=\"index.jsp\">Home</a></li>\r\n");
      out.write("        <li><a href=\"register.jsp\">Registration</a></li>\r\n");
      out.write("        <li><a href=\"#\"> Login</a>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <li><a href=\"Userlogin.jsp\">User</a></li>\r\n");
      out.write("            <li><a href=\"adminlogin.jsp\">Admininstrator</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"wrapper col2\">\r\n");
      out.write("  <div id=\"gallery\">\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li class=\"placeholder\" style=\"background-image:url(images/demo/gallery_default.jpg);\">Image Holder</li>\r\n");
      out.write("      <li><a class=\"swap\" style=\"background-image:url(images/demo/1.jpg);\" href=\"#gallery\"><strong>Services</strong><span><img src=\"images/demo/gallery_1.jpg\" alt=\"\" /></span></a></li>\r\n");
      out.write("      <li><a class=\"swap\" style=\"background-image:url(images/demo/2.jpg);\" href=\"#gallery\"><strong>Products</strong><span><img src=\"images/demo/gallery_2.jpg\" alt=\"\" /></span></a></li>\r\n");
      out.write("      <li class=\"last\"><a class=\"swap\" style=\"background-image:url(images/demo/3.jpg);\" href=\"#gallery\"><strong>Company</strong><span><img src=\"images/demo/gallery_3.jpg\" alt=\"\" /></span></a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"wrapper col4\">\r\n");
      out.write("  <div id=\"container\">\r\n");
      out.write("    <div id=\"content\">\r\n");
      out.write("      <h1>Fog Computing : Mitigating Insider Data Thefts</h1>\r\n");
      out.write("      <p>&quot;Fog Computing&quot; </p>\r\n");
      out.write("      <p>\tCloud computing promises to significantly change  the way we use computers and access and store our personal and business  information. With these new computing and communications paradigms arise new  data security challenges. Existing data protection mechanisms such as  encryption have failed in preventing data theft attacks, especially those  perpetrated by an insider to the cloud provider.</p>\r\n");
      out.write("      <p>We propose a different approach for securing  data in the cloud using offensive decoy technology. We monitor data access in  the cloud and detect abnormal data access patterns. When unauthorized access is  suspected and then verified using challenge questions, we launch a disinformation  attack by returning large amounts of decoy information to the attacker. This  protects against the misuse of the user&rsquo;s real data.</p>\r\n");
      out.write("</div>\r\n");
      out.write("    <div id=\"column\">\r\n");
      out.write("      <div id=\"featured\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li>\r\n");
      out.write("            <h2>Cloud Computing</h2>\r\n");
      out.write("            <p class=\"imgholder\"><img src=\"images/demo/gallery_default.jpg\" alt=\"\" width=\"241\" height=\"91\" /></p>\r\n");
      out.write("            <p>In computer networking, <strong>cloud computing</strong> is computing that involves a large number of computers connected through a communication network such as the Internet, similar to utility computing. In science, cloud computing is a synonym for distributed computing over a network, and means the ability to run a program or application on many connected computers at the same time.</p>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"wrapper col5\">\r\n");
      out.write("  <div id=\"footer\">\r\n");
      out.write("    <div id=\"contactform\">\r\n");
      out.write("      <h2>Contact Us Today !</h2>\r\n");
      out.write("      <p></p>\r\n");
      out.write("<h2>Mail @ mycloudsite@gmail.com</h2>\r\n");
      out.write("      <h2>Contact : 1800-11-722</h2>\r\n");
      out.write("</div>\r\n");
      out.write("    <!-- End Contact Form -->\r\n");
      out.write("    <div id=\"compdetails\">\r\n");
      out.write("      <div id=\"officialdetails\">\r\n");
      out.write("        <h2>Company Information !</h2>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li>Company Mycloudsite Ltd</li>\r\n");
      out.write("          <li>Registered in Combatore</li>\r\n");
      out.write("          <li>Company No. 722553      </li>\r\n");
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
      out.write("    </p>\r\n");
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
