function darkMode(x) {
	var element1 = document.body;
	element1.classList.toggle("dark-mode");
	x.classList.toggle("fa-moon-o");
	
	var element2 = document.getElementById("kbd");
	if (element2.innerText == "Click icon for Light Mode") {
		element2.innerText = "Click icon for Dark Mode";
	  } else {
		  element2.innerHTML = "<bold>Click icon for Light Mode</bold>";
	  }
	
	var element3 = document.getElementById("countriesStats");
	element3.classList.remove("table-striped");
	element3.classList.remove("table-hover");
}

function applyColors(){
	var table = document.getElementById( 'countriesStats' );
	rows = table.getElementsByTagName( 'tr' );

	for( var i=rows.length; i--; ) {
		if (rows[i].cells[2].innerText > 0) {
			var x = rows[i].cells[2].innerText;
			rows[i].cells[2].innerHTML = "<mark class='casesToday'>"+x+"</mark>";
		}
		if (rows[i].cells[4].innerText > 0) {
			var x = rows[i].cells[4].innerText;
			rows[i].cells[4].innerHTML = "<mark class='deathsToday'>"+x+"</mark>";
		}
		if (rows[i].cells[0].innerText == 'India') {
			rows[i].style.backgroundColor = "#a6a6a6";
			rows[i].style.fontWeight = "bold";
			
		}
	}
}

$(document).ready(function(){
	
	$("#countryInput").on("keyup", function() {
	    var value = $(this).val().toLowerCase();
	    $(".countriesTable tr").filter(function() {
	      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
	    });
	  });
});