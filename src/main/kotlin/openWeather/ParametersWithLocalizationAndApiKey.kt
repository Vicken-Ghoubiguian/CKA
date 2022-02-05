package openWeather

//
class ParametersWithLocalizationAndApiKey : Parameters {

    //
    private var localization: String? = null
    private var apiKey: String? = null

    //
    constructor(localization: String, apiKey: String) {

        //
        this.localization = localization
        this.apiKey = apiKey
    }

    //
    public override fun getLocalization(): String? {

        //
        return this.localization
    }

    //
    public override fun getCountryCode(): String? {

        TODO("Not yet implemented")
    }

    //
    public override fun getAPIKey(): String? {

        //
        return this.apiKey
    }

    //
    override var parametersType: ParametersEnum = ParametersEnum.PARAMETERSWITHLOCALIZATIONAPIKEY

    //
    public override fun toString(): String {

        //
        return ""
    }
}