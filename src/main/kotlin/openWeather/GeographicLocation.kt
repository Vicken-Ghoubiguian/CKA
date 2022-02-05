package openWeather

class GeographicLocation {

    //
    private var countryCode: String? = null
    private var cityName: String? = null

    //
    public fun getCountryCode(): String? {

        return this.countryCode
    }

    //
    public fun getCityName(): String? {

        return this.cityName
    }
}