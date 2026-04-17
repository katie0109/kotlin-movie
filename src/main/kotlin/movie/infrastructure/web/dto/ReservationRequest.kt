package movie.infrastructure.web.dto


data class ReservationRequest(
    val screeningId: Long,
    val selectedSeats: List<SelectedSeatRequest>,
)

data class SelectedSeatRequest(
    val seatRow: String,
    val seatColumn: Int,
)
