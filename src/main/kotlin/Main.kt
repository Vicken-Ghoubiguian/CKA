import openWeather.PresentOpenWeather

//
suspend fun main(args: Array<String>) {

    //
    var currentPresentOpenWeather = PresentOpenWeather("", "", "")
    currentPresentOpenWeather.openWeatherInitializer("", "", "")

    //
    println(currentPresentOpenWeather.toString())

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}