public class Creatabtwo{
    // Creation d'un attribut
    int [] tab={1,2,3,4,5};
   //creation d'une methode qui permet de crrer un tableau 
   public static int somme(int[] tab){
    int somme=0;
    for(int i=0; i<tab.length;i++){
        somme=somme+tab[i];
    }
    return somme; 
}

    public static void main(String [] args){
        //creation d'un objet
        Creatabtwo tableau=new Creatabtwo();

       System.out.println("la somme des elemnts du tableau sont :"+ somme(tableau.tab));
    }
}