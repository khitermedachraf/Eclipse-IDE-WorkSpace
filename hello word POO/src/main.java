// declarations de classe + specialisation (heritage) :



public class main {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Déclarez et créez une chaîne de caractères
        String shockingSentence="The Java String type actually is a class, not a simple type!";
        // Faites-le savoir
        System.out.println(shockingSentence.toUpperCase());
        // Inversez-le
        System.out.println(shockingSentence.replace("simple","primitive"));
        
        int[] myArray = new int[]{7,2,4};
        for (int i=0; i<myArray.length; i++) {

        	System.out.println(myArray[i]);

        }
        System.out.println("\n another way \n");
        for (int number: myArray){
            System.out.println(number);
        }
        // declarations de classe + specialisation (heritage) : 
        
        
	}

}
