//firebase configurations for the project
import { initializeApp } from "https://www.gstatic.com/firebasejs/10.1.0/firebase-app.js";
import { getAnalytics } from "https://www.gstatic.com/firebasejs/10.1.0/firebase-analytics.js";
import { getFirestore } from "https://www.gstatic.com/firebasejs/10.1.0/firebase-firestore.js";
import {
	getAuth,
	createUserWithEmailAndPassword,
	signInWithEmailAndPassword,
	onAuthStateChanged,
	updateProfile,
} from "https://www.gstatic.com/firebasejs/10.1.0/firebase-auth.js";

const firebaseConfig = {
	apiKey: "AIzaSyCihFlCkJxVAtj1gpkr3fa-yI_Rea_mwhs",
	authDomain: "board-6406c.firebaseapp.com",
	databaseURL: "https://board-6406c-default-rtdb.firebaseio.com",
	projectId: "board-6406c",
	storageBucket: "board-6406c.appspot.com",
	messagingSenderId: "64154231773",
	appId: "1:64154231773:web:529105d6863b32763d8c34",
	measurementId: "G-MR7BR84GQ0",
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);
const db = getFirestore(app);
const firebaseAuth = getAuth(app);

if (document.body.className.includes("index")) {
	initialiseDateAndTime();
}

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

	document.getElementById("greeting").innerHTML = welcome.toString();
	document.getElementById("date").innerHTML = formatDate.toString();

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

switch (document.body.className) {
	case "login":
		document
			.getElementById("login_user")
			.addEventListener("click", authenticateUser);
		break;
	case "registration":
		document
			.getElementById("register_user")
			.addEventListener("click", registerUser);
		break;
}

//login user to save data
function authenticateUser() {
	const loginForm = document.getElementById("loginForm");

	//user input from the form
	const email = loginForm["login__email"].value.trim();
	const password = loginForm["login__password"].value.trim();

	signInWithEmailAndPassword(firebaseAuth, email, password)
		.then((cred) => {
			const user = cred.user;
			console.log("Logged in user: ", user);
		})
		.catch((error) => {
			console.log("error", error);
			console.error(error.message.toString());
			if (
				error.message.toString() == "Firebase: Error (auth/user-not-found)."
			) {
				alert("User not found. Please register to continue");
			}
		});

	console.log("firebaseAuth", firebaseAuth);
}

//register user to save data
function registerUser() {
	document
		.getElementById("register_user")
		.addEventListener("click", registerUser);
	const registerForm = document.getElementById("registerForm");

	console.log("firebaseAuth", firebaseAuth);
	const email = registerForm["reg_mail"].value.trim();
	const password = registerForm["reg_password"].value.trim();
	const name = registerForm["first_name"].value.trim() + " ";
	registerForm["last_name"].value.trim();

	console.log("name", name);
	createUserWithEmailAndPassword(firebaseAuth, email, password)
		.then((cred) => {
			const user = cred.user;
			console.log("Registered user: ", user);
			updateProfile(firebaseAuth.currentUser, { displayName: name })
				.then(() => {
					console.log("Profile registered successfully");
				})
				.catch((error) => {
					console.log("error", error);
					console.error(error);
				});
		})
		.catch((error) => {
			console.error(error);
		});
}

// Login User as they are authenticated
// onAuthStateChanged(firebaseAuth, (user) => {
// 	if (user) {
// 		console.log("user " + user + " logged in");
// 		window.location.href = "./index.html";
// 	}
// });
