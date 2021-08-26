package sample;

import java.io.*;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class FileContentReader implements Iterable<String> {
    private File file;
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    public FileContentReader(String filePath) throws FileNotFoundException {
        file = new File(filePath);
        init();
    }

    public FileContentReader(File file) throws FileNotFoundException {
        this.file = file;
        init();
    }

    private void init() throws FileNotFoundException {
        bufferedReader = new BufferedReader(new FileReader(file));
    }

    @Override
    public Iterator<String> iterator() {

        Iterator iterator = new Iterator() {
            String nextLine = null;

            @Override
            public boolean hasNext() {
                boolean hasNext = false;
                try {
                    nextLine = bufferedReader.readLine();
                    if (nextLine != null) {
                        hasNext = true;
                    }
                    return hasNext;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return hasNext;
            }

            @Override
            public Object next() {
                String line = null;
                if (nextLine != null) {
                    line = nextLine;
                } else if (hasNext()) {
                    nextLine = null;
                } else {
                    throw new NoSuchElementException();
                }
                return line;
            }
        };
        return iterator;
    }
}
