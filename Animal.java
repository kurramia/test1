import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public interface Animal {
    String getBreed();
    String getName();
    double getCost();
    String getCharacter();
    LocalDate getBirthDate();
    String toString();
    boolean equals(Object obj);
}
