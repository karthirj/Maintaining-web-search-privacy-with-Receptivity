package org.apache.jsp.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.pmse.dao.Location_dao;
import java.sql.ResultSet;

public final class changepass_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<title>PMSE</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/js/map.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/js/interface.js\"></script>\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://maps.googleapis.com/maps/api/js?key=AIzaSyByHt0Rn3cnw6t-IIWO18CR0Wv0QX1v6tk&sensor=false\">\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction Changepass()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\r\n");
      out.write("\t\t\tvar MyForm=document.forms[0];\r\n");
      out.write("\t\t\tvar old_pass=MyForm.old_pass;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\tif(old_pass.value.length==0)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\talert(\"Please,Enter your Password..\");\r\n");
      out.write("\t\t\t\t\told_pass.focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar new_pass=MyForm.new_pass;\r\n");
      out.write("\t\t\t\t if(new_pass.value.length==0)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\talert(\"Please,Enter your New Password..\");\r\n");
      out.write("\t\t\t\t\tnew_pass.focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar re_pass=MyForm.re_pass;\r\n");
      out.write("\t\t\t\tif(re_pass.value.length==0)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\talert(\"Please,Enter your Retype_Password..\");\r\n");
      out.write("\t\t\t\t\tre_pass.focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(new_pass.value!=re_pass.value)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\talert(\"New password and retype password is mismatched\");\r\n");
      out.write("\t\t\t\t\tre_pass.focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\telse\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"main_header\">\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write(" <ul class=\"navi\">\r\n");
      out.write("  <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/admin/location.jsp\">Location Ontology</a></li>\r\n");
      out.write("    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/admin/content.jsp\">Content Ontology</a></li>\r\n");
      out.write("    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/admin/postings.jsp\">Postings</a></li>\r\n");
      out.write("    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/admin/changepass.jsp\">Change Pass</a></li>\r\n");
      out.write("     <li class=\"li1\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/Logout\">Logout</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"main_body\">\r\n");
      out.write("\t<div id=\"body\">\r\n");
      out.write("\t    <!--latest event start -->\r\n");
      out.write("\t     ");

                    	
                    String aid=(String)session.getAttribute("aid");
                    
                   
                    
      out.write("\r\n");
      out.write("\t  <div id=\"event\">\r\n");
      out.write("\t   <h2 style=\"background:url(");
      out.print(request.getContextPath());
      out.write("/images/content.png) no-repeat ; \">Change  <span>Password</span></h2>\r\n");
      out.write("\t \t<form class=\"login1\" action=\"");
      out.print(request.getContextPath());
      out.write("/AdminLogin\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\t<table align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font style=\"color: #00BFFF;font-size: 20px;\">Old Password</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 50px;\" align=\"center\">:</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"password\"   name=\"old_pass\" placeholder=\"Old Password\" required ></input></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font style=\"color: #00BFFF;font-size: 20px;\">New Password</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 50px;\" align=\"center\">:</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"password\"   name=\"new_pass\" placeholder=\"New Password\" required ></input></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font style=\"color: #00BFFF;font-size: 20px;\">Confrm Password</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 50px;\" align=\"center\">:</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"password\"   name=\"re_pass\" placeholder=\"Confrm Password\" required ></input></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"hidden\"   name=\"id\" value=\"");
      out.print(aid);
      out.write("\"></input></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<br><br>\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<center><input type=\"submit\" id=\"submitbtn\" name=\"submit\" value=\"Chage Password\"   onclick=\"return Changepass()\" tabindex=\"4\"></input></center>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t  <!--latest event end -->\r\n");
      out.write("\t  <br class=\"balnk\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"main_footer\">\r\n");
      out.write("\t<div id=\"footer\"><!--footer navigation start -->\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/admin/location.jsp\" class=\"mg\">Location Ontology</a>|</li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/admin/content.jsp\">Content Ontology</a>|</li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/admin/postings.jsp\"> Postings</a>|</li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/admin/changepass.jsp\">Change Password</a>|</li>\r\n");
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div><!--footer navigation end -->\r\n");
      out.write("\t");

    	String status=null;
	status=request.getParameter("status");
	if(status!=null)
	{
		int k=Integer.parseInt(status);
		if(k==1)
		{
      out.write("\r\n");
      out.write("\t\t\t<script >alert(\"Password Changed Sucessfully\")</script>\r\n");
      out.write("\t");
 }else if(k==2)
	{
      out.write("\r\n");
      out.write("\t\t<script >alert(\"Password Changed Failure\")</script>\r\n");
      out.write("\t\r\n");
      out.write("\t");
}}
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
