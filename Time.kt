class Time {

    //
    private var sunriseAsTimestampAccordingToUtc: String? = null
    private var sunsetAsTimestampAccordingToUtc: String? = null
    private var utcOffsetAsTimestamp: String? = null

    //
    public fun Time(sunriseAsTimestampAccordingToUtc: String, sunsetAsTimestampAccordingToUtc: String, utcOffsetAsTimestamp: String) {

        //
        this.sunriseAsTimestampAccordingToUtc = sunriseAsTimestampAccordingToUtc
        this.sunsetAsTimestampAccordingToUtc = sunsetAsTimestampAccordingToUtc
        this.utcOffsetAsTimestamp = utcOffsetAsTimestamp
    }
}