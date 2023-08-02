//firebase configurations for the project
const firebaseConfig = {
	apiKey: "AIzaSyCihFlCkJxVAtj1gpkr3fa-yI_Rea_mwhs",
	authDomain: "board-6406c.firebaseapp.com",
	projectId: "board-6406c",
	storageBucket: "board-6406c.appspot.com",
	messagingSenderId: "64154231773",
	appId: "1:64154231773:web:529105d6863b32763d8c34",
	measurementId: "G-MR7BR84GQ0",
};
firebase.initializeApp(firebaseConfig);
// const db = Firebase.firestore();

initialiseDateAndTime();

//method to manage the client system date and time and greet the user accordingly
function initialiseDateAndTime() {
	let date = new Date();
	let formatDate = date.toDateString();

	var welcome;
	var hour = date.getHours();
	var minute = date.getMinutes();
	var second = date.getSeconds();
	if (minute < 10) {
		minute = "0" + minute;
	}
	if (second < 10) {
		second = "0" + second;
	}
	if (hour < 12) {
		welcome = "Good Morning,";
	} else if (hour < 17) {
		welcome = "Good Afternoon,";
	} else {
		welcome = "Good Evening,";
	}

	console.log("welcome", welcome);
	document.getElementById("greeting").innerHTML = welcome.toString();
	document.getElementById("date").innerHTML = formatDate.toString();

	var timeDisplay = document.getElementById("time");

	function refreshTime() {
		var today = new Date();
		var h = today.getHours();
		var m = today.getMinutes();
		var s = today.getSeconds();
		m = checkTime(m);
		s = checkTime(s);
		document.getElementById("time").innerHTML = h + ":" + m + ":" + s + " HRS";
	}

	function checkTime(i) {
		if (i < 10) i = "0" + i; // add zero in front of numbers < 10
		return i;
	}
	setInterval(refreshTime, 1000);
}
