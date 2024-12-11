import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Pet extends AbstractAnimal {

    public Pet(String breed, String name, double cost, String character, LocalDate birthDate){
        super(breed, name, cost, character, birthDate);
    }
}
