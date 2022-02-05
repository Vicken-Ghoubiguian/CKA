package openWeather

class ParametersWithLocalizationCountryCodeAndApiKey : Parameters {

    //
    override var parametersType: ParametersEnum = ParametersEnum.PARAMETERSWITHLOCALIZATIONCOUNTRYCODEAPIKEY

    //
    private var localization: String? = null
    private var countryCode: String? = null
    private var apiKey: String? = null

    //
    constructor(localization: String, countryCode: String, apiKey: String) {

        //
        this.localization = localization
        this.countryCode = countryCode
        this.apiKey = apiKey
    }

    //

    //

    //


    //
    public override fun toString(): String {

        //
        TODO("Not yet implemented")
    }
}