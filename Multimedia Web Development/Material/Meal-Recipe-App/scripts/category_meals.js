//JS script to fetch data asynchronously

//retrieve category name stored using localStorage
let catName = localStorage.getItem("Category")
console.log(catName);

//define the url from which to fetch data
let url = "https://www.themealdb.com/api/json/v1/1/filter.php?c=" + catName;


//define dynamic h1 heading
let div_h1 = document.getElementById("h1");

let h1 = document.createElement("h1")
h1.innerHTML = "Meals in the " + catName + " Category"

div_h1.appendChild(h1)

//define the function to fetch and display the data.
//incorporate error handling
//using async..await framework: function has to be an async function

async function fetchCategoryMeals(){
	try{
		//wait for the response from the fetch() Api
		let response = await fetch(url);
		
		//catch any errors that arise if the response is not ok
		if(!response.ok){
			throw "error getting data from the MealDB API";
		}
		//response is ok
		//convert respose text to JSON object using json() method
		let arrCatMeals = await response.json();
		
		//check if the data has been retrieved
		console.log(arrCatMeals);
		
		//process the data and display it in the form of a table
		//ref display table
		let table = document.getElementById("tbl")
		//strip "meals" wrapper around array of JSON Objects
		let arrCategoryMeals = arrCatMeals["meals"];
		//use a loop to work through the array of json objects and display category name, thumb image, and category description
		for(let i=0; i<arrCategoryMeals.length; i++){
			
			let tr = document.createElement("tr");
			
			let td1 = document.createElement("td");
			let td2 = document.createElement("td");
			//let td3 = document.createElement("td");
			let img = document.createElement("img");
			img.style.width ="80px";
			img.style.height = "50px";
			
			let link_caption = document.createTextNode(arrCategoryMeals[i].strMeal)
			
			let a = document.createElement("a");
			
			//set the id attribute for the anchor
			a.setAttribute("id",arrCategoryMeals[i].idMeal)
			
			a.appendChild(link_caption);
			a.href = "meal-recipe.html";
			//attach image to img Element
			img.src = arrCategoryMeals[i].strMealThumb
			//insert the text from the json objects into the tds
			//td2 = document.createTextNode(arrMealCategories[i].strCategory)
			//append anchor to td2
			td2.appendChild(a)
			td1.appendChild(img)
			//td3 = document.createTextNode(arrMealCategories[i].strCategoryDescription)
			

			//append tds to the tr
			tr.appendChild(td1);
			tr.appendChild(td2);
			//tr.appendChild(td3);
			
			
			//append the tr to the table
			table.appendChild(tr);
			
		}
		
		
		
		
		
	}
	catch(e){
		console.log(e);
	}
}

//call the funtion
fetchCategoryMeals()

//use localStorage to store mealID for whatever meal the user clicks
$(document).on('click',"a", function(){
	localStorage.setItem("mealID",$(this).attr("id"))
})


