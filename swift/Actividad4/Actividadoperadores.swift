print("ASSIGNMENT OPERATOR")
let b = 10
var a = 5
a = b 
print("El valor de a es \(a)") 

print("Tupla")
let(x,y)=(1,2)
print("x es \(x) y y es \(y)") 

print("ARITHMETIC OPERATORS")
print("1 + 2 =", 1 + 2)  
print("5 - 3 =", 5 - 3)  
print("2 * 3 =", 2 * 3)
print("10.0 / 2.5 =", 10.0 * 2.5)
print("Hello," + "world")

print("COMPOUND ASSIGMENT")
var myScore = 10
print("Valor inicial de myScore: \(myScore)") 
myScore += 3
print("myScore += 3: \(myScore)") 
myScore -= 5
print("myScore -= 5: \(myScore)") 
myScore *= 2
print("myScore *= 2: \(myScore)") 
myScore /= 2
print("myScore /= 2: \(myScore)") 

print("REMINDER OPERATOR")
let dividend = 10 
let divisor = 3
let quotient = dividend / divisor
let remainder = dividend % divisor
let numero = 9 
let resultado = numero % 4
print("Didendo es: 10")
print("Divisor es: 3")
print("El cociente es: \(quotient)")  
print("El residuo: \(remainder)")  
print("El residuo de 9 % 4 es \(resultado)")  

print("ORDER OF OPERATIONS")
var c=2
var d=3
var e=5
print("c = 2")
print("d = 3")
print("e = 5")
let resultado1 = c + d * e
print("c + d * e =", resultado1)  
let resultado2 = (c + d) * e
print("(c + d) * e =", resultado2)  

print("NUMERIC TYPE CONVERSION")
let x1 = 3
let x2 = 0.1415927
print("x1 = \(x1)")
print("x2 = \(x2)")
print("El valor de Pi es:", (x1 + Int(x2)))  
let f = 3
let g = 0.1415927
print("El doble valor de Pi es:", (Double(f) + g))
