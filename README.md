Pembacaan gambar (image loading)
Gambar input dibaca menggunakan OpenCV dan dikonversi ke grayscale.

Penerapan Morfologi Opening

Opening = Erosi → Dilasi

Digunakan untuk menghilangkan noise kecil pada citra.

Penerapan Morfologi Closing

Closing = Dilasi → Erosi

Digunakan untuk menutup celah kecil atau lubang kecil pada objek.

Perbandingan Hasil Opening & Closing
Notebook menampilkan hasil kedua operasi untuk menunjukkan perbedaan efek pada citra:

Opening cenderung merapikan noise.

Closing cenderung mempertegas objek dan menutup area kosong kecil.

File ini dibuat sebagai bagian dari tugas praktikum untuk memahami perbedaan dan implementasi dari operasi morfologi pada pengolahan citra digital
