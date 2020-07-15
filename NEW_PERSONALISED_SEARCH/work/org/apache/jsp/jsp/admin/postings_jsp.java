package org.apache.jsp.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.pmse.dao.Location_dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.pmse.dao.Content_dao;
import com.pmse.dao.Postings_dao;

public final class postings_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/css/popup.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<!-- <script src=\"http://maps.googleapis.com/maps/api/js?key=AIzaSyByHt0Rn3cnw6t-IIWO18CR0Wv0QX1v6tk&sensor=false\">\r\n");
      out.write("</script> -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://maps.googleapis.com/maps/api/js?key=AIzaSyByHt0Rn3cnw6t-IIWO18CR0Wv0QX1v6tk&sensor=false\">\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction addContent()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar key=document.getElementById(\"keyword\").value;\r\n");
      out.write("\t\tvar content=document.getElementById(\"content\").value;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(content.length==0)\r\n");
      out.write("\t\t\t document.getElementById(\"content\").value = key;\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t document.getElementById(\"content\").value = content+\",\"+key;\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction checkboxval()\r\n");
      out.write("\t{\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar id=document.getElementsByName(\"post_code\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar no=0;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor(var i=0;i<id.length;i++)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif(id[i].checked)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tno++;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(no==0)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"You must Select atleast one checkbox\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\tfunction val()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar heading=document.getElementById(\"heading\").value;\r\n");
      out.write("\t\tvar keyword=document.getElementById(\"keyword\").value;\r\n");
      out.write("\t\tvar location=document.getElementById(\"location\").value;\r\n");
      out.write("\t\tvar image=document.getElementById(\"image\").value;\r\n");
      out.write("\t\tvar desc=document.getElementById(\"desc\").value;\r\n");
      out.write("\t\tif(heading.length==0)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"Please enter the Heading \");\r\n");
      out.write("\t\t\tdocument.getElementById(\"heading\").focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(keyword==\"select\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"Please select the content \");\r\n");
      out.write("\t\t\tdocument.getElementById(\"keyword\").focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(location==0)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"Please select the location \");\r\n");
      out.write("\t\t\tdocument.getElementById(\"location\").focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(image.length==0)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"Please select the Image \");\r\n");
      out.write("\t\t\tdocument.getElementById(\"image\").focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(desc.length==0)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"Please Enter the Description \");\r\n");
      out.write("\t\t\tdocument.getElementById(\"desc\").focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".scrollbar\r\n");
      out.write("{\r\n");
      out.write("\tmargin-left: 30px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\theight: 210px;\r\n");
      out.write("\twidth: 780px;\r\n");
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
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"main_header\">\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write(" <ul class=\"navi\">\r\n");
      out.write("   <li><a href=\"");
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
      out.write("\t   \r\n");
      out.write("\t  <div id=\"event\">\r\n");
      out.write("\t   <h2 style=\"background:url(");
      out.print(request.getContextPath());
      out.write("/images/location.png) no-repeat ; \">Postings  <span></span></h2>\r\n");
      out.write("\t   <form action=\"");
      out.print(request.getContextPath());
      out.write("/PostingsDetails\"  enctype=\"multipart/form-data\" method=\"post\">\r\n");
      out.write("\t   <div style=\"position: absolute;top: 200px;left: 100px;\">\r\n");
      out.write("\t   <table id=t1>\r\n");
      out.write("\t   \t<tr>\r\n");
      out.write("\t\t  \t<th align=\"left\">Heading</th>\r\n");
      out.write("\t\t  \t<th  align=\"left\">Keywords</th>\r\n");
      out.write("\t\t  \t<th  align=\"left\">Content</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t   \t\t<td><input type=\"text\" name=\"heading\" id=\"heading\" placeholder=\"Enter Heading\" required=\"yes\"></input></td>\r\n");
      out.write("\t   \t\t<td><select id=\"keyword\" name=\"keyword\" ><option value=\"select\" >--Select--</option>\r\n");
      out.write("\t   \t");

	   		ResultSet parent=Content_dao.getContentDetails();
		   	while(parent.next())
		   	{
		   	
      out.write("\r\n");
      out.write("\t\t   \t\t<option value=\"");
      out.print(parent.getString(2) );
      out.write('"');
      out.write('>');
      out.print(parent.getString(4) );
      out.write("</option>\r\n");
      out.write("\t   \t\t");
} 
      out.write(" \r\n");
      out.write("\t   \t\t</select>\r\n");
      out.write("\t   \t\t<input type=\"button\" id=\"add_content\" name=\"add_content\" value=\"Add\" onclick=\"addContent()\"></input>\r\n");
      out.write("\t   \t\t</td>\r\n");
      out.write("\t   \t\t<td><textarea rows=\"2\" cols=\"40\" name=\"content\" id=\"content\"></textarea></td>\r\n");
      out.write("\t   \t\t\r\n");
      out.write("\t   \t\t\r\n");
      out.write("\t   \t</tr>\r\n");
      out.write("\t   \t<tr>\r\n");
      out.write("\t\t  \t<th  align=\"left\">Location</th>\r\n");
      out.write("\t\t  \t<th  align=\"left\">Image</th>\r\n");
      out.write("\t\t  \t<th  align=\"left\">Description</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><select id=\"location\" name=\"location\"><option value=\"0\" >--Select--</option>\r\n");
      out.write("\t   \t");

	   		ResultSet location=Location_dao.getParentNames();
		   	while(location.next())
		   	{
		   	
      out.write("\r\n");
      out.write("\t\t   \t\t<option value=\"");
      out.print(location.getInt(1) );
      out.write('"');
      out.write('>');
      out.print(location.getString(2) );
      out.write("</option>\r\n");
      out.write("\t   \t\t");
} 
      out.write(" \r\n");
      out.write("\t   \t\t</select></td>\r\n");
      out.write("\t   \t\t<td><input type=\"file\"  id=\"image\" name=\"image\" ></input></td>\r\n");
      out.write("\t   \t\t<td><textarea id=\"desc\" name=\"desc\" rows=\"2\" cols=\"40\"></textarea></td>\r\n");
      out.write("\t   \t\t<td style=\"width: 200px;\"><input type=\"submit\" id=\"add\" name=\"submit\" value=\"Post\" onclick=\"return val()\" ></input></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t   </table>\r\n");
      out.write("\t   </div>\r\n");
      out.write("\t    </form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t    <br></br>\r\n");
      out.write("\t   \r\n");
      out.write("\t    \r\n");
      out.write("\t   \r\n");
      out.write("\t    <form action=\"");
      out.print(request.getContextPath());
      out.write("/DeletePostings\" method=\"post\">\r\n");
      out.write("\t     <div id=\"body_content1\" >\r\n");
      out.write("\t     <div class=\"scrollbar\" id=\"style-1\">\r\n");
      out.write("\t\t  \t<table  style=\"width: 350px; \">\r\n");
      out.write("\t\t  \t\r\n");
      out.write("\t\t  \t\t<tr style=\"color: black;\">\r\n");
      out.write("\t\t  \t\t\r\n");
      out.write("\t\t  \t\t\t<th></th>\r\n");
      out.write("\t\t  \t\t\t<th>Heading</th>\r\n");
      out.write("\t\t  \t\t\t<th>Location</th>\r\n");
      out.write("\t\t  \t\t\t<th>Image</th>\r\n");
      out.write("\t\t  \t\t\t<th>Description</th>\r\n");
      out.write("\t\t  \t\t\t<th></th>\r\n");
      out.write("\t\t  \t\t\r\n");
      out.write("\t\t  \t\t</tr>\r\n");
      out.write("\t\t  \t\t\r\n");
      out.write("\t\t  \t");

			ResultSet rs=Postings_dao.getPostingsDetails();
			while(rs.next())
			{ int loc=Integer.parseInt(rs.getString(5));
			
      out.write("\r\n");
      out.write("\t\t  \t\t<tr>\r\n");
      out.write("\t\t  \t\t\t<td ><input type=\"checkbox\" name=\"post_code\" value=\"");
      out.print(rs.getInt(1));
      out.write("\" style=\"width: 50px;border-color: white;\"></input></td>\r\n");
      out.write("\t\t  \t\t\t<td ><input type=\"text\" name=\"headings\" value=\"");
      out.print(rs.getString(2));
      out.write("\" style=\"width: 100px;border-color: white;\"></input></td>\r\n");
      out.write("\t\t  \t\t\t<td ><input type=\"text\" name=\"location\" value=\"");
      out.print(Location_dao.getLocationName(loc));
      out.write("\" style=\"width: 100px;border-color: white;\"></input></td>\r\n");
      out.write("\t\t  \t\t\t<td ><input type=\"image\" name=\"image\" src=\"");
      out.print(request.getContextPath());
      out.write("/Image/");
      out.print(rs.getString(6));
      out.write("\" style=\"width: 80px;height: 40px;\"></input></td>\r\n");
      out.write("\t\t  \t\t\t<td ><textarea rows=\"2\" cols=45\" style=\"border-color: gray;\">");
      out.print(rs.getString(3));
      out.write("</textarea></td>\r\n");
      out.write("\t\t  \t\t</tr>\r\n");
      out.write("\t\t  \t");
} 
      out.write("\r\n");
      out.write("\t\t  \t</table>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t  <input type=\"submit\" name=\"submit\" id=\"add\" value=\"Delete\" style=\"position: absolute;top:600px;left: 420px;\" onclick=\"return checkboxval()\"></input>\t\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t  </form>\r\n");
      out.write("\t   \r\n");
      out.write("\t    \r\n");
      out.write("\t  \r\n");
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
      out.write("/jsp/admin/changepass.jsp\">Change Password</a></li>\r\n");
      out.write("\t\r\n");
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
      out.write("\t\t\t<script >alert(\"Postings Created Sucessfully\")</script>\r\n");
      out.write("\t");
 }else if(k==2)
	{
      out.write("\r\n");
      out.write("\t\t<script >alert(\"Postings Edited Sucessfully\")</script>\r\n");
      out.write("\t");
}else if(k==3)
	{
      out.write("\r\n");
      out.write("\t\t<script >alert(\"Postings Deleted Sucessfully\")</script>\r\n");
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
