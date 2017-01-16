function loadInteractivePieChart(){
	
var pie = new d3pie("pieChartInteractive", {
	"header": {
		"title": {
			"text": "Passengers in 2015",
			"fontSize": 24.8,
			"font": "courier",
			"font-weight": "bold"
		},
		"subtitle": {
			"text": "Percentages of different passengers in 2015.",
			"color": "#000000",
			"fontSize": 9.52,
			"font": "courier"
		},
		"location": "pie-center",
		"titleSubtitlePadding": 10
	},
	"size": {
		"canvasWidth": 630,
		"pieInnerRadius": "88%",
		"pieOuterRadius": "70%"
	},
	"data": {
		"sortOrder": "label-desc",
		"content": [
			{
				"label": "International passengers",
				"value": 69800000,
				"color": "#FC0303"
			},
			{
				"label": "Domestic passengers",
				"value": 5100000,
				"color": "#0328FC"
			},
			{
				"label": "Business passengers",
				"value": 27000000,
				"color": "#03FC2C"
			},
			{
				"label": "Leisure passengers",
				"value": 48000000,
				"color": "#FCF403"
			},
			{
				"label": "Transfer passengers",
				"value": 24000000,
				"color": "#FC6703"
			}
		]
	},
	"labels": {
		"outer": {
			"format": "label-percentage1",
			"pieDistance": 20
		},
		"inner": {
			"format": "none"
		},
		"mainLabel": {
			"fontSize": 13
		},
		"percentage": {
			"color": "#000000",
			"fontSize": 13,
			"decimalPlaces": 0
		},
		"value": {
			"color": "#cccc43",
			"fontWeight": "bold",
			"fontSize": 13
		},
		"lines": {
			"enabled": true,
			"color": "#777777"
		},
		"truncation": {
			"enabled": true
		}
	},
	"effects": {
		"pullOutSegmentOnClick": {
			"effect": "linear",
			"speed": 400,
			"size": 10
		}
	},
	"misc": {
		"colors": {
			"segmentStroke": "#000000"
		}
	}
});
}