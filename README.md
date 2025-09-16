# Sistem Pencatatan Aktivitas Memancing
## Deskripsi
Sistem Manajemen Reservasi Lapangan Futsal adalah aplikasi berbasis Java untuk mengelola proses pemesanan dan pencatatan reservasi lapangan futsal. Program ini memudahkan pengelola maupun pengguna untuk:

1.Mencatat data lapangan dan pelanggan.
2.Melakukan reservasi lapangan dengan jadwal tertentu.
3.Melihat daftar reservasi yang sudah dibuat.
4.Mengubah atau menghapus data reservasi.

<img width="641" height="268" alt="image" src="https://github.com/user-attachments/assets/9cd1a449-f7f1-4bf2-8bec-9a48abc5e20a" />

Struktur program dibagi menjadi beberapa komponen:
model → Menyimpan struktur data, seperti Lapangan, Pelanggan, dan Reservasi.
service → Berisi logika CRUD untuk pengelolaan reservasi menggunakan ArrayList.
main → Titik masuk aplikasi (MainApp) yang menampilkan menu interaktif berbasis teks.
Aplikasi ini cocok digunakan sebagai contoh penerapan Object-Oriented Programming (OOP), manipulasi data menggunakan ArrayList, dan pengelolaan input/output berbasis konsol.

Saat program pertama kali dijalankan, eksekusi dimulai dari class MainApp yang berada di package main. Program langsung menampilkan menu utama kepada pengguna.
Menu ini ditampilkan berulang-ulang menggunakan perulangan sehingga pengguna dapat memilih beberapa operasi secara bergantian tanpa harus menjalankan ulang program. Proses ini akan terus berlanjut sampai pengguna memilih opsi Keluar.
Fitur yang tersedia di menu utama:
.Tambah Pelanggan – Menambahkan data pelanggan baru.
.Buat Reservasi – Membuat reservasi lapangan futsal dengan memilih pelanggan dan lapangan.
.Lihat Semua Reservasi – Menampilkan daftar reservasi yang sudah tersimpan.
.Keluar – Mengakhiri program.

<img width="328" height="114" alt="image" src="https://github.com/user-attachments/assets/4124ecc3-c512-4ca4-8a2d-7f9fb410c3fb" />

Jika user memilih menu 1. Tambah Pelanggan, program akan meminta beberapa data pelanggan, yaitu ID Pelanggan, Nama, dan Nomor HP. Data yang dimasukkan user kemudian digunakan untuk membuat objek baru dari class Pelanggan (yang ada di package model). Objek ini lalu disimpan ke dalam ArrayList melalui method di PelangganService. Setelah proses penambahan berhasil, program menampilkan pesan konfirmasi.
<img width="348" height="217" alt="image" src="https://github.com/user-attachments/assets/0c158a19-f27b-4fbe-8bcc-2cf8bd0086a3" />

<img width="479" height="330" alt="image" src="https://github.com/user-attachments/assets/7f2c606a-ca12-4ffd-bb25-a58b13155fbe" />

Jika user memilih menu 2. Buat Reservasi, program akan meminta input data untuk membuat reservasi baru. Data yang diminta antara lain: ID Reservasi, ID Pelanggan (yang sudah ditambahkan sebelumnya), Nama Lapangan, Tanggal, dan Jam Reservasi. Data ini digunakan untuk membuat objek baru dari class Reservasi (package model), kemudian disimpan ke dalam ArrayList melalui method di ReservasiService. Setelah berhasil ditambahkan, program menampilkan pesan konfirmasi.

<img width="740" height="184" alt="image" src="https://github.com/user-attachments/assets/3ffe0c77-0b5c-4a2f-8ae2-0673a7f10130" />

Jika user memilih menu 3 , program ini kan menampilkan semua hasil reservasi yang telah di buatkan , program akan menampilkan user name, lapangan yang mau di pakai ,terus jam dan total harga
<img width="776" height="198" alt="image" src="https://github.com/user-attachments/assets/f4ce3194-a1df-4ecf-bad8-c08ddd38609a" />

jika user memili menu 4 , program in akan di tutup/ selesai
<img width="666" height="258" alt="image" src="https://github.com/user-attachments/assets/2d6fe596-b03c-43ec-9b66-4f4aa1da4a30" />







