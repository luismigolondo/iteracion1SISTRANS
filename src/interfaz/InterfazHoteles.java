/**
 * 
 */
package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Logger;

import javax.jdo.JDODataStoreException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import negocio.CadenaHoteles;
import negocio.Hotel;
import negocio.VOReservaHabitacion;

/**
 * Clase principal de la interfaz
 * @author Germ�n Bravo
 * MODIFICADO POR LUIS MIGUEL GOMEZ Y JUAN DAVID DIAZ PARA LA ITERACION 1 DE SISTEMAS TRANSACCIONALES.
 */
@SuppressWarnings("serial")
public class InterfazHoteles extends JFrame implements ActionListener{

	//---------------------------------------------------
	// CONSTANTES
	//---------------------------------------------------
	/**
	 * Logger para escribir la traza de la ejecuci�n
	 */
	private static Logger log = Logger.getLogger(InterfazHoteles.class.getName());
	
	/**
	 * Ruta al archivo de configuraci�n de la interfaz
	 */
	private static final String CONFIG_INTERFAZ = "./resources/config/interfaceConfigApp.json"; 
	
	
	/**
	 * Ruta al archivo de configuraci�n de los nombres de tablas de la base de datos
	 */
	private static final String CONFIG_TABLAS = "./resources/config/TablasBD_A.json"; 
	
	//---------------------------------------------------
	// ATRIBUTOS
	//---------------------------------------------------
	
	private CadenaHoteles hoteles;
	
	private JsonObject guiConfig;
	
	private JsonObject tableConfig;
	
	private PanelDeDatos panelDatos;
	
	private JMenuBar menuBar;
	
	/* ****************************************************************
	 * 			M�todos
	 *****************************************************************/
    /**
     * Construye la ventana principal de la aplicaci�n. <br>
     * <b>post:</b> Todos los componentes de la interfaz fueron inicializados.
     */
    public InterfazHoteles( )
    {
        // Carga la configuraci�n de la interfaz desde un archivo JSON
        guiConfig = openConfig ("Interfaz", CONFIG_INTERFAZ);
        
        // Configura la apariencia del frame que contiene la interfaz gr�fica
        configurarFrame ( );
        if (guiConfig != null) 	   
        {
     	   crearMenu( guiConfig.getAsJsonArray("menuBar") );
        }
        
        tableConfig = openConfig("Tablas BD", CONFIG_TABLAS);
        hoteles = new CadenaHoteles(tableConfig);
        
    	String path = guiConfig.get("bannerPath").getAsString();
        panelDatos = new PanelDeDatos ( );

        setLayout (new BorderLayout());
        add (new JLabel (new ImageIcon (path)), BorderLayout.NORTH );          
        add( panelDatos, BorderLayout.CENTER );        
    }
    
	/* ****************************************************************
	 * 			M�todos de configuraci�n de la interfaz
	 *****************************************************************/
    /**
     * Lee datos de configuraci�n para la aplicaci�, a partir de un archivo JSON o con valores por defecto si hay errores.
     * @param tipo - El tipo de configuraci�n deseada
     * @param archConfig - Archivo Json que contiene la configuraci�n
     * @return Un objeto JSON con la configuraci�n del tipo especificado
     * 			NULL si hay un error en el archivo.
     */
    private JsonObject openConfig (String tipo, String archConfig)
    {
    	JsonObject config = null;
		try 
		{
			Gson gson = new Gson( );
			FileReader file = new FileReader (archConfig);
			JsonReader reader = new JsonReader ( file );
			config = gson.fromJson(reader, JsonObject.class);
			log.info ("Se encontr� un archivo de configuraci�n v�lido: " + tipo);
		} 
		catch (Exception e)
		{
//			e.printStackTrace ();
			log.info ("NO se encontr� un archivo de configuraci�n v�lido");			
			JOptionPane.showMessageDialog(null, "No se encontr� un archivo de configuraci�n de interfaz v�lido: " + tipo, "Cadena de Hoteles", JOptionPane.ERROR_MESSAGE);
		}	
        return config;
    }
    
    /**
     * M�todo para configurar el frame principal de la aplicaci�n
     */
    private void configurarFrame(  )
    {
    	int alto = 0;
    	int ancho = 0;
    	String titulo = "";	
    	
    	if ( guiConfig == null )
    	{
    		log.info ( "Se aplica configuraci�n por defecto" );			
			titulo = "Cadena de Hoteles";
			alto = 300;
			ancho = 500;
    	}
    	else
    	{
			log.info ( "Se aplica configuraci�n indicada en el archivo de configuraci�n" );
    		titulo = guiConfig.get("title").getAsString();
			alto= guiConfig.get("frameH").getAsInt();
			ancho = guiConfig.get("frameW").getAsInt();
    	}
    	
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLocation (50,50);
        setResizable( true );
        setBackground( Color.WHITE );

        setTitle( titulo );
		setSize ( ancho, alto);        
    }

    /**
     * M�todo para crear el men� de la aplicaci�n con base em el objeto JSON le�do
     * Genera una barra de men� y los men�s con sus respectivas opciones
     * @param jsonMenu - Arreglo Json con los men�s deseados
     */
    private void crearMenu(  JsonArray jsonMenu )
    {    	
    	// Creaci�n de la barra de men�s
        menuBar = new JMenuBar();       
        for (JsonElement men : jsonMenu)
        {
        	// Creaci�n de cada uno de los men�s
        	JsonObject jom = men.getAsJsonObject(); 

        	String menuTitle = jom.get("menuTitle").getAsString();        	
        	JsonArray opciones = jom.getAsJsonArray("options");
        	
        	JMenu menu = new JMenu( menuTitle);
        	
        	for (JsonElement op : opciones)
        	{       	
        		// Creaci�n de cada una de las opciones del men�
        		JsonObject jo = op.getAsJsonObject(); 
        		String lb =   jo.get("label").getAsString();
        		String event = jo.get("event").getAsString();
        		
        		JMenuItem mItem = new JMenuItem( lb );
        		mItem.addActionListener( this );
        		mItem.setActionCommand(event);
        		
        		menu.add(mItem);
        	}       
        	menuBar.add( menu );
        }        
        setJMenuBar ( menuBar );	
    }
    
	//------------------------------------
	 // Metodos de requerimientos
	//------------------------------------
    public void RF7registrarReservaHabitacion( )
    {
    	try 
    	{
    		long id = Long.parseLong(JOptionPane.showInputDialog (this, "Ingrese el identificador de la reserva a crear", "Agregar nueva reserva habitacion", JOptionPane.QUESTION_MESSAGE));
    		long idCliente = Long.parseLong(JOptionPane.showInputDialog (this, "Ingrese la cedula de ciduadania del cliente", "Agregar nueva reserva habitacion", JOptionPane.QUESTION_MESSAGE));
    		long tipoId = Long.parseLong(JOptionPane.showInputDialog (this, "Ingrese el tipo de identificacion", "Agregar nueva reserva habitacion", JOptionPane.QUESTION_MESSAGE));
    		long idHabitacion = Long.parseLong(JOptionPane.showInputDialog (this, "Ingrese el numero de la habitacion", "Agregar nueva reserva habitacion", JOptionPane.QUESTION_MESSAGE));
    		long idPlanDeConsumo = Long.parseLong(JOptionPane.showInputDialog (this, "Ingrese el plan de consumo para la reserva", "Agregar nueva reserva habitacion", JOptionPane.QUESTION_MESSAGE));
    		String idFinic = JOptionPane.showInputDialog (this, "Ingrese la fecha de inicio DD/MM/AAAA", "Agregar nueva reserva habitacion", JOptionPane.QUESTION_MESSAGE);
    		String idFfin= JOptionPane.showInputDialog (this, "Ingrese la fecha de fin DD/MM/AAAA", "Agregar nueva reserva habitacion", JOptionPane.QUESTION_MESSAGE);
    		
    		if (id != 0)
    		{
        		VOReservaHabitacion tb = hoteles.adicionarReservaHabitacion(id, idCliente, tipoId, idHabitacion, idPlanDeConsumo, idFinic, idFfin);
        		if (tb == null)
        		{
        			throw new Exception ("No se pudo crear la reserva: " + id);
        		}
        		String resultado = "En adicionarReservaHabitacion\n\n";
        		resultado += "Reserva adicionada exitosamente: " + tb;
    			resultado += "\n Operaci�n terminada";
    			panelDatos.actualizarInterfaz(resultado);
    		}
    		else
    		{
    			panelDatos.actualizarInterfaz("Operaci�n cancelada por recepcion");
    		}
		} 
    	catch (Exception e) 
    	{
//			e.printStackTrace();
			String resultado = generarMensajeError(e);
			panelDatos.actualizarInterfaz(resultado);
		}
    }

    /**
     * Consulta en la base de datos los tipos de bebida existentes y los muestra en el panel de datos de la aplicaci�n
     */
    public void listarTipoBebida( )
    {
//    	try 
//    	{
//			List <VOTipoBebida> lista = parranderos.darVOTiposBebida();
//
//			String resultado = "En listarTipoBebida";
//			resultado +=  "\n" + listarTiposBebida (lista);
//			panelDatos.actualizarInterfaz(resultado);
//			resultado += "\n Operaci�n terminada";
//		} 
//    	catch (Exception e) 
//    	{
////			e.printStackTrace();
//			String resultado = generarMensajeError(e);
//			panelDatos.actualizarInterfaz(resultado);
//		}
    }

    /**
     * Borra de la base de datos el tipo de bebida con el identificador dado po el usuario
     * Cuando dicho tipo de bebida no existe, se indica que se borraron 0 registros de la base de datos
     */
    public void eliminarTipoBebidaPorId( )
    {
//    	try 
//    	{
//    		String idTipoStr = JOptionPane.showInputDialog (this, "Id del tipo de bedida?", "Borrar tipo de bebida por Id", JOptionPane.QUESTION_MESSAGE);
//    		if (idTipoStr != null)
//    		{
//    			long idTipo = Long.valueOf (idTipoStr);
//    			long tbEliminados = parranderos.eliminarTipoBebidaPorId (idTipo);
//
//    			String resultado = "En eliminar TipoBebida\n\n";
//    			resultado += tbEliminados + " Tipos de bebida eliminados\n";
//    			resultado += "\n Operaci�n terminada";
//    			panelDatos.actualizarInterfaz(resultado);
//    		}
//    		else
//    		{
//    			panelDatos.actualizarInterfaz("Operaci�n cancelada por el usuario");
//    		}
//		} 
//    	catch (Exception e) 
//    	{
////			e.printStackTrace();
//			String resultado = generarMensajeError(e);
//			panelDatos.actualizarInterfaz(resultado);
//		}
    }

    /**
     * Busca el tipo de bebida con el nombre indicado por el usuario y lo muestra en el panel de datos
     */
    public void buscarTipoBebidaPorNombre( )
    {
//    	try 
//    	{
//    		String nombreTb = JOptionPane.showInputDialog (this, "Nombre del tipo de bedida?", "Buscar tipo de bebida por nombre", JOptionPane.QUESTION_MESSAGE);
//    		if (nombreTb != null)
//    		{
//    			VOTipoBebida tipoBebida = parranderos.darTipoBebidaPorNombre (nombreTb);
//    			String resultado = "En buscar Tipo Bebida por nombre\n\n";
//    			if (tipoBebida != null)
//    			{
//        			resultado += "El tipo de bebida es: " + tipoBebida;
//    			}
//    			else
//    			{
//        			resultado += "Un tipo de bebida con nombre: " + nombreTb + " NO EXISTE\n";    				
//    			}
//    			resultado += "\n Operaci�n terminada";
//    			panelDatos.actualizarInterfaz(resultado);
//    		}
//    		else
//    		{
//    			panelDatos.actualizarInterfaz("Operaci�n cancelada por el usuario");
//    		}
//		} 
//    	catch (Exception e) 
//    	{
////			e.printStackTrace();
//			String resultado = generarMensajeError(e);
//			panelDatos.actualizarInterfaz(resultado);
//		}
    }


	/* ****************************************************************
	 * 			M�todos administrativos
	 *****************************************************************/
	/**
	 * Muestra el log de Hoteles
	 */
	public void mostrarLogHoteles ()
	{
		mostrarArchivo ("hoteles.log");
	}
	
	/**
	 * Muestra el log de datanucleus
	 */
	public void mostrarLogDatanuecleus ()
	{
		mostrarArchivo ("datanucleus.log");
	}
	
	/**
	 * Limpia el contenido del log de Hoteles
	 * Muestra en el panel de datos la traza de la ejecuci�n
	 */
	public void limpiarLogHoteles ()
	{
		// Ejecuci�n de la operaci�n y recolecci�n de los resultados
		boolean resp = limpiarArchivo ("hoteles.log");

		// Generaci�n de la cadena de caracteres con la traza de la ejecuci�n de la demo
		String resultado = "\n\n************ Limpiando el log de hoteles ************ \n";
		resultado += "Archivo " + (resp ? "limpiado exitosamente" : "NO PUDO ser limpiado !!");
		resultado += "\nLimpieza terminada";

		panelDatos.actualizarInterfaz(resultado);
	}
	
	/**
	 * Limpia el contenido del log de datanucleus
	 * Muestra en el panel de datos la traza de la ejecuci�n
	 */
	public void limpiarLogDatanucleus ()
	{
		// Ejecuci�n de la operaci�n y recolecci�n de los resultados
		boolean resp = limpiarArchivo ("datanucleus.log");

		// Generaci�n de la cadena de caracteres con la traza de la ejecuci�n de la demo
		String resultado = "\n\n************ Limpiando el log de datanucleus ************ \n";
		resultado += "Archivo " + (resp ? "limpiado exitosamente" : "NO PUDO ser limpiado !!");
		resultado += "\nLimpieza terminada";

		panelDatos.actualizarInterfaz(resultado);
	}
	
	/**
	 * Limpia todas las tuplas de todas las tablas de la base de datos de hoteles
	 * Muestra en el panel de datos el n�mero de tuplas eliminadas de cada tabla
	 */
	public void limpiarBD ()
	{
//		try 
//		{
//    		// Ejecuci�n de la demo y recolecci�n de los resultados
//			long eliminados [] = hoteles.limpiarHoteles();
//			
//			// Generaci�n de la cadena de caracteres con la traza de la ejecuci�n de la demo
//			String resultado = "\n\n************ Limpiando la base de datos ************ \n";
//			resultado += eliminados [0] + " Gustan eliminados\n";
//			resultado += eliminados [1] + " Sirven eliminados\n";
//			resultado += eliminados [2] + " Visitan eliminados\n";
//			resultado += eliminados [3] + " Bebidas eliminadas\n";
//			resultado += eliminados [4] + " Tipos de bebida eliminados\n";
//			resultado += eliminados [5] + " Bebedores eliminados\n";
//			resultado += eliminados [6] + " Bares eliminados\n";
//			resultado += "\nLimpieza terminada";
//   
//			panelDatos.actualizarInterfaz(resultado);
//		} 
//		catch (Exception e) 
//		{
////			e.printStackTrace();
//			String resultado = generarMensajeError(e);
//			panelDatos.actualizarInterfaz(resultado);
//		}
	}
	
	/**
	 * Muestra la presentaci�n general del proyecto
	 */
	public void mostrarPresentacionGeneral ()
	{
		mostrarArchivo ("data/00-ST-ParranderosJDO.pdf");
	}
	
	/**
	 * Muestra el modelo conceptual de hoteles
	 */
	public void mostrarModeloConceptual ()
	{
		mostrarArchivo ("data/Modelo Conceptual Parranderos.pdf");
	}
	
	/**
	 * Muestra el esquema de la base de datos de hoteles
	 */
	public void mostrarEsquemaBD ()
	{
		mostrarArchivo ("data/Esquema BD Parranderos.pdf");
	}
	
	/**
	 * Muestra el script de creaci�n de la base de datos
	 */
	public void mostrarScriptBD ()
	{
		mostrarArchivo ("data/EsquemaParranderos.sql");
	}
	
	/**
	 * Muestra la arquitectura de referencia para Hoteles
	 */
	public void mostrarArqRef ()
	{
		mostrarArchivo ("data/ArquitecturaReferencia.pdf");
	}
	
	/**
	 * Muestra la documentaci�n Javadoc del proyectp
	 */
	public void mostrarJavadoc ()
	{
		mostrarArchivo ("doc/index.html");
	}
	
	/**
     * Muestra la informaci�n acerca del desarrollo de esta apicaci�n
     */
    public void acercaDe ()
    {
		String resultado = "\n\n ************************************\n\n";
		resultado += " * Universidad	de	los	Andes	(Bogot�	- Colombia)\n";		
		resultado += " * Curso: ISIS2304 - Sistemas Transaccionales\n";
		resultado += " * Proyecto: HotelUniandes\n";
		resultado += " * Hecho por Luis Miguel Gomez Londo�o y Juan David Diaz Cristancho\n";
		resultado += " * Inspirado y referenciado principalmente por el proyecto PARRANDEROS elaborado\n";
		resultado += " * por el profesor GERMAN BRAVO\n";
		resultado += "\n ************************************\n\n";

		panelDatos.actualizarInterfaz(resultado);		
    }
    

	/* ****************************************************************
	 * 			M�todos privados para la presentaci�n de resultados y otras operaciones
	 *****************************************************************/
    /**
     * Genera una cadena de caracteres con la lista de los tipos de bebida recibida: una l�nea por cada tipo de bebida
     * @param lista - La lista con los tipos de bebida
     * @return La cadena con una l�ea para cada tipo de bebida recibido
     */
    private String listarTiposBebida(List<String> lista) 
    {
//    	String resp = "Los tipos de bebida existentes son:\n";
//    	int i = 1;
//        for (VOTipoBebida tb : lista)
//        {
//        	resp += i++ + ". " + tb.toString() + "\n";
//        }
//        return resp;
    	return null;
	}

    /**
     * Genera una cadena de caracteres con la descripci�n de la excepcion e, haciendo �nfasis en las excepcionsde JDO
     * @param e - La excepci�n recibida
     * @return La descripci�n de la excepci�n, cuando es javax.jdo.JDODataStoreException, "" de lo contrario
     */
	private String darDetalleException(Exception e) 
	{
		String resp = "";
		if (e.getClass().getName().equals("javax.jdo.JDODataStoreException"))
		{
			JDODataStoreException je = (javax.jdo.JDODataStoreException) e;
			return je.getNestedExceptions() [0].getMessage();
		}
		return resp;
	}

	/**
	 * Genera una cadena para indicar al usuario que hubo un error en la aplicaci�n
	 * @param e - La excepci�n generada
	 * @return La cadena con la informaci�n de la excepci�n y detalles adicionales
	 */
	private String generarMensajeError(Exception e) 
	{
		String resultado = "************ Error en la ejecuci�n\n";
		resultado += e.getLocalizedMessage() + ", " + darDetalleException(e);
		resultado += "\n\nRevise datanucleus.log y hoteles.log para m�s detalles";
		return resultado;
	}

	/**
	 * Limpia el contenido de un archivo dado su nombre
	 * @param nombreArchivo - El nombre del archivo que se quiere borrar
	 * @return true si se pudo limpiar
	 */
	private boolean limpiarArchivo(String nombreArchivo) 
	{
		BufferedWriter bw;
		try 
		{
			bw = new BufferedWriter(new FileWriter(new File (nombreArchivo)));
			bw.write ("");
			bw.close ();
			return true;
		} 
		catch (IOException e) 
		{
//			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Abre el archivo dado como par�metro con la aplicaci�n por defecto del sistema
	 * @param nombreArchivo - El nombre del archivo que se quiere mostrar
	 */
	private void mostrarArchivo (String nombreArchivo)
	{
		try
		{
			Desktop.getDesktop().open(new File(nombreArchivo));
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* ****************************************************************
	 * 			M�todos de la Interacci�n
	 *****************************************************************/
    /**
     * M�todo para la ejecuci�n de los eventos que enlazan el men� con los m�todos de negocio
     * Invoca al m�todo correspondiente seg�n el evento recibido
     * @param pEvento - El evento del usuario
     */
    @Override
	public void actionPerformed(ActionEvent pEvento)
	{
		String evento = pEvento.getActionCommand( );		
        try 
        {
			Method req = InterfazHoteles.class.getMethod ( evento );			
			req.invoke ( this );
		} 
        catch (Exception e) 
        {
			e.printStackTrace();
		} 
	}
    
	/* ****************************************************************
	 * 			Programa principal
	 *****************************************************************/
    /**
     * Este m�todo ejecuta la aplicaci�n, creando una nueva interfaz
     * @param args Arreglo de argumentos que se recibe por l�nea de comandos
     */
    public static void main( String[] args )
    {
        try
        {
        	
            // Unifica la interfaz para Mac y para Windows.
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );
            InterfazHoteles interfaz = new InterfazHoteles( );
            interfaz.setVisible( true );
        }
        catch( Exception e )
        {
            e.printStackTrace( );
        }
    }

}
