var isColdOutside = true;



function isCold(jacket) {
    if (jacket === true) {
        return "you'll need a jacket";
    }
    else {
        return;
    }
}

isCold(isColdOutside);

// write a function which adds two numbers and returns the sum

function addTwoNumbers() {
    var num1 = prompt("Enter the first number to be added");
    var num2 = prompt("Enter the second number");
    var total = num1 + num2;
    console.log("The total is " + total);
    return total;
}