// Imagine the supplied array is like a pack of cards.
// Write a function to shuffle an array in to a completely new and entirely random order,
// much like shuffling a pack of cards.
//     example input: [2,4,6,8];
// expected output: [4,2,8,6];

var stuff = [2, 4, 6, 8];
function shuffleArr(input) {
    console.log(input);
    var len = Number((input.length));
    var mix = Number(Math.floor(Math.random() * (len)));
    var mixedElement = input[mix];
    console.log(mixedElement);
    do {
        var replacement = Number(Math.floor(Math.random() * (len)));
        console.log(replacement);
    } while (replacement === mix);
    console.log('the mix is ' + mix + ' and the replacement is ' + replacement);
    console.log(mix + ' ' + replacement);
    var replaceWith = input[replacement];
    console.log(replaceWith);
    input.splice(mix, 1, replaceWith);
    console.log(input);
    input.splice(replacement, 1, mixedElement);
    console.log(input);
    return input;
}

shuffleArr(stuff);