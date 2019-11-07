var status = "close";

function openNav() {
	document.getElementById("mySidebar").style.width = "250px";
	document.getElementById("main").style.marginLeft = "250px";
	status = "open"
}

function closeNav() {
	document.getElementById("mySidebar").style.width = "0";
	document.getElementById("main").style.marginLeft = "0";
	status = "close"
}

function toggle() {
	if (status == "close") {
		openNav()
		status = "open"
	} else {
		closeNav()
		status = "close"
	}
}
