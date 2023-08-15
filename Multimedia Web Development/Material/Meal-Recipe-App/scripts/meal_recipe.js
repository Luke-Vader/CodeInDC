//JS script to fetch data asynchronously

//retrieve category name stored using localStorage
let mealID = localStorage.getItem("mealID")
console.log(mealID);

//define the url from which to fetch data
let url = "https://www.themealdb.com/api/json/v1/1/lookup.php?i=" + mealID;



async function fetchMealRecipe(){
	try{
		//wait for the response from the fetch() Api
		let response = await fetch(url);
		
		//catch any errors that arise if the response is not ok
		if(!response.ok){
			throw "error getting data from the MealDB API";
		}
		//response is ok
		//convert respose text to JSON object using json() method
		let arrMealRecipe = await response.json();
		
		//check if the data has been retrieved
		console.log(arrMealRecipe);
		
		//strip "meals" and 0 ref
		let result = arrMealRecipe["meals"][0];
		
		//ref html elements
		let h2 = document.getElementById("h21");
		let div = document.getElementById("img");
		let para = document.getElementById("result");
		let table = document.getElementById("tbl1");
		let h3 = document.getElementById("head3");
		let ptext = document.getElementById("ptext");
		
	//loop through the items and display the info
	//use the for...in loop (returns index or property name, which we can use to retrieve property value)
	for (let prop in result) {
		/*check that the result has this property and that the property name is equal to strMeal. If so, attach it to the Recipe title
		*/if((result[prop]!="")&&(prop=="strMeal")){
		let h2txt = document.createTextNode(result[prop] + " Recipe from the MealDB API")
		//append text to h2
		h2.appendChild(h2txt)
			}
			
	
	}
			//Image
	let img = document.createElement("img")
	img.src = result["strMealThumb"]
	//attach image to the div	
	div.appendChild(img)

	//create to arrays to store values
	let arrIngredients = [];
	let arrMeasures = [];
	
	//loop for ingredients/measures
	for (let prop1 in result){
		if((result[prop1]!="") && (result[prop1]!=null) && prop1.includes("Ingredient")){
			//add ingredient to the array
			arrIngredients.push(result[prop1])
		}
		
		if((result[prop1]!="") && prop1.includes("Measure")){
			//add measure to the array
			arrMeasures.push(result[prop1])
		}	
		
	}
	
	//display the ingredients are their corresponding measures
	//use for loop
	for (let j=0; j<arrIngredients.length; j++){
		let tr = document.createElement('tr');
		let td1 = document.createElement('td');
		let td2 = document.createElement('td');
		
		//create textnodes
		let txt1 = document.createTextNode(arrIngredients[j]);
		let txt2 = document.createTextNode(arrMeasures[j]);
		//append text to tds
		td1.appendChild(txt1)
		td2.appendChild(txt2)
		
		//append the tds to tr
		tr.appendChild(td1)
		tr.appendChild(td2)
		
		//append tr to table
		table.appendChild(tr)
	}
	
	//display cooking instructions
	//use for...in loop
	for (prop2 in result){
		//check that it is not empty and contains "Instructions"; if so, display th instructions
		if((result[prop2]!="") && prop2.includes("Instructions")){
			//create textNode containing instructions
			let txtInstruct = document.createTextNode(result[prop2])
			//append instructions to paragraph (ptext)
			ptext.appendChild(txtInstruct)
		}
	}		
			
	}
	catch(e){
		console.log(e);
	}
}

//call the funtion
fetchMealRecipe()