import java.time.*;
public interface Time{
    void setDateTime(int day, int month, int year, int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
}