package com.mycompany.pert3.rpl.Controller;

import com.mycompany.pert3.rpl.Model.MahasiswaDAO;
import com.mycompany.pert3.rpl.Model.MahasiswaModel;
import java.util.List;

public class MahasiswaController {
    private final MahasiswaDAO mahasiswaDAO;
    
    public MahasiswaController(MahasiswaDAO mahasiswaDAO){
        this.mahasiswaDAO = mahasiswaDAO;
    }
    
    public void displayMahasiswaList(List<MahasiswaModel> mahasiswaList){
        if(mahasiswaList.isEmpty()){
            System.out.println("Tidak ada data mahasiswa");
        } else {
            System.out.println("");
            System.out.println("===========================");
            for(MahasiswaModel m: mahasiswaList){
                System.out.println("ID          : " + m.getId());
                System.out.println("NPM         : " + m.getNpm());
                System.out.println("NAMA        : " + m.getNama());
                System.out.println("SEMESTER    : " + m.getSemester());
                System.out.println("IPK         : " + m.getIpk());
                System.out.println("===========================");
            }
        }
    }
    
    public void displayMessage(String message){
        System.out.println(message);
    }
    
    public void checkDatabaseConnection(){
        mahasiswaDAO.checkConnection();
    }
    
    public void displayAllMahasiswa(){
        List<MahasiswaModel> mahasiswaList = mahasiswaDAO.getAllMahasiswa();
        displayMahasiswaList(mahasiswaList);
    }
    
    public void addMahasiswa(String npm, String nama, int semester, float ipk){
        MahasiswaModel mahasiswaBaru = new MahasiswaModel(0, npm, nama, semester, ipk);
        mahasiswaDAO.addMahasiswa(mahasiswaBaru);
        displayMessage("Mahasiswa berhasil ditambahkan!");
    }
    
    public void updateMahasiswa(int id, String npm, String nama, int semester, float ipk){
        MahasiswaModel mahasiswaBaru = new MahasiswaModel(id, npm, nama, semester, ipk);
        mahasiswaDAO.updateMahasiswa(mahasiswaBaru);
        displayMessage("Mahasiswa berhasil diperbarui!");
    }
    
    public void deleteMahasiswa(int id){
        mahasiswaDAO.deleteMahasiswa(id);
        displayMessage("Mahasiswa Berhasil Dihapus!");
    }
    
    public void closeConnection() {
        mahasiswaDAO.closeConnection();
    }
}
