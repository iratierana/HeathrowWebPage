function paintHistogram() {

	var ctx = document.getElementById('myChart').getContext('2d');


				var myChart = new Chart(ctx, {
					type: 'line',
					data: {
						labels: ['2010', '2011', '2012', '2013', '2014','2015'],
						datasets: [{
							label: 'Annual number of passengers in Heathrow Airport',
							data: [65881660,69433230,70037417,72367054,73405330,74985748],
							backgroundColor: "rgba(200,255,100,0.4)"
						}]
					}
				});

  }