
package app.utility;

import app.dao.AplikasiDao;
import app.dao.impl.AplikasiDaoImpl;



/**
 *
 * @author casper
 */
public class DaoUtility {
    
    private static AplikasiDao aplikasiDao;

    public static AplikasiDao getAplikasiDao() throws Exception {
        if (aplikasiDao == null) {
            aplikasiDao = new AplikasiDaoImpl(DBUtility.getConnection());
        }
        return aplikasiDao;
    }
    
     
}
