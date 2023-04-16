package ohm.softa.a05.model;

public class Flower extends Plant{
    public Flower(PlantColor color,Integer height, String name, String family ) {
        super(height,name,family);
        if(color == PlantColor.GREEN)
            throw new IllegalArgumentException();
        else{
            this.color = color;
        }
    }
}
