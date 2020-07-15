package org.apache.jsp.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.pmse.dao.Location_dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.pmse.dao.Content_dao;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String con_code=null;
	    
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<title>PMSE</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/map.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://maps.googleapis.com/maps/api/js?key=AIzaSyByHt0Rn3cnw6t-IIWO18CR0Wv0QX1v6tk&sensor=false\">\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function Check()\r\n");
      out.write("{\r\n");
      out.write("\t\r\n");
      out.write("\tvar con_name=document.getElementById(\"address\");\r\n");
      out.write("\t\r\n");
      out.write("\tif(con_name.value.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"Please,Enter Keyword..\");\r\n");
      out.write("\t\tcon_name.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\telse\r\n");
      out.write("\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("}\r\n");
      out.write("function checkboxval()\r\n");
      out.write("{\r\n");
      out.write("\t\r\n");
      out.write("\tvar id=document.getElementsByName(\"con_code\");\r\n");
      out.write("\t\r\n");
      out.write("\tvar no=0;\r\n");
      out.write("\t\r\n");
      out.write("\tfor(var i=0;i<id.length;i++)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(id[i].checked)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tno++;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tif(no==0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"You must Select atleast one checkbox\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".scrollbar\r\n");
      out.write("{\r\n");
      out.write("\tmargin-left: 30px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\theight: 230px;\r\n");
      out.write("\twidth: 450px;\r\n");
      out.write("\t\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"main_header\">\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <ul class=\"navi\">\r\n");
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
      out.write("\t    ");
      out.write("\r\n");
      out.write("\t  <div id=\"event\">\r\n");
      out.write("\t   <h2 style=\"background:url(");
      out.print(request.getContextPath());
      out.write("/images/content.png) no-repeat ; \">Content  <span>Ontology</span></h2>\r\n");
      out.write("\t   <form action=\"");
      out.print(request.getContextPath());
      out.write("/ContentDetails\" method=\"post\">\r\n");
      out.write("\t   <div style=\"position: absolute;top: 200px;left: 150px;\">\r\n");
      out.write("\t   <table id=t1>\r\n");
      out.write("\t   <tr >\r\n");
      out.write("\t\t<td>KeyWord</td>\r\n");
      out.write("\t");

	con_code=(String)request.getParameter("con_code");
		if(con_code==null)
		{
      out.write("\r\n");
      out.write("\t\t  \t<td><input type=\"text\" name=\"con_name\" id=\"address\" placeholder=\"Enter Keyword\" style=\"width: 100px;\" required=\"yes\"></input></td>\r\n");
      out.write("\t\t");
}
		else
		{
			String con_name=Content_dao.getContentName(Integer.parseInt(con_code));
		
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t   \t\t<td><input type=\"text\" name=\"con_name\" id=\"address\"  value=\"");
      out.print(con_name);
      out.write("\" style=\"width: 100px;\"></input></td>\r\n");
      out.write("\t   \t");
}
      out.write("\t\t\r\n");
      out.write("\t   \t\t<td  style=\"width: 100px;\">Parent</td>\r\n");
      out.write("\t   \t\t<td><select id=\"parent\" name=\"parent\" style=\"width: 120px;\" required=\"yes\"><option value=\"0\" >root</option>\r\n");
      out.write("\t   \t");

	   		ResultSet parent=Content_dao.getContentDetails();
		   	while(parent.next())
		   	{
		   	
      out.write("\r\n");
      out.write("\t\t   \t\t<option value=\"");
      out.print(parent.getInt(1) );
      out.write('"');
      out.write('>');
      out.print(parent.getString(4) );
      out.write("</option>\r\n");
      out.write("\t   \t\t");
} 
      out.write(" \r\n");
      out.write("\t   \t\t</select></td>\r\n");
      out.write("\t   \t</tr>\r\n");
      out.write("\t\t<tr><td><input type=\"hidden\"   name=\"co_code\" value=\"");
      out.print(con_code);
      out.write("\" ></input></td></tr>\r\n");
      out.write("\t\t<tr><td></td></tr><tr><td></td></tr><tr><td></td></tr>\r\n");
      out.write("\t   \t<tr>\r\n");
      out.write("\t   \t\t\r\n");
      out.write("\t   \t\t<td style=\"width: 130px; \"align=\"right\"><input type=\"submit\" id=\"add\" name=\"submit\" value=\"Add\" onclick=\"return Check()\"></input></td>\r\n");
      out.write("\t   \t\t<td style=\"width: 130px;\" align=\"right\"><input type=\"submit\" id=\"update\" name=\"submit\" value=\"Update\" onclick=\"return Check()\" ></input></td>\r\n");
      out.write("\t   \t\t<td></td>\r\n");
      out.write("\t   \t\t<td><input type=\"submit\" name=\"submit\" id=\"add\" value=\"Delete\" align=\"left\" onclick=\"return checkboxval()\"></input>\t</td>\r\n");
      out.write("\t   \t</tr>\r\n");
      out.write("\t   \r\n");
      out.write("\t   </table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"body_content2\"  >\r\n");
      out.write("\t\t\t<div class=\"scrollbar\" id=\"style-1\">\r\n");
      out.write("\t\t  \t<table  style=\"width: 400px; \">\r\n");
      out.write("\t\t  \t<tr style=\"color: black;\">\r\n");
      out.write("\t\t  \t\t\t<th></th>\r\n");
      out.write("\t\t  \t\t\t<th>Keyword</th>\r\n");
      out.write("\t\t  \t\t\t<th>Parent</th>\r\n");
      out.write("\t\t  \t\t\t<th></th>\r\n");
      out.write("\t\t  \t\t</tr>\r\n");
      out.write("\t\t  \t");

			ResultSet rs=Content_dao.getContentDetails();
			while(rs.next())
			{
			
      out.write("\r\n");
      out.write("\t\t  \t\t<tr>\r\n");
      out.write("\t\t  \t\t\t<td ><input type=\"checkbox\" name=\"con_code\" value=\"");
      out.print(rs.getInt(1));
      out.write("\" ></input></td>\r\n");
      out.write("\t\t  \t\t\t<td ><input type=\"text\" name=\"con_name\" value=\"");
      out.print(rs.getString(2));
      out.write("\" style=\"width: 100px;\"></input></td>\r\n");
      out.write("\t\t  \t\t\t<td ><input type=\"text\" name=\"parent\" value=\"");
      out.print(Content_dao.getContentName(rs.getInt(3)));
      out.write("\" style=\"width: 100px;\"></input></td>\r\n");
      out.write("\t\t  \t\t\t<td><a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/admin/content.jsp?con_code=");
      out.print(rs.getInt(1));
      out.write("\" id=\"l\" style=\"width: 100px;\" onclick=\"Modified()\">  Edit</a></td>\r\n");
      out.write("\t\t  \t\t</tr>\r\n");
      out.write("\t\t  \t");
} 
      out.write("\r\n");
      out.write("\t\t  \t</table>\r\n");
      out.write("\t\t  \t\r\n");
      out.write("\t    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\t    <br></br>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t    </form>\r\n");
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
      out.write("</div>\r\n");

	String status=null;
	status=request.getParameter("status");
	if(status!=null)
	{
		int k=Integer.parseInt(status);
		if(k==1)
		{
      out.write("\r\n");
      out.write("\t\t\t<script >alert(\"Content Added Sucessfully\")</script>\r\n");
      out.write("\t");
 }else if(k==2)
	{
      out.write("\r\n");
      out.write("\t\t<script >alert(\"Content Edited Sucessfully\")</script>\r\n");
      out.write("\t");
}else if(k==3)
	{
      out.write("\r\n");
      out.write("\t\t<script >alert(\"Content Deleted Sucessfully\")</script>\r\n");
      out.write("\t");
}}
      out.write("\r\n");
      out.write("\r\n");
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
