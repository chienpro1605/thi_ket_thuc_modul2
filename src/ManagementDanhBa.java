import java.io.IOException;
import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.List;

public class ManagementDanhBa {
    List<DanhBa> list;
   public ManagementDanhBa(){
       try {
           this.list = ReadWriteFileCsv.readFromFile("danhba.csv");
       }catch (Exception e){
           this.list = new ArrayList<>();
       }

   }

    public void add(DanhBa danhBa) throws IOException {
       ReadWriteFileCsv.writeToFile("danhba.csv", list);
        list.add(danhBa);
    }
    public void display(){
        System.out.println("danh sách danh bạ: ");
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public int findPhoneNumber(String phoneNumber){
        for (int i = 0; i<list.size(); i++){
            if (list.get(i).getPhoneNumber().equals(phoneNumber)){
                return i;
            }

        }
        return -1;
    }
    public void editDanhBa(String phoneNumber, DanhBa danhBa){
        if (findPhoneNumber(phoneNumber) == -1){
            System.out.println("không tìm thấy");
        }else {
            list.set(findPhoneNumber(phoneNumber), danhBa);
        }
    }
    public void deleteDanhBa(String phoneNumber){
        if (findPhoneNumber(phoneNumber) == -1){
            System.out.println("không tìm thấy");
        }else {
            list.remove(findPhoneNumber(phoneNumber));
        }
    }
    public void seachDanhBa(String phoneNumber, String name){
        for (int i = 0 ; i<list.size(); i++){
            if (list.get(i).getPhoneNumber().contains(phoneNumber) || list.get(i).getName().contains(name)){
                System.out.println(list.get(i).toString());
            }
        }
    }


}
