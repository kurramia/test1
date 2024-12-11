import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class SearchServiceImpl implements SearchService{
    @Override
    public String[] findLeapYearNames(Animal[] animals) {
        return Arrays.stream(animals)
                .filter(animal -> animal.getBirthDate().getYear() % 4 == 0 &&
                        (animal.getBirthDate().getYear() % 100 != 0 || animal.getBirthDate().getYear() % 400 == 0))
                .map(Animal::getName)
                .toArray(String[]::new);
    }

    @Override
    public Animal[] findOlderAnimals(Animal[] animals, int age) {
        return Arrays.stream(animals)
                .filter(animal -> LocalDate.now().getYear() - animal.getBirthDate().getYear() > age)
                .toArray(Animal[]::new);
    }

    @Override
    public void findDuplicates(Animal[] animals) {
        Set<Animal> duplicates = new HashSet<>();
        Set<Animal> seen = new HashSet<>();
        for (Animal animal : animals) {
            if (!seen.add(animal)) {
                duplicates.add(animal);
            }
        }
        duplicates.forEach(System.out::println);
    }
}
