<%@taglib  prefix="s" uri="/struts-tags" %>

	<section class="well well-md">
		<s:iterator value="airplane">
			<img alt="Airplane photo" class="img-rounded" src="https://thumbs.dreamstime.com/t/handelspassagierflugzeug-whrend-des-fluges-67048953.jpg"><hr>
			<label>Serial : </label>
				<s:property value="serialNumb"/><br>
			<label>Airline : </label>
				<s:property value="name"/><hr>
		</s:iterator>
		
		<s:iterator value="flight">
			<table class="table table-hover">
				<tr>
					<th>Departure Airport</th>
					<th></th>
					<th>Arrival Airport</th>
				</tr>
				<tr>
					<td><s:property value="departAirport.name"/></td>
					<td><img src="<s:url value="/img/airplane.png"/>"/></td>
					<td><s:property value="arriveAirport.name"/></td>
				</tr>
			</table>																																	
		</s:iterator>
		
		<table class="table table-hover">
		<s:iterator value="flight">
			<thead class="thead-inverse">
				<tr>
					<th style="text-align:center;">Departure</th>
					<th style="text-align:center;">Arrival</th>
				</tr>
			</thead>
			<tr>
				<td><s:property value="departureDate"/></td>
				<td><s:property value="arrivalDate"/></td>
			</tr>
			</s:iterator>
		</table><hr>
		
		<s:iterator value="flight">
			<label>Departure Terminal : </label>
				<s:property value="departureTerminal"/><br>
			<label>Departure Gate : </label>
				<s:property value="departureGate"/><br>
			<label>Arrival Terminal : </label>
				<s:property value="arrivalTerminal"/><br>
			<label>Arrival Gate : </label>
				<s:property value="arrivalTerminal"/><br><hr>
		</s:iterator>		
	</section>