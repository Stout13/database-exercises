//
// /**
//  * @param {number[]} nums
//  * @param {number} target
//  * @return {number[]}
//  */
//
// let nums = [3,2,4];
// let target = 6;
// let twoSum = function(numArr, targetNum) {
//
//
//
//     //      Make a loop that will cycle through each non-repeating combination of
//     // 2 numbers and check to see if the
//     // sum is equal to the target.
//
//     //      numsArrLenLength  length of initial array is reduced by one for each loop through a
//     //  combination, 1-7, 2-7, 3-7, 4-7 etc.
//
//
//     // removed numsArrLen used i/j instead
//     // let numsArrLen = nums.length;
//     // console.log(numsArrLen);
//
//     //      loopArrLen  as we loop through non-repeating combinations,
//     // the length of the array decreases as all
//     // possible combinations are made with the first number, then loopArrLen is incremented
//
//     //     loopArrLen requires a seperate tracker because it is a nested for loop
//     // and the inner loop will decrement seperately from the outer loop
//
//
//     // console.log(loopArrLen);
//
//     //      solutionZeroCount  number of solutions beginning at zero determines the position of the current
//     // combination in an array of solutions.
//
//
//     // ignore due to "exactly one answer premise"
//     // let solutionZeroCount = 0;
//
//     //      solutionArr  to store solution sets which satisfy the if condition
//
//
// //     disregard due to "exactly one solution" in premise
//     // let solutionArr = [];
//
//     //      firstNumberPosition  tracks the first number of the combination for this segment of the combination loop            ([9, 2], [9, 3], [9, NumberAtMaxPosition] firstNumber == 1, firstNumber +=1)
//
//     //  no longer using
//     // let firstNumberPosition = 0;
//
//     //      Loops through C(n,r) where r = 2 only
//
//     //      This loop determines the number of loops required for C(n,r) where r=2.  The final element is not counted           because there are no more non-repeating numbers with which to add ([1, 2], [1, 3], ... [1, 8],  etc. to             [7, 8])
//
//     let j = 0;
//     let i = 1;
//
//     let loopArrLen = numArr.length;
//     // console.log(loopArrLen);
//
//     do {
//         // console.log("do1");
//
//         //      The next loop is for every combination(2) of elements starting from first number firstNumberPosition = 2,           nums = [1, 9, 15, 25, 33]  loop will generate and check every combination [9, 15], [9, 25], [9, 33] to              the end of the loop for the if condition
//
//         do {
//             // console.log("do2")
//
//             //      If statement could be replaced with any type of solution requirement
//             // console.log(nums[firstNumberPosition]);
//             // console.log(nums[i]);
//             if (Number(numArr[j] + numArr[i]) === Number(targetNum)) {
//                 // console.log("if");
//
//                 //      If the condition is met, store the solution set in the solution array solutionArr and increment the number of solutions
//                 // console.log(nums[firstNumberPosition]);
//                 // console.log(nums[i]);
//                 // console.log(j);
//                 // console.log(i);
//                 // console.log("indices " + j + " plus " + i +" sum together for target " + target);
//                 return [j, i];
//                 // console.log(solution);
//
// //                 disregarded due to "exactly one solution"
//
//                 //     if(solutionArr == null) {
//                 //         solutionArr == solution;
//                 //     }
//                 //     else{
//                 //         solutionArr.push(solution);
//                 //     }
//                 //     solutionZeroCount++;
//                 // }
//             }
//             i++;
//         } while (i <= loopArrLen);
//         // firstNumberPosition++;
//         j++;
//         i = j+1;
//         // loopArrLen--;
//     } while(j<loopArrLen);
//
//     // console.log(solutionArr);
//
// //     disregard due to "exactly one solution premise"
//     // return solutionArr;
//
// }
//
// console.log(twoSum(nums, target));
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numArr, targetNum) {



    //      Make a loop that will cycle through each non-repeating combination of
    // 2 numbers and check to see if the
    // sum is equal to the target.

    //      numsArrLenLength  length of initial array is reduced by one for each loop through a
    //  combination, 1-7, 2-7, 3-7, 4-7 etc.


    // removed numsArrLen used i/j instead
    // let numsArrLen = nums.length;
    // console.log(numsArrLen);

    //      loopArrLen  as we loop through non-repeating combinations,
    // the length of the array decreases as all
    // possible combinations are made with the first number, then loopArrLen is incremented

    //     loopArrLen requires a seperate tracker because it is a nested for loop
    // and the inner loop will decrement seperately from the outer loop


    // console.log(loopArrLen);

    //      solutionZeroCount  number of solutions beginning at zero determines the position of the current
    // combination in an array of solutions.


    // ignore due to "exactly one answer premise"
    // let solutionZeroCount = 0;

    //      solutionArr  to store solution sets which satisfy the if condition


//     disregard due to "exactly one solution" in premise
    // let solutionArr = [];

    //      firstNumberPosition  tracks the first number of the combination for this segment of the combination loop            ([9, 2], [9, 3], [9, NumberAtMaxPosition] firstNumber == 1, firstNumber +=1)

    //  no longer using
    // let firstNumberPosition = 0;

    //      Loops through C(n,r) where r = 2 only

    //      This loop determines the number of loops required for C(n,r) where r=2.  The final element is not counted           because there are no more non-repeating numbers with which to add ([1, 2], [1, 3], ... [1, 8],  etc. to             [7, 8])

    let j = 0;
    let i = 1;

    let loopArrLen = numArr.length;
    // console.log(loopArrLen);

    do {
        // console.log("do1");

        //      The next loop is for every combination(2) of elements starting from first number firstNumberPosition = 2,           nums = [1, 9, 15, 25, 33]  loop will generate and check every combination [9, 15], [9, 25], [9, 33] to              the end of the loop for the if condition

        do {
            // console.log("do2")

            //      If statement could be replaced with any type of solution requirement
            // console.log(nums[firstNumberPosition]);
            // console.log(nums[i]);
            if (Number(numArr[j] + numArr[i]) === Number(targetNum)) {
                // console.log("if");

                //      If the condition is met, store the solution set in the solution array solutionArr and increment the number of solutions
                // console.log(nums[firstNumberPosition]);
                // console.log(nums[i]);
                // console.log(j);
                // console.log(i);
                // console.log("indices " + j + " plus " + i +" sum together for target " + target);
                return [j, i];
                // console.log(solution);

//                 disregarded due to "exactly one solution"

                //     if(solutionArr == null) {
                //         solutionArr == solution;
                //     }
                //     else{
                //         solutionArr.push(solution);
                //     }
                //     solutionZeroCount++;
                // }
            }
            i++;
        } while (i <= loopArrLen);
        // firstNumberPosition++;
        j++;
        i = j+1;
        // loopArrLen--;
    } while(j<loopArrLen);

    // console.log(solutionArr);

//     disregard due to "exactly one solution premise"
    // return solutionArr;

}