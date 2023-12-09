
public class DanhSachDapAn extends DeThi{
     public  DanhSachDapAn(){};
     public  void DanhSach(){
          System.out.println("Danh sach dap an mon hoc " + this.getTenMonThi());
          int number = this.getSoCau();
          for(int i = 0; i < number ;i++){
               int Index = i + 1;
               int index = this.getIndex()[i];
               String noiDung = this.getDanhSachCauHoi().getCh()[index].getNoiDungCau();
               String dapAn = this.getDanhSachCauHoi().getCh()[index].getDapAn();
               System.out.println("Cau hoi "+ Index + " " +noiDung);
               System.out.println(dapAn);
          }
     }
     public static void main(String[] args){
          DanhSachDapAn ds = new DanhSachDapAn();
          ds.NhapThongTinDeThi();
          ds.MonThi(ds.getTenMonThi().concat(".txt"));
          ds.DanhSach();
     }
}
