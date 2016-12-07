function initMap() {
  var km0 = {lat: 51.477412, lng: -0.481296};
  var km1 = {lat: 51.477573, lng: -0.467992};
  var km2 = {lat: 51.477733, lng: -0.455632};
  var km3 = {lat: 51.477679, lng: -0.440698};
  var km4 = {lat: 51.476290, lng: -0.433402};
  var km5 = {lat: 51.475969, lng: -0.440354};
  var km6 = {lat: 51.476022, lng: -0.449882};
  var km7 = {lat: 51.475862, lng: -0.461297};
  var km8 = {lat: 51.475808, lng: -0.475888};
  
  var km9 = {lat: 51.466719, lng: -0.447478};
  var km10 = {lat: 51.466719, lng: -0.458207};
  var km11 = {lat: 51.466826, lng: -0.472713};
  var km12 = {lat: 51.465490, lng: -0.487647};
  var km13 = {lat: 51.464795, lng: -0.478206};
  var km14 = {lat: 51.464901, lng: -0.466962};
  var km15 = {lat: 51.464901, lng: -0.453315};
  var km16 = {lat: 51.464955, lng: -0.440097};
  
  var map = new google.maps.Map(document.getElementById('map'), {
    zoom: 14,
    center: {lat: 51.470022, lng: -0.454295},
    mapTypeId: google.maps.MapTypeId.SATELLITE
  });

  var flightPlanCoordinates = [
	  {lat: 51.477412, lng: -0.481296},
	  {lat: 51.477573, lng: -0.467992},
	  {lat: 51.477733, lng: -0.455632},
	  {lat: 51.477679, lng: -0.440698},
	  {lat: 51.477236, lng: -0.433584},
	  {lat: 51.476902, lng: -0.433069},
	  {lat: 51.476822, lng: -0.434035},
	  {lat: 51.476568, lng: -0.434507},
	  {lat: 51.476328, lng: -0.435001},
	  {lat: 51.476020, lng: -0.435516},
	  {lat: 51.476290, lng: -0.433402},
	  {lat: 51.475969, lng: -0.440354},
	  {lat: 51.476022, lng: -0.449882},
	  {lat: 51.475862, lng: -0.461297},
	  {lat: 51.475808, lng: -0.475888},
  ];
  
  var flightPlanCoordinates2 = [
	  {lat: 51.466719, lng: -0.447478},
	  {lat: 51.466719, lng: -0.458207},
	  {lat: 51.466826, lng: -0.472713},
	  {lat: 51.465490, lng: -0.487647},
	  {lat: 51.464795, lng: -0.478206},
	  {lat: 51.464901, lng: -0.466962},
	  {lat: 51.464901, lng: -0.453315},
	  {lat: 51.464955, lng: -0.440097}
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
  });
  
  /*var poligon = new google.maps.Polygon({
	  paths: flightPlanCoordinates,
	  strokeColor: '#FF0000',
	  strokeOpacity: 0.8,
	  strokeWeight: 2,
	  fillColor: '#FF0000',
	  fillOpacity: 0.35
  });*/
  

 flightPath.setMap(map);
 flightPath2.setMap(map);
 //poligon.setMap(map);
}