import java.util.ArrayList

fun main(args: Array<String>) {
    println("Hello, World!")
    var x = 10;
    var y = x + 1;

    println("gia tri cua y la: $y")
    var myArray : Array<Long> = arrayOf(15,16,20)
    var testInt: Int =myArray[0].toInt();
    println("gia tri cua testInt la: $testInt")
    val  day = 1
    when(day){
        1 -> {
            println("Monday")
            println("First day of the week")
        }
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }

    val testFor = 5;
    for(i in 5 downTo  1 step 2){
        println("gia tri cua i la: $i")
    }
    var sinhvien = SinhVienPTIT(1, "Nguyen Van A", 3.5);
    println("id: ${sinhvien.id} + name: ${sinhvien.name} + age: ${sinhvien.age} + gpa: ${sinhvien.gpa}")
    sinhvien.id = 3;
    println("id: ${sinhvien.id} + name: ${sinhvien.name} + age: ${sinhvien.age} + gpa: ${sinhvien.gpa}")
    var dog : Animal1 = Dog("Ha Noi", 1, "Dog", 2);
    println("id: ${dog.id} + name: ${dog.name} + age: ${dog.age}" + (dog as Dog).diachi)
    var color = Demo.RED;
    var a = mutableSetOf<Int>()
    a.add(1)
    a.add(2)
    a.add(3)
    a.add(4)
    a.add(6)
    for (i in a){
        println("gia tri cua i la: $i")
    }

    for(i in a){
        println("gia tri cua i la: $i")
    }

    var sum : (Int, Int) -> Int = {x : Int,  y : Int -> (x + y)}


}

fun getColor(color: Demo) = when(color){
    Demo.RED -> "Color is Red"
    Demo.GREEN -> "Color is Green"
    Demo.YELLOW -> "Color is Blue"
}

fun add(x: Int, y: Int) : Int{
    return x + y;
}