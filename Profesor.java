class Profesor{
public static Importar(){
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    materias[] arreglo=new materias[59];
    try {
         archivo = new File ("materiasFacultad1.csv");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         String linea;
         int i=0;
         while((linea=br.readLine())!=null){

           arreglo[i]=new materias(linea);
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
      for(int i=0;i<59;i++){
        arreglo[i].Imprimir();
      }
  }
}
