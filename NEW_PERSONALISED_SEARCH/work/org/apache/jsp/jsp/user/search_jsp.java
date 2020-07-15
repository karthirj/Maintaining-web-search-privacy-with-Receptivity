package org.apache.jsp.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.pmse.util.*;
import com.pmse.dao.Postings_dao;
import com.pmse.dao.Location_dao;
import java.util.ArrayList;
import com.pmse.dao.User_dao;
import java.sql.ResultSet;
import com.pmse.util.Process;
import com.pmse.dao.Search_dao;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


		String temp=null;
		String search_no=null;
		ResultSet rs=null;
	
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
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function createlightbox()\r\n");
      out.write("{\r\n");
      out.write("    document.getElementById('light').style.display='block';\r\n");
      out.write("    document.getElementById('fade').style.display='block'\r\n");
      out.write("}\r\n");
      out.write("function closelightbox()\r\n");
      out.write("{\r\n");
      out.write("    document.getElementById('light').style.display='none';\r\n");
      out.write("    document.getElementById('fade').style.display='none'\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#black_overlay{\r\n");
      out.write("\t\t\tdisplay: none;\r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\ttop: 0%;\r\n");
      out.write("\t\t\tleft: 0%;\r\n");
      out.write("\t\t\twidth: 90%;\r\n");
      out.write("\t\t\theight: 90%;\r\n");
      out.write("\t\t\tbackground-color: black;\r\n");
      out.write("\t\t\tz-index:1001;\r\n");
      out.write("\t\t\t-moz-opacity: 0.5;\r\n");
      out.write("\t\t\topacity:.50;\r\n");
      out.write("\t\t\tfilter: alpha(opacity=50);\r\n");
      out.write("\t\t}\r\n");
      out.write("      \r\n");
      out.write("\t\t.white_content\r\n");
      out.write("\t\t {\r\n");
      out.write("\t\t\tdisplay: block;\r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\ttop: 35%;\r\n");
      out.write("\t\t\tleft: 15%;\r\n");
      out.write("\t\t\twidth: 400px;;\r\n");
      out.write("\t\t\theight: 50%;\r\n");
      out.write("\t\t\tpadding: 0px;\r\n");
      out.write("\t\t\t  border:1px solid white;\r\n");
      out.write("\t\t\t margin: 0 auto;\r\n");
      out.write("           background:black;\r\n");
      out.write("            border: 1px solid rgba(147, 184, 189,0.8);\r\n");
      out.write("            -webkit-box-shadow: 0pt 2px 5px rgba(105, 108, 109,  0.7),\t0px 0px 8px 5px rgba(208, 223, 226, 0.4) inset;\r\n");
      out.write("               -moz-box-shadow: 0pt 2px 5px rgba(105, 108, 109,  0.7),\t0px 0px 8px 5px rgba(208, 223, 226, 0.4) inset;\r\n");
      out.write("                    box-shadow: 0pt 2px 5px rgba(105, 108, 109,  0.7),\t0px 0px 8px 5px rgba(208, 223, 226, 0.4) inset;\r\n");
      out.write("            -webkit-box-shadow: 10px;\r\n");
      out.write("            -moz-border-radius: 10px;\r\n");
      out.write("                 border-radius: 10px;\r\n");
      out.write("                 opacity:1;\r\n");
      out.write("\t\t\tz-index:1002;\r\n");
      out.write("\t\t\toverflow: auto;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t/* For the \"inset\" look only */\r\n");
      out.write(".scrollbar\r\n");
      out.write("{\r\n");
      out.write("\tmargin-left: 30px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\theight: 330px;\r\n");
      out.write("\twidth: 480px;\r\n");
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
      out.write(".pass input{\r\n");
      out.write("\tbackground-position:0 -96px;\r\n");
      out.write("}\r\n");
      out.write(" .pass input:focus{\r\n");
      out.write("\tbackground-position:0 -144px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function validatesearchkey(key) \r\n");
      out.write("{\r\n");
      out.write("\tvar error = \"\";\r\n");
      out.write("    \r\n");
      out.write("\t if (key.value == \"\")\r\n");
      out.write("    {\r\n");
      out.write("       \r\n");
      out.write("\t\t key.style.background = 'white';\r\n");
      out.write("        error = \"Empty Search Filed  Enter  Keyword\\n\";\r\n");
      out.write("        alert(error);\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"");
      out.print(request.getContextPath());
      out.write("/images/templatemo_body1.jpg\">\r\n");
      out.write("<div id=\"slider\">\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"templatemo_wrapper\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"templatemo_main\">\r\n");
      out.write("        \t<div id=\"templatemo_sidebar\">\r\n");
      out.write("            \t<div id=\"header\"><h1><a href=\"http://www.templatemo.com\">PMSE</a></h1></div>\r\n");
      out.write("                \r\n");
      out.write("                <div id=\"menu\">\r\n");
      out.write("                    <ul class=\"navigation\">\r\n");
      out.write("                   <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/user/index.jsp\" >Home</a></li>\r\n");
      out.write("                      <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/user/search.jsp\">Search</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/user/cpass.jsp\">C Pass</a></li>\r\n");
      out.write("                     <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Logout\" >Logout</a></li>\r\n");
      out.write("                \r\n");
      out.write("                    </ul>\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("            </div> <!-- end of side bar -->\r\n");
      out.write("             ");

                    	String uname=(String)session.getAttribute("uname");
             
                    String uid=(String)session.getAttribute("uid");
                    
                    String time=(String)session.getAttribute("Time");
                    
                    ArrayList<String>list=User_dao.getUserdet(uid);
                    
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    <div style=\"position: relative;top: 50px;left: 300px;\">\r\n");
      out.write("                    <h1>Time taken :");
      out.print(time);
      out.write("</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                     <div id=\"templatemo_content\">\r\n");
      out.write("              <div class=\"scroll\">\r\n");
      out.write("            <div class=\"scrollContainer\">\r\n");
      out.write("           <div class=\"panel\" id=\"search\">\r\n");
      out.write("                     <form action=\"");
      out.print(request.getContextPath());
      out.write("/PersonalSearch\" method=\"post\">\r\n");
      out.write("                    <h2>Search</h2>\r\n");
      out.write("        \t\t\t<input type=\"text\" name=\"keyword\" class=\"easyui-validatebox\" required=\"required\"   onblur=\"validatesearchkey(this);\"  ></input>\r\n");
      out.write("                     \t<input type=\"submit\" value=\"Submit\"></input>\t\r\n");
      out.write("                      </form>\r\n");
      out.write("                    <br></br>\r\n");
      out.write("                       <div class=\"scrollbar\" id=\"style-1\">\r\n");
      out.write("                      ");

                     
                      temp=(String)request.getAttribute("temp");
                      search_no=(String)request.getAttribute("search_no");
                      if(temp=="yes")
                      {
                    	ResultSet rset=Search_dao.getResult();
                     while(rset.next())
                        {	
                        
      out.write("\r\n");
      out.write("                     \t <div class=\"post_box\" >\r\n");
      out.write("                            <h2><a href = \"");
      out.print(request.getContextPath());
      out.write("/PersonalSearch?code=");
      out.print(rset.getInt(1));
      out.write("&search_no=");
      out.print(search_no );
      out.write('"');
      out.write(' ');
      out.write('>');
      out.print(rset.getString(2));
      out.write("</a></h2>\r\n");
      out.write("                            <img src=\"Image/");
      out.print(rset.getString(4));
      out.write("\" class=\"image_wrapper\" alt=\"Image 2\" style=\"width: 100px;height: 70px;\"/>\r\n");
      out.write("                            <p><span class=\"cat\">Location in <span class=\"loc\">");
      out.print(rset.getString(5));
      out.write("</span></p>\r\n");
      out.write("                            <p>");
      out.print(rset.getString(3));
      out.write("</p>\r\n");
      out.write("                            <div class=\"cleaner1\"></div>\r\n");
      out.write("                             </div>        \r\n");
      out.write("                      ");
}
                      }
                      	
                      
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </div> <!-- end of search -->\r\n");
      out.write("      \r\n");
      out.write("\t\t\t\t");

			
				
					 rs=(ResultSet)request.getAttribute("rs");
				
				
				if(rs!=null)
				{
      out.write("\t\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <div  class=\"white_content\" id=\"light\"> \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<a href = \"javascript:void(0)\"  style=\"position:absolute;top:15px;left:360px;\" onclick=\"closelightbox()\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/close.gif\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t");
while(rs.next())
					{
      out.write("  \r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t <div class=\"post_box\" style=\"position:absolute;top:20px;left:22px;width: 360px;\">\r\n");
      out.write("\t\t\t\t\t\t <h2><a href = \"#\" >");
      out.print(rs.getString(2));
      out.write("</a></h2>\r\n");
      out.write("\t\t\t\t\t\t <img src=\"Image/");
      out.print(rs.getString(4));
      out.write("\" class=\"image_wrapper\" alt=\"Image 2\" style=\"width: 100px;height: 70px;\"/>\r\n");
      out.write("                         <p style=\"width: 350px;\"><span class=\"cat\">Location in <span class=\"loc\">");
      out.print(rs.getString(5));
      out.write("</span></p>\r\n");
      out.write("                         <p style=\"width: 350px;\">");
      out.print(rs.getString(3));
      out.write("</p>\r\n");
      out.write("                         <div class=\"cleaner\"></div> \r\n");
      out.write("                           \r\n");
      out.write("                            \r\n");
      out.write("\t\t\t\t  ");
}}
      out.write("\r\n");
      out.write("\t\t\t\t   </div>   \r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div id=\"fade\" class=\"black_overlay\"></div>\r\n");
      out.write("           \r\n");
      out.write("                    </div>\r\n");
      out.write("           </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"cleaner\"></div>\r\n");
      out.write("        </div> <!-- end of main -->\r\n");
      out.write("    \r\n");
      out.write("    \t\r\n");
      out.write("       \r\n");
      out.write("    </div> <!-- end of wrapper -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");

	if(Utility.parse(request.getParameter("no"))==3)
	{

      out.write("\r\n");
      out.write("\t\t<div class=\"info\" id=\"message\" style=\"position:absolute;top:421px;left:11px\">\t\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\talert(\"Invalid keyword!!\");</script>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t");
	
} 
      out.write("\t\r\n");
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
