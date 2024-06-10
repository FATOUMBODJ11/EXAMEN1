import java.util.List;
import java.util.Scanner;

import entities.Classe;
import entities.ClasseP;
import entities.Professeur;
import services.ClasseService;
import services.ProfesseurService;


public class ResponsablePedagogiqueView {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc = new Scanner(System.in);
        ClasseService classeService=new ClasseService() ;
        do{
            System.out.println("1-Ajouter une classe");
            System.out.println("2-Lister les classes");
            System.out.println("3-Ajouter des professeurs");
            System.out.println("4-Lister les professeurs");
            System.out.println("5-Filtrer les classes d'un professeur");
            choix=sc.nextInt();
            sc.nextLine();
            ProfesseurService professeurService;
            switch (choix) {
                case 1:
                System.out.println("Entrez le niveau de la classe(L1, L2, L3)");
                String niveau=sc.nextLine();
                System.out.println("Entrez la filière de la classe");
                String filiere=sc.nextLine();
                Classe cl= new Classe();
                cl.setNiveau(niveau);
                cl.setFiliere(filiere);
                classeService.ajouterClasse(cl);
                System.out.println("Classe ajoutée avec succés");


                    break;
                case 2:
                List<Classe> listerClasses= classeService.ListerClasse();
                for(Classe c: listerClasses){
                    System.out.println("ID : "+c.getId());
                    System.out.println("Niveau : "+c.getNiveau());
                    System.out.println("Filiere : "+c.getFiliere());
                }

                    break;

                case 3:
                Professeur professeur=new Professeur();
                //1-Donner les Infos de commande (Numero)
                  System.out.println("la date du");
                  professeur.setNci(sc.nextLine());
                  sc.nextLine();
                  System.out.println("Entrer le nom complet");
                  professeur.setNomComplet(sc.nextLine());
                  System.out.println("Entrer le grade");
                  professeur.setGrade(sc.nextLine());
                  
                //2-Ajouter 1 ou plusieurs produits a la commande 
                    //Apres chaque ajout recalculer le montant
                    listerClasses = classeService.ListerClasse();
                    int response;
                    do {
                        for (Classe c : listerClasses) {
                            System.out.println(c.getNiveau()+"-"+c.getFiliere());
                          }
                         System.out.println("Veuillez selectionner la classe à laquelle vous voulez affecter");
                          int idClasse=sc.nextInt(); 
                          cl= classeService.findClasseById(idClasse);
                          if (cl!=null) {
                            ClasseP classeP=new ClasseP();
                            classeP.setClasse(cl);
                            professeur.getClassep().add(classeP);
                            
                          }else{
                             System.out.println("Cet Id n'existe pas");
                          } 
                          
                        
                         System.out.println("Voulez continuez 1-Oui 2-Non"); 
                         response=sc.nextInt(); 
                       
                    } while (response==1);
                    
                    if (professeur.getClassep().size()==0) {
                        System.out.println("Le professeur doit avoir au moins une classe");
                             
                    }else{
                        
                       
                        
                    }

                    break;
                case 4:
                      
                break;     
            
                default:
                    break;
            }
        }while(choix!=5);
    }
    
}
