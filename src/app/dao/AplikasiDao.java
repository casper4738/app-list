/*
 * author : casper
 * IDE    : netbeans 7.2
 */
package app.dao;

import app.entity.Aplikasi;
import java.util.List;

/**
 *
 * @author Fandy
 */
public interface AplikasiDao {
    
    public String getAutoKode() throws Exception;
    
    public void insert(Aplikasi e) throws Exception;
    
    public void update(Aplikasi e) throws Exception;
    
    public void delete(Object id) throws Exception;
    
    public List<Aplikasi> getList() throws Exception;
    
}
