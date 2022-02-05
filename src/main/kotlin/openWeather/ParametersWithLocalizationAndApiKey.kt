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
    public fun getLocalization(): String? {

        //
        return this.localization
    }

    //
    public fun getApiKey(): String? {

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