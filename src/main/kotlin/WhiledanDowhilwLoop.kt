fun main(args: Array<String>) {
    //white loop
    var x : Int = 0
    println("Example of while lopp--")
    while (x <= 10){
        print("$x ")
        x++
    }
    print('\n')

    //do-while-loop
    var y:Int = 0
    do {
        y = y + 10
        println("I am inside Do block---" +y)
    } while(y <= 50)
}