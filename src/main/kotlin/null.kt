fun main(args: Array<String>) {
    //Nullable types
    var mayNumber : Int ?  = 15
    mayNumber = null
    println(" mayNumber : $mayNumber ${mayNumber?.hashCode()}")

}