package services;

import java.util.List;

import entities.ClasseP;
import entities.Professeur;
import repositories.ProfesseurRepository;
import repositories.ClassePRepository;

public class ProfesseurService {
    ProfesseurRepository professeurRepository=new ProfesseurRepository();
    ClassePRepository ClassePRepository=new ClassePRepository();
      public  void ajouterUnProfesseur(Professeur professeur){
        //Transaction
         professeurRepository.insert(professeur);
         List<ClasseP> classeP = professeur.getClassep();
         for (ClasseP cp  : classeP) {
            ClassePRepository.insert(cp);
         }

      }
    
    public void insererProfesseur(Professeur professeur) {
        professeurRepository.insert(professeur);
    }
  
    public List<Professeur>listerProfesseur(){
      return professeurRepository.selectAll();
    }  


    
    
}
