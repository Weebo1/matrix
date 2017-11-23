package com.company;

import org.opencv.core.*;
import java.io.File;
import org.opencv.core.Core;
import org.opencv.highgui.Highgui;

public class Test {

    static {System.loadLibrary(Core.NATIVE_LIBRARY_NAME);}

    public static void main(String[] args)  {

        File f = new File("C:\\Users\\blm\\Desktop\\JPEG_example.png");
        Mat m = Highgui.imread(f.getAbsolutePath());
        System.out.println("OpenCV Mat data:\n" + m.dump());
        System.out.println("OpenCV Mat cols and rows :\n" + m.cols() + " "+ m.rows());
    }
}
