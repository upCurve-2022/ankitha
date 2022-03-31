import java.io.*;  
importjava.util.*;  
// create FileExample class to copy data of one file into another  
publicclassFileExample {  
    // create coptData() method that copy data of file1 into file2  
    publicstaticvoidcopyData(File file1, File file2) throws Exception  
    {  
        // create instances of FileInputStream and FileOutputStream classes for file1 and file2  
        FileInputStreaminputStream = newFileInputStream(file1);  
        FileOutputStreamoutputStream = newFileOutputStream(file2);  
        // use try-catch-finally block to read and write bytes data into file  
        try {  
            // declare variable for indexing  
            inti;  
            // use while loop with read() method of FileInputStream class to read bytes data from file1  
            while ((i = inputStream.read()) != -1) {  
                                  outputStream.write(i);  
            }  
        }  
        // catch block to handle exceptions  
        catch(Exception e) {  
            System.out.println("Error Found: "+e.getMessage());  
        }  
        // use finally to close instance of the FileInputStream and FileOutputStream classes  
        finally {  
            if (inputStream != null) {  
        // use close() method of FileInputStream class to close the stream  
                inputStream.close();  
            }   
            if (outputStream != null) {  
                outputStream.close();  
            }  
        }  
        System.out.println("File Copied");  
    }   
    publicstaticvoid main(String[] args) throws Exception  
    {   
        Scanner sc = newScanner(System.in);    
        System.out.println("Enter the name of the file from where the data would be copied :");  
        String file1 = sc.nextLine();     
        File a = newFile("C:\\Users\\pc\\OneDrive\\Desktop\\"+file1);    
        System.out.println("Enter the name of the file from where the data would be written :");  
        String file2 = sc.nextLine();   
        File b = newFile("C:\\Users\\pc\\OneDrive\\Desktop\\"+file2);  
        sc.close();   
        copyData(a, b);  
    }  
}
