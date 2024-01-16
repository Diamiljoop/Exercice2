public class Creatabthree{
    // Creation d'un attribut
    int [] tab={1,2,3,4,5};
   //creation d'une methode qui permet d'incrementer un tableau 
   public static void incremente(int[] tab){
    for(int i=0;i< tab.length;i++){
        tab[i]=tab[i]+1;
        System.out.println(tab[i]);
    }
}

    public static void main(String [] args){
        //creation d'un objet
        Creatabthree tableau=new Creatabthree();
        incremente(tableau.tab);
}

}