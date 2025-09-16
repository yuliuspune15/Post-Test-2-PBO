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
>Tambah Pelanggan – Menambahkan data pelanggan baru.
>Buat Reservasi – Membuat reservasi lapangan futsal dengan memilih pelanggan dan lapangan.
>Lihat Semua Reservasi – Menampilkan daftar reservasi yang sudah tersimpan.
>Keluar – Mengakhiri program.

<img width="328" height="114" alt="image" src="https://github.com/user-attachments/assets/4124ecc3-c512-4ca4-8a2d-7f9fb410c3fb" />


