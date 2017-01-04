var map;
var marker = [];

var rectangle_takeOffLane;
var rectangle_landingLane;

function initMap() {
	  
	var marker1 = {lat: 51.470791, lng: -0.481360};
	var marker2 = {lat: 51.471218, lng: -0.476253};
	var marker3 = {lat: 51.471111, lng: -0.462992};
	var marker4 = {lat: 51.471245, lng: -0.443079};
	
  map = new google.maps.Map(document.getElementById('map'), {
    zoom: 14,
    center: {lat: 51.471959, lng: -0.450397},
    mapTypeId: google.maps.MapTypeId.ROADMAP
  });
  

  /*var flightPlanCoordinates = [
	  {lat: 51.477527, lng: -0.482090},
	  {lat: 51.477580, lng: -0.477798},
	  {lat: 51.477580, lng: -0.473936},
	  {lat: 51.477553, lng: -0.468700},
	  {lat: 51.477580, lng: -0.464580},
	  {lat: 51.477660, lng: -0.459645},
	  {lat: 51.477687, lng: -0.454881},
	  {lat: 51.477607, lng: -0.448315},
	  {lat: 51.477740, lng: -0.442135},
	  {lat: 51.477687, lng: -0.437114},
	  {lat: 51.477634, lng: -0.434196},
	  {lat: 51.477223, lng: -0.433885},
	  {lat: 51.476916, lng: -0.433949},
	  {lat: 51.476515, lng: -0.434700},
	  {lat: 51.476167, lng: -0.435301},
	  {lat: 51.475873, lng: -0.436009},
	  {lat: 51.475913, lng: -0.437533}, 
	  {lat: 51.475913, lng: -0.439056},
	  {lat: 51.475953, lng: -0.441095},
	  {lat: 51.475967, lng: -0.442768},
	  {lat: 51.476007, lng: -0.444506},
	  {lat: 51.475953, lng: -0.447210},
	  {lat: 51.476020, lng: -0.449163},
	  {lat: 51.475967, lng: -0.451781},
	  {lat: 51.475940, lng: -0.454549},
	  {lat: 51.475950, lng: -0.460503},
	  {lat: 51.475896, lng: -0.467842},
	  {lat: 51.475789, lng: -0.477927}
  ];
  
  var flightPlanCoordinates2 = [
	  {lat: 51.466567, lng: -0.445998},
	  {lat: 51.466647, lng: -0.452349},
	  {lat: 51.466620, lng: -0.457928},
	  {lat: 51.466567, lng: -0.463464},
	  {lat: 51.466567, lng: -0.469558},
	  {lat: 51.466486, lng: -0.475223},
	  {lat: 51.466540, lng: -0.480373},
	  {lat: 51.466513, lng: -0.485094},
	  {lat: 51.466433, lng: -0.487282},
	  {lat: 51.465898, lng: -0.487669},
	  {lat: 51.465444, lng: -0.487797},
	  {lat: 51.464775, lng: -0.487454},
	  {lat: 51.464722, lng: -0.486596},
	  {lat: 51.464775, lng: -0.482519},
	  {lat: 51.464775, lng: -0.475910},
	  {lat: 51.464802, lng: -0.469644},
	  {lat: 51.464829, lng: -0.462177},
	  {lat: 51.464882, lng: -0.455911},
	  {lat: 51.464962, lng: -0.448358},
	  {lat: 51.464909, lng: -0.440419},
	  {lat: 51.464882, lng: -0.435183}
  ];
  
  var flightPath = new google.maps.Polyline({
    path: flightPlanCoordinates,
    geodesic: true,
    strokeColor: '#FF0000',
    strokeOpacity: 1.0,
    strokeWeight: 2
  });
  
  var flightPath2 = new google.maps.Polyline({
	    path: flightPlanCoordinates2,
	    geodesic: true,
	    strokeColor: '#FF0000',
	    strokeOpacity: 1.0,
	    strokeWeight: 2
  });*/
  
  var bounds_landingLane = {
		north: 51.478039,
		south: 51.477237,
		east: -0.433170,
		west: -0.485012
  };
  
  var bounds_takeOffLane = {
	   north: 51.465208,
	   south: 51.464513,
	   east: -0.434072,
	   west: -0.487072
  };
  
  var bounds_terminal4 = {
		north: 51.474159,
		south: 51.468090,
		east: -0.479257,
	    west: -0.483034
  };
  
  var bounds_terminal3 = {
		north: 51.474292,
		south: 51.468090,
		east: -0.474279,
		west: -0.477970
  };
  
  var bounds_terminal2 = {
		north: 51.474693,
		south: 51.468224,
		east: -0.458915,
		west: -0.466726
  };
  
  var bounds_terminal1 = {
		north: 51.474479,
		south: 51.468037,
		east: -0.441020,
		west: -0.445311
  };
  
   rectangle_takeOffLane_green = new google.maps.Rectangle({
	  fillColor: '#00FF00',
	  strokeWeight: 0,
	  bounds: bounds_takeOffLane,
	  editable: false,
	  draggable: false,
  })
   
   rectangle_takeOffLane_red = new google.maps.Rectangle({
		  fillColor: '#FF0000',
		  strokeWeight: 0,
		  bounds: bounds_takeOffLane,
		  editable: false,
		  draggable: false,
	  })
  
   rectangle_landingLane_green = new google.maps.Rectangle({
	  strokeWeight: 0,
	  fillColor: '#00FF00',
	  bounds: bounds_landingLane,
	  editable: false,
	  draggable: false,
  })
   
   rectangle_landingLane_red = new google.maps.Rectangle({
		  strokeWeight: 0,
		  fillColor: '#FF0000',
		  bounds: bounds_landingLane,
		  editable: false,
		  draggable: false,
	  })
  
  var rectangle_terminal4 = new google.maps.Rectangle({
	   bounds: bounds_terminal4,
	   strokeWeight: 0,
	   editable:false,
	   draggable:false
	  });
  
  var rectangle_terminal3 = new google.maps.Rectangle({
	   bounds: bounds_terminal3,
	   strokeWeight: 0,
	   editable:false,
	   draggable:false
	  });
  
  var rectangle_terminal2 = new google.maps.Rectangle({
	   bounds: bounds_terminal2,
	   strokeWeight: 0,
	   editable:false,
	   draggable:false
	  });
 
  var rectangle_terminal1 = new google.maps.Rectangle({
	   bounds: bounds_terminal1,
	   strokeWeight: 0,
	   editable:false,
	   draggable:false
	  });
  

  

 /*flightPath.setMap(map);
 flightPath2.setMap(map);*/
 rectangle_landingLane_green.setMap(map);
 rectangle_takeOffLane_green.setMap(map);
 rectangle_terminal4.setMap(map);
 rectangle_terminal3.setMap(map);
 rectangle_terminal2.setMap(map);
 rectangle_terminal1.setMap(map);
 reloadMap();
}

function reloadMap() {
	
			  
	    d3.csv("../data/planeMarkerData.csv", function(data){
	    	
	    	for(var kont=0; kont<marker.length;kont++){
	    		marker[kont].setMap(null);
	    	}
	        data.forEach(function(d, i){        	
	            d['lat'] = +d['lat'];
	            d['long'] = +d['lon'];
	            marker[i] = new google.maps.Marker({
	                position:{lat: d['lat'], lng: d['long']},
	                map:map,
	                icon:'../img/mapIcons/airplane_m.png',
	                draggable:false,
	                title: d['id']	                
	            });
	            marker[i].setMap(map);
	            changeColourLandingLane(d['lat'], d['long']);
	            changeColourTakeOffLane(d['lat'], d['long']);
	        }) 	      
 	    });
	    
	  
	  
	  setTimeout("reloadMap()", 2000);
	}


function changeColourLandingLane(lat,lon){
	var latt=lat+'';
	var lonn=lon+'';
	 if((latt.localeCompare('51.477626') == 0) && (lonn.localeCompare('-0.457006') == 0)){
    	 rectangle_landingLane_green.setMap(null);
    	 rectangle_landingLane_red.setMap(map);
    }else{
    	rectangle_landingLane_green.setMap(map);
    	 rectangle_landingLane_red.setMap(null);
    }
}

function changeColourTakeOffLane(lat,lon){
	var latt=lat+'';
	var lonn=lon+'';
	console.log("lat: " +lat);
	console.log("lon:" + lon);
	 if((latt.localeCompare('51.464848') == 0) && (lonn.localeCompare('-0.459924') == 0)){
		 rectangle_takeOffLane_green.setMap(null);
    	 rectangle_takeOffLane_red.setMap(map);
    	 console.log("mapa gorri");
    }else{
    	 rectangle_takeOffLane_green.setMap(map);
    	 rectangle_takeOffLane_red.setMap(null);
    	 console.log("mapa berde");
    }
}
