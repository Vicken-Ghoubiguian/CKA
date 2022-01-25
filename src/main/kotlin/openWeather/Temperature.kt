package openWeather

//
final class Temperature {

    //
    private var value: Double? = null
    private var measureUnit: TemperatureUnitEnum? = null

    //
    public fun Temperature(value: Double) {

        //
        this.value = value
        this.measureUnit = TemperatureUnitEnum.KELVIN
    }
}