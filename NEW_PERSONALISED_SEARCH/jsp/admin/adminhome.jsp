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

 <style type="text/css">
    
    
    </style>
<script type="text/javascript">

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
	  <div id="event">
	 
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
			 <li><a href="<%=request.getContextPath()%>/Logout">Logout</a></li>

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
			<script >alert("Login Sucessfully")</script>
	<% }}%>

</body>
</html>
