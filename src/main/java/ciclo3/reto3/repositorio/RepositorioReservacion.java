/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclo3.reto3.repositorio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import ciclo3.reto3.interfaces.InterfaceReservacion;
import ciclo3.reto3.modelo.Reservacion;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioReservacion {
    @Autowired
    private InterfaceReservacion crud4;

    public List<Reservacion> getAll(){
        return (List<Reservacion>) crud4.findAll();
    }

    public Optional<Reservacion> getReservation(int id){
        return crud4.findById(id);
    }

    public Reservacion save(Reservacion reservation){
        return crud4.save(reservation);
    }

    public void delete(Reservacion reservation){
        crud4.delete(reservation);
    }


}
