import presentopenWeather.PresentOpenWeather

//
fun main(args: Array<String>) {

    //
    var currentOpenWeather = PresentOpenWeather("", "", "")

    //
    println(currentOpenWeather.toString())

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}