
package app.dao.impl;

import app.dao.AplikasiDao;
import app.entity.Aplikasi;
import app.utility.Query;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import swingx.utility.AutoNumber;


/**
 *
 * @author Fandy
 */
public class AplikasiDaoImpl implements AplikasiDao{

    private Connection connection;
    private AutoNumber autoNumber;

    public AplikasiDaoImpl(Connection connection) {
        this.connection = connection;
        autoNumber = new AutoNumber(connection);
    }
    
    @Override
    public String getAutoKode() {
        return autoNumber.getAutoNumber("aplikasi");
    }

    @Override
    public void insert(Aplikasi e) throws Exception {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(Query.Aplikasi.INSERT);
            statement.setString(1, e.getId());
            statement.setString(2, e.getNama());
            statement.setString(3, e.getPembuat());
            statement.setString(4, e.getSumber());
            statement.setDate(5, e.getTanggal());
            statement.setString(6, e.getDeskripsi());
            statement.executeUpdate();
            connection.commit();            
        } catch (SQLException exception) {
            try { connection.rollback(); } catch (SQLException ex) { }
            throw new Exception(exception.getMessage());
        } catch (Exception exception) {
            try { connection.rollback(); } catch (SQLException ex) { }
            throw new Exception(exception.getMessage());
        } finally {
            try { connection.setAutoCommit(true); } catch (SQLException ex) { }
            if (statement != null) {
                try {statement.close(); } catch (SQLException exception) { }
            }
        }
    }

    @Override
    public void update(Aplikasi e) throws Exception {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(Query.Aplikasi.UPDATE);
            statement.setString(1, e.getNama());
            statement.setString(2, e.getPembuat());
            statement.setString(3, e.getSumber());
            statement.setDate(4, e.getTanggal());
            statement.setString(5, e.getDeskripsi());
            statement.setString(6, e.getId());
            statement.executeUpdate();
            connection.commit();            
        } catch (SQLException exception) {
            try { connection.rollback(); } catch (SQLException ex) { }
            throw new Exception(exception.getMessage());
        } catch (Exception exception) {
            try { connection.rollback(); } catch (SQLException ex) { }
            throw new Exception(exception.getMessage());
        } finally {
            try { connection.setAutoCommit(true); } catch (SQLException ex) { }
            if (statement != null) {
                try {statement.close(); } catch (SQLException exception) { }
            }
        }
    }
    
    @Override
    public void delete(Object id) throws Exception {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(Query.Aplikasi.DELETE);
            statement.setObject(1, id);
            statement.executeUpdate();
            connection.commit();            
        } catch (SQLException exception) {
            try { connection.rollback(); } catch (SQLException ex) { }
            throw new Exception(exception.getMessage());
        } catch (Exception exception) {
            try { connection.rollback(); } catch (SQLException ex) { }
            throw new Exception(exception.getMessage());
        } finally {
            try { connection.setAutoCommit(true); } catch (SQLException ex) { }
            if (statement != null) {
                try {statement.close(); } catch (SQLException exception) { }
            }
        }
    }

    @Override
    public List<Aplikasi> getList() throws Exception {
        List<Aplikasi> list = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(Query.Aplikasi.SELECT);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {                
                Aplikasi e = new Aplikasi();
                e.setId(rs.getString("id"));
                e.setNama(rs.getString("nama"));
                e.setPembuat(rs.getString("pembuat"));
                e.setSumber(rs.getString("sumber"));
                e.setTanggal(rs.getDate("tanggal"));
                e.setDeskripsi(rs.getString("deskripsi"));
                list.add(e);
            }
            connection.commit();
            return list;
        } catch (SQLException exception) {
            try { connection.rollback(); } catch (SQLException ex) { }
            throw new Exception(exception.getMessage());
        } catch (Exception exception) {
            try { connection.rollback(); } catch (SQLException ex) { }
            throw new Exception(exception.getMessage());
        } finally {
            try { connection.setAutoCommit(true); } catch (SQLException ex) { }
            if (statement != null) {
                try {statement.close(); } catch (SQLException exception) { }
            }
        }
    }
    
    
}
