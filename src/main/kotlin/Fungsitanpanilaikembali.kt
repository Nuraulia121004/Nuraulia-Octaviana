fun main(args: Array<String>) {
    // Panggil fungsi displayMessage dari sini
    displayMessage("Rekayasa Perangkat Lunak", 10)
}

// Deklarasi fungsi displayMessage di luar main()
fun displayMessage(msg: String, count: Int) {
    var counter = 1
    while (counter <= count) {
        println("$msg $counter")
        counter++
    }
}
