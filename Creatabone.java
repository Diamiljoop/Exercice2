public class Creatabone{
   //creation d'une methode qui permet de crrer un tableau 
    public static int[] creerTableau(int n){
        int [] tab= new int[n];
        System.out.println("les elemnts du tableau sont : ");
        for(int i=0; i<n;i++){
            tab[i]=i+1;
            System.out.println(tab[i]);
        }
        return tab;  
    }

    public static void main(String [] args){
        //creation d'un objet 
        Creatabone tab=new Creatabone();
        Creatabone.creerTableau(5);
    }
}