
import java.sql.SQLException;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yanti
 */
public interface eServicesProfil {
    Profil insert(Profil profil) throws SQLException;
    void update(Profil profil) throws SQLException;
    void delete(int id) throws SQLException;
    List getAll() throws SQLException;
}
