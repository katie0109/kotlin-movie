package movie.repository

import movie.domain.screening.Screening

interface ScreeningRepository {
    fun findById(id: Long): Screening
    fun findAllByMovieId(movieId: Long): List<Screening>
}