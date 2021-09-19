fun main(){
    println("Hello, Enter your name please: ")
    val name = readLine()
    var message:String = "Welcome user, I hope you have a great day"
    println(message.replace("user", "$name"))
}

