<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>More Information Page</title>
  
  <link rel="shortcut icon" href="<s:url value="/img/pageIcon.png"/>">
  <!-- D3 -->
  <!--<script type="text/javascript" src="<s:url value="/d3/d3.js"/>"></script>-->
  <script type="text/javascript" src="<s:url value="/d3/d3pie.min.js"/>"></script>
  
  <!-- CHART js -->
  <script type="text/javascript" src="<s:url value="/chart/Chart.js"/>"></script>
  
  <!-- BOOTSTRAP -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
  <script type="text/javascript" src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
  
  <!-- CSS -->
  <link rel="stylesheet" type="text/css" href="<s:url value="/css/moreInfo.css"/>">
  <link rel="stylesheet" type="text/css" href="<s:url value="/c3/c3.css"/>">
  
  <!-- JS -->
  <script type="text/javascript" src="<s:url value="/js/pieChartInteractive.js"/>"></script>
  <script type="text/javascript" src="<s:url value="/js/barChart.js"/>"></script>
  <script type="text/javascript" src="<s:url value="/js/moreInfo.js"/>"></script>
  <script type="text/javascript" src="<s:url value="/js/pieChart.js"/>"></script>
  <script type="text/javascript" src="<s:url value="/js/bubbleChart.js"/>"></script>
  
  <!-- C3 library -->
  <script type="text/javascript" src="<s:url value="https://d3js.org/d3.v3.min.js"/>"></script>
  <script type="text/javascript" src="<s:url value="/c3/c3.min.js"/>"></script>
  
  <!-- D3 pie -->
  <script src="//cdnjs.cloudflare.com/ajax/libs/d3/3.4.4/d3.min.js"></script>
  
  <!-- HIGHCHARTS libraries -->
  <script src="https://code.highcharts.com/highcharts.js"></script>
  <script src="https://code.highcharts.com/highcharts-more.js"></script>
  <script src="https://code.highcharts.com/modules/exporting.js"></script>
  
</head>

<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
     	 <a class="navbar-brand" style="font-weight:bold;">Heathrow Airport Information</a>
    </div>
    <ul class="nav navbar-nav">
      <li>
      	<a href="#" onclick="setArticle('pie-chart')" id="pieChart-nav">Passengers</a>
      </li>
      <li>
      	<a href="#" onclick="setArticle('bar-chart')" id="barChart-nav">Departures</a>
      </li>
      <li>
      	<a href="#" onclick="setArticle('histogram')" id="histogram-nav">Passenger volume by terminal</a>
      </li>
      <li>
      	<a href="#" onclick="setArticle('all-graphs')" id="all-nav">All info</a>
      </li>
    </ul>
    	<ul class="nav navbar-nav navbar-right">
    	<s:form action="firstAction" method="post">
      		<s:submit type="button" class="btn btn-default glyphicon glyphicon-log-in" style="margin-top:5px; margin-right:5px;">Login</s:submit>
      	</s:form>
    	</ul>
  </div>
</nav>

<section>
	<article id="pie-chart">
		<h2>Different passengers in Heathrow airport during 2015</h2>		
		<div id="pieChartInteractive" class="chartClass">
    		<script type="text/javascript">
    			loadInteractivePieChart();
    		</script>
  		</div>
		<p class="parag">The following graph shows us the different passengers who have passed from Heathrow airport during 2015.
		The different data is displayed in percentages in a pie chart, being user-friendly. Entering deeply those are the ones who passed from the airport:<br>
		- International passengers = 69.8 million<br>
		- Domestic passengers = 5.1 million<br>
		- Businness passengers = 27 million<br>
		- Leisure passengers = 48 million<br>
		- Transfer passengers = 24 million
		</p>
		
	</article>
	
	<article id="bar-chart" class="hideme">
		<h2>Departures</h2>
		<h3>Within 15 minutes of schedule</h3>
		<p class="parafBar" style="margin-top:30px;">The following graph shows the evolution of the number of departures (in percentages) that had been in Heathrow airport (London) since 2007,
		taking into account 15 minutes of the scheduled time. </p>
		<div  style="width:850px;" class="barChart">
      		<canvas id="myChart"></canvas>
    	<script type="text/javascript">
    		loadBarChart();
    	</script>
  		</div>
		
	</article>
	
	<article id=histogram class="hideme">
		<h2>Passenger volume by terminal (millions) in 2015</h2>
		<!-- <div id="pieChart" class="chartClass" style="max-height:350px;">
    		<script type="text/javascript">
    			loadPieChart();
    		</script>
  		</div>
  		<p>asfasdfasdfasdfsdfasfaxfsdfsaasdfdsf</p>-->
  		
  		<div id="bubbleChart" style="height: 400px; min-width: 650px; max-width: 600px; margin: 0 auto">
  			<script type="text/javascript">
  				loadBubbleChart();
  			</script>
  		</div>
  		
  		<p class="parag">In this bubble chart is shown the passenger volume by terminals (in millions) during 2015.
  		As we can see there, each terminal takes some values that fix with the passengers and the number of flights.</p>
		
	</article>

</section>

</body>
</html>