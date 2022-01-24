//
final class OpenWeather {

    //
    private var coords: Coordinates? = null

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
    public override fun toString(): String {

        return ""
    }
}