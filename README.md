# OOF - Online Food Ordering: Program Pemesanan Makanan Online

## About this Project
OOF merupakan sebuah program sederhana berbasis *Command Prompt* yang memungkinkan *customer* untuk melakukan proses *Order and Delivery* makanan secara *online*. Program ini dibuat menggunakan bahasa Java guna memenuhi salah satu tugas mata kuliah yakni Pemrograman Berbasis Objek.

## UML Class Diagram
UML (*Unified Modelling Language*) adalah suatu metode dalam pemodelan secara visual yang digunakan sebagai sarana perancangan sistem berorientasi objek. Dalam project ini, terdapat tujuh kelas utama yang saling berhubungan antara satu sama lainnya. Hubungan tersebut dapat dilihat pada UML di bawah ini.

## Program Flow
Alur dari proses berjalannya program OOF yang telah dijelaskan sebelumnya ialah sebagai berikut.

**1. Menu Login**
Proses diawali pada menu login. *User* diminta untuk melakukan *input* berupa *username* dan *password*. Berdasarkan *username* yang di-*input*kan, *user* akan dikelompokan ke dalam dua tipe yakni sebagai admin atau sebagai *customer*. Karena masih berbasis *Command Prompt*, saat ini hanya terdapat dua *username* dan *password* yaitu `admin | 123` dan juga `customer | 123`. Berikut merupakan tampilan dari menu login.

<img width="257" alt="menu login" src="https://user-images.githubusercontent.com/115071633/232797728-4a804b02-795d-40db-8040-446a73551f29.png">


**2. Menu Admin**
Jika *user* melakukan *input* pada menu login berupa *username* dan *password* `admin | 123`, maka akan diarahkan menuju menu admin. Di dalam menu ini, *user* dapat melihat restaurant, menambah data restaurant, dan juga menghapus data restaurant. Berikut merupakan tampilan dari menu admin.

<img width="254" alt="menu admin" src="https://user-images.githubusercontent.com/115071633/232797829-5ead1fd9-9a6c-494a-a33f-3c098bdf81b3.png">


**2.1 Menu Admin (Lihat Restaurant)**
Jika admin memilih lihat restaurant, admin dapat melihat id, nama, dan alamat restaurant serta menu yang di jual oleh restaurant yang telah di-*input*kan sebelumnya Berikut merupakan tampilan dari menu admin (lihat restaurant).

<img width="265" alt="melihat data restaurant" src="https://user-images.githubusercontent.com/115071633/232798017-63f834d3-ad41-4ad9-afee-790143e6cbb4.png">


**2.2 Menu Admin (Tambah Data Restaurant)**
Jika admin memilih tambah data restaurant, admin dapat menambahkan restaurant baru pada program dengan meng-*input*kan id, nama, dan alamat restaurant serta menu yang di jual oleh restaurant. Berikut merupakan tampilan dari menu admin (tambah data restaurant).

<img width="299" alt="tambah data restaurant" src="https://user-images.githubusercontent.com/115071633/232798077-ed152bec-f80f-4490-9fcb-65afb3bd8849.png">


**2.3 Menu Admin (Hapus Data Restaurant)**
Jika admin memilih hapus data restaurant, admin dapat menghapus restaurant yang terdapat pada program dengan meng-*input*kan id restaurantnya. Berikut merupakan tampilan dari menu admin (hapus data restaurant).

<img width="288" alt="hapus restaurant" src="https://user-images.githubusercontent.com/115071633/232798129-01fb3d6e-4e30-4213-9cb5-f69cea6db5c5.png">


**3. Menu Customer**
Jika *user* melakukan *input* pada menu login berupa *username* dan *password* `customer | 123`, maka akan diarahkan menuju menu *customer*. Di dalam menu ini, *user* dapat melihat restaurant, membuat pesanan, dan juga melihat data pesanan. Berikut merupakan tampilan dari menu *customer*.

<img width="259" alt="menu customer" src="https://user-images.githubusercontent.com/115071633/232798255-9ae15551-fbc8-43fa-b4a2-a40d1bc3b101.png">


**3.1 Menu Customer (Lihat Restaurant)**
Jika *customer* memilih lihat restaurant, *customer* dapat melihat id, nama, dan alamat restaurant serta menu yang di jual oleh restaurant sama halnya dengan yang ada pada menu admin. Berikut merupakan tampilan dari menu customer (lihat restaurant).

<img width="263" alt="data restaurant customer" src="https://user-images.githubusercontent.com/115071633/232798307-2e719800-94c0-4d21-b27f-b149d7cf3881.png">


**3.2 Menu Customer (Tambah Pesanan)**
Jika *customer* memilih tambah pesanan, *customer* dapat membeli makanan atau minuman pada restaurant yang terdapat pada program. *Customer* dalam menu ini meng-*input*kan id restaurant, id menu yang ingin dibeli, jumlah menu yang ingin dibeli, dan juga jarak antara restaurant dan lokasi *customer*. Berikut merupakan tampilan dari menu customer (tambah pesanan).

<img width="257" alt="menu pemesanan" src="https://user-images.githubusercontent.com/115071633/232798383-ade8a978-be4f-4d52-bdb1-064ee96e4d39.png">


**3.3 Menu Customer (Lihat Pesanan)**
Jika *customer* memilih lihat pesanan, *customer* dapat melihat kembali data - data terkait dengan pesanan yang telah dilakukan sebelumnya, Berikut merupakan tampilan dari menu customer (lihat pesanan).

<img width="259" alt="data pesanan" src="https://user-images.githubusercontent.com/115071633/232798450-fdb5b285-15a9-4155-a52e-8cfee78004f7.png">


## Closing
Sebelumnya, saya mengucapkan terima kasih karena telah membaca laporan *project* ini sampai dengan selesai. Selain itu, saya juga mengucapkan banyak terima kasih kepada teman - teman yang telah membantu saya dalam belajar bahasa Java yang sungguh membuat sakit kepala ini. Saya menyadari bahwa *project* ini masih terdapat banyak sekali kekurangan dan kesalahan di dalamnya. Oleh sebab itu, saya meminta maaf terkait dengan hal tersebut dan juga menerima kritik dan saran agar kedepannya bisa menjadi lebih baik lagi. Terima kasih!

**I Made Arya Adi Pramana - 2205551016**
