//do while loop for motivational quotes

//array of motivational quotes
var arrMotivation = new Array("The Way Get Started Is To Quit Talking And Begin Doing. - Walt Disney",
"The Pessimist Sees Difficulty In Every Opportunity. The Optimist Sees Opportunity In Every Difficulty.- Winston Churchill",
"Don't Let Yesterday Take Up Too Much Of Today. - Will Rogers",
"You Learn More From Failure Than From Success. Don't Let It Stop You. Failure Builds Character. - Unknown",
"It's Not Whether You Get Knocked Down, It's Whether You Get Up. - Vince Lombardi",
"If You Are Working On Something That You Really Care About, You Don't Have To Be Pushed. The Vision Pulls You. - Steve Jobs",
"People Who Are Crazy Enough To Think They Can Change The World, Are The Ones Who Do. - Rob Siltanen",
"Failure Will Never Overtake Me If My Determination To Succeed Is Strong Enough. - Og Mandino",
"Entrepreneurs Are Great At Dealing With Uncertainty And Also Very Good At Minimizing Risk. That's The Classic Entrepreneur. - Mohnish Pabrai",
"We May Encounter Many Defeats But We Must Not Be Defeated. - Maya Angelou");

//define function to generate random integers

function genRandInt(min, max){
	return Math.floor(Math.random()*(max-min))
}

//define a function to display quotes at random
//ref display para
let display = document.getElementById('mQuotes');
function displayQuotes(){

//generate 3 random and unique integers

let indx1, indx2, indx3;

let min =0;
let max = arrMotivation.length;

do {
	indx1 = genRandInt(min,max);
	indx2 = genRandInt(min,max);
	indx3 = genRandInt(min,max);
}
//if any of the indices are the same, we need to generate a new index until they are unique
while(indx1==indx2||indx1==indx3||indx2==indx3)

	//display the 3 quotes, one per line
	display.innerHTML = arrMotivation[indx1] +"<br>"
	display.innerHTML += arrMotivation[indx2] +"<br>"
	display.innerHTML += arrMotivation[indx3] 

}

//call function
//use setInterval function to execute the function after every 5 seconds
setInterval(displayQuotes,5000)
