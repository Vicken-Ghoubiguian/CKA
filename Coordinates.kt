//
final class Coordinates {

    //
    private var longitude: Double = 0.0
    private var latitude: Double = 0.0

    //
    public fun Coordinates(longitude: Double, latitude: Double) {

        //
        this.longitude = longitude
        this.latitude = latitude
    }

    //
    public fun getLongitude(): Double {

        //
        return this.longitude
    }

    //
    public fun getLatitude(): Double {

        //
        return this.latitude
    }

    //
    public override fun toString(): String {

        //
        return ""
    }
}