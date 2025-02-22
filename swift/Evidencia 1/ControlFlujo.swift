print("CONDITIONAL STATEMENTS")
print("If")
var temperatureInFahrenheit = 30
if temperatureInFahrenheit <= 32{
    print("It's very cold. Considerer wearing a scarf.")
}
//prints

temperatureInFahrenheit = 40
if temperatureInFahrenheit <= 32{
    print("It's very cold. Considerer wearing a scarf")
} else{
    print("It's not that cold. Wear a T-shirt.")
}


temperatureInFahrenheit = 90
if temperatureInFahrenheit <= 32{
    print("it's very cold. Considerer wearing a scarf.")
} else if temperatureInFahrenheit >= 86{
    print("it's really warm. Don't forget to wear suns")
} else {
    print("it's not that cold. Wear a T-shirt.")
}


let temperatureInCelsius = 25
let weatherAdvice = String
if temperatureInCelsius <=0{
    weatherAdvice = "it's very cold. Considerer wearing a scarf."
} else if temperatureInCelsius >= 30{
    weatherAdvice = "it's really warm. Don't forget to wear suns"
} else {
    weatherAdvice = "it's not that cold. Wear a T-shirt."
}
print(weatherAdvice)

let freezeWarning: String? = if temperatureInCelsius <=0{
     "It's below freezing. Watch for ice!"
} else {
    nil
}

///Switch
print("SWITCH")
let someCharacter: Character = "z"
switch someCharacter {
case "a":
    print("The first letter of the Latin alphabet")
case "z":
    print("The last letter of the Latin alphabet")
default:
    print("Some other character")
}

let someCharacter: Character = "a"
switch someCharacter {
case "a":
    print("The first letter of the Latin alphabet")
case "z":
    print("The last letter of the Latin alphabet")
default:
    print("Some other character")
}

/// For Loops
let numberOfLegs = ["spider": 8,"ant": 6, "cat": 4]
for (animalName, legCount) in numberOfLegs{
    print("\(animalName)s have \(legCount) legs")
}

for index in 1...5{
    print("\(index) times 5 is \(index * 5)")
}