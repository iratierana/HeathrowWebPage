function loadBarChart(){

/*	var width = 100;
	var height = 350;

	d3.csv("data/dataBarChart.csv",function(data){

	var xAsixDomain = ['2007','2015','9M 2015','9M 2016'];

	var separate = width + ((data.length-1)*50);


	var widthScaleX = d3.scale.linear()
					 .domain([0,1278])
					 .range([0,width]);

	var widthScaleY = d3.scale.linear()
					 .domain([0,1278])
					 .range([height,0]);

	var x = d3.scale.ordinal()
				  .domain(xAsixDomain)
				  .rangePoints([0,separate]);

	var asisX = d3.svg.axis()
				  .scale(x)
				  .orient("bottom");

	var axisY = d3.svg.axis()
				  .scale(widthScaleY)
				  .orient("left")
				  .ticks(4);

	var canvas = d3.select("#barChart")		//creamos el espacio para dibujar a continuacion
					  .append("svg")
					  .attr("width",800)
					  .attr("height",500)
					  .append("g")
					  .attr("class", "bar")
					  .attr("transform","translate(50,50)");


	var colorScales = d3.scaleLinear()
					  .domain([0,1278])
					  .range(["green","blue"]);

	var bars = canvas.selectAll("rect")	
			  .data(data)
			  .enter()
			  .append("rect")
			   .transition()
			  .delay(function(d,i){
			  	return i*500;
			  })
			 
			  .transition()
			   .delay(function(d, i) { return i * 500 })
			   .duration(2000)
			  .attr("width",30)
			  .attr("height",function(d){
			  	return height - widthScaleY(d.departures);
			  })
			  .attr("y",function(d){
			  	return widthScaleY(d.departures);
			  })
			  .attr("x",function(d,i){
			  	return i*57;	// bars en arteko separaziñua
			  })
			  .attr("fill","blue");

	canvas.selectAll("text")
		   .data(data)
		   .enter()
		   .append("text")
		   .attr("fill","black")
		   .attr("x",function(d,i){
		   		return i*55 + 10;
		   })
		   .text(function(d){
		   	 return d.departures;
		   })
		   .attr("transform","translate(0,-15)");

	canvas.append("g")
			 .attr("transform","translate(0,350)")
			 .call(asisX);

	canvas.append("g")
			 .call(axisY);

});*/

	var ctx = document.getElementById('myChart').getContext('2d');

	var myChart = new Chart(ctx, {
		type: 'bar',
		data: {
			labels: ['2007', '2015', '9 March 2015', '9 March 2016'],
			datasets: [{
				label: 'Departures: Within 15 minutes of schedule',
				data: [63, 78, 77, 79],
				labelFontSize: 16,
				backgroundColor: "rgba(129, 34, 34, 0.91)"
			}]
		}
	});
}
