import java.util.Scanner;

public class App {
    public static DanhSachCauHoi DSCH[];
    public static DanhSachGiaoVien DSGV[];
    public static StudentList DSSV[];
    public static int MatKhau = 12345678;
    public void DangNhap(){
        System.out.println("Moi Dang Nhap Tai Khoan Cua Ban");
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println("Moi Nhap Tai Khoan");
        string = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Moi Nhap Mat Khau");
        string = scanner.nextLine();
        MenuSinhVien();
    }
    public void MenuSinhVien(){
        Scanner scanner = new Scanner(System.in);
        int option;
        while (true) {
           System.out.println("1.Vao Thi");
           System.out.println("2.Xem Thong Tin");
           System.out.println("3.Cap Nhat Thong Tin");
           System.out.println("4.Dang Xuat");
            option = scanner.nextInt();
           if(option == 1){
            System.out.println("Vao Thi thanh cong");
            return;
           } else if(option == 2){
            System.out.println("Thong tin");
            return;
           } else if(option == 3){
             System.out.println("Moi Cap nhat thong tin");
             return;
        }  else if(option == 4){
            return;
        }
         System.out.println("Khong Hop Le Moi Nhap Lai");
        }
    }
    public void ThongThiTracNghiem(){
        Scanner scanner = new Scanner(System.in);
        int option;
        do{
     System.out.println("===============================================");
        System.out.println("Ban muon dang nhap voi tu cach gi: ");
        System.out.println("1.Tu cach sinh vien");
        System.out.println("2.Tu cach giao vien ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                  DangNhap();
                    return;
                case 2:
                    System.out.println("chao giao vien");
                    return;
            }
            System.out.println("Khong hop le moi nhap lai");
        }while(true);
    }
    public static void main(String[] args) {
        App app = new App();
        app.ThongThiTracNghiem();
    }

}