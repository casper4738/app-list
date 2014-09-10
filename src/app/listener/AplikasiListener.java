/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.listener;

import app.entity.Aplikasi;

/**
 *
 * @author Casper
 */
public interface AplikasiListener {

    public void onInsert(Aplikasi e);

    public void onUpdate(Aplikasi e);

    public void onDelete();

}
