/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTGK_CS311AU_2324_NguyenHuuHoang_6536;

/**
 *
 * @author HAIP
 */
// Lớp SachGiaoKhoa kế thừa từ lớp DanhMuc
class SachGiaoKhoa extends DanhMuc {
    String khoiLop;

    @Override
    double thanhTien() {
        return giaBan * soLuong * 0.8; // Giảm giá 20% cho sách giáo khoa
    }
}