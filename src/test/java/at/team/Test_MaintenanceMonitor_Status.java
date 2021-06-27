package at.team;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_MaintenanceMonitor_Status {

    @Test
    public void test_getStatus(){
        //arrange
        MaintenanceMonitor monitor = new MaintenanceMonitor();
        String message = "-";
        monitor.status(monitor.getStatus());
        //act
        String testvar = monitor.getStatus().getEntity().toString();
        //assert
        Assertions.assertEquals(message, testvar);
    }
}
