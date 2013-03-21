
package Kap15;

import java.util.LinkedList;
import java.util.Scanner;

public class LankadListaTest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LinkedList<String> namnLista = new LinkedList<>();
        int val;
        String namn;
        boolean fortsatt = true;
        while (fortsatt) 
        {//loopen körs så länge fortsatt = true
            
            if (namnLista.isEmpty()) {
                System.out.println("Listan är tom");
            }else{
                for (int i = 0; i < namnLista.size(); i++) {
                    
                    System.out.println(i + ". " + namnLista.get(i));
                }//End for
            }//end if else
            
            System.out.println("");
            
            System.out.print("Dina val");
            System.out.println("1. Fyll listan med namn");
            System.out.println("2. Lägg till ett namn");
            System.out.println("3. Lägg till ett namn på en viss plats");
            System.out.println("4. Se element nummer");
            System.out.println("5. Ta bord element nummer");
            System.out.println("6. Ta bort ett namn");
            System.out.println("7. Ta bort alla");
            System.out.println("0. Avsluta");
            System.out.println("");
            
            try {                
            
            System.out.print("Välj något av ovanstående alternativ: ");
            val = sc.nextInt();

            switch (val) {
                case 1:
//                    char laggTillNamn = 'n';
//                    do {
//                        System.out.print("Ange ett namn: ");
//                        namn = sc.next();
//                        namnLista.add(namn);
//                        System.out.print("Vill du lägga till ett till namn(j/n)? ");
//                        laggTillNamn = sc.next().charAt(0);
//                        System.out.println("");
//                    } while (laggTillNamn == 'J' || laggTillNamn == 'j');
//                    System.out.println("");
                    namnLista.add("Kalle");
                    namnLista.add("Pelle");
                    namnLista.add("Olle");
                    namnLista.add("Johan");
                    namnLista.add("Lisa");
                    namnLista.add("Patrik");
                    
                    break;
                case 2:                    
                    System.out.print("Ange ett namn: ");
                        namn = sc.next();
                        if (!namn.equals("")) {
                        namnLista.add(namn);//lägger till ett namn
                    }//end if
                        
                    break;
                case 3:                    
                    System.out.print("Ange ett namn: ");//anger namnet
                    namn = sc.next();
                    System.out.print("Ange platsen: ");//anger platsen i listan
                    int plats = sc.nextInt();
                    namnLista.add(plats, namn);
                    break;
                case 4:
                    System.out.print("Ange elementets plats");
                    plats = sc.nextInt();
                    System.out.println("Platsen har namnet " + namnLista.get(plats));
                    break;
                case 5:
                    System.out.print("Ange platsen du vill ta bort");
                    plats = sc.nextInt();
                    namnLista.remove(plats);
                    break;
                case 6:
                    System.out.print("Ange namnet du vill ta bort: ");
                    namn = sc.next();
                    boolean hittad = false;
                    if (!namn.equals("")) {
                        for (String namnetIListan : namnLista) {
                            if (namnetIListan.equals(namn)) {
                                namnLista.remove(namn);  
                                hittad = true;
                            }//end if
                        }//end for    
                    }//end if
                    
                    else{
                        System.out.println("Namnet fanns inte med i listan");
                        hittad = true;
                    }
                    
                    if (hittad == false) {
                        System.out.println("Namnet finns inte med i listan");
                    }
                    break;
                case 7:
                    System.out.println("Ta bort listan (j/n)");
                    char svar = sc.next().charAt(0);
                    if (svar == 'j' || svar == 'J') {
                        namnLista.clear();//tar bort alla namn i listan
                    }else{
                        System.out.println("Du ångrade dig");
                    }
                    
                    break;
                case 0:
                    
                    fortsatt = false;
                    System.out.println("GoodBye");
                    break;
                default:                    
            }//end switch
            } catch (Exception e) {
                System.out.println("Error");
            }//end try
        }//end while
    }//end main    
}//end class
