<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="com.pmse.dao.Location_dao"%>
<%@page import="java.sql.ResultSet"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>PMSE</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/map.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/interface.js"></script>
<link href="<%=request.getContextPath() %>/css/style.css" rel="stylesheet" type="text/css" />

<script src="http://maps.googleapis.com/maps/api/js?key=AIzaSyByHt0Rn3cnw6t-IIWO18CR0Wv0QX1v6tk&sensor=false">
</script>
<script type="text/javascript">
	function Changepass()
		{
	
			var MyForm=document.forms[0];
			var old_pass=MyForm.old_pass;
			
			
				if(old_pass.value.length==0)
				{
					alert("Please,Enter your Password..");
					old_pass.focus();
					return false;
				}

				var new_pass=MyForm.new_pass;
				 if(new_pass.value.length==0)
				{
					alert("Please,Enter your New Password..");
					new_pass.focus();
					return false;
				}

				var re_pass=MyForm.re_pass;
				if(re_pass.value.length==0)
				{
					alert("Please,Enter your Retype_Password..");
					re_pass.focus();
					return false;
				}
				if(new_pass.value!=re_pass.value)
				{
					alert("New password and retype password is mismatched");
					re_pass.focus();
					return false;
				}

				
				else

					return true;
		}

</script>
 
</head>

<body>
<div id="main_header">
<div id="header">
  
 
 <ul class="navi">
  <li><a href="<%=request.getContextPath()%>/jsp/admin/location.jsp">Location Ontology</a></li>
    <li><a href="<%=request.getContextPath()%>/jsp/admin/content.jsp">Content Ontology</a></li>
    <li><a href="<%=request.getContextPath()%>/jsp/admin/postings.jsp">Postings</a></li>
    <li><a href="<%=request.getContextPath()%>/jsp/admin/changepass.jsp">Change Pass</a></li>
     <li class="li1"><a href="<%=request.getContextPath()%>/Logout">Logout</a></li>
  </ul>
</div>
</div>
<div id="main_body">
	<div id="body">
	    <!--latest event start -->
	     <%
                    	
                    String aid=(String)session.getAttribute("aid");
                    
                   
                    %>
	  <div id="event">
	   <h2 style="background:url(<%=request.getContextPath()%>/images/content.png) no-repeat ; ">Change  <span>Password</span></h2>
	 	<form class="login1" action="<%=request.getContextPath()%>/AdminLogin" method="post">

				
					<br><br>
					<table align="center">
						
						<tr>
							<td><font style="color: #00BFFF;font-size: 20px;">Old Password</font></td>
							<td style="width: 50px;" align="center">:</td>
							<td><input type="password"   name="old_pass" placeholder="Old Password" required ></input></td>
						</tr>
						<tr>
							<td><font style="color: #00BFFF;font-size: 20px;">New Password</font></td>
							<td style="width: 50px;" align="center">:</td>
							<td><input type="password"   name="new_pass" placeholder="New Password" required ></input></td>
						</tr>
						<tr>
							<td><font style="color: #00BFFF;font-size: 20px;">Confrm Password</font></td>
							<td style="width: 50px;" align="center">:</td>
							<td><input type="password"   name="re_pass" placeholder="Confrm Password" required ></input></td>
							<td><input type="hidden"   name="id" value="<%=aid%>"></input></td>
						</tr>
					</table>
					<br><br>			
						<center><input type="submit" id="submitbtn" name="submit" value="Chage Password"   onclick="return Changepass()" tabindex="4"></input></center>
						</form>
	  </div>
	  <!--latest event end -->
	  <br class="balnk" />
	</div>
</div>
<div id="main_footer">
	<div id="footer"><!--footer navigation start -->
		<ul>
			<li><a href="<%=request.getContextPath()%>/jsp/admin/location.jsp" class="mg">Location Ontology</a>|</li>
			<li><a href="<%=request.getContextPath()%>/jsp/admin/content.jsp">Content Ontology</a>|</li>
			<li><a href="<%=request.getContextPath()%>/jsp/admin/postings.jsp"> Postings</a>|</li>
			<li><a href="<%=request.getContextPath()%>/jsp/admin/changepass.jsp">Change Password</a>|</li>

		</ul>
	</div><!--footer navigation end -->
	<%
    	String status=null;
	status=request.getParameter("status");
	if(status!=null)
	{
		int k=Integer.parseInt(status);
		if(k==1)
		{%>
			<script >alert("Password Changed Sucessfully")</script>
	<% }else if(k==2)
	{%>
		<script >alert("Password Changed Failure")</script>
	
	<%}}%>
</div>

</body>
</html>
