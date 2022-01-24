//
final class OpenWeather(s: String, s1: String, s2: String) {

    //
    private var coords: Coordinates? = null
    private var weather: Weather? = null
    private var time: Time? = null

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
    public fun getTime(): Time? {

        return this.time
    }

    //
    public override fun toString(): String {

        return ""
    }
}