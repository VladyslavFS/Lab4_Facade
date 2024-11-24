import gLib.GraphicsManager;
import gLib.TextManager;
import gLib.WindowManager;

class Facade {
    private WindowManager windowManager = new WindowManager();
    private GraphicsManager graphicsManager = new GraphicsManager();
    private TextManager textManager = new TextManager();

    public void createWindow() {
        windowManager.create();
    }

    public void drawGraphics() {
        graphicsManager.draw();
    }

    public void addText() {
        textManager.add();
    }
}
