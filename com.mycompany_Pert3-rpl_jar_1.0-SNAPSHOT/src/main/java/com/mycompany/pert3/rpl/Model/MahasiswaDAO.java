package com.mycompany.pert3.rpl.Model;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaDAO {

    private final List<MahasiswaModel> dataMahasiswa;

    public MahasiswaDAO() {
        dataMahasiswa = new ArrayList<>();
    }

    // Cek koneksi (mode offline / non database)
    public void checkConnection() {
        System.out.println("Koneksi OK (Mode tanpa database)");
    }

    // Mengambil semua data mahasiswa
    public List<MahasiswaModel> getAllMahasiswa() {
        return dataMahasiswa;
    }

    // Menambah mahasiswa baru
    public void addMahasiswa(MahasiswaModel mhs) {
        // Auto-generate ID
        int newId = dataMahasiswa.size() + 1;
        mhs.setId(newId);

        dataMahasiswa.add(mhs);
        System.out.println("Mahasiswa berhasil ditambahkan ke LIST!");
    }

    // Update mahasiswa berdasarkan ID
    public void updateMahasiswa(MahasiswaModel updated) {
        for (int i = 0; i < dataMahasiswa.size(); i++) {
            MahasiswaModel m = dataMahasiswa.get(i);
            if (m.getId() == updated.getId()) {
                dataMahasiswa.set(i, updated);
                System.out.println("Mahasiswa berhasil diupdate!");
                return;
            }
        }
        System.out.println("Update gagal: ID tidak ditemukan!");
    }

    // Delete mahasiswa berdasarkan ID
    public void deleteMahasiswa(int id) {
        dataMahasiswa.removeIf(m -> m.getId() == id);
        System.out.println("Mahasiswa berhasil dihapus dari LIST!");
    }

    // Tutup koneksi (dummy)
    public void closeConnection() {
        System.out.println("Koneksi ditutup (Mode tanpa database)");
    }
}
