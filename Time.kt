class Time {

    //
    private var sunriseAsTimestampAccordingToUtc: Long? = null
    private var sunsetAsTimestampAccordingToUtc: Long? = null
    private var utcOffsetAsTimestamp: Short? = null

    //
    public fun Time(sunriseAsTimestampAccordingToUtc: Long, sunsetAsTimestampAccordingToUtc: Long, utcOffsetAsTimestamp: Short) {

        //
        this.sunriseAsTimestampAccordingToUtc = sunriseAsTimestampAccordingToUtc
        this.sunsetAsTimestampAccordingToUtc = sunsetAsTimestampAccordingToUtc
        this.utcOffsetAsTimestamp = utcOffsetAsTimestamp
    }

    //
    //public fun getSunriseAsTimestampAccordingToUtc
}