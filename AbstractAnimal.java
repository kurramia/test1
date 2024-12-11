import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public abstract class AbstractAnimal implements Animal {
    protected String breed; // порода
    protected String name; // имя
    protected Double cost; // цена в магазине
    protected String character; // характер
    protected LocalDate birthDate;

    public AbstractAnimal(String breed, String name, double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name=name;
        this.cost=cost;
        this.character=character;
        this.birthDate = birthDate;
        //System.out.println("Порода: "+breed+", Имя: "+name+", Цена в магазине: "+cost+", Характер: "+character);
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }
    public LocalDate getBirthDate() { return birthDate; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof AbstractAnimal)) return false;
        AbstractAnimal animal = (AbstractAnimal) obj;
        return Double.compare(animal.cost, cost) == 0 &&
                Objects.equals(breed, animal.breed) &&
                Objects.equals(name, animal.name) &&
                Objects.equals(character, animal.character) &&
                Objects.equals(birthDate, animal.birthDate);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return String.format("%s{breed='%s', name='%s', cost=%.2f, character='%s', birthDate='%s'}",
                getClass().getSimpleName(), breed, name, cost, character, birthDate.format(formatter));
    }
}
