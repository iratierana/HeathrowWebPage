function loadBarChart(){

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
