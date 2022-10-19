class RealMadrid {
    public static void main(String[] args) {
        System.out.println("Real Madrid"); 
    }
}

class Barcelona {
    public static void main(String[] args) {
        System.out.println("Barcelona"); 
    }
}

/*
    Compile this file
        javac onlyOnePublicClass.java -------> 
            generates two class files 
                'Barcelona.class' 
                'RealMadrid.class'
    Execute the class file
        java Barcelona
        java RealMadrid

*/
