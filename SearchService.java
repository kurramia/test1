import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public interface SearchService {
    String[] findLeapYearNames(Animal[] animals);
    Animal[] findOlderAnimals(Animal[] animals, int age);
    void findDuplicates(Animal[] animals);
}
