function loadPieChart(){
	var chart = c3.generate({
	    bindto : '#pieChart',
		data: {
	        columns: [
	        	 ['International Passengers', 69800000],
		            ['Domestic Passengers', 5100000],
		            ['Businness Passengers', 27000000],
		            ['Leisure Passengers', 48000000],
		            ['Transfer Passengers', 24000000]
	        ],
	        type : 'pie',
	        onclick: function (d, i) { console.log("onclick", d, i); },
	        onmouseover: function (d, i) { console.log("onmouseover", d, i); },
	        onmouseout: function (d, i) { console.log("onmouseout", d, i); }
	    }
	});

	/*setTimeout(function () {
	    chart.load({
	        columns: [
	            ['International Passengers', 69800000],
	            ['Domestic Passengers', 5100000],
	            ['Businness Passengers', 27000000],
	            ['Leisure Passengers', 48000000],
	            ['Transfer Passengers', 24000000]
	        ]
	    });
	}, 2000);

	/*setTimeout(function () {
	    chart.unload({
	        ids: 'Percentages of different passengers in 2015'
	    });
	}, 1000);*/
}