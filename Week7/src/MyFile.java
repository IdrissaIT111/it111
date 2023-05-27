import java.io.File;

public class MyFile {

    public static void main(String[]args){

        File dir = new File("NewFolder");
        // how to also find directory ./"Folder name".
        // or Users/Idris/IdeaProjects/Week7/NewFolder

        // create if else statement if exists, yippy skippy
        // else, not a good thing

        if(dir.exists()) {
            System.out.println("Yippy Skippy, we have a directory!");
        } else {
            System.out.println("We are lost in space don't know where that directory is.");
        }

    }
}
