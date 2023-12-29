/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTGK_CS311AU_2324_NguyenHuuHoang_6536;

/**
 *
 * @author HAIP
 */
// Lớp TieuThuyet kế thừa từ lớp DanhMuc
class TieuThuyet extends DanhMuc {
    String theLoai;

    @Override
    double thanhTien() {
        return giaBan * soLuong * 0.6; // Giảm giá 40% cho tiểu thuyết
    }
}
