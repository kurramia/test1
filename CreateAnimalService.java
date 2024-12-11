import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CreateAnimalService {
    protected Set<String> uniqueNames = new HashSet<>();
    protected Random random = new Random();

    protected String[] breeds = {"Dog", "Cat", "Wolf", "Lion"};
    protected String[] names = {"Buddy", "Leo", "Whiskers", "Max", "Bella", "Milo", "Charlie", "Luna", "Oliver", "Daisy"};
    protected String[] characters = {"Friendly", "Curious", "Aggressive", "Calm"};

    public Animal[] createAnimals() {
        Animal[] animals = new Animal[names.length];

        for (int index = 0; index < names.length; index++) {
            String name = names[index];
            if (!uniqueNames.contains(name)) {
                uniqueNames.add(name);
                LocalDate birthDate = generateRandomDate();
                animals[index] = createAnimal(name, birthDate);
            }
        }
        return animals;
    }

    protected Animal createAnimal(String name, LocalDate birthDate) {
        String breed = breeds[random.nextInt(breeds.length)];
        double cost = 50 + (200 - 50) * random.nextDouble();
        String character = characters[random.nextInt(characters.length)];
        return random.nextBoolean() ? new Pet(breed, name, cost, character, birthDate) : new Predator(breed, name, cost, character, birthDate);
    }
    private LocalDate generateRandomDate() {
        int year = 2000 + random.nextInt(24);
        int month = 1 + random.nextInt(12);
        int day = 1 + random.nextInt(28);
        return LocalDate.of(year, month, day);
    }
}
