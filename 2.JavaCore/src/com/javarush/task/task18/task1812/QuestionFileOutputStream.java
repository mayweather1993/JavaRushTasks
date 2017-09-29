package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

/* public class QuestionFileOutputStream implements AmigoOutputStream {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream) {
        this.amigoOutputStream = amigoOutputStream;
    }

    private AmigoOutputStream amigoOutputStream;

    @Override
    public void flush() throws IOException {
amigoOutputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
amigoOutputStream.write(b , off , len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        String answer = reader.readLine();
        if(answer.equals("Д"))amigoOutputStream.close();
        if(answer.equals("Н")) ;
    }
}

*/