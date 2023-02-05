package javaOOP;

import java.io.File;// import package này để xử lý file (creating,reading,writing,deleting)
import java.io.IOException;// import package này để xử lý IOEXception để xử lý lỗi ngoại lệ
// import java.io.FileNotFoundException; // import package này để xử lý lỗi (reading   )
import java.util.Scanner;//(reading)
import java.io.FileWriter;// import package này dùng để ghi vào file (wrting)

public class xulyfile {
    public static void main(String[] args) {
        try {
            // 1.creating
            File myFile = new File("fileName.txt");

            // 2. writing
            if (myFile.canWrite()) {
                FileWriter myWrite = new FileWriter(myFile);
                myWrite.write("to test thui !!!");
                myWrite.close();
                System.out.println("can wirte");
            }

            // 1.1 check Creating
            if (myFile.createNewFile()) {
                System.out.println("File created : " + myFile.getName());
            } else {
                System.out.println("File can't define");
            }

            // 3. Reading
            Scanner myRead = new Scanner(myFile);
            while (myRead.hasNextLine()) {
                // method hasNextLine() : dùng để check hàng tiếp theo có dữ liệu không , method
                // nextLine() : để trỏ sang dòng mới
                String data = myRead.nextLine();
                System.out.println(data);
            }
            myRead.close();

            // 4. deleting
            // dùng method delete() : để xóa
            File deleteFile = new File("deleteFile.txt");

            System.out.println(deleteFile.getName());
            System.out.println(deleteFile.exists());
            if (deleteFile.exists()) {
                deleteFile.delete();
                if (deleteFile.exists()) {
                    System.out.println("failed delete FIle");
                } else {
                    System.out.println("delete File: " + deleteFile.getName());
                }
            }

        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("An error");
            e.printStackTrace();
        }
        // 2.update
    }
}
