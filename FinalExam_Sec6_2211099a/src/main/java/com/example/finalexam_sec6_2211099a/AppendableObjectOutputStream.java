package com.example.finalexam_sec6_2211099a;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream (OutputStream out) throws IOException{
        super(out);
    }
    @Override
    protected void writeStreamHeader()throws IOException{

    }
}
