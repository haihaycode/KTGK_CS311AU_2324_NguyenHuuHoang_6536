/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTGK_CS311AU_2324_NguyenHuuHoang_6536;

import java.io.Serializable;

/**
 *
 * @author HAIP
 */
// Lớp trừu tượng DanhMuc
abstract class DanhMuc implements Serializable {
    String tenSach;
    String nhaXuatBan;
    int namXuatBan;
    int soTrang;
    double giaBan;
    int soLuong;

    abstract double thanhTien();
}


