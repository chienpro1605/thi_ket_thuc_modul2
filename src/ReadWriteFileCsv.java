import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileCsv {
    public static void writeToFile(String path, List<DanhBa> danhBas) throws IOException {
        FileWriter fw = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fw);
        String str = "phoneNuBer, group, name, gender, address, bornDay, email\n";
        for (int i = 0; i< danhBas.size(); i++){
            str += danhBas.get(i).getPhoneNumber() + "," + danhBas.get(i).getGroup() + "," + danhBas.get(i).getName()
                    + "," + danhBas.get(i).getGender()+","+danhBas.get(i).getAddress()+","+danhBas.get(i).getBornDay()
                    +"," +danhBas.get(i).getEmail() +"\n";
        }
        bw.write(str);
        bw.close();
        fw.close();
    }
    public static List<DanhBa> readFromFile (String path) throws IOException {
        List<DanhBa> newList = new ArrayList<>();
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String content = br.readLine();
        while ((content = br.readLine())!=null){
            String[] values = content.split(",");
            newList.add(new DanhBa(values[0], values[1], values[2], values[3], values[4], values[5], values[6]));

        }
        return newList;
    }

}
