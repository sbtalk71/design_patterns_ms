package composite;

import java.io.File;
import java.nio.file.Files;

public class FilesDemo {
    public static void main(String[] args) throws Exception{
        File file=new File("C:\\work\\JBoss7Lab\\JBossClass");
        if(file.isDirectory()){
            File[] files=file.listFiles();
             for(File f:files){
                 System.out.println(f);
             }
        }
    }
}
