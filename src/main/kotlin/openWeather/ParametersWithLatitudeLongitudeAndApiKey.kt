package openWeather

//
class ParametersWithLatitudeLongitudeAndApiKey : Parameters {

    //
    override var parametersType: ParametersEnum = ParametersEnum.PARAMETERSWITHLATITUDELONGITUDE

    //
    private var latitude: Double? = null
    private var longitude: Double? = null
    private var apiKey: String? = null

    //
    override fun getLatitude(): Double? {

        //
        return this.latitude
    }

    //
    override fun getLongitude(): Double? {

        //
        return this.longitude
    }

    //
    override fun getAPIKey(): String? {

        //
        return this.apiKey
    }

    //
    override fun getLocalization(): String? {

        //
        TODO("Not yet implemented")
    }

    //
    override fun getCountryCode(): String? {

        //
        TODO("Not yet implemented")
    }

    //
    public override fun toString(): String {

        //
        return ""
    }
}