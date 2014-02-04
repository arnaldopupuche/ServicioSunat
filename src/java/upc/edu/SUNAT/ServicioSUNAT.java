/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upc.edu.SUNAT;


import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.ArrayList;

import upc.edu.Entidad.Empresa;

/**
 *
 * @author alumnos
 */
@WebService(serviceName = "ServicioSUNAT")
public class ServicioSUNAT {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ConsultaPorRUC")
    public Empresa ConsultaPorRUC(@WebParam(name = "name") String RUC)
   {
    ArrayList<Empresa> lstEmpresa = new ArrayList<Empresa>();
       
    /*private String RUC;
    private String Descripcion;
    private String RAM; Remuneracion Asegurable Mensual
    private String Profesion;
    private String FechaInicioLaboral;
    private String EstadoCivil;
    private String Celular;
    private String TelefonoOficina;
    private String Anexo;
    private String NroHijos;
    
    private String DireccionPreferencia;
    private String TipoPreferenciaDireccion;
    private String Referencia;
    private String Departamento;
    private String Provincia;
    private String Distrito;  
    */
    
    Empresa empresa1 = new Empresa();
    
    empresa1.setRUC("20103040506");
    empresa1.setDescripcion("Jorge Romero Flores");
    empresa1.setRAM("5500");
    empresa1.setProfesion("Ing Sistemas");
    empresa1.setFechaInicioLaboral("01/01/2012");
    empresa1.setEstadoCivil("Soltero");
    empresa1.setCelular("987099980");
    empresa1.setTelefonoOficina("723-5223");
    empresa1.setAnexo("3319");
    empresa1.setNroHijos("2");
    empresa1.setDireccionPreferencia("Av Canaval y Moreyra 480");
    empresa1.setTipoPreferenciaDireccion("Oficina");
    empresa1.setReferencia("Esquina con Rep Panama");
    empresa1.setDepartamento("Lima");
    empresa1.setProvincia("Lima");
    empresa1.setDistrito("San Isidro");
    
    Empresa empresa2 = new Empresa();
     
    empresa2.setRUC("20304050607");
    empresa2.setDescripcion("Rosa Luz Martinez");
    empresa2.setRAM("6600");
    empresa2.setProfesion("Administradora");
    empresa2.setFechaInicioLaboral("01/01/2006");
    empresa2.setEstadoCivil("Casada");
    empresa2.setCelular("9563435221");
    empresa2.setTelefonoOficina("623-5851");
    empresa2.setAnexo("215412");
    empresa2.setNroHijos("1");
    empresa2.setDireccionPreferencia("Av Primavera 1314");
    empresa2.setTipoPreferenciaDireccion("Oficina");
    empresa2.setReferencia("Costa Vivanda Encalada");
    empresa2.setDepartamento("Lima");
    empresa2.setProvincia("Lima");
    empresa2.setDistrito("Surco");
    
    lstEmpresa.add(empresa1);
    lstEmpresa.add(empresa2);
    
    
     Empresa EmpresaRespuesta = new Empresa();
     EmpresaRespuesta.setMensaje("No");
     Empresa EmpresaBusqueda = new Empresa();
        for( int i=0; i <lstEmpresa.size(); i++ )
        {
           EmpresaBusqueda= lstEmpresa.get(i);
           if(EmpresaBusqueda.getRUC().equalsIgnoreCase(RUC))
           {
            EmpresaRespuesta=EmpresaBusqueda;
           }
        }
        
    return EmpresaRespuesta;
   }
}
