package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.pmse.util.HashingTechnique;
import java.sql.ResultSet;
import com.pmse.dao.Postings_dao;
import com.pmse.dao.Location_dao;
import javax.swing.JOptionPane;

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
      out.write("<link href=\"templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/coda-slider.css\" type=\"text/css\" charset=\"utf-8\" />\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/jquery-1.2.6.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/jquery.scrollTo-1.3.3.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/jquery.localscroll-1.2.5.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("<script src=\"js/jquery.serialScroll-1.2.1.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("<script src=\"js/coda-slider.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("<script src=\"js/jquery.easing.1.3.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t/* For the \"inset\" look only */\r\n");
      out.write(".scrollbar\r\n");
      out.write("{\r\n");
      out.write("\tmargin-left: 30px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\theight: 500px;\r\n");
      out.write("\twidth: 500px;\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("        function validateEmail(emailField)\r\n");
      out.write("        {\r\n");
      out.write("        var reg = /^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,4})$/;\r\n");
      out.write("\r\n");
      out.write("        if (reg.test(emailField.value) == false) \r\n");
      out.write("        {\r\n");
      out.write("            alert('Invalid Email Address');\r\n");
      out.write("            emailField.value = null;\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        return true;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("        </script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function Validate() \r\n");
      out.write("{\r\n");
      out.write("    var val = document.getElementById('ids').value;\r\n");
      out.write("    \r\n");
      out.write("    if (!val.match(/^[a-zA-Z]+$/)) \r\n");
      out.write("    {\r\n");
      out.write("        alert('Company Name  shouldnot contain Integers');\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
      out.write("<script>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    \tfunction ValidateAlpha(evt)\r\n");
      out.write("        {\r\n");
      out.write("    \t\t var keyCode = (evt.which) ? evt.which : evt.keyCode\r\n");
      out.write("    \t\t\t        if ((keyCode < 65 || keyCode > 90) && (keyCode < 97 || keyCode > 123) && keyCode != 32)\r\n");
      out.write("    \t\t\t        \t{\r\n");
      out.write("    \t\t\t        \t\r\n");
      out.write("    \t\t\t        \talert('Numbers not allowed');\r\n");
      out.write("    \t\t\t        \t return false;\r\n");
      out.write("    \t\t\t        \t}    \t\t\t        \t\r\n");
      out.write("    \t\t\t       \r\n");
      out.write("    \t\t\t            return true;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \t\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function validatePassword(fld) {\r\n");
      out.write("    var error = \"\";\r\n");
      out.write("    var illegalChars = /[\\W_]/; // allow only letters and numbers\r\n");
      out.write(" \r\n");
      out.write("    if (fld.value == \"\") {\r\n");
      out.write("        fld.style.background = 'white';\r\n");
      out.write("        error = \"You didn't enter a password.\\n\";\r\n");
      out.write("        alert(error);\r\n");
      out.write("        return false;\r\n");
      out.write(" \r\n");
      out.write("    } else if ((fld.value.length < 7) || (fld.value.length > 15)) {\r\n");
      out.write("        error = \"The password is the wrong length. \\n\";\r\n");
      out.write("        fld.style.background = 'white';\r\n");
      out.write("        alert(error);\r\n");
      out.write("        return false;\r\n");
      out.write(" \r\n");
      out.write("    } else if (illegalChars.test(fld.value)) {\r\n");
      out.write("        error = \"The password contains illegal characters.\\n\";\r\n");
      out.write("        fld.style.background = 'white';\r\n");
      out.write("        alert(error);\r\n");
      out.write("        return false;\r\n");
      out.write(" \r\n");
      out.write("    } else if ( (fld.value.search(/[a-zA-Z]+/)==-1) || (fld.value.search(/[0-9]+/)==-1) ) {\r\n");
      out.write("        error = \"The password must contain at least one numeral.\\n\";\r\n");
      out.write("        fld.style.background = 'white';\r\n");
      out.write("        alert(error);\r\n");
      out.write("        return false;\r\n");
      out.write(" \r\n");
      out.write("    } else {\r\n");
      out.write("        fld.style.background = 'White';\r\n");
      out.write("    }\r\n");
      out.write("   return true;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function isNumberKey(evt)\r\n");
      out.write("{\r\n");
      out.write("   var charCode = (evt.which) ? evt.which : event.keyCode\r\n");
      out.write("   if (charCode > 31 && (charCode < 48 || charCode > 57))\r\n");
      out.write("      return false;\r\n");
      out.write("\r\n");
      out.write("   return true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("        function validatePhone(PhoneField)\r\n");
      out.write("        {\r\n");
      out.write("      \r\n");
      out.write("       var reg = /[7-9]{1}\\d{9}/;\r\n");
      out.write("\r\n");
      out.write("        if (reg.test(PhoneField.value) == false) \r\n");
      out.write("        {\r\n");
      out.write("            alert('Invalid Phone Number');\r\n");
      out.write("            PhoneField.value = null;\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        return true;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("function isNumber(evt) {\r\n");
      out.write("    evt = (evt) ? evt : window.event;\r\n");
      out.write("    var charCode = (evt.which) ? evt.which : evt.keyCode;\r\n");
      out.write("    if (charCode > 31 && (charCode < 48 || charCode > 57)) {\r\n");
      out.write("    \talert('Only Numbers should be filled out');\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("</script >\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"slider\">\r\n");
      out.write("\t<div id=\"templatemo_wrapper\">\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"templatemo_main\">\r\n");
      out.write("        \t<div id=\"templatemo_sidebar\">\r\n");
      out.write("            \t<div id=\"header\"><h1><a href=\"#\">PWS</a></h1></div>\r\n");
      out.write("                \r\n");
      out.write("                <div id=\"menu\">\r\n");
      out.write("                    <ul class=\"navigation\">\r\n");
      out.write("                     <li><a href=\"#search\" > Search</a></li>\r\n");
      out.write("                 <!--    <li><a href=\"#home\" >Home</a></li> -->\r\n");
      out.write("                    <li><a href=\"#admin\">Admin</a></li>\r\n");
      out.write("                    <li><a href=\"#user\">User</a></li>\r\n");
      out.write("                   \r\n");
      out.write("                \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> <!-- end of sidebar -->\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"templatemo_content\">\r\n");
      out.write("            \t<div class=\"scroll\">\r\n");
      out.write("\t        \t\t<div class=\"scrollContainer\">\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <div class=\"panel\" id=\"search\">\r\n");
      out.write("                     <form action=\"");
      out.print(request.getContextPath());
      out.write("/SimpleSearch\" method=\"post\">\r\n");
      out.write("                    <h2>Search</h2>\r\n");
      out.write("        \t\t\t\t<input type=\"text\" name=\"keyword\"  class=\"easyui-validatebox\" required=\"required\"   onblur=\"validatesearchkey(this);\"   ></input>\r\n");
      out.write("                     \t<input type=\"submit\" value=\"submit\"></input>\t\r\n");
      out.write("                      </form>\r\n");
      out.write("                    <br></br>\r\n");
      out.write("                       <div class=\"scrollbar\" id=\"style-1\">\r\n");
      out.write("                      ");

                      String  keyword=(String)request.getParameter("key");
                      System.out.println("======================== "+keyword);
                      String enc = HashingTechnique.MD5(keyword);
                      if(keyword!=null)
                      {
	                    	ResultSet rs=Postings_dao.getPostingSearch(keyword,enc);
	                     if(!rs.next())
	                     {      
	                    	 System.out.println("+++++++++++++ condition no match++++++++++++");
	                        
      out.write("\r\n");
      out.write("\t                  \t       <script type=\"text/javascript\">\r\n");
      out.write("\t                     \t\t\t alert(\"no match..\");\r\n");
      out.write("\t                    \t\t </script>\r\n");
      out.write("\t                     \t       \r\n");
      out.write("\t                      ");
}
	                     
	                     else{
	                    
	                     while(rs.next())
	                        {
	                     
      out.write("\r\n");
      out.write("\t                     <div class=\"post_box\" >\r\n");
      out.write("\t                            <h2><a href=\"#\" >");
      out.print(rs.getString(2) );
      out.write("</a></h2>\r\n");
      out.write("\t                            <img src=\"Image/");
      out.print(rs.getString(4) );
      out.write("\" class=\"image_wrapper\" alt=\"Image 2\" style=\"width: 100px;height: 70px;\"/>\r\n");
      out.write("\t                            <p><span class=\"cat\">Location in <span class=\"loc\">");
      out.print(rs.getString(5));
      out.write("</span></p>\r\n");
      out.write("\t                            <p >");
      out.print(rs.getString(3));
      out.write("</p>\r\n");
      out.write("\t                            <div class=\"cleaner\"></div>\r\n");
      out.write("\t                             </div>  \r\n");
      out.write("\t                     \r\n");
      out.write("\t                     \r\n");
      out.write("\t                     ");
 }
	                 
                      }
                      }
                      	
                      
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </div> <!-- end of search -->\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"panel\" id=\"home\">\r\n");
      out.write("                          \r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- end of home -->\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"panel\" id=\"admin\">\r\n");
      out.write("                        <h2>Admin Login</h2>\r\n");
      out.write("                         <a href=\"#\" ><img src=\"images/administrator.png\" alt=\"Image 2\" class=\"image_wrapper image_fr\" /></a>\r\n");
      out.write("                        \r\n");
      out.write("                       <form action=\"");
      out.print(request.getContextPath());
      out.write("/AdminLogin\" method=\"post\">\r\n");
      out.write("                       \t<table style=\"position: absolute;top:1300px;\">\r\n");
      out.write("                       \t\t<tr>\r\n");
      out.write("                       \t\t\t<td>Admin Id </td>\r\n");
      out.write("                       \t\t\t<td style=\"width: 50px;\" align=\"center\">:</td>\r\n");
      out.write("                       \t\t\t<td><input type=\"text\" name=\"id\" required></input></td>\r\n");
      out.write("                       \t\t</tr>\r\n");
      out.write("                       \t\t<tr>\r\n");
      out.write("                       \t\t\t<td>Password </td>\r\n");
      out.write("                       \t\t\t<td style=\"width: 50px;\" align=\"center\">:</td>\r\n");
      out.write("                       \t\t\t<td><input type=\"password\" name=\"pwd\" required></input></td>\r\n");
      out.write("                       \t\t</tr>\r\n");
      out.write("                       \t\t<tr>\r\n");
      out.write("                       \t\t\t<td colspan=\"3\" align=\"center\"><input type=\"submit\" name=\"submit\" value=\"Login\"></input></td>\r\n");
      out.write("                       \t\t</tr>\r\n");
      out.write("                       \t\r\n");
      out.write("                       \t</table>\r\n");
      out.write("                       \r\n");
      out.write("                       </form>\r\n");
      out.write("                       \r\n");
      out.write("                    </div> <!-- end of admin -->\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"panel\" id=\"user\">\r\n");
      out.write("                        <h2>User Login</h2>\r\n");
      out.write("                         <a href=\"\" target=\"_parent\"><img src=\"images/user.png\" alt=\"Image 2\" class=\"image_wrapper image_fr\" /></a>\r\n");
      out.write("                        \r\n");
      out.write("                       <form action=\"");
      out.print(request.getContextPath());
      out.write("/UserLogin\" method=\"post\">\r\n");
      out.write("                       \t<table style=\"position: absolute;top:1850px;\">\r\n");
      out.write("                       \t\t<tr>\r\n");
      out.write("                       \t\t\t<td>User Id </td>\r\n");
      out.write("                       \t\t\t<td style=\"width: 50px;\" align=\"center\">:</td>\r\n");
      out.write("                       \t\t\t<td><input type=\"text\" name=\"userid\" required></input></td>\r\n");
      out.write("                       \t\t</tr>\r\n");
      out.write("                       \t\t<tr>\r\n");
      out.write("                       \t\t\t<td>Password </td>\r\n");
      out.write("                       \t\t\t<td style=\"width: 50px;\" align=\"center\">:</td>\r\n");
      out.write("                       \t\t\t<td><input type=\"password\" name=\"userpwd\" required></input></td>\t\r\n");
      out.write("                       \t\t</tr>\r\n");
      out.write("                       \t\t<tr>\r\n");
      out.write("                       \t\t\t<td>Location </td>\r\n");
      out.write("                       \t\t\t<td style=\"width: 50px;\" align=\"center\">:</td>\r\n");
      out.write("                       \t\t\t<td><select id=\"loc\" name=\"loc\">\r\n");
      out.write("\t\t\t\t\t\t\t   \t");
	
							   	ResultSet parent=Location_dao.getParentNames();
								   	while(parent.next())
								   	{
								   	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t   \t\t<option value=\"");
      out.print(parent.getString(2) );
      out.write('"');
      out.write('>');
      out.print(parent.getString(2) );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t   \t\t");
} 
      out.write(" \r\n");
      out.write("\t   \t\t\t\t\t\t</select></td>\r\n");
      out.write("                       \t\t\t\r\n");
      out.write("                       \t\t</tr>\r\n");
      out.write("                       \t\t<tr>\r\n");
      out.write("                       \t\t\t<td colspan=\"2\" align=\"right\"><input type=\"submit\" name=\"submit\" value=\"Login\" ></input></td>\r\n");
      out.write("                       \t\t\t<td align=\"center\"><a href=\"#register\"   >New User</a></td>\r\n");
      out.write("                       \t\t</tr>\t\r\n");
      out.write("                       \t</table>\r\n");
      out.write("                       </form>\r\n");
      out.write("                    </div> <!-- end of user -->\r\n");
      out.write("                                        <div class=\"panel\" id=\"register\">\r\n");
      out.write("                    \r\n");
      out.write("                   \r\n");
      out.write("                    <br></br>\r\n");
      out.write("                    \r\n");
      out.write("                       \r\n");
      out.write("                     <form class=\"login1\" action=\"");
      out.print(request.getContextPath());
      out.write("/UserLogin\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<center><label><font style=\"font-family: Monotype Corsiva;font-size: 35px;color: #DAA520;\">User Registration</font></label></center>\r\n");
      out.write("\t\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\t\t<table align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font style=\"color: #00BFFF;\">User Id</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\"  name=\"userid\" placeholder=\"User Id\" required></input></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font style=\"color: #00BFFF;\">User Password</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"password\"  name=\"userpwd\"  placeholder=\"Password\" class=\"easyui-validatebox\"  onblur=\"validatePassword(this);\" required></input></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font style=\"color: #00BFFF;\">User Name</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\"   name=\"uname\" placeholder=\"User Name\" onKeyPress=\"return ValidateAlpha(event);\"  class=\"easyui-validatebox\" required></input></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font style=\"color: #00BFFF;\">User Email</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\"   name=\"email\" class=\"easyui-validatebox\"  onblur=\"validateEmail(this);\"  placeholder=\"Email\" required></input></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font style=\"color: #00BFFF;\">Phone</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\"   name=\"phone\" placeholder=\"Phone\"  min=\"10\" maxlength=\"10\" class=\"easyui-validatebox\" required=\"required\"   onclick=\"validatePhone(this);\"   ></input></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<center><input type=\"submit\" id=\"submitbtn\" name=\"submit\" value=\"Register\" tabindex=\"4\"></input></center>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                    </div> <!-- end of gallery -->\r\n");
      out.write("    ");

	String status=null;
	status=request.getParameter("status");
	if(status!=null)
	{
		int k=Integer.parseInt(status);
		if(k==1)
		{
      out.write("\r\n");
      out.write("\t\t\t<script >alert(\"Admin Login Failure\")</script>\r\n");
      out.write("\t");
 }else if(k==2)
	{
      out.write("\r\n");
      out.write("\t\t<script >alert(\"User Login Failure\")</script>\r\n");
      out.write("\t\r\n");
      out.write("\t");
}else if(k==3)
	{
      out.write("\r\n");
      out.write("\t<script >alert(\"User Registered Sucessfully\")</script>\r\n");
      out.write("\r\n");
      out.write("\t");
}else if(k==4)
	{
      out.write("\r\n");
      out.write("\t<script >alert(\"User Registered Failure\")</script>\r\n");
      out.write("\r\n");
      out.write("\t");
}}
      out.write("\r\n");
      out.write("          \r\n");
      out.write("                  \r\n");
      out.write("                    </div> <!-- end scrollContainer -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("            </div> <!-- end of content -->\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"cleaner\"></div>\r\n");
      out.write("        </div> <!-- end of main -->\r\n");
      out.write("    \r\n");
      out.write("    \t\r\n");
      out.write("       \r\n");
      out.write("    </div> <!-- end of wrapper -->\r\n");
      out.write("</div> <!-- end of slider -->\r\n");
 String location = System.getProperty("catalina.base") + java.io.File.separator + "logs" + java.io.File.separator + 
"localhost_access_log." + new java.sql.Date(System.currentTimeMillis()) +".txt";

System.out.println("   Location : "+location); 
      out.write("\r\n");
      out.write("</body>\r\n");
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
