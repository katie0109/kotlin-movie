package movie.repository

import movie.domain.amount.Money
import movie.domain.amount.Point

interface ReservationRepository {
    fun save(
        screeningIds: List<Long>,
        seatsByScreening: Map<Long, List<Pair<String, Int>>>,
        totalPrice: Money,
        usedPoints: Point,
        paymentMethod: String,
    ): Long
}