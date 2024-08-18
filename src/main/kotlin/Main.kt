package com.oneclient

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var greeting = "Hello"
    println(greeting) // hello
    val greet = "welcome"
    println(greet) // welcome
    greeting = "hi"
    println(greeting) // hi

    var name: String = "Bob "
    println(name)
    var Lname = "Jefferson"
    var fullname: String =  name + Lname
    println(fullname)

    if (Lname != "Jefferson") {
        println("Lname is not Jefferson NO ENTRY")
    }
    else println("enter")

    strings()
    booleans()
    elses()

}

fun strings() {

    var klistebest: String = "KOTLIN IS THE BEST!!!"
    println(klistebest[0])
    println(klistebest[1])

    var text: String = "abcdefghijklmnopqrstuvwxyz "
    println(text + "has " + text.length + " Letters")

    var lower = "hi"
    println(lower.uppercase())
    var upper = "HI"
    println(upper.lowercase())

    var txt1 = "Hello World"
    var txt2 = "Hello World"
    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)
    var txt3 = "Hello World"
    var txt4 = "Hello Universe"
    println(txt3.compareTo(txt4))

    //The indexOf() function returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
    var etxt = "Please locate where 'locate' occurs!"
    println(etxt.indexOf("'locate'"))  // Outputs 7 //20th letter = where l is

    //quotes inside string use ''
    var text111: String = "Hello World My Dog's toy is broken"
    println(text111)

    //concatenation
    var firstName = "John"
    var lastName = "Doe"
    println(firstName + " " + lastName)
    //or plus() eg:
    //if "John "
    println(firstName.plus(lastName))


    //String Templates/Interpolation
    //Instead of concatenation, you can also use "string templates", which is an easy way to add variables and expressions inside a string.
    //
    //Just refer to the variable with the $ symbol:

    println("My name is $firstName $lastName")
    //printing My name is John Doe

}

fun booleans() {

    val isKotlinFun = true
    val isFishTasty = false
    println(isKotlinFun)   // Outputs true
    println(isFishTasty)   // Outputs false

    println(isKotlinFun == isKotlinFun)

    val mum = 14
    val mumlaw = 16

    println(mum>mumlaw)

    if (mum < mumlaw)
        println("thats illegal!")
}

fun elses() {

    val time = 22
    if (time < 10) {
        println("Good morning.")
    } else if (time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
// Outputs "Good evening."

    val time2 = 20
    if (time2 < 18) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
// Outputs "Good evening."


    //ifelse

    var time3 = 0
    var tim4 = if (time3 < -1) {
        "Good day"
    } else {
        "good day not!"
    } //pout good day not

    println(tim4)

    //Note: You can ommit the curly braces {} when if has only one statement:

        val time6 = 20
        val greeting = if (time6 < 18) "Good day." else "Good evening."
        println(greeting)

        //print out good evening
    }



