package openWeather

//
class OpenWeather(localization: String, countryCode: String, apiKey: String) {

    //
    private var coords: Coordinates? = null

    //
    public fun OpenWeather(localization: String, apiKey: String) {

    }

    //
    public fun OpenWeather(localization: String, countryCode: String, apiKey: String) {
        
    }

    //
    public fun OpenWeather(longitude: Double, latitude: Double, apiKey: String) {

    }

    //
    public fun getCoords(): Coordinates? {

        return this.coords
    }

    //
    public override fun toString(): String {

        return "Hello World!"
    }
}