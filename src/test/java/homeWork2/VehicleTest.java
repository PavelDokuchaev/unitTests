package homeWork2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    @DisplayName("Экземпляр объекта Car также является экземпляром транспортного средства")
    void testInstanceOf(){
        Car car = new Car("Reno", "Duster", 2010);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    @DisplayName("Объект Car развивает скорость 60 в режиме тестового вождения")
    void testDriveCar() {
        Car car = new Car("Reno", "Duster", 2010);
        car.testDrive();
        assertTrue(car.getSpeed() == 60);
    }

    @Test
    @DisplayName("Проверка, что в режиме парковки машина останавдивается (speed = 0)")
    void parkCar() {
        Car car = new Car("Reno", "Duster", 2010);
        car.testDrive();
        car.park();
        assertTrue(car.getSpeed() == 0);
    }

    @Test
    @DisplayName("Объект Car создается с 4-мя колесами")
    void getNumWheelsCar() {
        Car car = new Car("Reno", "Duster", 2010);
        assertTrue(car.getNumWheels() == 4);
    }

    @Test
    @DisplayName("Объект Motorcycle создается с 2-мя колесами")
    void getNumWheelsMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CRF450RX", 2023);
        assertTrue(motorcycle.getNumWheels() == 2);
    }

    @Test
    @DisplayName("Объект Motorcycle развивает скорость 75 в режиме тестового вождения")
    void testDriveMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CRF450RX", 2023);
        motorcycle.testDrive();
        assertTrue(motorcycle.getSpeed() == 75);
    }

    @Test
    @DisplayName("Проверка, что в режиме парковки мотоцикл останавдивается (speed = 0)")
    void parkMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CRF450RX", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertTrue(motorcycle.getSpeed() == 0);
    }
}