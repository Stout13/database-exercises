var car = {
    year: 2020,
    make: "honda",
    model: "fit",
    has4Wheels: true,
    leather: true,
    wheels: 4,
    doors: 2,
    stereo: false,
    radioStations: [104.5, 95.1,101.1,"wrr", 105.3,"kntu",96.1]
}

console.log("I drive a " + car.year + " " + car.make + " " + car.model + " " + "and I listen to " + car.radioStations[5]
    + " and " + car.radioStations[0] + "!");
