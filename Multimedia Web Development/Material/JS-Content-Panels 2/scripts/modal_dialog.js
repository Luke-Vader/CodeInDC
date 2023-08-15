//Modal-dialog JS File
//ref the modal dialog panel

//let modal_dialog = document.getElementsByClassName("modal-content")
let modal_dialog = document.querySelector(".modal-content")

//ref button
let btn = document.getElementById("myBtn")

//add event listener to the button
btn.addEventListener("click", function(){
	//show the dialog content
	modal_dialog.style.visibility = "visible";
	
})

let close = document.getElementsByTagName("span")

//close/remove dialog when close is clicked
close[0].addEventListener("click", function(){
	modal_dialog.style.visibility = "hidden";
})

