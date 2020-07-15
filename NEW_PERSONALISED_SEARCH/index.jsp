
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="com.pmse.util.HashingTechnique"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.pmse.dao.Postings_dao"%>
<%@page import="com.pmse.dao.Location_dao"%>
<%@page import="javax.swing.JOptionPane"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>PMSE</title>
<meta name="keywords" content="Cafe and Bakery, Free CSS Template, Pink, Black" />
<meta name="description" content="Cafe and Bakery is a free CSS template using pink gradient and black colors." />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="css/coda-slider.css" type="text/css" charset="utf-8" />

<script src="js/jquery-1.2.6.js" type="text/javascript"></script>
<script src="js/jquery.scrollTo-1.3.3.js" type="text/javascript"></script>
<script src="js/jquery.localscroll-1.2.5.js" type="text/javascript" charset="utf-8"></script>
<script src="js/jquery.serialScroll-1.2.1.js" type="text/javascript" charset="utf-8"></script>
<script src="js/coda-slider.js" type="text/javascript" charset="utf-8"></script>
<script src="js/jquery.easing.1.3.js" type="text/javascript" charset="utf-8"></script>

<style type="text/css">
	/* For the "inset" look only */
.scrollbar
{
	margin-left: 30px;
	float: left;
	height: 500px;
	width: 500px;
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
</style>


<script>
        function validateEmail(emailField)
        {
        var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;

        if (reg.test(emailField.value) == false) 
        {
            alert('Invalid Email Address');
            emailField.value = null;
            return false;
        }

        return true;

}
        </script>
<script type="text/javascript">


function Validate() 
{
    var val = document.getElementById('ids').value;
    
    if (!val.match(/^[a-zA-Z]+$/)) 
    {
        alert('Company Name  shouldnot contain Integers');
        return false;
    }
    
    return true;
}


</script>
<script type="text/javascript">


function validatesearchkey(key) 
{
	var error = "";
    
	 if (key.value == "")
    {
       
		 key.style.background = 'white';
        error = "Empty Search Filed  Enter  Keyword\n";
        alert(error);
        return false;
    }
    
    return true;
}


</script>
<script>
   

    	function ValidateAlpha(evt)
        {
    		 var keyCode = (evt.which) ? evt.which : evt.keyCode
    			        if ((keyCode < 65 || keyCode > 90) && (keyCode < 97 || keyCode > 123) && keyCode != 32)
    			        	{
    			        	
    			        	alert('Numbers not allowed');
    			        	 return false;
    			        	}    			        	
    			       
    			            return true;
        }


    	
    </script>
    
    <script type="text/javascript">


function validatePassword(fld) {
    var error = "";
    var illegalChars = /[\W_]/; // allow only letters and numbers
 
    if (fld.value == "") {
        fld.style.background = 'white';
        error = "You didn't enter a password.\n";
        alert(error);
        return false;
 
    } else if ((fld.value.length < 7) || (fld.value.length > 15)) {
        error = "The password is the wrong length. \n";
        fld.style.background = 'white';
        alert(error);
        return false;
 
    } else if (illegalChars.test(fld.value)) {
        error = "The password contains illegal characters.\n";
        fld.style.background = 'white';
        alert(error);
        return false;
 
    } else if ( (fld.value.search(/[a-zA-Z]+/)==-1) || (fld.value.search(/[0-9]+/)==-1) ) {
        error = "The password must contain at least one numeral.\n";
        fld.style.background = 'white';
        alert(error);
        return false;
 
    } else {
        fld.style.background = 'White';
    }
   return true;
}
</script>
<script type="text/javascript">




function isNumberKey(evt)
{
   var charCode = (evt.which) ? evt.which : event.keyCode
   if (charCode > 31 && (charCode < 48 || charCode > 57))
      return false;

   return true;
}



</script>

<script>
        function validatePhone(PhoneField)
        {
      
       var reg = /[7-9]{1}\d{9}/;

        if (reg.test(PhoneField.value) == false) 
        {
            alert('Invalid Phone Number');
            PhoneField.value = null;
            return false;
        }

        return true;

}
        </script>






   <script type="text/javascript">

function isNumber(evt) {
    evt = (evt) ? evt : window.event;
    var charCode = (evt.which) ? evt.which : evt.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57)) {
    	alert('Only Numbers should be filled out');
        return false;
    }
    
    
    
    
    
    
    return true;
}
</script >
</head>
<body>

<div id="slider">
	<div id="templatemo_wrapper">

        
        <div id="templatemo_main">
        	<div id="templatemo_sidebar">
            	<div id="header"><h1><a href="#">PWS</a></h1></div>
                
                <div id="menu">
                    <ul class="navigation">
                     <li><a href="#search" > Search</a></li>
                 <!--    <li><a href="#home" >Home</a></li> -->
                    <li><a href="#admin">Admin</a></li>
                    <li><a href="#user">User</a></li>
                   
                
                    </ul>
                </div>
            </div> <!-- end of sidebar -->
            
            <div id="templatemo_content">
            	<div class="scroll">
	        		<div class="scrollContainer">
                    <%!
                    String keyword=null;
                    %>
                    <div class="panel" id="search">
                     <form action="<%=request.getContextPath()%>/SimpleSearch" method="post">
                    <h2>Search</h2>
        				<input type="text" name="keyword"  class="easyui-validatebox" required="required"   onblur="validatesearchkey(this);"   ></input>
                     	<input type="submit" value="submit"></input>	
                      </form>
                    <br></br>
                       <div class="scrollbar" id="style-1">
                      <%
                      String  keyword=(String)request.getParameter("key");
                      System.out.println("======================== "+keyword);
                      String enc = HashingTechnique.MD5(keyword);
                      if(keyword!=null)
                      {
	                    	ResultSet rs=Postings_dao.getPostingSearch(keyword,enc);
	                     if(!rs.next())
	                     {      
	                    	 System.out.println("+++++++++++++ condition no match++++++++++++");
	                        %>
	                  	       <script type="text/javascript">
	                     			 alert("no match..");
	                    		 </script>
	                     	       
	                      <%}
	                     
	                     else{
	                    
	                     while(rs.next())
	                        {
	                     %>
	                     <div class="post_box" >
	                            <h2><a href="#" ><%=rs.getString(2) %></a></h2>
	                            <img src="Image/<%=rs.getString(4) %>" class="image_wrapper" alt="Image 2" style="width: 100px;height: 70px;"/>
	                            <p><span class="cat">Location in <span class="loc"><%=rs.getString(5)%></span></p>
	                            <p ><%=rs.getString(3)%></p>
	                            <div class="cleaner"></div>
	                             </div>  
	                     
	                     
	                     <% }
	                 
                      }
                      }
                      	
                      %>
                        </div>
                        
                    </div> <!-- end of search -->
                    
                    <div class="panel" id="home">
                          
                        
                    </div>
                    <!-- end of home -->
                    
                    <div class="panel" id="admin">
                        <h2>Admin Login</h2>
                         <a href="#" ><img src="images/administrator.png" alt="Image 2" class="image_wrapper image_fr" /></a>
                        
                       <form action="<%=request.getContextPath()%>/AdminLogin" method="post">
                       	<table style="position: absolute;top:1300px;">
                       		<tr>
                       			<td>Admin Id </td>
                       			<td style="width: 50px;" align="center">:</td>
                       			<td><input type="text" name="id" required></input></td>
                       		</tr>
                       		<tr>
                       			<td>Password </td>
                       			<td style="width: 50px;" align="center">:</td>
                       			<td><input type="password" name="pwd" required></input></td>
                       		</tr>
                       		<tr>
                       			<td colspan="3" align="center"><input type="submit" name="submit" value="Login"></input></td>
                       		</tr>
                       	
                       	</table>
                       
                       </form>
                       
                    </div> <!-- end of admin -->
                    
                    <div class="panel" id="user">
                        <h2>User Login</h2>
                         <a href="" target="_parent"><img src="images/user.png" alt="Image 2" class="image_wrapper image_fr" /></a>
                        
                       <form action="<%=request.getContextPath()%>/UserLogin" method="post">
                       	<table style="position: absolute;top:1850px;">
                       		<tr>
                       			<td>User Id </td>
                       			<td style="width: 50px;" align="center">:</td>
                       			<td><input type="text" name="userid" required></input></td>
                       		</tr>
                       		<tr>
                       			<td>Password </td>
                       			<td style="width: 50px;" align="center">:</td>
                       			<td><input type="password" name="userpwd" required></input></td>	
                       		</tr>
                       		<tr>
                       			<td>Location </td>
                       			<td style="width: 50px;" align="center">:</td>
                       			<td><select id="loc" name="loc">
							   	<%	
							   	ResultSet parent=Location_dao.getParentNames();
								   	while(parent.next())
								   	{
								   	%>
								   		<option value="<%=parent.getString(2) %>"><%=parent.getString(2) %></option>
							   		<%} %> 
	   						</select></td>
                       			
                       		</tr>
                       		<tr>
                       			<td colspan="2" align="right"><input type="submit" name="submit" value="Login" ></input></td>
                       			<td align="center"><a href="#register"   >New User</a></td>
                       		</tr>	
                       	</table>
                       </form>
                    </div> <!-- end of user -->
                                        <div class="panel" id="register">
                    
                   
                    <br></br>
                    
                       
                     <form class="login1" action="<%=request.getContextPath()%>/UserLogin" method="post">

					<center><label><font style="font-family: Monotype Corsiva;font-size: 35px;color: #DAA520;">User Registration</font></label></center>
					<br><br>
						<table align="center">
						<tr>
							<td><font style="color: #00BFFF;">User Id</font></td>
							<td><input type="text"  name="userid" placeholder="User Id" required></input></td>
						</tr>
						<tr>
							<td><font style="color: #00BFFF;">User Password</font></td>
							<td><input type="password"  name="userpwd"  placeholder="Password" class="easyui-validatebox"  onblur="validatePassword(this);" required></input></td>
						</tr>
						<tr>
							<td><font style="color: #00BFFF;">User Name</font></td>
							<td><input type="text"   name="uname" placeholder="User Name" onKeyPress="return ValidateAlpha(event);"  class="easyui-validatebox" required></input></td>
						</tr>
						<tr>
							<td><font style="color: #00BFFF;">User Email</font></td>
							<td><input type="text"   name="email" class="easyui-validatebox"  onblur="validateEmail(this);"  placeholder="Email" required></input></td>
						</tr>
						<tr>
							<td><font style="color: #00BFFF;">Phone</font></td>
							<td><input type="text"   name="phone" placeholder="Phone"  min="10" maxlength="10" class="easyui-validatebox" required="required"   onclick="validatePhone(this);"   ></input></td>
						</tr>
					</table>
				<br><br>
						
						<center><input type="submit" id="submitbtn" name="submit" value="Register" tabindex="4"></input></center>
						
						
						</form>

                        
                    </div> <!-- end of gallery -->
    <%
	String status=null;
	status=request.getParameter("status");
	if(status!=null)
	{
		int k=Integer.parseInt(status);
		if(k==1)
		{%>
			<script >alert("Admin Login Failure")</script>
	<% }else if(k==2)
	{%>
		<script >alert("User Login Failure")</script>
	
	<%}else if(k==3)
	{%>
	<script >alert("User Registered Sucessfully")</script>

	<%}else if(k==4)
	{%>
	<script >alert("User Registered Failure")</script>

	<%}}%>
          
                  
                    </div> <!-- end scrollContainer -->
				</div>
            </div> <!-- end of content -->
            
            <div class="cleaner"></div>
        </div> <!-- end of main -->
    
    	
       
    </div> <!-- end of wrapper -->
</div> <!-- end of slider -->
<% String location = System.getProperty("catalina.base") + java.io.File.separator + "logs" + java.io.File.separator + 
"localhost_access_log." + new java.sql.Date(System.currentTimeMillis()) +".txt";

System.out.println("   Location : "+location); %>
</body>
</html>