

public class Profesor {



    static int numerosProfesor=0;
    String nombre;
    int area, numeroEmpleado; 
    
    static Profesor []arreglo =new Profesor [26];

//CONSTRUCTOR RECIBE ARCHIVO DE TEXTO
    Profesor(){

    }
    Profesor(String linea){
      String Temporal[]=linea.split(",");
      this.nombre=Temporal[1];
      this.numeroEmpleado=Integer.parseInt(Temporal[2]);
      this.area=Integer.parseInt(Temporal[3]);
      
    }
    public void imprimir(){
    System.out.println(this.nombre + this.numeroEmpleado+ this.area );
    }


    public void importar(String nombreArchivos){
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
           archivo = new File (nombreArchivos);
           fr = new FileReader (archivo);
           br = new BufferedReader(fr);

           String linea;
           int i=0;
           while((linea=br.readLine())!=null){
             arreglo[i]=new Profesor(linea);
             i++;
           }

       	}

        catch(Exception e){
           e.printStackTrace();
        }finally{
           try{
              if( null != fr ){
                 fr.close();
              }
           }catch (Exception e2){
              e2.printStackTrace();
           }
    }
  }
    public void buscar(String nombre){
      if(arreglo.length==0){
        System.out.println("Nesecitas crear o importar profesores. ");
      }else{
        for(int i=0;i<arreglo.length;i++){
          if(nombre==arreglo[i].nombre){
            System.out.println(arreglo[i].nombre);
          }
        }
      }
  }
}//Fin de la clase
