package entities;

import java.util.ArrayList;
import java.util.List;

public class Professeur {
    private String nomComplet;
    private int id;
    private String nci;
    private String grade;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    List<Classe> classes;
    public List<Classe> getClasses() {
        return classes;
    }
    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }

    private List<ClasseP>  classep =new ArrayList<>();

    public List<ClasseP> getClassep() {
        return classep;
    }
    public void setClassep(List<ClasseP> classep) {
        this.classep = classep;
    }
    public Professeur() {
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public String getNci() {
        return nci;
    }
    public void setNci(String nci) {
        this.nci = nci;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    
}
