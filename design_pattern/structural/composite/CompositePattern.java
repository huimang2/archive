package design_pattern.structural.composite;

public class CompositePattern {
    public static void main(String[] args){
        
        ApplicationFile file1 = new ApplicationFile("file1.txt");
        ApplicationFile file2 = new ApplicationFile("file2.java");
        ApplicationFile file3 = new ApplicationFile("file3.jpg");
        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("forder2");
        Folder folder3 = new Folder("forder3");

        System.out.println("<<파일 생성>>");
        folder1.add(file1).add(file2).add(file3).add(folder2).add(folder3);
        System.out.println("");

        System.out.println("<<파일 삭제>>");
        folder1.remove(file2);
        System.out.println("");

        System.out.println("<<파일 목록>>");
        folder1.getChild();
    }
}
