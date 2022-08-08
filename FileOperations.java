import java.util.Scanner;
import java.io.File;
import java.awt.Desktop;  

public class Project1
{
    public static void main(String[] args) 
    {
        DisplayOptions();
    }

    /**
     * 
     */
    public static void DisplayOptions()
    {
        Scanner sc = new Scanner(System.in);        
        
        int option =0;
        try
        {
            do
            {
                System.out.println ("Please select an Option");
                System.out.println ("1. Create a new file");
                System.out.println ("2. Search file ");
                System.out.println ("3. Open File ");
                System.out.println ("4. Delete file ");
                System.out.println ("0. Exit  ");

                System.out.print ("Enter your choice : ");
                option =sc.nextInt();
                    
                switch(option)
                {
                    case 1:
                        try
                        {            
                            System.out.println ("Please enter the filename to be created : ");
                            String fn = sc.next().trim();

                            File file = new File(fn);
                            boolean value = file.createNewFile();
                            if (value==true) 
                                System.out.println("New Java File is created.");
                            else    
                                System.out.println("New Java File could not be created.");
                        }
                        catch(Exception ex)
                        {

                        }
                    break;
                    case 2:
                    {
                        try
                        {            
            
                            System.out.println ("Please enter the Diretory name : ");
                            String dn = sc.next().trim();
            
                            File file = new File(dn);
                            String[] files=  file.list();
                            
                            for (int i=0; i<files.length;i++) {
                                System.out.println (files[i]);
                            }
                        }
                        catch(Exception ex)
                        {
            
                        }
                    break;   
                }

                case 3 :
                    System.out.println ("Please enter the File name : ");
                    String fn = sc.next().trim();

                    File file = new File(fn);
                    
                    Desktop desktop = Desktop.getDesktop();  
                    if (file.exists())
                    {
                        try
                        {
                            desktop.open(file);
                        }
                        catch(Exception ex)
                        {
                            System.out.println ("Something went wrong. File could not be opened " +ex.getMessage());
                        
                        }
                    }
                    else
                    {
                        System.out.println ("No such file with the given filename exists!");
                        
                    }
                    break;
                
                case 4:
                {
                    try
                    {            
                        System.out.println ("Please enter the filename to be deleted : ");
                        fn = sc.next().trim();
                        file = new File(fn);
                        
                        boolean value = file.delete();
                        if (value) 
                            System.out.println("File Deleted");
                        else
                        {
                            System.out.println("File not found");
                        }
                    }
                    catch(Exception ex)
                    {

                    }
                break;   
            }
            case 0:
            System.out.println("Execution exited!!");
                
            break;
            default:
                System.out.println("Invalid option!!");
                
                                
        }
        
        }while(option!=0);
        sc.close();

        }    
        catch (Exception e) 
        {
                System.out.println ("Something went wrong. File could not be opened " +e.getMessage());
                        
        }
        finally
        {

        }
    }
}
