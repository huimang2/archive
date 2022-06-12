package design_pattern.structural.composite;

import java.util.ArrayList;

public class Folder implements File {
    
    private String name;
    private ArrayList<File> fileList = new ArrayList<File>();

    public Folder(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }

    public Folder add(File file){
        fileList.add(file);
        if(file.getClass() == ApplicationFile.class){
            System.out.println(file.getName() + " 파일이 생성되었습니다.");
        } else if(file.getClass() == Folder.class){
            System.out.println(file.getName() + " 폴더가 생성되었습니다.");
        }
        return this;
    }

    public Folder remove(File file){
        fileList.remove(file);
        if(file.getClass() == ApplicationFile.class){
            System.out.println(file.getName() + " 파일이 삭제되었습니다.");
        } else if(file.getClass() == Folder.class){
            System.out.println(file.getName() + " 폴더가 삭제되었습니다.");
        }
        return this;
    }

    public Folder getChild(){
        System.out.println("..");
        for(File file : fileList){
            System.out.println(file.getName());
        }
        return this;
    }
}
