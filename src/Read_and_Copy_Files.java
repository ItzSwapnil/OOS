// Read and copy files with a specific path and count the number of lines and words in the file.

import java.io.*;
import java.nio.file.*;

public class Read_and_Copy_Files {
    public static void main(String[] args) {
        String sourceFileName = "E:\\Projects\\IdeaProjects\\OOS\\src\\Samples\\source.txt";
        String destinationFileName = "E:\\Projects\\IdeaProjects\\OOS\\src\\Samples\\destination.txt";

        try {
            Path sourcePath = Paths.get(sourceFileName);
            Path destinationPath = Paths.get(destinationFileName);

            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);

            int lineCount = 0;
            int wordCount = 0;

            BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                wordCount += line.split("\\s+").length;
            }

            reader.close();

            System.out.println("File copied successfully to " + destinationFileName);
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

/*
    Output:
File copied successfully to E:\Projects\IdeaProjects\OOS\src\Samples\destination.txt
Number of lines: 5
Number of words: 14
 */