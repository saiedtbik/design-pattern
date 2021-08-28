package sample1;

import java.io.*;

public class Data implements Serializable {
    private String value;
    private String extra;
    private int id;
    private File storedFile;

    public void savePoint() {
        try {
            storedFile = File.createTempFile("data", "obj");
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(storedFile))) {
                objectOutputStream.writeObject(this);
            }
        } catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
    }

    public Data restoreSavePoint() {
        Data data = null;
        try {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(this.storedFile))) {
              data = (Data)objectInputStream.readObject();
            }
        }catch (IOException | ClassNotFoundException ex){
            throw new IllegalStateException();
        }
        return data;
    }
}
