fun main(args: Array<String>) {
    // safe calling
    //?.let
    var mayNumber : Int ? = 15
    mayNumber?.let { println(it) }
    //The ?. chaining
//student?.teacher?.supervisor?.name = "Seymour Skinner"
}