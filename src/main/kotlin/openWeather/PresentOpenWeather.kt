package openWeather

//
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

//
class PresentOpenWeather{

    //
    private var coords: Coordinates? = null
    private var humidity: Humidity? = null
    private var wind: Wind? = null

    private var der: String? = null

    //
    /**/

    //
    constructor(localization: String, countryCode: String, apiKey: String) {

    }

    //
    constructor(localization: String, apiKey: String) {

    }

    //
    constructor(longitude: Double, latitude: Double, apiKey: String) {

    }

    //
    public suspend fun openWeatherInitializer(localization: String, countryCode: String, apiKey: String) {

        this.der = "Hello World!"

        //
        val openWeatherClient = HttpClient(CIO)

        //
        val httpOpenWeatherRequest = "https://api.openweathermap.org/data/2.5/weather?q=" + localization + "," + countryCode + "&appid=" + apiKey

        //
        val openWeatheResponse: HttpResponse = openWeatherClient.get(httpOpenWeatherRequest)

        //
        println(openWeatheResponse.status)

        //
        openWeatherClient.close()
    }

    //
    public suspend fun openWeatherInitializer(localization: String, apiKey: String) {

        this.der = "Hello World!"

        //
        val openWeatherClient = HttpClient(CIO)

        //
        val httpOpenWeatherRequest = "https://api.openweathermap.org/data/2.5/weather?q=" + localization + "&appid=" + apiKey

        //
        val openWeatheResponse: HttpResponse = openWeatherClient.get(httpOpenWeatherRequest)

        //
        println(openWeatheResponse.status)

        //
        openWeatherClient.close()
    }

    //
    public fun getCoords(): Coordinates? {

        return this.coords
    }

    //
    public fun getHumidity(): Humidity? {

        return this.humidity
    }

    //
    public fun getWind(): Wind? {

        return this.wind
    }

    //
    public override fun toString(): String {

        return "(" + this.der
    }
}