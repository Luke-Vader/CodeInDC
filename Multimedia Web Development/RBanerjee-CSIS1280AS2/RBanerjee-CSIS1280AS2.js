// Author: Rishabh Banerjee | 300374594
// Date: 2023-07-04
// Purpose: JavaScript file for Assignment 2

//function to check if the input fields are empty
function CheckForGroupMemberInput() {
	console.log("CheckForGroupMemberInput() called");

	//fetching the values of the input fields
	var memberLastName = document.getElementById("lastname").value;
	var memberFirstName = document.getElementById("firstname").value;

	//checking if the input fields are empty
	if (memberLastName.trim() == "" || memberFirstName.trim() == "")
		throw new Error("Please enter a first and last name for the group member.");
	else return { firstName: memberFirstName, lastName: memberLastName };
}

function CheckForGroupSizeInput() {
	console.log("CheckForGroupSizeInput() called");

	//fetching the value of the input field
	var groupSize = document.getElementById("GroupSize").value;

	//checking if the input field is numeric
	if (isNaN(groupSize))
		throw new Error("Please enter a number for the group size.");
	else return groupSize;
}

function CalcGroupDiscount() {
	console.log("CalcGroupDiscount() called");

	try {
		var groupSize = CheckForGroupSizeInput();
		console.log("groupSize = " + groupSize);

		//calculating the discount
		if (groupSize > 24) {
			rate = 50 - 50 * 0.25;
			console.log("rate = " + rate);
		} else if (groupSize > 10 && groupSize <= 24) {
			rate = 50 - 50 * 0.2;
			console.log("rate = " + rate);
		} else if (groupSize > 4 && groupSize <= 10) {
			rate = 50 - 50 * 0.1;
			console.log("rate = " + rate);
		} else {
			rate = 50;
			console.log("rate = " + rate);
		}

		//displaying the discount rate
		document.getElementById("discRate").value = rate.toFixed(2);
	} catch (e) {
		alert("Error: " + e.message);
	}
}

function AddGroupMember() {
	console.log("AddGroupMember() called");

	const groupList = document.getElementById("members");
	try {
		var member = CheckForGroupMemberInput();
		//adding the group member to the list
		const option = document.createElement("option");
		option.textContent = member.lastName + ", " + member.firstName;

		groupList.appendChild(option);

		//resetting the input fields
		document.getElementById("lastname").value = "";
		document.getElementById("firstname").value = "";

		//setting the focus to the last name input field
		document.getElementById("lastname").focus();

		console.log("member = " + member.firstName + " " + member.lastName);
	} catch (error) {
		alert("Error: " + error.message);
	}
}

function RemoveGroupMember() {
	console.log("RemoveGroupMember() called");
	const groupList = document.getElementById("members");

	//checking if there are any selected group members to delete
	if (groupList.selectedIndex == -1)
		alert("There are no group members to delete!");
	//removing the selected group member from the list
	else groupList.remove(groupList.selectedIndex);
}

function SortGroupMembers() {
	console.log("SortGroupMembers() called");
	const groupList = document.getElementById("members");

	//sorting the group members in alphabetical order
	for (var i = 0; i < groupList.length - 1; i++) {
		for (var j = i + 1; j < groupList.length; j++) {
			if (groupList.options[i].text > groupList.options[j].text) {
				var temp = groupList.options[i].text;
				groupList.options[i].text = groupList.options[j].text;
				groupList.options[j].text = temp;
			}
		}
	}
}

function FlyingBee() {}
