
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@page import="java.sql.ResultSet"%>
<%@page import="com.pmse.dao.Postings_dao"%>
<%@page import="com.pmse.dao.Location_dao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.pmse.dao.User_dao"%><html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>PMSE</title>
<meta name="keywords" content="Cafe and Bakery, Free CSS Template, Pink, Black" />
<meta name="description" content="Cafe and Bakery is a free CSS template using pink gradient and black colors." />
<link href="<%=request.getContextPath()%>/templatemo_style.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/coda-slider1.css" type="text/css" charset="utf-8" />

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
<style type="text/css">
	/* For the "inset" look only */
.scrollbar
{
	margin-left: 30px;
	float: left;
	height: 500px;
	width: 700px;
	background: #0f020b;;
	overflow: auto;
	margin-bottom: 25px;
}

#style-1::-webkit-scrollbar-track
{
	-webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);
	border-radius: 10px;
	background-color: #F5F5F5;
}

#style-1::-webkit-scrollbar
{
	width: 12px;
	background-color: #F5F5F5;
}

#style-1::-webkit-scrollbar-thumb
{
	border-radius: 10px;
	-webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
	background-color: #555;
}
.pass input{
	background-position:0 -96px;
}
 .pass input:focus{
	background-position:0 -144px;
}

</style>
</head>
<body background="<%=request.getContextPath()%>/images/templatemo_body1.jpg">

<div id="slider">
	<div id="templatemo_wrapper">
	
		
        
        <div id="templatemo_main">
        	<div id="templatemo_sidebar">
            	<div id="header"><h1><a href="http://www.templatemo.com">PMSE</a></h1></div>
                
                <div id="menu">
                    <ul class="navigation">
                     <li><a href="<%=request.getContextPath()%>/jsp/user/index.jsp" >Home</a></li>
                      <li><a href="<%=request.getContextPath()%>/jsp/user/search.jsp">Search</a></li>
                    <li><a href="<%=request.getContextPath()%>/jsp/user/cpass.jsp">C Pass</a></li>
                     <li><a href="<%=request.getContextPath()%>/Logout" >Logout</a></li>
                
                    </ul>
                   
                </div>
            </div> <!-- end of sidebar -->
             <%
                    	String uname=(String)session.getAttribute("uname");
                    String uid=(String)session.getAttribute("uid");
                    
                    ArrayList<String>list=User_dao.getUserdet(uid);
                    %>
                     <div id="templatemo_content">
              <div class="scroll">
            <div class="scrollContainer">
            <div class="panel" id="cpass">                                      
                    <br></br>                                       
                     <form class="login1" action="<%=request.getContextPath()%>/UserLogin" method="post">

				<center><label><font style="font-family: Monotype Corsiva;font-size: 35px;color: #DAA520;">Change Password</font></label></center>
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
							<td><input type="hidden"   name="userid" value="<%=uid%>"></input></td>
						</tr>
					</table>
					<br><br>			
						<center><input type="submit" id="submitbtn" name="submit" value="Chage Password"   onclick="return Changepass()" tabindex="4"></input></center>
						</form>
                    </div> 
                    </div>
           </div>
            </div>
            <div class="cleaner"></div>
        </div> <!-- end of main -->
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
       
    </div> <!-- end of wrapper -->
</div>

</body>
</html>