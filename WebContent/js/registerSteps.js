function goToStep1(){
	
	var pb1 = document.getElementById("pb1"); var fielset1 = document.getElementById("step1");
	var pb2 = document.getElementById("pb2"); var fielset2 = document.getElementById("step2");
	var pb3 = document.getElementById("pb3"); var fielset3 = document.getElementById("step3");
	
	pb1.className="active";
	pb2.className="";
	pb3.className="";
	fielset1.className = "";
	fielset2.className = "hideme";
	fielset3.className = "hideme";
}
function goToStep2(){
	
	var pb1 = document.getElementById("pb1"); var fielset1 = document.getElementById("step1");
	var pb2 = document.getElementById("pb2"); var fielset2 = document.getElementById("step2");
	var pb3 = document.getElementById("pb3"); var fielset3 = document.getElementById("step3");
	
	pb1.className="";
	pb2.className="active";
	pb3.className="";
	fielset1.className = "hideme";
	fielset2.className = "";
	fielset3.className = "hideme";
}


function goToStep3(){
	
	var pb1 = document.getElementById("pb1"); var fielset1 = document.getElementById("step1");
	var pb2 = document.getElementById("pb2"); var fielset2 = document.getElementById("step2");
	var pb3 = document.getElementById("pb3"); var fielset3 = document.getElementById("step3");
	
	pb1.className="";
	pb2.className="";
	pb3.className="active";
	fielset1.className = "hideme";
	fielset2.className = "hideme";
	fielset3.className = "";
}