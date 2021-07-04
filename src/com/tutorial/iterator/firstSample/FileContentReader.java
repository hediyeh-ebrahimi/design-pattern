package com.tutorial.iterator.firstSample;

import java.io.*;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class FileContentReader implements Iterable<String> {
    private File file;
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    public FileContentReader(File file) throws FileNotFoundException {
        Objects.requireNonNull(file);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        this.file = file;
    }

    public FileContentReader(String fileName) throws FileNotFoundException {
        this(new File(fileName));
    }

    private void initialize() throws FileNotFoundException {
        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);
    }

    @Override
    public Iterator<String> iterator() {
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }

            if (fileReader != null) {
                fileReader.close();
            }

            initialize();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Iterator<String>() {
            String nextLine = null;

            @Override
            public boolean hasNext() {
                if (nextLine != null) {
                    return true;
                } else {
                    try {
                        nextLine = bufferedReader.readLine();
                        return (nextLine != null) ? true : false;
                    } catch (IOException e) {
                        e.printStackTrace();
                        throw new UncheckedIOException(e);
                    }
                }
            }

            @Override
            public String next() {
                if(nextLine != null || hasNext()){
                    String line = nextLine;
                    nextLine = null;
                    return line;
                }else{
                    throw new NoSuchElementException();
                }
            }
        };
    }
}
