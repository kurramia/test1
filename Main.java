import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        CreateAnimalService createAnimalService = new CreateAnimalService();
        Animal[] animals = createAnimalService.createAnimals();

        SearchService searchService = new SearchServiceImpl();
        System.out.println("Животные, родившиеся в високосные годы: " + Arrays.toString(searchService.findLeapYearNames(animals)));
        System.out.println("Животные старше 2 лет: " + Arrays.toString(searchService.findOlderAnimals(animals, 2)));
        System.out.println("Повторяющиеся животные:");
        searchService.findDuplicates(animals);
    }
}
