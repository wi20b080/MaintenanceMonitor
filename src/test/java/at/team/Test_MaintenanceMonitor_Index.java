package at.team;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;


public class Test_MaintenanceMonitor_Index {

    @Test
    public void test_getIndex() throws IOException {

        //arrange
        MaintenanceMonitor monitor = new MaintenanceMonitor();

        //act
        java.nio.file.Path path = java.nio.file.Paths.get("C:\\Users\\43670\\Desktop\\SLM\\MaintenanceMonitor\\front\\index.html");
        String newpath = java.nio.file.Files.readString(path);

        //assert
        Assertions.assertEquals(monitor.getIndex(), newpath);

    }
}
