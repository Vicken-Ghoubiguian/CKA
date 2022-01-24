//
final class OpenWeather {

    //
    private var coords: Coordinates? = null
    private var weather: Weather? = null

    //
    public fun OpenWeather(localization: String, countryCode: String, apiKey: String) {

    }

    //
    public fun OpenWeather(localization: String, apiKey: String) {

    }

    //
    public fun getCoords(): Coordinates? {

        return this.coords
    }

    //
    public fun getWeather(): Weather? {

        return this.weather
    }

    //
    public override fun toString(): String {

        return ""
    }
}