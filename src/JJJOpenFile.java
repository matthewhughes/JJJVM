/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 18/02/13
 * Time: 16:51
 * To change this template use File | Settings | File Templates.
 */
public class JJJOpenFile {
    void Welcome(){
     System.out.println("Welcome to the Java!Java!JSON! Virtual Machine");
     System.out.println("By Matthew Hughes");
     System.out.println("Me@matthewhughes.co.uk");
     System.out.println("MatthewHughes.co.uk");
    }
    void CheckHelp(String Argument){
        if(Argument.equals("Help")){
            Help();
            System.exit(0);
        }
    }

    void Help(){
        System.out.println("the JJJ VM takes in three arguments.");
        System.out.println("The first is the filename of the JJJ code. This has the file extension JJJ.");
        System.out.println("The second indicates if logging is enabled (1) or disabled (0)");
        System.out.println("The third indicates if verbosity is enabled (1) or disabled (0)");
        System.out.println("An example of usage is as follows:");
        System.out.println("");
    }
}
