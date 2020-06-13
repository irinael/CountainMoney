package DataAccessApi;

import java.sql.SQLException;
import java.util.List;

import entitiesForJDBC.Depense;
import entitiesForJDBC.Lieu;

public interface IDataAccess {
	
	Depense ajouterDepense(Depense depense) throws SQLException;
	List<Depense> getAllDepense() throws SQLException;

	List<Lieu> getAllLieu() throws SQLException;
	Lieu getLieuById(int id) throws SQLException;

}
