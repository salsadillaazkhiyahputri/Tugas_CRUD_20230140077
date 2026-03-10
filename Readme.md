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
