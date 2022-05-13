package ceasar;

import java.io.FileWriter;

public class Caesar {


    public static void main(String[] args) throws Exception {
        //Программа должна получать путь к текстовому файлу с исходным текстом//

        FileWriter nFile = new FileWriter("file1.txt");

        nFile.write("Хокку \nПодобен лучу самурайский клинок \nИ тот затупился \nПроклятая килька в томате!!");

        nFile.close();
    }

}
