package movie.infrastructure.web.dto


data class ReservationResponse(
    val reservationId: Long,
    val totalPrice: Int,
)
