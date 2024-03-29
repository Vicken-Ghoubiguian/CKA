package openWeather

//
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.runBlocking

//
class ForecastOpenWeather {

    //
    private var coords: Coordinates? = null
    private var weather: Weather? = null
    private var temperature: Temperature? = null
    private var feelingLikeTemperature: Temperature? = null
    private var minTemperature: Temperature? = null
    private var maxTemperature: Temperature? = null
    private var pressure: Pressure? = null
    private var humidity: Humidity? = null
    private var wind: Wind? = null
    private var sunRiseTime: Time? = null
    private var sunSetTime: Time? = null
    private var geoLocation: GeographicLocation? = null
    private var uv: UV? = null
}