/*
 * *
 * Email  : casperadam91@gmail.com
 * IDE    : netbeans ide 7.0.1
 */
package app.utility;

/**
 *
 * @author casper
 */
public interface Query {

    static interface Aplikasi {

        static final String INSERT = "INSERT INTO aplikasi SET id=?, nama=?, pembuat=?, sumber=?, tanggal=?, deskripsi=?;";
        static final String UPDATE = "UPDATE aplikasi SET nama=?, pembuat=?, sumber=?, tanggal=?, deskripsi=? WHERE id=?;";
        static final String DELETE = "DELETE FROM aplikasi WHERE id=?;";
        static final String SELECT = "SELECT * FROM aplikasi ORDER BY nama ASC;";
    }
}
