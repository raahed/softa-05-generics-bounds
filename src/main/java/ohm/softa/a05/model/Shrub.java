package ohm.softa.a05.model;

public class Shrub extends Plant{

    public Shrub(PlantColor color, Integer height, String name, String family ) {
        super(height, name, family);
        if(color != PlantColor.GREEN)
            throw new IllegalArgumentException();
        else{
            this.color = PlantColor.GREEN;
        }
        //this.color = PlantColor.GREEN;
    }
}
