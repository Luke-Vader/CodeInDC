// Author: Rishabh Banerjee
// Date: 11/7/2023
// Objective: To print Good Evening after 10s of page load

console.log("Hello World");

let display = document.getElementById("display");

let ctr = 0;
while (ctr < 10) {
	display.innerHTML += `${ctr}s elapsed<br>`;
	ctr++;
}
console.log("Good Evening");
display.innerHTML += "Good Evening";
