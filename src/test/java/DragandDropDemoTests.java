import base.BasestTest;
import org.testng.annotations.Test;

public class DragandDropDemoTests extends BasestTest {

    @Test
    public void fullDragNDrop(){
        dragandDropDemo.openUrl();
        dragandDropDemo.fullDrop();
    }
}
