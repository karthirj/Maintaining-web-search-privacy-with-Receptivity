
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page import="com.pmse.util.*"%>
<%@page import="com.pmse.dao.Postings_dao"%>
<%@page import="com.pmse.dao.Location_dao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.pmse.dao.User_dao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.pmse.util.Process"%>
<%@page import="com.pmse.dao.Search_dao"%><html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>PMSE</title>
<meta name="keywords" content="Cafe and Bakery, Free CSS Template, Pink, Black" />
<meta name="description" content="Cafe and Bakery is a free CSS template using pink gradient and black colors." />
<link href="<%=request.getContextPath()%>/templatemo_style.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/coda-slider1.css" type="text/css" charset="utf-8" />



<script type="text/javascript">
function createlightbox()
{
    document.getElementById('light').style.display='block';
    document.getElementById('fade').style.display='block'
}
function closelightbox()
{
    document.getElementById('light').style.display='none';
    document.getElementById('fade').style.display='none'
}
</script>
<style type="text/css">
#black_overlay{
			display: none;
			position: absolute;
			top: 0%;
			left: 0%;
			width: 90%;
			height: 90%;
			background-color: black;
			z-index:1001;
			-moz-opacity: 0.5;
			opacity:.50;
			filter: alpha(opacity=50);
		}
      
		.white_content
		 {
			display: block;
			position: absolute;
			top: 35%;
			left: 15%;
			width: 400px;;
			height: 50%;
			padding: 0px;
			  border:1px solid white;
			 margin: 0 auto;
           background:black;
            border: 1px solid rgba(147, 184, 189,0.8);
            -webkit-box-shadow: 0pt 2px 5px rgba(105, 108, 109,  0.7),	0px 0px 8px 5px rgba(208, 223, 226, 0.4) inset;
               -moz-box-shadow: 0pt 2px 5px rgba(105, 108, 109,  0.7),	0px 0px 8px 5px rgba(208, 223, 226, 0.4) inset;
                    box-shadow: 0pt 2px 5px rgba(105, 108, 109,  0.7),	0px 0px 8px 5px rgba(208, 223, 226, 0.4) inset;
            -webkit-box-shadow: 10px;
            -moz-border-radius: 10px;
                 border-radius: 10px;
                 opacity:1;
			z-index:1002;
			overflow: auto;
		}
	/* For the "inset" look only */
.scrollbar
{
	margin-left: 30px;
	float: left;
	height: 330px;
	width: 480px;
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
</head>
<body background="<%=request.getContextPath()%>/images/templatemo_body1.jpg">
<div id="slider">

	<div id="templatemo_wrapper">
	
		<%!
		String temp=null;
		String search_no=null;
		ResultSet rs=null;
	%>
		
        
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
            </div> <!-- end of side bar -->
             <%
                    	String uname=(String)session.getAttribute("uname");
             
                    String uid=(String)session.getAttribute("uid");
                    
                    String time=(String)session.getAttribute("Time");
                    
                    ArrayList<String>list=User_dao.getUserdet(uid);
                    %>
                    
                    <div style="position: relative;top: 50px;left: 300px;">
                    <h1>Time taken :<%=time%></h1>
                    </div>
                    
                     <div id="templatemo_content">
              <div class="scroll">
            <div class="scrollContainer">
           <div class="panel" id="search">
                     <form action="<%=request.getContextPath()%>/PersonalSearch" method="post">
                    <h2>Search</h2>
        			<input type="text" name="keyword" class="easyui-validatebox" required="required"   onblur="validatesearchkey(this);"  ></input>
                     	<input type="submit" value="Submit"></input>	
                      </form>
                    <br></br>
                       <div class="scrollbar" id="style-1">
                      <%
                     
                      temp=(String)request.getAttribute("temp");
                      search_no=(String)request.getAttribute("search_no");
                      if(temp=="yes")
                      {
                    	ResultSet rset=Search_dao.getResult();
                     while(rset.next())
                        {	
                        %>
                     	 <div class="post_box" >
                            <h2><a href = "<%=request.getContextPath()%>/PersonalSearch?code=<%=rset.getInt(1)%>&search_no=<%=search_no %>" ><%=rset.getString(2)%></a></h2>
                            <img src="Image/<%=rset.getString(4)%>" class="image_wrapper" alt="Image 2" style="width: 100px;height: 70px;"/>
                            <p><span class="cat">Location in <span class="loc"><%=rset.getString(5)%></span></p>
                            <p><%=rset.getString(3)%></p>
                            <div class="cleaner1"></div>
                             </div>        
                      <%}
                      }
                      	
                      %>
                        </div>
                        
                    </div> <!-- end of search -->
      
				<%
			
				
					 rs=(ResultSet)request.getAttribute("rs");
				
				
				if(rs!=null)
				{%>	
				  
				  <div  class="white_content" id="light"> 
				
					<a href = "javascript:void(0)"  style="position:absolute;top:15px;left:360px;" onclick="closelightbox()"><img src="<%=request.getContextPath()%>/images/close.gif" alt="" /></a>
					<%while(rs.next())
					{%>  
					 
						 <div class="post_box" style="position:absolute;top:20px;left:22px;width: 360px;">
						 <h2><a href = "#" ><%=rs.getString(2)%></a></h2>
						 <img src="Image/<%=rs.getString(4)%>" class="image_wrapper" alt="Image 2" style="width: 100px;height: 70px;"/>
                         <p style="width: 350px;"><span class="cat">Location in <span class="loc"><%=rs.getString(5)%></span></p>
                         <p style="width: 350px;"><%=rs.getString(3)%></p>
                         <div class="cleaner"></div> 
                           
                            
				  <%}}%>
				   </div>   
			 </div>
		
			<div id="fade" class="black_overlay"></div>
           
                    </div>
           </div>
            </div>
            <div class="cleaner"></div>
        </div> <!-- end of main -->
    
    	
       
    </div> <!-- end of wrapper -->
</div>

</body>

<%
	if(Utility.parse(request.getParameter("no"))==3)
	{
%>
		<div class="info" id="message" style="position:absolute;top:421px;left:11px">	
			<script type="text/javascript">
				
				
				alert("Invalid keyword!!");</script>
		</div>	
		<%	
} %>	
</html>