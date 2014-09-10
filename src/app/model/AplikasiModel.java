/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import app.dao.AplikasiDao;
import app.entity.Aplikasi;
import app.listener.AplikasiListener;
import app.utility.DaoUtility;
import java.sql.Date;

/**
 *
 * @author Casper
 */
public class AplikasiModel {

    private String id;
    private String nama;
    private String pembuat;
    private String sumber;
    private String deskripsi;
    private String lokasi;
    private Date tanggal;
    private AplikasiListener listener;

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPembuat(String pembuat) {
        this.pembuat = pembuat;
    }

    public void setSumber(String sumber) {
        this.sumber = sumber;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void setListener(AplikasiListener listener) {
        this.listener = listener;
    }

    protected void fireOnInsert(Aplikasi e) {
        if (listener != null) {
            listener.onInsert(e);
        }
    }

    protected void fireOnUpdate(Aplikasi e) {
        if (listener != null) {
            listener.onUpdate(e);
        }
    }

    protected void fireOnDelete() {
        if (listener != null) {
            listener.onDelete();
        }
    }

    public String getAutoKode() throws Exception {
        AplikasiDao dao = DaoUtility.getAplikasiDao();
        return dao.getAutoKode();
    }

    public void insert() throws Exception {
        Aplikasi e = new Aplikasi();
        e.setDeskripsi(deskripsi);
        e.setTanggal(tanggal);
        e.setSumber(sumber);
        e.setPembuat(pembuat);
        e.setNama(nama);
        e.setId(id);
        e.setLokasi(lokasi);

        AplikasiDao dao = DaoUtility.getAplikasiDao();
        dao.insert(e);
        fireOnInsert(e);
    }

    public void update() throws Exception {
        Aplikasi e = new Aplikasi();
        e.setDeskripsi(deskripsi);
        e.setTanggal(tanggal);
        e.setSumber(sumber);
        e.setPembuat(pembuat);
        e.setNama(nama);
        e.setId(id);
        e.setLokasi(lokasi);

        AplikasiDao dao = DaoUtility.getAplikasiDao();
        dao.update(e);
        fireOnInsert(e);
    }

    public void delete() throws Exception {
        AplikasiDao dao = DaoUtility.getAplikasiDao();
        dao.delete(id);
        fireOnDelete();
    }

}
