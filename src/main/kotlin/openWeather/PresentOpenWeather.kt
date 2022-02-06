package openWeather

//
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

//
class PresentOpenWeather{

    //
    private var parameters: Parameters? = null

    //
    private var coords: Coordinates? = null
    private var weather: Weather? = null

    private var humidity: Humidity? = null
    private var wind: Wind? = null
    private var sunRiseTime: Time? = null
    private var sunSetTime: Time? = null
    private var geoLocation: GeographicLocation? = null

    //
    /**/

    //
    constructor(localization: String, countryCode: String, apiKey: String) {

        //
        this.parameters = ParametersWithLocalizationCountryCodeAndApiKey(localization, countryCode, apiKey)
    }

    //
    constructor(localization: String, apiKey: String) {

        //
        this.parameters = ParametersWithLocalizationAndApiKey(localization, apiKey)
    }

    //
    constructor(longitude: Double, latitude: Double, apiKey: String) {

    }

    //
    public suspend fun openWeatherInitializer() {

        //
        val openWeatherClient = HttpClient(CIO)

        //
        var httpOpenWeatherRequest = ""

        //
        if(this.parameters?.parametersType == ParametersEnum.PARAMETERSWITHLOCALIZATIONAPIKEY) {

            //
            httpOpenWeatherRequest =
                "https://api.openweathermap.org/data/2.5/weather?q=" + this.parameters?.getLocalization() + "&appid=" + this.parameters?.getAPIKey()

            //
        } else if(this.parameters?.parametersType == ParametersEnum.PARAMETERSWITHLOCALIZATIONCOUNTRYCODEAPIKEY) {

            //
            httpOpenWeatherRequest =
                "https://api.openweathermap.org/data/2.5/weather?q=" + this.parameters?.getLocalization() + "," + this.parameters?.getCountryCode() + "&appid=" + this.parameters?.getAPIKey()

            //
        } else {

            //
            httpOpenWeatherRequest = "https://api.openweathermap.org/data/2.5/weather?lat=" + this.parameters?.getLatitude().toString() + "&lon=" + this.parameters?.getLongitude().toString() + "&appid=" + this.parameters?.getAPIKey()
        }

        //
        val openWeatheResponse: HttpResponse = openWeatherClient.get(httpOpenWeatherRequest)

        //
        println(openWeatheResponse.status)

        //
        openWeatherClient.close()
    }

    //
    /*public suspend fun openWeatherInitializer(localization: String, apiKey: String) {

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
    }*/

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

        return "Hello World!"
    }
}