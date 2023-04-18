# OOF - Online Food Ordering: Program Pemesanan Makanan Online

## About this Project
OOF merupakan sebuah program sederhana berbasis *Command Prompt* yang memungkinkan *customer* untuk melakukan proses *Order and Delivery* makanan secara *online*. Program ini dibuat menggunakan bahasa Java guna memenuhi salah satu tugas mata kuliah yakni Pemrograman Berbasis Objek.

## UML Class Diagram
UML (*Unified Modelling Language*) adalah suatu metode dalam pemodelan secara visual yang digunakan sebagai sarana perancangan sistem berorientasi objek. Dalam project ini, terdapat tujuh kelas utama yang saling berhubungan antara satu sama lainnya. Hubungan tersebut dapat dilihat pada UML di bawah ini.

## Program Flow
Alur dari proses berjalannya program OOF yang telah dijelaskan sebelumnya ialah sebagai berikut.

**1. Menu Login**
Proses diawali pada menu login. *User* diminta untuk melakukan *input* berupa *username* dan *password*. Berdasarkan *username* yang di-*input*kan, *user* akan dikelompokan ke dalam dua tipe yakni sebagai admin atau sebagai *customer*. Karena masih berbasis *Command Prompt*, saat ini hanya terdapat dua *username* dan *password* yaitu `admin | 123` dan juga `customer | 123`. Berikut merupakan tampilan dari menu login.

**2. Menu Admin**
Jika *user* melakukan *input* pada menu login berupa *username* dan *password* `admin | 123`, maka akan diarahkan menuju menu admin. Di dalam menu ini, *user* dapat melihat restaurant, menambah data restaurant, dan juga menghapus data restaurant. Berikut merupakan tampilan dari menu admin.

**2.1 Menu Admin (Lihat Restaurant)**
Jika admin memilih lihat restaurant, admin dapat melihat id, nama, dan alamat restaurant serta menu yang di jual oleh restaurant yang telah di-*input*kan sebelumnya Berikut merupakan tampilan dari menu admin (lihat restaurant).

**2.2 Menu Admin (Tambah Data Restaurant)**
Jika admin memilih tambah data restaurant, admin dapat menambahkan restaurant baru pada program dengan meng-*input*kan id, nama, dan alamat restaurant serta menu yang di jual oleh restaurant. Berikut merupakan tampilan dari menu admin (tambah data restaurant).

**2.3 Menu Admin (Hapus Data Restaurant)**
Jika admin memilih hapus data restaurant, admin dapat menghapus restaurant yang terdapat pada program dengan meng-*input*kan id restaurantnya. Berikut merupakan tampilan dari menu admin (hapus data restaurant).

**3. Menu Customer**
Jika *user* melakukan *input* pada menu login berupa *username* dan *password* `customer | 123`, maka akan diarahkan menuju menu *customer*. Di dalam menu ini, *user* dapat melihat restaurant, membuat pesanan, dan juga melihat data pesanan. Berikut merupakan tampilan dari menu *customer*.

**3.1 Menu Customer (Lihat Restaurant)**
Jika *customer* memilih lihat restaurant, *customer* dapat melihat id, nama, dan alamat restaurant serta menu yang di jual oleh restaurant sama halnya dengan yang ada pada menu admin. Berikut merupakan tampilan dari menu customer (lihat restaurant).

**3.2 Menu Customer (Tambah Pesanan)**
Jika *customer* memilih tambah pesanan, *customer* dapat membeli makanan atau minuman pada restaurant yang terdapat pada program. *Customer* dalam menu ini meng-*input*kan id restaurant, id menu yang ingin dibeli, jumlah menu yang ingin dibeli, dan juga jarak antara restaurant dan lokasi *customer*. Berikut merupakan tampilan dari menu customer (tambah pesanan).

**3.3 Menu Customer (Lihat Pesanan)**
Jika *customer* memilih lihat pesanan, *customer* dapat melihat kembali data - data terkait dengan pesanan yang telah dilakukan sebelumnya, Berikut merupakan tampilan dari menu customer (lihat pesanan).

## Closing
Sebelumnya, saya mengucapkan terima kasih karena telah membaca laporan *project* ini sampai dengan selesai. Selain itu, saya juga mengucapkan banyak terima kasih kepada teman - teman yang telah membantu saya dalam belajar bahasa Java yang sungguh membuat sakit kepala ini. Saya menyadari bahwa *project* ini masih terdapat banyak sekali kekurangan dan kesalahan di dalamnya. Oleh sebab itu, saya meminta maaf terkait dengan hal tersebut dan juga menerima kritik dan saran agar kedepannya bisa menjadi lebih baik lagi. Terima kasih!

**I Made Arya Adi Pramana - 2205551016**