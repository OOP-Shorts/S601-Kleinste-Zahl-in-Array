import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class GraphicsAppApplication extends GraphicsApp {

   
    @Override
    public void initialize() {
        setCanvasSize(500, 500);
    }

    @Override
    public void draw() {
        drawBackground(Colors.BLACK);
    }

    public static void main(String[] args) {
        GraphicsAppLauncher.launch("GraphicsAppApplication");
    }
}
