"use strict";

// *
//  * Write your solutions here.
// Problems
// Define a function named isANumber that takes in a value and returns true if the input is numeric or not. Numeric strings are not considered as numbers and should return false.
function isANumber(input) {
    if (typeof input === "number") {
        return true;
    }
    return false;
}
//
// isANumber(23)               // true
// isANumber("42")             // false
// isANumber(3.141)            // true
// isANumber("")               // false
// isANumber(true)             // false
// isANumber("Bob")            // false
// isANumber([1,2,3])          // false
// Define a function named increment that takes in an input and adds 1 to it if the input is numeric.
// If the input is not numeric, then return false.
//

function increment(input) {
    var str = String(input);
    // console.log(str)
    var num = Number(str);
    if (!isNaN(num)) {
        return ++num;
    }
    return false;
}

// increment(0)                // 1
// increment("10")             // 11
// increment(-5)               // -4
// increment("Bob")            // false
// increment([1, 2, 3])        // false
// increment(true)             // false
// increment(null)             // false
// Define a function named decrement. If the provided input is numeric,
// the function should subtract 1 and return the result.
// If the input is not numeric, decrement should return false.
//

function decrement (input) {
    console.log(input);
    var str = String(input);
    // console.log(str)
    var num = Number(str);
    if (!isNaN(num)) {
        // --num; tried lots of ways to nail down decrement functionality. returning num-- would not work because, as remembered,
        // returns num, then never executes -- due to exiting statement => --num is required
        return --num;
    }
    return false;
}
// decrement(19)               // 18
// decrement(0)                // -1
// decrement("4")              // 3
// decrement("Bob")            // false
// decrement([1, 2, 3])        // false
// decrement(false)            // false
// decrement(null)             // false
// Write a function named getHighestNumber that takes in 3 arguments.
// If all 3 inputs are numbers or numeric strings, then return the highest number.
// If any of the 3 inputs is missing or non-numeric, then return false.
//

function getHighestNumber(in1, in2, in3) {
    var num1 = String(in1);
    var num2 = String(in2);
    var num3 = String(in3);
    num1 = Number(num1);
    num2 = Number(num2);
    num3 = Number(num3);
    if (!isNaN(num1) && !isNaN(num2) && !isNaN(num3)) {
        var arr = [num1, num2, num3];
        // what in the ... what am I thinking?! LOL
        // arr = arr.push(num1);
        // arr = arr.push(num2);
        // arr = arr.push(num3);
        arr = arr.sort();
        return arr[2];
    }
    return false;
}

// getHighestNumber(1, 3, 2)           // 3
// getHighestNumber(0, 1, "2")         // 2
// getHighestNumber(9, 3, -20)         // 9
// getHighestNumber(2, 2, 2)           // 2
// getHighestNumber(2, 5, 5)           // 5
// getHighestNumber(1, 2, 'x')         // false
// getHighestNumber("a", "b")          // false
// getHighestNumber()                  // false
// Define a function named parseNumber that parses (converts) a numeric String and returns it's value as a number,
// the function should be able to decide if it should be parsing an Integer or a Float value.
//
function parseNumber(input) {
    if (Number.isInteger(input)) {
        return parseInt(input);
    }
    // if (!Number.isInteger(input))
    // if (input.includes(".")) {
    //     return parseFloat(input);
    else {
        return parseFloat(input);
    }
}

//     }
//     else if (typeof input === "string") {
//         for (var i = 0; i < input.length; i++) {
//             if (input[i] === ".") {
//                 var parsedAndFloat = parseFloat(input);
//                 if (typeof parsedAndFloat === "number") {
//                     return parsedAndFloat;
//                 }
//             }
//             else {
//                 var parsedAndInt = parseInt(input);
//                 if (typeof parsedAndInt === "number") {
//                     return parsedAndInt;
//                 }
//             }
//         }
//
//     }
//     var numberfied = (input)
//     if (typeof numberfied === "number") {
//
//
//     }
// }
// parseNumber("123")            // 123
// parseNumber(123)              // 123
// parseNumber("34.4")           // 34.4
// parseNumber(10.5)             // 10.5
// parseNumber("-2")             // -2
// parseNumber("-10.4")          // -10.4
// Write a function named add that takes in two inputs. If both inputs provided are numeric,
// add will return the sum of both inputs. If one or both inputs is not numeric, add should return false.
//
function add(in1, in2) {
    var num1 = String(in1);
    var num2 = String(in2);
    num1 = Number(num1);
    num2 = Number(num2);
    if (!isNaN(num1) && !isNaN(num2)) {
        return num1 + num2;
    }
    return false;
}

// add(1, 2)                   // 3
// add(0, 0)                   // 0
// add(-5, 10)                 // 5
// add("2", 4)                 // 6
// add(5, true)                // false
// add(true, false)            // false
// add("Monday", "Tuesday")    // false
// add(null)                   // false
// Write a function named multiply that takes in two inputs.
// If both inputs provided are numeric, multiply returns the product of the first input multiplied by the second.
// If either or both inputs are not numeric, multiply should return false.
//

function multiply(in1, in2) {
    var num1 = String(in1);
    var num2 = String(in2);
    num1 = Number(num1);
    num2 = Number(num2);
    if (!isNaN(num1) && !isNaN(num2)) {
        return num1 * num2;
    }
    return false;
}

// multiply(4, 2)              // 8
// multiply(0, 44)             // 0
// multiply(-5, 10)            // -50
// multiply(5, true)           // false
// multiply(true, false)       // false
// multiply("Monday")          // false


// Define a function named square. If the provided input is numeric,
// square should return the number multiplied by itself.
// If the input is not numeric, square, should return false.
//
function square(input) {
    var str = String(input);
    console.log(str)
    var num = Number(str);
    if(!isNaN(num)) {
        return num * num;
    }
    return false;
}


// square(2)                   // 4
// square(3)                   // 9
// square(-4)                  // 16
// square("5")                 // 25
// square(0.5)                 // .25
// square("Bob")               // false
// square(true)                // false
// square(false)               // false
// square(null)                // false
// square([1, 2, 3])           // false
// square()                    // false
// Write a function named sumOfSquares that takes in two inputs.
// If both inputs are numeric, sumOfSquares should square each input
// and return the sum of them added together.
// For example, if we pass a and b then we should square a and add it to the square of b.
// If either or both inputs are not numeric, sumOfSquares should return false.
//
function sumOfSquares(in1, in2) {
    var num1 = String(in1);
    var num2 = String(in2);
    num1 = Number(num1);
    num2 = Number(num2);
    if (!isNaN(num1) && !isNaN(num2)) {
        return num1 * num1 + num2 * num2;
    //    NOTE: learned javascript maintains order of operations in a return statement making parenthesis unnecessary
        //    for math operations
    }
    return false;
}
// sumOfSquares(2, 3)          // 13
// sumOfSquares(1, 0)          // 1
// sumOfSquares("4", 5)        // 41
// sumOfSquares(2, false)      // false
// sumOfSquares(null)          // false
// sumOfSquares()              // false
// Write a function named isPalindrome that takes in a single input.
// If the input is a numeric string, then return false.
// If the input is a string, then return true if the string is the same forwards as it is backwards.
// Return false if the string is different forwards from backwards. Ignore capitalization.
//

function isPalindrome(input) {
    // var isNumber = Number(String(input));
    // if (isNaN(isNumber)) {
    //     return false;
    // }
    // if (typeof input === "object" || typeof input === "array" || typeof input === "boolean" || typeof input == "number") {
    //     return false;
    // }
    // var rev = input.
    if (typeof (input) !== "string") {
        // || (!(input.toLowerCase === input.toLowerCase().split("").reverse().join()))) {
        return false;
    }

    //  NOTE: .join() requires a ""  .join("") to create a string from array elements because default seperator is ","
    else if (input.toLowerCase() === ((input.toLowerCase().split("").reverse().join("")))) {
        return true;
    }
    else {
        return false;
    }
}

//         var str = input.toLowerCase();
//         var rev = str.split("").reverse().join();
//         if (str === rev) {
//             return true;
//         }
//     }
//     return false;
// }

// isPalindrome("Bob")         // true
// isPalindrome("radar")       // true
// isPalindrome("ufotofu")     // true
// isPalindrome("Monday")      // false
// isPalindrome(232)           // false
// isPalindrome(null)          // false
//  *
//  *
//  * **Note**: While normally it is good practice to wrap your javascript in an
//  * immediately invoked function expression (iife), you should _not_ do that
//  * here. If you do, the automated tests will not be able to see your functions.
//
