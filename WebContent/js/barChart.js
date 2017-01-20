	var dataset=[];
	var labs=[]; 
	var dataa=[];

	function datuakKargatu(){ 

		d3.csv("data/dataBarChart.csv", function(data){

			labs=[]; 
	 		dataa=[];


	 		 dataset = data.map(function(d) {
	 		  return [ d["label"], +d["value"] ];
	 		   });

	 		 for(var kont=0; kont<dataset.length; kont++){
		   		labs.push(dataset[kont][0]);
		   		console.log(labs[kont]);
		   		dataa.push(dataset[kont][1]);
		   		console.log(dataa[kont]);   	
			  }
			  grafikuaMarraztu();
		});
		
	}

	function grafikuaMarraztu(){
		/*var randomColorFactor = function() {
	            return Math.round(Math.random() * 255);
	        };*/
	    var color = function(opacity) {
	        return 'rgb(129, 34, 34, 0.91)';
	    };


	    var config = {
	            type: 'bar',
	            data: {
	                labels: labs,
	                datasets: [{
	                	label: 'Departures: Within 15 minutes of schedule',
	                	data: dataa,
	                    labelFontSize: 16,
	    				backgroundColor: "rgba(129, 34, 34, 0.91)"
	                }]
	            },
	            options: {
	                responsive: true,
	                datasets: [{
	                	label:'Departures: Within 15 minutes of schedule'
	                }],
	               hover: {
	                    mode: 'dataset'
	                },
	                scales: {
	                    xAxes: [{
	                        display: true,
	                        scaleLabel: {
	                            display: true,
	                            labelString: 'Year'
	                        }
	                    }],
	                    yAxes: [{
	                        display: true,
	                        scaleLabel: {
	                            display: true,
	                            labelString: 'Number of departures in %'
	                        },
	                        ticks: {
	                            beginAtZero: true,
	                        }
	                    }]
	                }
	            }
	        };


		var ctx = document.getElementById('myChart').getContext('2d');
		window.myLine = new Chart(ctx, config);
	}
