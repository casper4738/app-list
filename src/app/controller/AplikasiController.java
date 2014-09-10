/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.model.AplikasiModel;
import app.view.PanelAplikasi;
import app.view.PanelAplikasiInput;
import javax.swing.JOptionPane;
import swingx.utility.StringCasper;

/**
 *
 * @author Casper
 */
public class AplikasiController {

    private AplikasiModel model;

    public void setModel(AplikasiModel model) {
        this.model = model;
    }

    public void insert(PanelAplikasiInput view) {
        try {
            if (validasi(view)) {
                model.insert();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex);
        }
    }

    public void update(PanelAplikasiInput view) {
        try {
            if (validasi(view)) {
                model.insert();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex);
        }
    }

    public void delete(PanelAplikasi view) {
        try {
            model.insert();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex);
        }
    }

    public boolean validasi(PanelAplikasiInput view) throws Exception {
        String nama = view.getTextNama().getText();
        String pembuat = view.getTextPembuat().getText();
        String sumber = view.getTextSumber().getText();
        String deskripsi = view.getTextDeskripsi().getText();
        String lokasi = view.getTextLokasi().getText();
        String id = view.getId();

        if (StringCasper.isNullOrEmpty(nama, true)) {
            JOptionPane.showMessageDialog(view, "nama aplikasi belum diisi");
            return false;
        }else if (StringCasper.isNullOrEmpty(lokasi, true)) {
            JOptionPane.showMessageDialog(view, "source code belum dipilih");
            return false;
        }

        model.setNama(nama);
        model.setPembuat(pembuat);
        model.setSumber(sumber);
        model.setDeskripsi(deskripsi);
        model.setTanggal(new java.sql.Date(new java.util.Date().getTime()));
        model.setId(id);
        model.setLokasi(lokasi);

        return true;
    }

}
