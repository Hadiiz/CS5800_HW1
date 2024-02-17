package Question4;

import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<Folder> folders;
    private ArrayList<File> files;

    public Folder(String name){
        this.name = name;
        folders = new ArrayList<Folder>();
        files = new ArrayList<File>();
    }

    //Add
    public void addFolder(Folder folder){
        folders.add(folder);
    }
    public void addFile(File file){
        files.add(file);
    }
    //Delete
    public void deleteFolder(Folder folder){
        folders.remove(folder);
    }
    public void deleteFile(File file){
        files.remove(file);
    }
    //Getters
    public String getName() {
        return name;
    }

    public ArrayList<Folder> getFolders() {
        return folders;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setFolders(ArrayList<Folder> folders) {
        this.folders = folders;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    //Print
    public void print(){
        System.out.println(name);
        for(Folder folder: folders){
            folder.print();
        }
        for(File file: files)
            System.out.println(file.getName());
    }
}
