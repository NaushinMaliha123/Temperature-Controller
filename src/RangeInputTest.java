
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class RangeInputTest {
    RangeInput passengerTemperature1, passengerTemperature2, driverTemperature1;

    @BeforeEach

    void setUp() {
        passengerTemperature1 = new RangeInput(70, 50);
        passengerTemperature1 = new RangeInput(80,60);
        driverTemperature1= new RangeInput(90,70);
        driverTemperature1= new RangeInput();


    }

    @Test
    void getCurrentTemperatureForPassenger1() {
        passengerTemperature1.Up();
        passengerTemperature1.Up();
        passengerTemperature1.Down();
        passengerTemperature1.Up();
        assertEquals(72,passengerTemperature1.getCurrentTemperature() );

    }

    @Test
    void getTemperatureForPassenger2() {
        passengerTemperature2.Up();
        passengerTemperature2.Up();
        passengerTemperature2.Up();
        passengerTemperature2.Down();
        passengerTemperature2.Down();
        assertEquals(71, passengerTemperature2.getCurrentTemperature() );
    }


    @Test
    void getTemperatureForDriver1() {
        driverTemperature1.Up();
        driverTemperature1.Up();
        driverTemperature1.Up();
        driverTemperature1.Down();
        driverTemperature1.Down();
        assertEquals(80, driverTemperature1.getCurrentTemperature());
    }



    @Test
    void up() {
    }

    @Test
    void down() {
    }

    @Test
    void getCurrentTemperature() {
    }
}