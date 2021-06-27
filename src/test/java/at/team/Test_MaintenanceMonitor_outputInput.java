package at.team;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_MaintenanceMonitor_outputInput {

    @Test
    public void test_outputInput() {

        //arrange
        MaintenanceMonitor monitor = new MaintenanceMonitor();

        //act
        String message = "-";

        //assert
        Assertions.assertEquals(monitor.createInput(message), message);


    }
}
