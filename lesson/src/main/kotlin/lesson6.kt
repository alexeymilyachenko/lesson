//Циклы while, do-while. Обратный отсчет с Thread.sleep()
fun main() {
    // while, do while
    var counter = 5
//    while (counter > 0)
//        println("Реклама начнется через ${counter--}")
//    Thread.sleep(1000)

    do{
        println("Реклама начнется через ${counter--}")
        Thread.sleep(1000)

    } while (counter > 0)
}