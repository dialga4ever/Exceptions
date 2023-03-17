public class main {
    public static void testTabNote(int tab[]){
        
        try{
            for(int i=0;i<tab.length;i++){
                
                if(tab[i]<0){
                    throw new GradeException(("note inferieur a 0 indice:"+i+" valeur :"+tab[i]));
                    
                }
                if(tab[i]>20){
                    
                    throw new GradeException(("note superieur a 20 indice:"+i+" valeur :"+tab[i]));
                }
            }
        }catch(GradeException probleme){
            System.out.println(probleme);
        }


    }
    public static void main(String[] args) throws GradeException {
        int tab[]={1,2,-2,4,5,6,7,9};
        testTabNote(tab);
    }
}
