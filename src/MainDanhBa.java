import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDanhBa {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ManagementDanhBa managementDanhBa = new ManagementDanhBa();
        Validate validate = new Validate();
        while (true){
            Menu();
            int choice =-1;
            while (choice == -1){
                try {
                    choice = scanner.nextInt();

                }catch (InputMismatchException e){
                    System.out.println("nhập sai rồi nhập lại  đê");
                }finally {
                    scanner.nextLine();
                }
            }
            switch (choice){
                case 1:
                    managementDanhBa.display();
                    break;
                case 2:
                    System.out.println("nhập số điện thoại thêm: ");
                    String phoneNumber;
                    do {
                        phoneNumber= scanner.nextLine();
                        if (!validate.valid(phoneNumber,validate.getPhonenumberRegex())){
                            System.out.println("sai định dạng nhập lại đi!");
                        }
                    }while (!validate.valid(phoneNumber,validate.getPhonenumberRegex()));
                    System.out.println("thêm nhóm danh bạ: ");
                    String group = scanner.nextLine();
                    System.out.println("thêm họ và tên: ");
                    String name = scanner.nextLine();
                    System.out.println("thêm giới tính:  ");
                    String gender = scanner.nextLine();
                    System.out.println("thêm địa chỉ: ");
                    String address = scanner.nextLine();
                    System.out.println("thêm ngày sinh: ");
                    String bornDay = scanner.nextLine();
                    System.out.println("thêm email:  ");
                    String email;
                    do {
                        email= scanner.nextLine();
                        if (!validate.valid(email,validate.getEmailRegex())){
                            System.out.println("sai định dạng nhập lại đi!");
                        }
                    }while (!validate.valid(email,validate.getEmailRegex()));
                    managementDanhBa.add(new DanhBa(phoneNumber,group, name, gender, address, bornDay, email));
                    break;
                case 3:
                    System.out.println("nhập số điện thoại cần update: ");
                    String phoneNumber1 = scanner.nextLine();
                    if (managementDanhBa.findPhoneNumber(phoneNumber1) == -1){
                        System.out.println("không tìm thấy số điện thoại này");
                    }else {
                        System.out.println("nhập nhóm danh bạ cần sửa: ");
                        String group1 = scanner.nextLine();
                        System.out.println("nhập tên cần sửa: ");
                        String name1 = scanner.nextLine();
                        System.out.println("nhập giới tính cần sửa: ");
                        String gender1 = scanner.nextLine();
                        System.out.println("nhập địa chỉ: ");
                        String address1 = scanner.nextLine();
                        System.out.println("nhập ngày sinh: ");
                        String bornDay1 = scanner.nextLine();
                        System.out.println("nhập email:  ");
                        String email4;
                        do {
                            email4= scanner.nextLine();
                            if (!validate.valid(email4,validate.getEmailRegex())){
                                System.out.println("sai định dạng nhập lại đi!");
                            }
                        }while (!validate.valid(email4,validate.getEmailRegex()));
                        managementDanhBa.editDanhBa(phoneNumber1, new DanhBa(phoneNumber1, group1, name1, gender1, address1,bornDay1, email4));
                    }
                    break;
                case 4:
                    System.out.println("nhập số điện thoại muốn xóa: ");
                    String phoneNumber2 = scanner.nextLine();
                    if (managementDanhBa.findPhoneNumber(phoneNumber2) == -1){
                        System.out.println("không tìm thấy số điện thoại này");
                    }else {
                        System.out.println("bạn có chắc chắn muốn xóa k   muốn xóa bấm phím Y nha còn k thì bấm gì cũng đc ");
                        String phim = scanner.nextLine();
                        if (phim.equals("Y")){
                            managementDanhBa.deleteDanhBa(phoneNumber2);
                        }else {
                            System.out.println("thôi k xóa nữa");
                        }
                    }
                    break;
                case 5:
                    System.out.println("nhập học tên cần tìm kiếm: ");
                    String name2 = scanner.nextLine();
                    System.out.println("nhập số điện thoại cần tìm kiếm");
                    String phoneNumber3 = scanner.nextLine();
                    managementDanhBa.seachDanhBa(phoneNumber3, name2);
                    break;
                case 6:
                    ReadWriteFileCsv.readFromFile("danhba.csv");
                    break;
                case 7:
                    ReadWriteFileCsv.writeToFile("danhba.csv", managementDanhBa.list);
                    break;
                case 8:
                    System.exit(0);
                    break;
            }


        }

    }
   public static void Menu(){
       System.out.println("----------------menu-----------------");
       System.out.println("1.xem danh sách");
       System.out.println("2.thêm mới");
       System.out.println("3.cập nhật ");
       System.out.println("4.xóa");
       System.out.println("5.tìm kiếm");
       System.out.println("6.đọc vào file");
       System.out.println("7.ghi vào file");
       System.out.println("8.thoát");
       System.out.println("chọn chức năng:  ");

   }





}
