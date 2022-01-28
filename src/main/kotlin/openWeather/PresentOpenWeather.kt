package openWeather

//
class PresentOpenWeather(localization: String, countryCode: String, apiKey: String) {

    //
    private var coords: Coordinates? = null
    private var humidity: Humidity? = null
    private var wind: Wind? = null

    //
    public fun PresentOpenWeather(localization: String, apiKey: String) {

    }

    //
    public fun PresentOpenWeather(localization: String, countryCode: String, apiKey: String) {
        
    }

    //
    public fun PresentOpenWeather(longitude: Double, latitude: Double, apiKey: String) {

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

        return "Hello World!"
    }
}