function loadBubbleChart(){

$(function () {
    Highcharts.chart('bubbleChart', {

        chart: {
            type: 'bubble',
            plotBorderWidth: 1,
            zoomType: 'xy'
        },

        legend: {
            enabled: false
        },

        title: {
            text: 'Passenger volume by terminal (millions) in 2015'
        },

        /*subtitle: {
            text: ''
        },*/

        xAxis: {
            gridLineWidth: 1,
            title: {
                text: 'Flights'
            },
            /*labels: {
                format: '{value} gr'
            },*/
            plotLines: [{
                color: 'black',
                dashStyle: 'dot',
                width: 2,
                value: 65,
                /*label: {
                    rotation: 0,
                    y: 15,
                    style: {
                        fontStyle: 'italic'
                    },
                    text: 'Safe fat intake 65g/day'
                },*/
                zIndex: 3
            }]
        },

        yAxis: {
            startOnTick: false,
            endOnTick: false,
            title: {
                text: 'Passengers'
            },
            /*labels: {
                format: '{value} gr'
            },*/
            maxPadding: 0.2,
            plotLines: [{
                color: 'black',
                dashStyle: 'dot',
                width: 2,
                value: 50,
                /*label: {
                    align: 'right',
                    style: {
                        fontStyle: 'italic'
                    },
                    text: 'Safe sugar intake 50g/day',
                    x: -10
                },*/
                zIndex: 3
            }]
        },

        tooltip: {
            useHTML: true,
            headerFormat: '<table>',
            pointFormat: '<tr><th colspan="2"><h3>{point.terminal}</h3></th></tr>' +
                '<tr><th>Number of Flights:</th><td>{point.x}g</td></tr>' +
                '<tr><th>Number of passengers</th><td>{point.y}g</td></tr>' +
                '<tr><th>Obesity (adults):</th><td>{point.z}%</td></tr>',
            footerFormat: '</table>',
            followPointer: true
        },

        plotOptions: {
            series: {
                dataLabels: {
                    enabled: true,
                    format: '{point.name}'
                }
            }
        },

        series: [{
            data: [
                { x: 116861, y: 16700000, z: 16.7, name: 'Terminal 1', country: 'Terminal 1' },
                { x: 76974, y: 15200000, z: 15.2, name: 'Terminal 2', country: 'Terminal 2' },
                { x: 53357, y: 9200000, z: 9.2, name: 'Terminal 3', country: 'Terminal 3' },
                { x: 215716, y: 33100000, z: 33.1, name: 'Terminal 4', country: 'Terminal 4' }
            ]
        }]

    });
});
}