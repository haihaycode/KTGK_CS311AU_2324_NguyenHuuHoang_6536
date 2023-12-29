/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTGK_CS311AU_2324_NguyenHuuHoang_6536;

/**
 *
 * @author HAIP
 */
import java.io.*;
import java.util.*;


public class DanhMucSach {

    public static List<DanhMuc> danhSachSach = new ArrayList<>();

    public static void luuDanhSachSach(Object obj, String tenFile) {
        try ( ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(tenFile))) {
            outputStream.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object docDanhSachSach(String tenFile) {
        try ( ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(tenFile))) {
            return  inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

  
   
    public DanhMuc timSachGiaoKhoaCoThanhTienLonNhat() {
        // Tìm sách giáo khoa có thành tiền lớn nhất trong danhSachSach
        // ...  
        return null;
    }

    public void sapXepTangDanTheoThanhTien() {
        // Sắp xếp danhSachSach theo thành tiền tăng dần
        // ...
    }
}
