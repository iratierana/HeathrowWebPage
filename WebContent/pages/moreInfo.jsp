<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>More Information Page</title>
  <script type="text/javascript" src="<s:url value="/d3/d3.js"/>"></script>
  <script type="text/javascript" src="<s:url value="/d3/d3pie.min.js"/>"></script>
  <script type="text/javascript" src="<s:url value="/chart/Chart.js"/>"></script>
  <link rel="shortcut icon" href="<s:url value="/img/pageIcon.png"/>">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
  <script type="text/javascript" src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
  <link rel="stylesheet" type="text/css" href="<s:url value="/css/moreInfo.css"/>">
  <script type="text/javascript" src="<s:url value="/js/pieChartInteractive.js"/>"></script>
  <script type="text/javascript" src="<s:url value="/js/barChart.js"/>"></script>
  <script src="//cdnjs.cloudflare.com/ajax/libs/d3/3.4.4/d3.min.js"></script>
  <script type="text/javascript" src="<s:url value="/js/moreInfo.js"/>"></script>
</head>

<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
     	 <a class="navbar-brand" style="font-weight:bold;">Heathrow Airport Information</a>
    </div>
    <ul class="nav navbar-nav">
      <li>
      	<a href="#" onclick="setArticle('pie-chart')" id="pieChart-nav">Pie Chart</a>
      </li>
      <li>
      	<a href="#" onclick="setArticle('bar-chart')" id="barChart-nav">Bar Chart</a>
      </li>
      <li>
      	<a href="#" onclick="setArticle('histogram')" id="histogram-nav">Histogram</a>
      </li>
      <li>
      	<a href="#" onclick="setArticle('all-graphs')" id="all-nav">All</a>
      </li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>

<section>
	<article id="pie-chart">
		<h2>Pie Chart Graph</h2>
		<div id="pieChart" class="chartClass">
    		<script type="text/javascript">
    			loadInteractivePieChart();
    		</script>
  		</div>
		<p>In Heathrow airport ,....... </p>
	</article>
	
	<article id="bar-chart" class="hideme">
		<h2>Bar Chart Graph</h2>
		<div class="barChart">
      		<canvas id="myChart"></canvas>
    	<script type="text/javascript">
    		loadBarChart();
    	</script>
  		</div>
		<p>In Heathrow airport ,....... </p>
	</article>
	
	<article id="histogram" class="hideme">
		<h2>Histogram Graph</h2>
		<p>In Heathrow airport ,....... </p>
	</article>

</section>

</body>
</html>