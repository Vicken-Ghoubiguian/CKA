package openWeather

//
interface Parameters {

    //
    public var parametersType: ParametersEnum

    //
    public fun getLocalization(): String?
    public fun getCountryCode(): String?
    public fun getAPIKey(): String?
    public fun getLatitude(): Double?
    public fun getLongitude(): Double?

    //
    public override fun toString(): String
}