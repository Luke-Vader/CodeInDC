//Author: Rishabh Banerjee
// Date: 11/7/23
// Objective: JS script to calculate the target heart rate for different burn zones

let zones = [
    {
        id: "1",
        explanation: "This zone encourages the flow of blood, which is key to maintaining a healthy heart and improving recovery after difficult workouts."
    },

    {
        id: "2",
        explanation: "At a light intensity, this zone enhances your endurance and increases your body’s ability to use fats and carbohydrates as fuel.",  
    },
    {
        id: "3",
        explanation: "Workouts in this zone help improve your body's aerobic capacity, or the ability to use oxygen. This zone also delays the fatigue caused by lactic acid."
    },
    {
        id: "4",
        explanation: "This zone improves your performance and makes moderate intensity effort easier by improving efficiency. Exercise in this zone is recommended for only short periods of time."
    },
    {
        id: "5",
        explanation: "The maximum zone should be used by experienced athletes only. Short bouts in this high-intensity zone help to develop top-end speed and overall performance."
    },
]

function calcHeartRateZones() {

    const MAX_HR = 220;
    let age = document.getElementById("userAge").value;

    let result = document.getElementById("result");
    console.log(result);
    // result.appendChild();

    output = document.getElementById("result");

    if(document.getElementById("zone1").checked){
        console.log("1");
        output.innerHTML = "<p>Your comfort zone: 1</p>" +
                            "<p>Your target heart rate range: " + 
                            ((MAX_HR - age)*0.5).toFixed(0) + " to " +
                            ((MAX_HR - age)*0.6).toFixed(0) +
                            "</p><p>About zone 1:</p>" + "<p>" +zones[0].explanation + "</p>";


    }else if(document.getElementById("zone2").checked){
        console.log("2");
        output.innerHTML = "<p>Your comfort zone: 2</p>" +
                            "<p>Your target heart rate range: " + 
                            ((MAX_HR - age)*0.6).toFixed(0) + " to " +
                            ((MAX_HR - age)*0.7).toFixed(0) +
                            "</p><p>About zone 2:\n" + "<p>" + zones[1].explanation + "</p>";

    }else if(document.getElementById("zone3").checked){
        console.log("3");
        output.innerHTML = "<p>Your comfort zone: 3</p>" +
                            "<p>Your target heart rate range: " + 
                            ((MAX_HR - age)*0.7).toFixed(0) + " to " +
                            ((MAX_HR - age)*0.8).toFixed(0) +
                            "</p><p>About zone 3:" + "<p>" + zones[2].explanation + "</p>";

    }
    else if(document.getElementById("zone4").checked){
        console.log("4");
        output.innerHTML = "<p>Your comfort zone: 4 </p>" +
                            "<p>Your target heart rate range: " + 
                            ((MAX_HR - age)*0.8).toFixed(0) + " to " +
                            ((MAX_HR - age)*0.9).toFixed(0) +
                            "<p></p>About zone 4:" + "<p>" + zones[3].explanation + "</p>";

    }
    else if(document.getElementById("zone5").checked){
        console.log("5");
        output.innerHTML = "<p>Your comfort zone: 5</p>" +
                            "<p>Your target heart rate range: " + 
                            ((MAX_HR - age)*0.9).toFixed(0) + " to " +
                            ((MAX_HR - age)).toFixed(0) +
                            "</p><p>About zone 5:" + "<p>" + zones[4].explanation + "</p>";

    }
}

function ClearResults() {

    document.getElementById("zone1").reset;
    document.getElementById("zone2").reset;
    document.getElementById("zone3").reset;
    document.getElementById("zone4").reset;
    document.getElementById("zone5").reset;
    document.getElementById("userAge").reset;
    document.getElementById("result").reset;

}