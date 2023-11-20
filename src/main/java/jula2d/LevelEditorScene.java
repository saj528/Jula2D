package jula2d;

import java.awt.event.KeyEvent;

public class LevelEditorScene extends Scene {

    private boolean changingScene = false;
    private double timeToChangeScene = 2.0f;

    public LevelEditorScene() {
        System.out.println("Inside level editor scene");
    }

    @Override
    public void update(double dt) {

        System.out.println("" + (1.0F / dt) + " FPS");

        if (!changingScene && KeyListener.isKeyPressed(KeyEvent.VK_SPACE))
        {
            changingScene = true;
        }

        if (changingScene && timeToChangeScene > 0)
        {
            timeToChangeScene -= dt;
            Window.get().r -= (float) (dt * 5.0d);
            Window.get().g -= (float) (dt * 5.0d);
            Window.get().b -= (float) (dt * 5.0d);
        }
        else if (changingScene)
        {
            Window.changeScene(1);
        }
    }
}