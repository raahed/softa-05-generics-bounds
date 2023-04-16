package ohm.softa.a05.model;

import java.util.Objects;

public abstract class Plant implements Comparable<Plant>{

    public Plant(Integer height, String name, String family) {
        this.height = height;
        this.name = name;
        this.family = family;
    }

    int height;
    PlantColor color;
    String family;
    String name;

    public int compareTo(Plant o) {
        if(o.height > this.height){
            return -1;
        } else if (o.height == this.height) {
            return 0;
        }
        else {
            return 1;
        }
    }

    public int getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public PlantColor getColor() {
        return color;
    }

    public String toString(){
        return this.height + " " + this.name + " " + this.family + " " + this.color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return height == plant.height && color == plant.color && Objects.equals(family, plant.family) && Objects.equals(name, plant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, color, family, name);
    }
}
