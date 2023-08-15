//JS Arrays

//Declaring arrays in JS

//1) Literal approach: array object identifier: []
//e.g., let myArr = [];

const dirtyDozen = ["Strawberies", "Spinach", "Kale, collard and mustard greens", "Nectarines", "Apples", "Grapes", "Bell and hot peppers", "Cherries", "Peaches", "Pears", "Celery", "Tomatoes"]

//2) object-oriented approach (using a constructor): new Constructorname()
const dirtyDozen1 = new Array("Strawberies", "Spinach", "Kale, collard and mustard greens", "Nectarines", "Apples", "Grapes", "Bell and hot peppers", "Cherries", "Peaches", "Pears", "Celery", "Tomatoes")

//2.1 empty without size
const fruits = new Array()

//2.2 empty with size
const fruits1 = new Array(12)

//alert(fruits)

//Array Methods
//1) push(): adds an element at the end of the array
fruits.push("Apple","Pineapple")
//alert(fruits)

//Equivalent to push(): use subscript
fruits[fruits.length] = "Kiwi"
alert(fruits)

//2) unshift(): adds an element at the begging of the Array
//add blueberry at the beginning
fruits.unshift("Blueberry")
//alert(fruits)

//3) splice(): adds elements in the middle of the array
//add Orange between Apple and Pineapple
fruits.splice(2,0,"Orange")
//alert(fruits)



