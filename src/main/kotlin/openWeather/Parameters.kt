package openWeather

//
interface Parameters {

    //
    public var parametersType: ParametersEnum

    //
    public fun getLocalization(): String?
    public fun getCountryCode(): String?
    public fun getAPIKey(): String?

    //
    public override fun toString(): String
}