package org.apache.jsp.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.pmse.util.*;
import java.sql.ResultSet;
import com.pmse.dao.Postings_dao;
import com.pmse.dao.Location_dao;
import java.util.ArrayList;
import com.pmse.dao.User_dao;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


                    String keyword=null;
                    
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>PMSE</title>\r\n");
      out.write("<meta name=\"keywords\" content=\"Cafe and Bakery, Free CSS Template, Pink, Black\" />\r\n");
      out.write("<meta name=\"description\" content=\"Cafe and Bakery is a free CSS template using pink gradient and black colors.\" />\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/coda-slider1.css\" type=\"text/css\" charset=\"utf-8\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t/* For the \"inset\" look only */\r\n");
      out.write(".scrollbar\r\n");
      out.write("{\r\n");
      out.write("\tmargin-left: 30px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\theight: 500px;\r\n");
      out.write("\twidth: 400px;\r\n");
      out.write("\tbackground: #0f020b;;\r\n");
      out.write("\toverflow: auto;\r\n");
      out.write("\tmargin-bottom: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#style-1::-webkit-scrollbar-track\r\n");
      out.write("{\r\n");
      out.write("\t-webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);\r\n");
      out.write("\tborder-radius: 10px;\r\n");
      out.write("\tbackground-color: #F5F5F5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#style-1::-webkit-scrollbar\r\n");
      out.write("{\r\n");
      out.write("\twidth: 12px;\r\n");
      out.write("\tbackground-color: #F5F5F5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#style-1::-webkit-scrollbar-thumb\r\n");
      out.write("{\r\n");
      out.write("\tborder-radius: 10px;\r\n");
      out.write("\t-webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);\r\n");
      out.write("\tbackground-color: #555;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"slider\">\r\n");
      out.write("\t<div id=\"templatemo_wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"templatemo_main\">\r\n");
      out.write("        \t<div id=\"templatemo_sidebar\">\r\n");
      out.write("            \t<div id=\"header\"><h1><a href=\"#\">PWE</a></h1></div>\r\n");
      out.write("                \r\n");
      out.write("               <div id=\"menu\">\r\n");
      out.write("                    <ul class=\"navigation\">\r\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/user/index.jsp\" >Home</a></li>\r\n");
      out.write("                      <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/user/search.jsp\">Search</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/user/cpass.jsp\" style=\"position: relative;left: 40px;\">Change Pass</a></li>\r\n");
      out.write("                     <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Logout\" >Logout</a></li>\r\n");
      out.write("                \r\n");
      out.write("                    </ul>\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("            </div> <!-- end of sidebar -->\r\n");
      out.write("             ");

                    	String uname=(String)session.getAttribute("uname");
                    String uid=(String)session.getAttribute("uid");
                    
                    ArrayList<String>list=User_dao.getUserdet(uid);
                    
      out.write("\r\n");
      out.write("            <div id=\"templatemo_content\">\r\n");
      out.write("            \t<div class=\"scroll\">\r\n");
      out.write("\t        \t\t<div class=\"scrollContainer\">\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                     <div class=\"panel\" id=\"home\">\r\n");
      out.write("                        <h2>Hi <span class=\"loc\">");
      out.print(uname);
      out.write("</span> welcome to PMSE</h2>   \r\n");
      out.write("                        \r\n");
      out.write("                  \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<center><label><font style=\"font-family: Monotype Corsiva;font-size: 35px;color: #DAA520;\"> User Profile</font></label></center>\r\n");
      out.write("\t\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\t\t<font style=\"color: #00BFFF;font-size: 20px;\">\r\n");
      out.write("\t\t\t\t\t<table align=\"center\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>User Name</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 50px;\" align=\"center\">:</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(list.get(0) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Email</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 50px;\" align=\"center\">:</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(list.get(1) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Phone</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 50px;\" align=\"center\">:</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(list.get(2) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<center><a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/user/editprofile.jsp\" >Edit</a></input></center>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("           </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"cleaner\"></div>\r\n");
      out.write("        </div> <!-- end of main -->\r\n");
      out.write("    \r\n");
      out.write("    \t\r\n");
      out.write("       \r\n");
      out.write("    </div> <!-- end of wrapper -->\r\n");
      out.write("</div> <!-- end of slider -->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
