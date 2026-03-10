#User API Spesification

##Create KTP
Endpoint : POST /api/ktp

Request Body :
```json
{
  "alamat": "Jl. Godean No. 1, Yogyakarta",
  "jenisKelamin": "Perempuan",
  "namaLengkap": "Salsa Dilla Azkhiyah Putri",
  "nomorKtp": "1234567890",
  "tanggalLahir": "2000-05-15"
}
```

Response Body (success) :
```json
{
  "status": "success",
  "data": {
    "id": 1,
    "nomorKtp": "1234567890",
    "namaLengkap": "Salsa Dilla Azkhiyah Putri",
    "alamat": "Jl. Godean No. 1, Yogyakarta",
    "tanggalLahir": "2000-05-15",
    "jenisKelamin": "Perempuan"
  }
}
```

##Get All KTP
Endpoint : GET /api/ktp

Response Body (success):
```json
{
  "status": "success",
  "data": [
    {
      "id": 1,
      "nomorKtp": "1234567890",
      "namaLengkap": "Salsa Dilla Azkhiyah Putri",
      "alamat": "Jl. Godean No. 1, Yogyakarta",
      "tanggalLahir": "2000-05-15",
      "jenisKelamin": "Perempuan"
    },
    {
      "id": 3,
      "nomorKtp": "9076598765",
      "namaLengkap": "Rangga Dwi Saputra",
      "alamat": "Jl. Magelang No 3, Yogyakarta",
      "tanggalLahir": "2004-04-18",
      "jenisKelamin": "Laki-laki"
    }
  ]
}
```

##Get KTP by ID
Endpoint : GET /api/ktp/{id}

Response Body (success):
```json
{
  "status": "success",
  "data": {
    "alamat": "Jl. Godean No. 1, Yogyakarta",
    "id": 1,
    "jenisKelamin": "Perempuan",
    "namaLengkap": "Salsa Dilla Azkhiyah Putri",
    "nomorKtp": "1234567890",
    "tanggalLahir": "2000-05-15"
  }
}
```

##Update KTP
Endpoint : PUT /api/ktp/{id}

Response Body:
```json
{
  "nomorKtp": "9076598765",
  "namaLengkap": "Rangga Dwi",
  "alamat": "Jl. Magelang No 3, Yogyakarta",
  "tanggalLahir": "2004-04-18",
  "jenisKelamin": "Laki-laki"
}
```

Response Body (success):
```json
{
  "status": "success",
  "data": {
    "alamat": "Jl. Magelang No 3, Yogyakarta",
    "id": 3,
    "jenisKelamin": "Laki-laki",
    "namaLengkap": "Rangga Dwi",
    "nomorKtp": "9076598765",
    "tanggalLahir": "2004-04-18"
  },
  "status": "success"
}
```

##Delete KTP
Endpoint : DELETE /api/ktp/{id}

```json
{
  "status": "success",
  "message": "success delete ktp with id 2"
}
```

Response Body (failed) :
```json
{
  "status": "failed",
  "message": "KTP tidak ditemukan"
}
```



##Tampilan Web

Halaman Utama
<img width="1918" height="1018" alt="halaman utama" src="https://github.com/user-attachments/assets/4eb2eb5d-5cc5-4fec-9f32-2de0cb8bc6af" />


Tambah Data KTP
<img width="1917" height="1013" alt="create data KTP" src="https://github.com/user-attachments/assets/6b6192b1-0f0f-4dea-936a-c269c4e2fc8c" />



Edit Data KTP
<img width="1919" height="1018" alt="Update data KTP" src="https://github.com/user-attachments/assets/9e8b1ba6-0866-4b74-90d0-f68fb91c25c9" />


Hapus Data KTP
<img width="1918" height="1017" alt="delete data ktp" src="https://github.com/user-attachments/assets/f87f0e89-ab0b-49a5-a560-3eff259feb35" />
