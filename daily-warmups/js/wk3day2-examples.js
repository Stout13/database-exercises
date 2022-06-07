function threeSides() {
    var begin = confirm("would you like to enter 3 sides of a triangle and receive an area?")
    if (begin === true){
        var a = prompt("what is side a")
        var b = prompt("what is side b")
        var c = prompt("what is side c")
        var s = (Math.abs(a) +Math.abs(b)+Math.abs(c))/2

        var step1 = s-a
        var step2 = s-b
        var step3 = s-c
        var area = (Math.sqrt(s*step1*step2*step3)).toFixed(2)




        alert("the area of the triangle is " + area + " units squared")
    }
}

threeSides();