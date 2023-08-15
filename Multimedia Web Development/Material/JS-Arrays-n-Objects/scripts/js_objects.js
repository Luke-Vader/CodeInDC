//JS Objects

//defining objects
const canBig6 = {ON: "Ontario", QC: "Quebec", BC: "British Columbia", AB: "Alberta", MB: "Manitoba", SK: "Saskatchewan"}

console.log(canBig6)

let arrObCan6 = Object.entries(canBig6)
console.log(arrObCan6)
//display the Canadian provinces in the form of a table, with first column being province code, and second column being province name

//ref table
let table = document.getElementById("tbl")
//loop through the Object using a loop that returns keys

for (key in canBig6){
	//create the tds and tr
	let td1 = document.createElement("td")
	let td2 = document.createElement("td")
	let tr = document.createElement("tr")
	
	txt1 = document.createTextNode(key)
	txt2 = document.createTextNode(canBig6[key])
	
	//append the textnodes to the tds
	td1.appendChild(txt1)
	td2.appendChild(txt2)
	
	//append the tds to the tr
	tr.appendChild(td1)
	tr.appendChild(td2)
	
	//append the tr to the table
	table.appendChild(tr)
	
	
})