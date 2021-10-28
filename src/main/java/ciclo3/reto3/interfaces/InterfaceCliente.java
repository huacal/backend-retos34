/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclo3.reto3.interfaces;

import org.springframework.data.repository.CrudRepository;

import ciclo3.reto3.modelo.Cliente;
/**
 *
 * @author USUARIO
 */
public interface InterfaceCliente extends CrudRepository<Cliente, Integer> {
    
}
