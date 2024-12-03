package controllers

class VenueAPI {
    private var venues = ArrayList<Venue>()

    fun add(venue: Venue): Boolean {
        return venues.add(venue)
    }
}