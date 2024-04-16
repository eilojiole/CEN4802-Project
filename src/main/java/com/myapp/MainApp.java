package com.myapp;

import java.io.File;

public class MainApp  {

    public void printFileNames(File[] a, int i, int lvl)  {


        if(i == a.length)
        {
            return;
        }

        for (int j = 0; j < lvl; j++)
        {
            System.out.print("\t");

        }

        if(a[i].isFile())
        {
            System.out.println(a[i].getName());

        }

        else if(a[i].isDirectory())
        {
            System.out.println("[" + a[i].getName() + "]");
            System.out.println(" " + a[i].length() + " bytes");

            printFileNames(a[i].listFiles(), 0, lvl + 1);
        }

        printFileNames(a, i + 1, lvl);
    }

    public static void main(String[] argvs)
    {

        String path = "C:\\Users\\14076\\3D Objects";

        File fObj = new File(path);

        MainApp obj = new MainApp();
        if(fObj.exists() && fObj.isDirectory())
        {

            File a[] = fObj.listFiles();

            System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
            System.out.println("Displaying Files from the directory: " + fObj);
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");

            obj.printFileNames(a, 0, 0);
        }
    }
}
