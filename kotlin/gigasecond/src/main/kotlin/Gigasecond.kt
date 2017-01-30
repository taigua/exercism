import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class Gigasecond(date: LocalDateTime) {
    constructor(date: LocalDate): this(LocalDateTime.of(date, LocalTime.of(0, 0)))
    
    val date: LocalDateTime = date.plusSeconds(1000000000)
}