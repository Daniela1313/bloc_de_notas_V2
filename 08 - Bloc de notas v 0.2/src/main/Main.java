package main;

import models.Model;
import models.Model;
import views.ViewBlocDeNotas;
import controllers.Controller;
/**
 *
 * @author Daniela Garcia Rios
 */
public class Main {
    private static Model model;
    private static ViewBlocDeNotas viewBlocDeNotas;
    private static Controller controller;
    
    public static void main(String[] args) {
        model = new Model();
        viewBlocDeNotas = new ViewBlocDeNotas();
        controller = new Controller(model, viewBlocDeNotas);
    }
    
}
