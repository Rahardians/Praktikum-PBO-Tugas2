package com.Reva.Tugas2.Nomer3;

// Class Mahasiswa
public class Mahasiswa {
    // Inisiasi variabel (nama, status, semester)
    public String nama = "Reva Rahardian"  ;
    public String status = "Single";
    public int semester = 3;

    // Method getStatus
    public void getStatus(){
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Status\t\t\t: " + status );
        System.out.println("Semester\t\t: " + semester);
    }
}