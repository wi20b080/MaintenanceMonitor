package at.team;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_MaintenanceMonitor_createInput {

    @Test
    public void test_createInput(){


        //arrange
        MaintenanceMonitor monitor = new MaintenanceMonitor();

        //act
        String message = "-";

        //assert
        Assertions.assertEquals(monitor.createInput(message), message);


    }

}