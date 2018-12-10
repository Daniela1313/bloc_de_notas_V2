package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import models.Model;
import views.ViewBlocDeNotas;

/**
 *
 * @author Daniela Garcia Rios
 */
public class Controller implements ActionListener {

    Model model;
    ViewBlocDeNotas viewBlocDeNotas;

    public Controller(Model model, ViewBlocDeNotas viewBlocDeNotas) {
        this.model = model;
        this.viewBlocDeNotas = viewBlocDeNotas;
        this.viewBlocDeNotas.jMenuItemOpen.addActionListener(this);
        this.viewBlocDeNotas.jMenuItemReadSave.addActionListener(this);
        inComp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewBlocDeNotas.jMenuItemOpen) {
            jmiRead();
        } else if (e.getSource() == viewBlocDeNotas.jMenuItemReadSave) {
            jmiSave();
        }
    }

    public void jmiRead() {
        try {
            selectPathOpen();
            model.fileRead(model.getPath());
            viewBlocDeNotas.jt_file_archivo.setText(model.getText());
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jmiSave() {
        try {
            selectPathSave();
            model.setText(viewBlocDeNotas.jt_file_archivo.getText());
            model.writeFile(model.getPath(), model.getText());
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void selectPathSave() {
        JFileChooser filechoser = new JFileChooser();
        filechoser.setMultiSelectionEnabled(false);
        filechoser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto *.npr", "npr");
        filechoser.setFileFilter(filter);
        filechoser.showSaveDialog(null);
        model.setPath("" + filechoser.getSelectedFile());
    }

    private void selectPathOpen() {
        JFileChooser filechoser = new JFileChooser();
        filechoser.setMultiSelectionEnabled(false);
        filechoser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto *.npr", "npr");
        filechoser.setFileFilter(filter);
        filechoser.showOpenDialog(null);
        model.setPath("" + filechoser.getSelectedFile());
    }

    public void inComp() {
        viewBlocDeNotas.setTitle("Guardar y abrir archivos");
        viewBlocDeNotas.setLocationRelativeTo(null);
        viewBlocDeNotas.setResizable(false);
        viewBlocDeNotas.setVisible(true);
    }

}
