package com.deploy.praktikum2.model.dto;

import lombok.Data;

@Data
public class KtpAddRequest {
    private String nomorKtp;
    private String namaLengkap;
    private String alamat;
    private String tanggalLahir; // Format yyyy-MM-dd
    private String jenisKelamin;
}