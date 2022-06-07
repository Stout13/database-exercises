# JavaScript Basics Assessment

## Core competencies assessed

- Reading and following directions
- Producing solutions that match the problem specification
- Using Git and working with GitHub
    - Cloning a git repository from GitHub
    - Creating your own branch
    - Committing and pushing work to a new branch on GitHub

- Programing fundamentals in JavaScript
    - Working with values, variables, and data types
    - Using assignment and comparision operators
    - Working with JS internal functions to make decisions and perform actions.
    - Using conditional logic to make decisions inside functions
    - Writing functions that take in inputs, process, and return outputs.
    

## Instructions

0. *Carefully* read *all* the instructions and problems before beginning your work.

1. Clone this repository to your local projects directory. If you're using IntelliJ, go to File->New->Project From Version Control->GitHub and then paste the clone address of this repo. The clone address of the repo is found by clicking the green "Clone or download" button on the repo's page.

1. Create a branch named `firstName-lastLastname` where `firstName` is your first name and `lastName` is your last name. In IntelliJ, go to VCS, then Git, then Branches, and click "+ New Branch" and name it accordingly.
     
1. Write your solutions to the problems presented below inside `solutions.js`.

1. Read the Testing instructions below.

1. Add, commit often (preferably every time you finish a problem), and only push your `firstName-lastName` branch to GitHub when an instructor tells you to.

## Problems

1. Define a function named `isANumber` that takes in a value and returns true if the input is numeric or not. Numeric strings are not considered as numbers and should return false.
        
        isANumber(23)               // true
        isANumber("42")             // false
        isANumber(3.141)            // true
        isANumber("")               // false
        isANumber(true)             // false
        isANumber("Bob")            // false
        isANumber([1,2,3])          // false

1. Define a function named `increment` that takes in an input and adds 1 to it if the input is numeric. If the input is not numeric, then return false.
        
        increment(0)                // 1
        increment("10")             // 11
        increment(-5)               // -4
        increment("Bob")            // false
        increment([1, 2, 3])        // false
        increment(true)             // false
        increment(null)             // false

1. Define a function named `decrement`. If the provided input is numeric, the function should subtract 1 and return the result. If the input is not numeric, `decrement` should return false.
        
        decrement(19)               // 18
        decrement(0)                // -1
        decrement("4")              // 3
        decrement("Bob")            // false
        decrement([1, 2, 3])        // false
        decrement(false)            // false
        decrement(null)             // false

1. Write a function named `getHighestNumber` that takes in 3 arguments. If all 3 inputs are numbers or numeric strings, then return the highest number. If any of the 3 inputs is missing or non-numeric, then return `false`.

        getHighestNumber(1, 3, 2)           // 3
        getHighestNumber(0, 1, "2")         // 2
        getHighestNumber(9, 3, -20)         // 9
        getHighestNumber(2, 2, 2)           // 2
        getHighestNumber(2, 5, 5)           // 5
        getHighestNumber(1, 2, 'x')         // false
        getHighestNumber("a", "b")          // false
        getHighestNumber()                  // false
        
1. Define a function named `parseNumber` that parses (converts) a numeric String and returns it's value as a number, the function should be able to decide if it should be parsing an Integer or a Float value.
        
        parseNumber("123")            // 123
        parseNumber(123)              // 123
        parseNumber("34.4")           // 34.4
        parseNumber(10.5)             // 10.5
        parseNumber("-2")             // -2
        parseNumber("-10.4")          // -10.4
        
1. Write a function named `add` that takes in two inputs. If both inputs provided are numeric, `add` will return the sum of both inputs. If one or both inputs is not numeric, `add` should return false.
        
        add(1, 2)                   // 3
        add(0, 0)                   // 0
        add(-5, 10)                 // 5
        add("2", 4)                 // 6
        add(5, true)                // false
        add(true, false)            // false
        add("Monday", "Tuesday")    // false
        add(null)                   // false

1. Write a function named `multiply` that takes in two inputs. If both inputs provided are numeric, `multiply` returns the product of the first input multiplied by the second. If either or both inputs are not numeric, `multiply` should return false.
    
        multiply(4, 2)              // 8
        multiply(0, 44)             // 0
        multiply(-5, 10)            // -50
        multiply(5, true)           // false
        multiply(true, false)       // false
        multiply("Monday")          // false

1. Define a function named `square`. If the provided input is numeric, `square` should return the number multiplied by itself. If the input is not numeric, `square`, should return false.

        square(2)                   // 4
        square(3)                   // 9
        square(-4)                  // 16
        square("5")                 // 25
        square(0.5)                 // .25
        square("Bob")               // false
        square(true)                // false
        square(false)               // false
        square(null)                // false
        square([1, 2, 3])           // false
        square()                    // false

1. Write a function named `sumOfSquares` that takes in two inputs. If both inputs are numeric, `sumOfSquares` should square each input and return the sum of them added together. For example, if we pass `a` and `b` then we should square `a` and add it to the square of `b`. If either or both inputs are not numeric, `sumOfSquares` should return false.

        sumOfSquares(2, 3)          // 13
        sumOfSquares(1, 0)          // 1
        sumOfSquares("4", 5)        // 41
        sumOfSquares(2, false)      // false
        sumOfSquares(null)          // false
        sumOfSquares()              // false

1. Write a function named `isPalindrome` that takes in a single input. If the input is a numeric string, then return `false`. If the input is a string, then return true if the string is the same forwards as it is backwards. Return false if the string is different forwards from backwards. Ignore capitalization.
        
        isPalindrome("Bob")         // true
        isPalindrome("radar")       // true
        isPalindrome("ufotofu")     // true
        isPalindrome("Monday")      // false
        isPalindrome(232)           // false
        isPalindrome(null)          // false


## Testing your work w/ automated tests

Open `assessment.html` in your browser. Jasmine will run tests on the code inside `solutions.js`. The first time you load assessment.html, you will see every test failing because `solutions.js` is empty to start. 

The automated tests provide immediate feedback as to whether or not your solutions solve the problems.

- Click on Spec List inside of `assessment.html` to see test results.

- If all the specs for `isNegative` function are green, then the provided solution is correct.

- Make sure that the functions inside `solutions.js` are not wrapped in an IFFE.

## How solutions will be graded

- Your grade is entirely dependent on the completeness of your solutions

- No credit will be given for code that cannot run due to typos or syntax errors.

- No credit will be given for commented out code.

- There are ten questions on the test. Below is an example of how a question appears on the test.<br><kbd><img src="./images/test-question.png" ></kbd>

- Each question counts for 10 points of the final grade.

- For a question to be counted as correct all specs must pass for the question.<br><kbd><img src="./images/correct-answer.png" ></kbd>

- If any of the specs are red for the question then the entire question will be considered incorrect.<br><kbd><img src="./images/incorrect-answer.png" ></kbd>

## Hints
- If you have green tests and notice that everything is now completely red, it means you likely have a syntax error or a type error in your code. Those kinds of errors will keep all the code from executing properly.
- If you have a syntax error, type error, or reference error in a particular solution function, and it's time to commit and push your work, then comment out that function or the line of code with the error so that your other solutions will be appropriately graded.

- Consider this problem: 

> Write a function called `isBoolean` that takes in a value and returns `true` or `false` if the argument provided is a boolean data-type or not.
>
> `isBoolean("Dog")` should return `false` because a string is not a boolean
>
> `isBoolean(false)` should return `true` because only true and false are boolean values.

- When a problem says `return`, it means `return`, not `console.log`.

- When a problem says that a function will take in an input, then it means the function must be defined so that it takes in an argument as its input, rather than relying on variables defined outside the function.

The following example is incorrect because the function does not take in an argument. It's modifying a global variable, and that is not the same as accepting an input as an argument.

```js
var input = "Grace Hopper"
function isBoolean() {
    return typeof input == "boolean";
}
```

This is incorrect because the function doesn't return the output. Functions that do not have an explicit `return` statement return `undefined` by default.

```js
function isBoolean(input) {
    console.log(typeof input == 'boolean');
}
```

Correct solution:

```js
function isBoolean(input) {
    return typeof input == "boolean";
}
```


