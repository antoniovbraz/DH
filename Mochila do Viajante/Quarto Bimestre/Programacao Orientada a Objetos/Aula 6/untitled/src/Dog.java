import java.time.LocalDate;
import java.time.Year;

public class Dog {
    private String nome;
    private Double weight;
    private  String breed;
    private Year birthDate;
    private Boolean hasTag;
    private Boolean isVaccinated = false;
    private Boolean isNeutered = false;
    private Boolean isUpForAdoption;

    public Dog(String nome, Double weight, String breed, Year birthDate, Boolean hasTag, Boolean isUpForAdoption) {
        this.nome = nome;
        this.weight = weight;
        this.breed = breed;
        this.birthDate = birthDate;
        this.hasTag = hasTag;
        this.isUpForAdoption = isUpForAdoption;
    }

    public getAge() {

    }
}
