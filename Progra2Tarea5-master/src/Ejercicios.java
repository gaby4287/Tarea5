import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicios {

	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirString(String nombre_archivo, String contenido)
	{
		try
		{
			PrintWriter I= new PrintWriter(nombre_archivo);
			I.println(contenido); 
			//Imprime a nombre_archivo, contenido
			I.close();
			//cierra I
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		//captura errores 
	}
	
	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirInt(String nombre_archivo, int contenido)
	{
		try
		{
			PrintWriter n= new PrintWriter(nombre_archivo);
			n.println(contenido); 
			//Imprime a nombre_archivo, contenido
			n.close();
			//cierra n
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		//captura errores 
	}
	
	//Devuelve el primer entero contenido en el archivo con nombre nombre_archivo
	static int leerEntero(String nombre_archivo)
	{
	    int n;
	    Scanner sc=new Scanner(System.in);
	    
	    try
	    {
		n=sc.nextInt();
		//lee el numero ingresado desde el teclado
		System.out.println(n);
		//imprime lo que hay en la variable n
		sc.close();
		//cierra el scanner para ahorrar espacio
		
		return n;
	 }catch(Exception e)
	{
		e.printStackTrace();
	}	
		return -1;
	}
	
	//Devuelve la primera string contenida en el archivo con nombre nombre_archivo
	static String leerString(String nombre_archivo)
	{
		String s;
		Scanner sc=new Scanner(System.in);
		
		try
		{
			s=sc.next();
			//guarda los datos ingresados desde el teclado
			System.out.println(s);
			//imprime lo que hay en la variable s
			sc.close();
			//cierra el scanner
			
			return s;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return "";
	}
	
	//Devuelve el primer double contenido en el archivo con nombre nombre_archivo
	static double leerDouble(String nombre_archivo)
	{
		double n;
		Scanner sc= new Scanner(System.in);
		
		try
		{
		n=sc.nextDouble();
		//almacena los datos ingresados
		System.out.println(n);
		//imprime el valor de la variable n
		sc.close();
		//cierra el scanner
		
		return n;
		
		}catch( Exception e)
		{
			e.printStackTrace();
		}
		
		return -1;
	}
	
	//Devuelve la cantidad de veces que buscada (dado) existe en el archivo con nombre nombre_archivo (dado)
	static int contar(String nombre_archivo, String buscada)
	{
		String p;
		int cont=0;
		
  
		try{
			Scanner sc = new Scanner(new File(nombre_archivo));
		
			while(sc.hasNext())
			{
			// asigna el valor string encontrado 
			p= sc.next();
			// si p es igual a la variable aumenta 1
			if(p.equals(buscada)) cont = cont +1;
			}
			System.out.println(cont);
			sc.close();
			//cierra el scanner
		
			return cont;
		//intenta atrapar un error 	
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		return -1;
	}
	
	//Devuelve el promedio de los numeros almacenados en un archivo
	//Nota: el archivo unicamente contiene enteros
	static int getPromedio(String nombre_archivo)
	{
				int suma=0;
				int cont=0;
				
				try{
					
					Scanner sc = new Scanner(new File(nombre_archivo));
					
					while(sc.hasNextInt())
					{
					   // agrega el siguiente numero entero a la suma
						suma = suma + sc.nextInt();
						cont = cont+1;
					}
					
					int prom;
					prom = suma/cont;
	
					System.out.println(prom);
					sc.close();
					//cierra el scanner
		
					return prom;
			   // intenta atrapar un error
				}catch (FileNotFoundException e){
					e.printStackTrace();
				}
				return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
