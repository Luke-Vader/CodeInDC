//JS File for Tabbled Panel

/* create a function to add and remove "current" class to/from both the tab links and tab content */

//should be a function with event parameter to enable us to track which element triggered the event

function addRemoveClass(evt){
	
	//ref active tabs (both tab link and tab content)
	let active_tabs = document.getElementsByClassName("current")
	//let active_tabs = document.querySelectorAll(".current")
	//loop through the active tabs and remove the class "current"
	//use for...of loop (no need for counter)
	let i=0
	while(i<active_tabs.length) {
		active_tabs[i].className = active_tabs[i].className.replace("current", "")
		i++
	}
	//Add class "current" to the clicked tab link and the related tab content
	
	//ref the clicked tab Link (element that triggered click event)
	//use event.target to get the element that triggered the Event
	let anchor = evt.target
	console.log(anchor)
	
	//use the parentElement to ref the li where the class "current" will be added
	let tab_link = anchor.parentElement	
	console.log(tab_link)
	
	//add the class "current" to clicked tab link
	tab_link.className += " current"
	
	//append class "current" to the associated tab content of the click tab link
	
	//extract the tab_id from the url of each clicked tab link (i.e., last 5 characters of the url)
	//use the substring() method
	let url = anchor.href
	console.log(url)
	
	let tab_id = url.substring(url.length-5)
	console.log(tab_id)
	
	//add class "current" to the asssociated tab-content of the clicked tab link

	let el = document.getElementById(tab_id)
	if(tab_id !="tab-1"){
		let first_tab = document.getElementById("tab-1")
	first_tab.className = first_tab.className.replace("current","") 
	}
	el.className += " current"
	
	console.log(el)	
	}


//call function using eventListener method
//ref the ul Element
let tab_ul = document.getElementById("ul_tab_nav")
tab_ul.addEventListener("click",addRemoveClass,false)

//ref the tablinks
/*let tab_links = document.querySelectorAll(".tab-links")
 for (link in tab_links){
 	link.addEventLister("click",addRemoveClass,false)
 }
*/

