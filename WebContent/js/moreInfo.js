const articleIds = ["pie-chart","bar-chart","histogram"];
const navIds = ["pieChart-nav","barChart-nav","histogram-nav","all-nav"];

function setArticle(articleId){
	var currentNavSet = false;
	var i;
	
	//Change the content of the page
	for(i=0;i<articleIds.length;i++){
		//Hide-unhide articles
		article = document.getElementById(articleIds[i]);
		if(articleId == "all-graphs" || articleId == articleIds[i]){
			//remove hideme class to the element
			article.className = "";
		}else{
			//add hideme class to the element
			article.className = "hideme";
		}
		
		// Change the style of the "current" nav item
		navElement = document.getElementById(navIds[i]);
		if(articleId == articleIds[i]){
			navElement.className = "current-nav";
			currentNavSet = true;
		}else{
			navElement.className = "";
		}
	}
	//This is the 4th nav item
	navElement = document.getElementById(navIds[i]);
	if(!currentNavSet){
		// 4th element is the current one
		navElement.className = "current-nav";
	}else{
		// 4th element is not the current one
		navElement.className = "";
	}
}