package Question4;


public class Main {


    public static void main(String[] args) {
        //PART 1
        System.out.println();
        System.out.println("**************************** PART 1 ****************************");

        Folder demo1 = new Folder("demo1");
        Folder sourceFiles = new Folder("Source Files");
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        Folder cache = new Folder("cache");
        Folder _public = new Folder("public");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        File htaccess = new File(".htaccess");
        File htrouter = new File(".htrouter.php");
        File index = new File("index.html");

        //demo1
        demo1.addFolder(sourceFiles);
        demo1.addFolder(includePath);
        demo1.addFolder(remoteFiles);

        //Source Files
        sourceFiles.addFolder(phalcon);
        sourceFiles.addFolder(app);
        sourceFiles.addFolder(cache);
        sourceFiles.addFolder(_public);
        sourceFiles.addFile(htaccess);
        sourceFiles.addFile(htrouter);
        sourceFiles.addFile(index);

        //app
        app.addFolder(config);
        app.addFolder(controllers);
        app.addFolder(library);
        app.addFolder(migrations);
        app.addFolder(models);
        app.addFolder(views);

        //Output
        demo1.print();

        //PART 2
        System.out.println();
        System.out.println("**************************** PART 2 ****************************");
        sourceFiles.deleteFolder(app);
        demo1.print();

        //PART 3
        System.out.println();
        System.out.println("**************************** PART 3 ****************************");
        sourceFiles.deleteFolder(_public);
        demo1.print();

    }

}
