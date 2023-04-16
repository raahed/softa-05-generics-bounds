package ohm.softa.a05.tests.models;

import ohm.softa.a05.collections.SimpleFilter;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;
import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.model.Shrub;
import ohm.softa.a05.tests.models.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class FlowerPower {

    private final Logger logger = LogManager.getLogger();

    @Test
    void testInitFlower(){
        assertThrows(IllegalArgumentException.class, () -> new Flower(PlantColor.GREEN, 10, "Hans", "<df"));
    }

    @Test
    void testInitShrub(){
        for(PlantColor color : PlantColor.values()) {
            if (color == PlantColor.GREEN)
                continue;
            assertThrows(IllegalArgumentException.class, () -> new Shrub(color, 60, "Hans", "<df"));
        }
    }
}
