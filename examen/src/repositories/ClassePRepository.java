package repositories;


import java.sql.SQLException;

import entities.ClasseP;


public class ClassePRepository extends Database{
    
    // Méthode pour insérer un professeur
    private final String SQL_INSERT_Classe_P = "INSERT INTO `classe_P `(`id`,`id_pr`, `id_cl`) VALUES (?,?,?)";
    public void insert(ClasseP  classeP){
        try {
             ouvrirConnexion();
             initPrepareStatement(SQL_INSERT_Classe_P);
             statement.setInt(1,classeP.getId());
             statement.setInt(2,classeP.getProfesseur().getId());
             statement.setInt(3,classeP.getClasse().getId());
             executeUpdate();
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    } 
}
