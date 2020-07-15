package org.apache.jsp.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.pmse.dao.Location_dao;
import java.sql.ResultSet;
import java.util.ArrayList;

public final class location_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String loc_code="";
	    
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
      out.write("<script src=\"http://maps.googleapis.com/maps/api/js?key=AIzaSyByHt0Rn3cnw6t-IIWO18CR0Wv0QX1v6tk&sensor=false\">\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function Check()\r\n");
      out.write("{\r\n");
      out.write("\t\r\n");
      out.write("\tvar loc_name=document.getElementById(\"address\");\r\n");
      out.write("\t\r\n");
      out.write("\tif(loc_name.value.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"Please,Enter Location..\");\r\n");
      out.write("\t\tloc_name.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tvar latitude=document.getElementById(\"x\");\r\n");
      out.write("\t\r\n");
      out.write("\tif(latitude.value.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"Please,Enter Latitude..\");\r\n");
      out.write("\t\tlatitude.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar longitude=document.getElementById(\"y\");\r\n");
      out.write("\tif(longitude.value.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"Please,Enter Longitude..\");\r\n");
      out.write("\t\tlongitude.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("}\r\n");
      out.write("function checkboxval()\r\n");
      out.write("{\r\n");
      out.write("\t\r\n");
      out.write("\tvar id=document.getElementsByName(\"loc_code\");\r\n");
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
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".scrollbar\r\n");
      out.write("{\r\n");
      out.write("\tmargin-left: 30px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\theight: 230px;\r\n");
      out.write("\twidth: 670px;\r\n");
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
      out.write("<ul class=\"navi\">\r\n");
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
      out.write("/images/location.png) no-repeat ; \" >Location  <span>Ontology</span></h2>\r\n");
      out.write("\t   <form action=\"");
      out.print(request.getContextPath());
      out.write("/LocationDetails\" method=\"post\">\r\n");
      out.write("\t   <div style=\"position: absolute;top: 200px;left: 150px;\">\r\n");
      out.write("\t   <table id=t1>\r\n");
      out.write("\t   \t<tr>\r\n");
      out.write("\t\t  \t<th align=\"left\">Location</th>\r\n");
      out.write("\t\t  \t<th  align=\"left\">Latitude</th>\r\n");
      out.write("\t\t  \t<th  align=\"left\">Longitude</th>\r\n");
      out.write("\t\t  \t<th  align=\"left\">Parent</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t");

	loc_code=request.getParameter("loc_code");
	
	
		if(loc_code==null)
		{
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t   \t\t<td><input type=\"text\" name=\"loc_name\" id=\"address\" placeholder=\"Enter Location Name\" ></input></td>\r\n");
      out.write("\t   \t\t<td><input type=\"text\"   id=\"x\" name=\"latitude\"  placeholder=\"Enter The Latitude\" ></input></td>\r\n");
      out.write("\t   \t\t<td><input type=\"text\"  id=\"y\" name=\"longitude\" placeholder=\"Enter The Longitude\" ></input></td>\r\n");
      out.write("\t   \t\t<td><select id=\"parent\" name=\"parent\"><option value=\"0\" >root</option>\r\n");
      out.write("\t   \t");

	   		ResultSet parent=Location_dao.getParentNames();
		   	while(parent.next())
		   	{
		   	
      out.write("\r\n");
      out.write("\t\t   \t\t<option value=\"");
      out.print(parent.getInt(1) );
      out.write('"');
      out.write('>');
      out.print(parent.getString(2) );
      out.write("</option>\r\n");
      out.write("\t   \t\t");
} 
      out.write(" \r\n");
      out.write("\t   \t\t</select></td>\r\n");
      out.write("\t   \t</tr>\r\n");
      out.write("\t\t");
}
		else
		{
			
			ResultSet rs=Location_dao.getLocationDet(Integer.parseInt(loc_code));
			while(rs.next())
			{
		
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t   \t\t<td><input type=\"text\" name=\"loc_name\" id=\"address\"  value=\"");
      out.print(rs.getString(1));
      out.write("\"></input></td>\r\n");
      out.write("\t   \t\t<td><input type=\"text\"   id=\"x\" name=\"latitude\"   value=\"");
      out.print(rs.getDouble(2));
      out.write("\"></input></td>\r\n");
      out.write("\t   \t\t<td><input type=\"text\"  id=\"y\" name=\"longitude\" value=\"");
      out.print(rs.getDouble(3));
      out.write("\"></input></td>\r\n");
      out.write("\t   \t\t<td><select id=\"parent\" name=\"parent\"><option value=\"0\" >root</option>\r\n");
      out.write("\t   \t");

			}	
	   	ResultSet parent=Location_dao.getParentNames();
		   	while(parent.next())
		   	{
		   	
      out.write("\r\n");
      out.write("\t\t   \t\t<option value=\"");
      out.print(parent.getInt(1) );
      out.write('"');
      out.write('>');
      out.print(parent.getString(2) );
      out.write("</option>\r\n");
      out.write("\t   \t\t");
} 
      out.write(" \r\n");
      out.write("\t   \t\t</select></td>\r\n");
      out.write("\t   \t\t<td><input type=\"hidden\"   name=\"lo_code\" value=\"");
      out.print(loc_code);
      out.write("\"></input></td>\r\n");
      out.write("\t   \t</tr>\r\n");
      out.write("\t");
}
	
      out.write("\t\t\r\n");
      out.write("\t   \t\r\n");
      out.write("\t   \r\n");
      out.write("\t   \t<tr>\r\n");
      out.write("\t   \t\t<td style=\"width: 200px;height: 50px;\"><input type=\"image\" value=\"submit\" src=\"");
      out.print(request.getContextPath());
      out.write("/images/google_maps.png\" onclick=\"return getMap()\"></input></td>\r\n");
      out.write("\t   \t\t<td style=\"width: 200px;\"><input type=\"submit\" id=\"add\" name=\"submit\" value=\"Add\" onclick=\"return Check()\"></input></td>\r\n");
      out.write("\t   \t\t<td style=\"width: 200px;\"><input type=\"submit\" id=\"update\" name=\"submit\" value=\"Update\" onclick=\"return Check()\" ></input></td>\r\n");
      out.write("\t   \t\t<td><input type=\"submit\" name=\"submit\" id=\"add\" value=\"Delete\" onclick=\"return checkboxval()\"></input>\t</td>\r\n");
      out.write("\t   \t</tr>\r\n");
      out.write("\t   \r\n");
      out.write("\t   </table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"light\" class=\"white_content\" > \r\n");
      out.write("\t\t\t\t<a href = \"javascript:void(0)\" onclick = \"closelightbox()\" style=\"float:right\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/close.gif\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t<div id=\"googleMap\"  style=\"width:675px;height:300px;\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div id=\"fade\" class=\"black_overlay\"></div>\r\n");
      out.write("\t\t\t<div id=\"body_content\" >\r\n");
      out.write("\t\t\t<div class=\"scrollbar\" id=\"style-1\">\r\n");
      out.write("\t\t  \t<table  style=\"width: 350px; \">\r\n");
      out.write("\t\t  \t\r\n");
      out.write("\t\t  \t\t<tr style=\"color: black;\">\r\n");
      out.write("\t\t  \t\t\r\n");
      out.write("\t\t  \t\t\t<th></th>\r\n");
      out.write("\t\t  \t\t\t<th>Location</th>\r\n");
      out.write("\t\t  \t\t\t<th>Latitude</th>\r\n");
      out.write("\t\t  \t\t\t<th>Longitude</th>\r\n");
      out.write("\t\t  \t\t\t<th>Parent</th>\r\n");
      out.write("\t\t  \t\t\t<th></th>\r\n");
      out.write("\t\t  \t\t\r\n");
      out.write("\t\t  \t\t</tr>\r\n");
      out.write("\t\t  \t\t\r\n");
      out.write("\t\t  \t");

			ResultSet rs=Location_dao.getLocationDetails();
			while(rs.next())
			{
			
      out.write("\r\n");
      out.write("\t\t  \t\t<tr>\r\n");
      out.write("\t\t  \t\t\t<td ><input type=\"checkbox\" name=\"loc_code\" value=\"");
      out.print(rs.getInt(1));
      out.write("\" style=\"width: 50px;border-color: white;\"></input></td>\r\n");
      out.write("\t\t  \t\t\t<td ><input type=\"text\" name=\"loc_name\" value=\"");
      out.print(rs.getString(2));
      out.write("\" style=\"width: 100px;border-color: white;\"></input></td>\r\n");
      out.write("\t\t  \t\t\t<td ><input type=\"text\" name=\"latitude\" value=\"");
      out.print(rs.getDouble(3));
      out.write("\" style=\"width: 120px;border-color: white;\"></input></td>\r\n");
      out.write("\t\t  \t\t\t<td ><input type=\"text\" name=\"latitude\" value=\"");
      out.print(rs.getDouble(4));
      out.write("\" style=\"width: 120px;border-color: white;\"></input></td>\r\n");
      out.write("\t\t  \t\t\t<td ><input type=\"text\" name=\"parent\" value=\"");
      out.print(Location_dao.getLocationName(rs.getInt(5)));
      out.write("\" style=\"width: 100px;border-color: white;\"></input></td>\r\n");
      out.write("\t\t  \t\t\t<td><a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/admin/location.jsp?loc_code=");
      out.print(rs.getInt(1));
      out.write("\" id=\"l\" style=\"width: 80px;\" >  Edit</a></td>\r\n");
      out.write("\t\t  \t\t</tr>\r\n");
      out.write("\t\t  \t");
} 
      out.write("\r\n");
      out.write("\t\t  \t</table>\r\n");
      out.write("\t\t  \t</div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\r\n");
      out.write("\t    <br></br>\r\n");
      out.write("\t\r\n");
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
      out.write("\t\t\t<script >alert(\"Location Added Sucessfully\")</script>\r\n");
      out.write("\t");
 }else if(k==2)
	{
      out.write("\r\n");
      out.write("\t\t<script >alert(\"Location Edited Sucessfully\")</script>\r\n");
      out.write("\t");
}else if(k==3)
	{
      out.write("\r\n");
      out.write("\t\t<script >alert(\"Location Deleted Sucessfully\")</script>\r\n");
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
