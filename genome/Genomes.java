/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genome;

/**
 *
 * @author Hayden
 */
class Genomes {

    int pop = 50;

    int len = 300; // the number of actions performed by the genome.

    int genomes[][] = new int[pop][len + 1]; //The last genome piece is going to be the fitness as evaluated in the JFrame.

    boolean flag = true;

    public Genomes() {
        System.out.println("BinaryGA start");
    }

    public void setPop(int i) {
        pop = i;
    }

    public void setLen(int i) {
        len = i;
    }

    public void genomeMaker() {
        for (int j = 0; j < pop; j++) {

            for (int i = 0; i < len; i++) {
                genomes[j][i] = (int) (Math.random() * 16); // Randomly chooses between 0 and 16 for the whole array of genomes.
            }

        }
    }

    public void reset() {
        for (int j = 0; j < pop; j++) {

            for (int i = 0; i < len; i++) {
                genomes[j][i] = 0; //(int) (Math.random() * 2); // Randomly chooses between 0 and 1 for the whole array of genomes.
            }

        }
    }

    public void altogether() {
        findBest(); // Takes the top 50% of the gene pool and doubles it
        splitGenome(); // Splices DNA every other one
        mutate(); // every bit of genetic code has a 5% chance to change to something else randomly
        //printGenome();
    }

    public void printGenome() { //works 
        for (int i = 0; i < pop; i++) {
            for (int j = 0; j <= len; j++) {
                System.out.print(" " + genomes[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void printGenomeAt(int i) { //works
        int[] printMe = new int[len];
        printMe = getGenomeAt(i);
        for (int j = 0; j < len; j++) {
            System.out.print(" " + printMe[j]);
        }
        System.out.println("");

    }

    public int[] getGenomeAt(int i) { //works
        int returnMe[] = new int[len];

        System.arraycopy(genomes[i], 0, returnMe, 0, len);

        return returnMe;
    }

    public void setGenomeAt(int i, int[] g) { //works directly with genomes
        System.arraycopy(g, 0, genomes[i], 0, len);
    }

    public void setGenomeAt(int i, int[][] g) { //Specifically for unpacking cross
        for (int j = 0; j < len; j++) {
            genomes[i][j] = g[0][j];
            genomes[i + 1][j] = g[1][j];
        }
    }

    private void findBest() {
        sort();
        int newGenomes[][] = new int[pop / 2][len + 1];
        for (int i = 0; i < pop / 2; i++) { //Takes the top half of genomes and puts it in newGenomes
            for (int j = 0; j < len + 1; j++) {
                newGenomes[i][j] = genomes[i][j];
            }
        }
        clearGenomes();
        for (int i = 0; i < pop / 2; i++) {
            for (int j = 0; j < len + 1; j++) {
                genomes[i][j] = newGenomes[i][j]; //makes first half of genomes newGenomes
            }
        }

        for (int i = pop / 2; i < pop; i++) {
            for (int j = 0; j < len + 1; j++) {
                genomes[i][j] = newGenomes[i - (pop / 2)][j]; //makes second half of genomes newGenomes
            }
        }

        //printGenome();
    }

    public void clearGenomes() {
        for (int i = 0; i < pop; i++) {
            for (int j = 0; j < len + 1; j++) {
                genomes[i][j] = 0;
            }
        }
    }

    public void sort() {
        int pocket = 0;

        for (int i = 0; i < pop; i++) {                                   //This is Bubble Sort
            for (int j = 1; j < pop; j++) {

                if (genomes[j - 1][len] < genomes[j][len]) {

                    swap(j - 1, j);
                }
            }
        }
        //printGenome();
    }

    private void swap(int a, int b) {
        int pocket[] = new int[len + 1];
        for (int i = 0; i < len + 1; i++) {
            pocket[i] = genomes[a][i];
        }
        for (int i = 0; i < len + 1; i++) {
            genomes[a][i] = genomes[b][i];
        }
        for (int i = 0; i < len + 1; i++) {
            genomes[b][i] = pocket[i];
        }
    }

    public void splitGenome() { //Splits every other one into the best ones.
        if (flag) {
            for (int i = 0; i < pop; i += 2) {
                setGenomeAt(i, (cross(getGenomeAt(i), getGenomeAt(i + 1)))); // Set genome at i with the cross between i and i + 1.
                flag = false;
            }
        } else {
            for (int i = 1; i < pop - 1; i += 2) {
                setGenomeAt(i, (cross(getGenomeAt(i), getGenomeAt(i + 1))));
            }
            flag = true;
        }
    }

    private int[][] cross(int[] a, int[] b) {
        int returnMe[][] = new int[2][len]; //pocket

        int crossPoint = (int) (Math.random() * len);

//        for (int i = 0; i < len; i++) { //To randomly split
//            if (Math.random() > .5) {
//                returnMe[0][i] = b[i];
//                returnMe[1][i] = a[i];
//            }
//            else if (Math.random()<.5){
//                returnMe[0][i] = a[i];
//                returnMe[1][i] = b[i];
//            }
//        }

        for (int i = 0; i < len; i++) { //to swap at a certain point
            
            returnMe[0][i] = b[i];
            returnMe[1][i] = a[i];
        }
        for (int i = crossPoint; i < len; i++) {
            returnMe[0][i] = a[i];
            returnMe[1][i] = b[i];
        }
        return returnMe;

    }

    public void mutate() {
        for (int i = 0; i < pop; i++) {
            for (int j = 0; j < len; j++) {
                if (Math.random() > .97) { //5% chance
                    if (Math.random() > .5) 

                    genomes[i][j] = (int) (Math.random() * 5); //0-4
                    else if (Math.random() < .5){
                        genomes[i][j] = (int) (Math.random() * 17); //0-15
                    }


                }
            }
        }
    }

}
