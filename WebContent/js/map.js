var map;
var marker;
var markerInMapArray = [];
var infoWindow;

var rectangle_takeOffLane;
var rectangle_landingLane;

var socket = io.connect("http://localhost:9092");


function initMap() {
	  
	var marker1 = {lat: 51.470791, lng: -0.481360};
	var marker2 = {lat: 51.471218, lng: -0.476253};
	var marker3 = {lat: 51.471111, lng: -0.462992};
	var marker4 = {lat: 51.471245, lng: -0.443079};
	
  map = new google.maps.Map(document.getElementById('map'), {
    zoom: 14,
    center: {lat: 51.470982, lng: -0.464773},
    mapTypeId: google.maps.MapTypeId.ROADMAP
  });
  
  
  
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
	 

 rectangle_landingLane_green.setMap(map);
 rectangle_takeOffLane_green.setMap(map);
 rectangle_terminal4.setMap(map);
 rectangle_terminal3.setMap(map);
 rectangle_terminal2.setMap(map);
 rectangle_terminal1.setMap(map); 
 
 rectangle_terminal4.addListener('click', showInformationTerminal4);
 rectangle_terminal3.addListener('click', showInformationTerminal3);
 rectangle_terminal2.addListener('click', showInformationTerminal2);
 rectangle_terminal1.addListener('click', showInformationTerminal1);

}

function showInformationTerminal4(event) {
	 
	  //var vertices = this.getPath();

	  var contentString = '<b>Terminal 4</b><br>' +
	      'Clicked location: <br>' + event.latLng.lat() + ',' + event.latLng.lng() +
	      '<br>' + '<li> It has 6 aircraft parkings';

	  // Replace the info window's content and position.
	  infoWindow.setContent(contentString);
	  infoWindow.setPosition(event.latLng);

	  infoWindow.open(map);
}

function showInformationTerminal3(event) {
	 
	  //var vertices = this.getPath();

	  var contentString = '<b>Terminal 3</b><br>' +
	      'Clicked location: <br>' + event.latLng.lat() + ',' + event.latLng.lng() +
	      '<br>' + '<li> It has 6 aircraft parkings';

	  // Replace the info window's content and position.
	  infoWindow.setContent(contentString);
	  infoWindow.setPosition(event.latLng);

	  infoWindow.open(map);
}

function showInformationTerminal2(event) {
	 
	  //var vertices = this.getPath();

	  var contentString = '<b>Terminal 2</b><br>' +
	      'Clicked location: <br>' + event.latLng.lat() + ',' + event.latLng.lng() +
	      '<br>' + '<li> It has 6 aircraft parkings';

	  // Replace the info window's content and position.
	  infoWindow.setContent(contentString);
	  infoWindow.setPosition(event.latLng);

	  infoWindow.open(map);
}

function showInformationTerminal1(event) {
	 
	  //var vertices = this.getPath();

	  var contentString = '<b>Terminal 1</b><br>' +
	      'Clicked location: <br>' + event.latLng.lat() + ',' + event.latLng.lng() +
	      '<br>' + '<li> It has 6 aircraft parkings';

	  // Replace the info window's content and position.
	  infoWindow.setContent(contentString);
	  infoWindow.setPosition(event.latLng);

	  infoWindow.open(map);
}

$(document).ready(
	    function() {

	        socket.on("database_change", function(jsonData) {

	            var data = JSON.parse(jsonData);
	            var position = mapPosition(data.airplaneid ,data.planeposition_planepositionid);
	            
		          marker = new google.maps.Marker({
		              position:{lat: position[0], lng: position[1]},
		              map:map,
		              icon:"/HeathrowWebPage/img/airplane.png",
		              draggable:false,
		              label:  {
		            	  color: '#FFFFFF',	              
		            	  text: data.airplaneid.toString(),
		              }
		          });
		          removeMarkers();
		          removeMarkerFromArray(marker);		          
		          insertMarkerInArray(marker);		          
		          paintArrayMarkersInMap();
		          
		          changeColourLandingLane(position[0], position[1]);
		          changeColourTakeOffLane(position[0], position[1]);
	            
		          console.log(data.planeposition_planepositionid +"==41");
		          if(data.planeposition_planepositionid == 41){
		        	  marker.setMap(null);
		          }
	        });

	    }


	);


function paintArrayMarkersInMap(){
	for(var i=0; i < Object.keys(markerInMapArray).length; i++){
    	markerInMapArray[i].setMap(map);
    	console.log('Paint= '+markerInMapArray[i]);
    }
}

function removeMarkers(){
    for(i=0; i < Object.keys(markerInMapArray).length; i++){
    	markerInMapArray[i].setMap(null);
    	console.log('Remove= '+markerInMapArray[i]);
    }
}

function insertMarkerInArray(marker){
	markerInMapArray.push(marker);
}

function removeMarkerFromArray(marker){
	var i = 0;
	for(var m in markerInMapArray){		
		var a = markerInMapArray[m].label.text;
		var b = marker.label.text;
		if(a == b){			
			markerInMapArray.splice(i,1);
		}
		i++;
	}
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
	 if((latt.localeCompare('51.464848') == 0) && (lonn.localeCompare('-0.459924') == 0)){
		 rectangle_takeOffLane_green.setMap(null);
    	 rectangle_takeOffLane_red.setMap(map);
    }else{
    	 rectangle_takeOffLane_green.setMap(map);
    	 rectangle_takeOffLane_red.setMap(null);
    }
}
