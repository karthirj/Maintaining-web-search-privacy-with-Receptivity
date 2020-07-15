function getMap()
{
	var geocoder = new google.maps.Geocoder();
	var address = document.getElementById("address").value;
	
	
	
	if(address.length==0)
	{
		alert("Please,Enter the Location  " );
	}
	else
	{
		var geo = new google.maps.Geocoder;
		geo.geocode({'address':address},function(results, status){
		    if (status == google.maps.GeocoderStatus.OK) 
		    {              
		        var myLatLng = results[0].geometry.location;
		        //alert("LatLng : " +myLatLng);
		        var latitude = results[0].geometry.location.lat();
		        var longitude = results[0].geometry.location.lng();
	            //alert("Lat : " +latitude+"\nLog : " + longitude);
	          
	        	initialize(latitude,longitude);
	        	//alert("Hello...");
	        	createlightbox();
		    }
		    else
		    {
		        alert("Geocode was not successful for the following reason: " + status);
		    }
		});
		
	}
	
	
	
	return false;
}
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

//Displaying The Map	
var map;
function initialize(lat,lng)
{
    //var lat = 12.931288;
    //var lng = 77.587582;
    
    var myCenter=new google.maps.LatLng(lat,lng);
	
    var mapProp = 
    {
 		 center:myCenter,
 		 //zoom:5,
  		 zoom:12,
  		 mapTypeId:google.maps.MapTypeId.ROADMAP
  	};

	var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);

//	var marker=new google.maps.Marker({position:myCenter,});
//	marker.setMap(map);
	 google.maps.event.addListener(map, 'click', function(event)
			  {
			    placeMarker(event.latLng);
			  });
}


function placeMarker(location) 
{
	  var marker = new google.maps.Marker({
	    position: location,
	    map: map,
		});
 
	  var infowindow = new google.maps.InfoWindow(
	  {
	    	content: 'Latitude: ' + location.lat() + '<br>Longitude: ' + location.lng()
	  });
 	 infowindow.open(map,marker);
 	 
 	 //Setting The Latitude and Longitude Value in Input Field
 	 document.getElementById("x").value = location.lat();
 	 document.getElementById("y").value = location.lng();
 	
}