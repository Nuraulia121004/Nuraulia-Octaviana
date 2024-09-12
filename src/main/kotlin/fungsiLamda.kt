fun main(args: Array<String>) {
    println(MyFunction("Rekayasa Perangkat Lunak"))

    //lamda function
    val mylambda:(String)->Unit = {s:String->print(s)}
    val v : String = "Jurusan Teknik Informatika"
    mylambda(v)

    //inline function
    myFun(v,mylambda)//passing lamda as a parameter of anothe function
}
fun MyFunction(x: String):String{
    var c:String = "Hey !! Welcome to --- "
    return (c+x)
}
fun myFun(a:String,action:(String)->Unit){
    print("\nHeyy!!!")
    action(a)//call to lambda function
}