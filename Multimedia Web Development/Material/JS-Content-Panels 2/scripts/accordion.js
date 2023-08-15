//accordion JS File

//define function to toggle icons ("+" and "-")
function toggleIcons(el,className1, className2){
	//use toggle() method
	el.classList.toggle(className1)
	el.classList.toggle(className2)
}

//ref panel div
let container = document.getElementsByClassName("container")

//for loop to work through the content panels collection
for(let i=0; i<container.length; i++){
	container[i].addEventListener("click", function(){
		//toggle the "+" and the "-"
		//define variables for the icons
		let plus_icon = "fa-plus"
		let minus_icon = "fa-minus"
		
		//expand and collapse the panels (class called "active" defined in the css file)
		
		this.classList.toggle("active");
		
		//define the element whose icons are going to be toggled
		let el = this.children[0].children[0]
		
		//call the toggle icons method
		toggleIcons(el,plus_icon,minus_icon)
		})
}







