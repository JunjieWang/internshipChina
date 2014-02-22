
function hide(obj, itself) {
	
	if (document.getElementById(obj).style.display == "none" ) {
		document.getElementById(itself).className += " entry-expand";	
	} else {
		document.getElementById(itself).className = "joblist-line";
	}
	
	$( '#'+obj ).toggle( "slow", function () {
	  
	} );
	
}
