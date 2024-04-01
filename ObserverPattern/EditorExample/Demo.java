package ObserverPattern.EditorExample;

import ObserverPattern.EditorExample.editor.Editor;
import ObserverPattern.EditorExample.listeners.EmailNotificationListener;
import ObserverPattern.EditorExample.listeners.LogOpenListener;

public class Demo {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("abc@xyz.xom"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
