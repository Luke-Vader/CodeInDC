//Basic JS Array Methods

const dirtyDozen = ["Apple",
					  "Peach",
					  "Nectarine",
					  "Strawberry",
					  "Grape",
					  "Celery",
					  "Spinach",
					  "Cucumber",
					  "Snap peas"]
					  
//add an element at the beginning of the array: use unshift() method
//say, add Blueberry at the begiining of the array
dirtyDozen.unshift("Blueberry")
//display the elements of the Array
let display = document.getElementById("arr_start")
for (val of dirtyDozen){
display.innerHTML += `${val} <br>`
}


//add element at the end of the array: use push() method
//add raspberry at the end of the array

dirtyDozen.push("Raspberry")
//display the elements of the Array
//use the forEach() function
//syntax of forEach(): obj.forEach(function(item,idex,array),cuval){})
let display1 = document.getElementById("arr_end")
dirtyDozen.forEach(function(item,indx){
display1.innerHTML += indx+1 + ".&nbsp;&nbsp;"+item +"<br>"
})

//Another way to add an element at the of the array (wothout using push() method)
//Add Plum at the end
dirtyDozen[dirtyDozen.length] = "Plum"

//Adding element in the middle of the Array: use splice() method: arr.splice(index,num_to_remove, listToAdd)
//add Potatoe and Lemon in the third Position
dirtyDozen.splice(2,0,"Potatoe","Lemon")
let display2 = document.getElementById("arr_mid")
dirtyDozen.forEach(function(item,indx){
display2.innerHTML += indx+1 + ".&nbsp;&nbsp;"+item +"<br>"
})

//Removing elements at the middle of the Array: splic() method
//remove Potatoe and Lemon

dirtyDozen.splice(2,2)

let display3 = document.getElementById("arr_mid_re")
//sort the Array: use sort() method
dirtyDozen.forEach(function(item,indx){
display3.innerHTML += indx+1 + ".&nbsp;&nbsp;"+item +"<br>"
})

//removing at the beginning of the array: use shift() method
//sort the array first, then remove the first Element
dirtyDozen.sort()
dirtyDozen.shift()
let display4 = document.getElementById("arr_start_re")
//sort the Array: use sort() method
dirtyDozen.forEach(function(item,indx){
display4.innerHTML += indx+1 + ".&nbsp;&nbsp;"+item +"<br>"
})

//removing at the end of the array: use pop() method
dirtyDozen.pop()
let display5 = document.getElementById("arr_end_re")

dirtyDozen.forEach(function(item,indx){
display5.innerHTML += indx+1 + ".&nbsp;&nbsp;"+item +"<br>"
})

//coppy snap peas and spinach to the veges array: use slice() method: syntax: obj.slice(start_indx, end_indx)
let veges = dirtyDozen.slice(8)
//alert(veges)

//Higher Order functions: reduce() function - enables us to get the sum of values

let groceryShoppingCart = [
{productTitle: "Milk", amount: 5.95},
{productTitle: "Dozen of eggs", amount: 12.95},
{productTitle: "Salmon", amount: 20.00},
{productTitle: "Beef", amount: 35.00}
]

/* 
let total =0
for (let i=0; i<groceryShoppingCart.length;i++){
	total += groceryShoppingCart[i].amount
}

*/
//get the sum in customer's shoppping cart
//define function to be passed to the reduce() function
let sumAmt = function(curTotAmt,item){
	return (curTotAmt + item.amount)
}

let sumAmt = (curTotAmt,item) => curTotAmt + item.amount
//call the reduce() function to get the shopping cart total
let total=groceryShoppingCart.reduce(sumAmt,0)
alert(total)

//const AmzShoppingCart = []
//defining objects
const canBig6 = {ON: "Ontario", QC: "Quebec", BC: "British Columbia", AB: "Alberta", MB: "Manitoba", SK: "Saskatchewan"}

//display the Canadian provinces in the form of a table, with first column being province code, and second column being province name



