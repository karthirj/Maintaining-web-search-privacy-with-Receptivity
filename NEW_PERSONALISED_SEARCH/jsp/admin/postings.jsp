<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="com.pmse.dao.Location_dao"%>
<%@page import="java.sql.ResultSet"%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.pmse.dao.Content_dao"%>

<%@page import="com.pmse.dao.Postings_dao"%><html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>PMSE</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/map.js"></script>

<link href="<%=request.getContextPath() %>/css/style.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath() %>/css/popup.css" rel="stylesheet" type="text/css" />

<!-- <script src="http://maps.googleapis.com/maps/api/js?key=AIzaSyByHt0Rn3cnw6t-IIWO18CR0Wv0QX1v6tk&sensor=false">
</script> -->

<script src="http://maps.googleapis.com/maps/api/js?key=AIzaSyByHt0Rn3cnw6t-IIWO18CR0Wv0QX1v6tk&sensor=false">
</script>
<script type="text/javascript">
	function addContent()
	{
		var key=document.getElementById("keyword").value;
		var content=document.getElementById("content").value;
		
		if(content.length==0)
			 document.getElementById("content").value = key;
		else
		 document.getElementById("content").value = content+","+key;
	}
	function checkboxval()
	{
		
		var id=document.getElementsByName("post_code");
		
		var no=0;
		
		for(var i=0;i<id.length;i++)
		{
			if(id[i].checked)
				{
					no++;
				}
		}
		if(no==0)
		{
			alert("You must Select atleast one checkbox");
			return false;
		}
		else
		
			return true;
	}
		
	function val()
	{
		var heading=document.getElementById("heading").value;
		var keyword=document.getElementById("keyword").value;
		var location=document.getElementById("location").value;
		var image=document.getElementById("image").value;
		var desc=document.getElementById("desc").value;
		if(heading.length==0)
		{
			alert("Please enter the Heading ");
			document.getElementById("heading").focus();
			return false;
		}
		else if(keyword=="select")
		{
			alert("Please select the content ");
			document.getElementById("keyword").focus();
			return false;
		}
		else if(location==0)
		{
			alert("Please select the location ");
			document.getElementById("location").focus();
			return false;
		}
		else if(image.length==0)
		{
			alert("Please select the Image ");
			document.getElementById("image").focus();
			return false;
		}
		else if(desc.length==0)
		{
			alert("Please Enter the Description ");
			document.getElementById("desc").focus();
			return false;
		}
		else
			return true;
	}
</script>
<style type="text/css">
.scrollbar
{
	margin-left: 30px;
	float: left;
	height: 210px;
	width: 780px;
	
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
	   
	  <div id="event">
	   <h2 style="background:url(<%=request.getContextPath()%>/images/location.png) no-repeat ; ">Postings  <span></span></h2>
	   <form action="<%=request.getContextPath()%>/PostingsDetails"  enctype="multipart/form-data" method="post">
	   <div style="position: absolute;top: 200px;left: 100px;">
	   <table id=t1>
	   	<tr>
		  	<th align="left">Heading</th>
		  	<th  align="left">Keywords</th>
		  	<th  align="left">Content</th>
		</tr>
	
			<tr>
	   		<td><input type="text" name="heading" id="heading" placeholder="Enter Heading" required="yes"></input></td>
	   		<td><select id="keyword" name="keyword" ><option value="select" >--Select--</option>
	   	<%
	   		ResultSet parent=Content_dao.getContentDetails();
		   	while(parent.next())
		   	{
		   	%>
		   		<option value="<%=parent.getString(2) %>"><%=parent.getString(4) %></option>
	   		<%} %> 
	   		</select>
	   		<input type="button" id="add_content" name="add_content" value="Add" onclick="addContent()"></input>
	   		</td>
	   		<td><textarea rows="2" cols="40" name="content" id="content"></textarea></td>
	   		
	   		
	   	</tr>
	   	<tr>
		  	<th  align="left">Location</th>
		  	<th  align="left">Image</th>
		  	<th  align="left">Description</th>
		</tr>
		<tr>
			<td><select id="location" name="location"><option value="0" >--Select--</option>
	   	<%
	   		ResultSet location=Location_dao.getParentNames();
		   	while(location.next())
		   	{
		   	%>
		   		<option value="<%=location.getInt(1) %>"><%=location.getString(2) %></option>
	   		<%} %> 
	   		</select></td>
	   		<td><input type="file"  id="image" name="image" ></input></td>
	   		<td><textarea id="desc" name="desc" rows="2" cols="40"></textarea></td>
	   		<td style="width: 200px;"><input type="submit" id="add" name="submit" value="Post" onclick="return val()" ></input></td>
		</tr>
	   </table>
	   </div>
	    </form>
		</div>
	    <br></br>
	   
	    
	   
	    <form action="<%=request.getContextPath()%>/DeletePostings" method="post">
	     <div id="body_content1" >
	     <div class="scrollbar" id="style-1">
		  	<table  style="width: 350px; ">
		  	
		  		<tr style="color: black;">
		  		
		  			<th></th>
		  			<th>Heading</th>
		  			<th>Location</th>
		  			<th>Image</th>
		  			<th>Description</th>
		  			<th></th>
		  		
		  		</tr>
		  		
		  	<%
			ResultSet rs=Postings_dao.getPostingsDetails();
			while(rs.next())
			{ int loc=Integer.parseInt(rs.getString(5));
			%>
		  		<tr>
		  			<td ><input type="checkbox" name="post_code" value="<%=rs.getInt(1)%>" style="width: 50px;border-color: white;"></input></td>
		  			<td ><input type="text" name="headings" value="<%=rs.getString(2)%>" style="width: 100px;border-color: white;"></input></td>
		  			<td ><input type="text" name="location" value="<%=Location_dao.getLocationName(loc)%>" style="width: 100px;border-color: white;"></input></td>
		  			<td ><input type="image" name="image" src="<%=request.getContextPath()%>/Image/<%=rs.getString(6)%>" style="width: 80px;height: 40px;"></input></td>
		  			<td ><textarea rows="2" cols=45" style="border-color: gray;"><%=rs.getString(3)%></textarea></td>
		  		</tr>
		  	<%} %>
		  	</table>
		 </div>
		 </div>
		  <input type="submit" name="submit" id="add" value="Delete" style="position: absolute;top:600px;left: 420px;" onclick="return checkboxval()"></input>	
		 
		  </form>
	   
	    
	  
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
			<li><a href="<%=request.getContextPath()%>/jsp/admin/changepass.jsp">Change Password</a></li>
	

		</ul>
	</div><!--footer navigation end -->
</div>
<%
	String status=null;
	status=request.getParameter("status");
	if(status!=null)
	{
		int k=Integer.parseInt(status);
		if(k==1)
		{%>
			<script >alert("Postings Created Sucessfully")</script>
	<% }else if(k==2)
	{%>
		<script >alert("Postings Edited Sucessfully")</script>
	<%}else if(k==3)
	{%>
		<script >alert("Postings Deleted Sucessfully")</script>
	<%}}%>


</body>
</html>
