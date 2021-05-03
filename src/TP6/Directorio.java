/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6;

import java.util.*;
import javax.swing.JOptionPane;




/**
 *
 * @author Chony
 */
public class Directorio {
   
    TreeMap<Long, Cliente> lista=new TreeMap<>();
   
  
    public void agregarCliente(Long l, Cliente c){
        if(lista.put(l,c)==c){
            
            JOptionPane.showMessageDialog(null, "no se puede agregar");
        }else{
            JOptionPane.showMessageDialog(null, "se puede agregar");
                    lista.put(l,c);
        }
    }
    
    public Cliente buscarCliente(Long tel){
      Set<Long> claves = lista.keySet();
      Long aux=null;
      for(Long c: claves){
          if(lista.get(c).equals(lista.get(tel)))
              aux=c;
      }
      
      return lista.get(aux);
    }
    
    public Set<Long> buscarTelefono(String apellido){
        Set<Long>llaves=lista.keySet();
        Set<Long> aux=new HashSet();
        
        for(long l: llaves){
            Cliente c=lista.get(l);
            if(c.apellido.equals(apellido)){
                aux.add(l);
            }
        }
        return aux;
  
    }
    
    public Collection<Cliente> buscarClientes(String ciudad){
     
     Set<Long>llaves=lista.keySet();
     Collection<Cliente>clientes=new HashSet();
        
        for(long l: llaves){
            Cliente c=lista.get(l);
            if(c.ciudad.equals(ciudad)){
                clientes.add(lista.get(l));
            }
        }
        return clientes;
        
    }
    public Collection<Cliente> borrarCliente(Long dni){
     Set<Long>llaves=lista.keySet();
     Collection<Cliente>clientes=new HashSet();
        
        for(long l: llaves){
            Cliente c=lista.get(l);
            if(c.getDni() == dni){
                clientes.add(lista.get(l));
                lista.remove(l);
            }
        }
        return clientes;
        
        
    }

   

    
    
}
