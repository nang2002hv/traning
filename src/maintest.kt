fun sum(x : Int, y : Int) = x + y
fun sub(x : Int, y : Int) = x - y
fun mul(x : Int, y : Int) = x * y
fun div(x : Int, y : Int) = x / y

fun calculator(x : Int, y : Int, operation : (Int, Int) -> Int ) : Int{
    return operation(x, y)
}

fun calculatorSum() : (Int, Int) -> Int{
    return ::sum
}


fun main(){
    println("Sum: ${calculator(10, 5, ::sum)}")
    println("Sub: ${calculator(10, 5, ::sub)}")
    println("Mul: ${calculator(10, 5, ::mul)}")
    println("Div: ${calculator(10, 5, ::div)}")
    println("Div : ${calculatorSum()(10,5)}")
}
