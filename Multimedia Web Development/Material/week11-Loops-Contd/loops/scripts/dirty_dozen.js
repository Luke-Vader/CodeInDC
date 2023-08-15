//for...of loop

//array
const dirtyDozen = ["Strawberies", "Spinach", "Kale, collard and mustard greens", "Nectarines", "Apples", "Grapes", "Bell and hot peppers", "Cherries", "Peaches", "Pears", "Celery", "Tomatoes"]

//ref display para
let output1 = document.getElementById("output");
//console.log(output1)

//for...of loop to display values of the array one per line
function displayDirtyDozen(){
for(val of dirtyDozen){
	console.log(val)
	output1.innerHTML = val + "<br>";
}
}

//call function
displayDirtyDozen()