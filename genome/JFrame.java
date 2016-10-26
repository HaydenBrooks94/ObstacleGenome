/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genome;

// @author Hayden
import java.awt.Graphics;

public class JFrame extends javax.swing.JFrame {

    Genomes theGA = new Genomes();
    ThreadedClass thread = new ThreadedClass();
    Maze maze = new Maze(100, 15);
    boolean cycle = false;
//    int xEnding[] = new int[theGA.pop];
//    int yEnding[] = new int[theGA.pop];
    int winCount = 0;
    int genCount = 0;

    public JFrame() {
        initComponents();
        setVisible(true);
        System.out.println("" + 4);
        setSize(1500, 1000);
        showMaze();
        this.repaint();

    }

    @Override
    public void paint(Graphics g) {
        super.paintComponents(g);
        genLabel.setText("" + genCount);
        for (int j = 0; j < maze.size; j++) {
            for (int i = 0; i < maze.size; i++) {
                maze.mazeArray[maze.size - 1][maze.size - 1] = 4;

                if (maze.mazeArray[j][i] == 4) {
                    g.fillRect(10 + i * 5, 35 + i * 5, 7, 7);
                }
                if (maze.mazeArray[j][i] == 3) {
                    g.fillRect(11 + i * 5, 36 + j * 5, 5, 5);
                }
                if (maze.mazeArray[j][i] == 2) {
                    g.drawRect(10 + i * 5, 35 + j * 5, 5, 5);
                }
            }
//            for (int i = 0; i < theGA.pop; i++) {
//                g.fillRect(10 + xEnding[i] * 5, 35 + yEnding[i], 5, 5);
//            }
//            clearEndings(xEnding, yEnding);
        }

        // g.dispose();// super.paint(g);
    }

    public void showMaze() {
//        mazeTA.setText("");
//        for (int i = 0; i < maze.size; i++) {
//            for (int j = 0; j < maze.size; j++) {
//                mazeTA.append(String.valueOf(maze.mazeArray[i][j]) + "  ");
//            }
//            mazeTA.append("\n");
//        }
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        makeGenome = new javax.swing.JButton();
        printGenome = new javax.swing.JButton();
        printLastGenome = new javax.swing.JButton();
        splitGenome = new javax.swing.JButton();
        splitnPrint = new javax.swing.JButton();
        mutateButton = new javax.swing.JButton();
        cycleButton = new javax.swing.JButton();
        tfSlide = new javax.swing.JTextField();
        cycleSlider = new javax.swing.JSlider();
        resetGenome = new javax.swing.JButton();
        upBut = new javax.swing.JButton();
        downBut = new javax.swing.JButton();
        leftBut = new javax.swing.JButton();
        rightBut = new javax.swing.JButton();
        newMazeBut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        difSlider = new javax.swing.JSlider();
        runGenomeButton = new javax.swing.JButton();
        breedButton = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();
        oneGen = new javax.swing.JButton();
        fiveGen = new javax.swing.JButton();
        tenGen = new javax.swing.JButton();
        twentyGen = new javax.swing.JButton();
        mazeGen1 = new javax.swing.JButton();
        mazeGen5 = new javax.swing.JButton();
        mazeGen10 = new javax.swing.JButton();
        printMazeBut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mazeGen20 = new javax.swing.JButton();
        mazeGen500 = new javax.swing.JButton();
        fivehundredGen = new javax.swing.JButton();
        runOne = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        genLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        makeGenome.setText("Make Genome");
        makeGenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeGenomeActionPerformed(evt);
            }
        });

        printGenome.setText("Print Genome");
        printGenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printGenomeActionPerformed(evt);
            }
        });

        printLastGenome.setText("Print Genome At");
        printLastGenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printLastGenomeActionPerformed(evt);
            }
        });

        splitGenome.setText("Split Genome");
        splitGenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                splitGenomeActionPerformed(evt);
            }
        });

        splitnPrint.setText("Split and Print");
        splitnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                splitnPrintActionPerformed(evt);
            }
        });

        mutateButton.setText("Mutate");
        mutateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutateButtonActionPerformed(evt);
            }
        });

        cycleButton.setText("Cycle");
        cycleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cycleButtonActionPerformed(evt);
            }
        });

        tfSlide.setText("50");
        tfSlide.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tfSlideMouseMoved(evt);
            }
        });
        tfSlide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSlideActionPerformed(evt);
            }
        });

        cycleSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cycleSliderMouseMoved(evt);
            }
        });

        resetGenome.setText("Reset Genome");
        resetGenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetGenomeActionPerformed(evt);
            }
        });

        upBut.setText("↑");
        upBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButActionPerformed(evt);
            }
        });

        downBut.setText("↓");
        downBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButActionPerformed(evt);
            }
        });

        leftBut.setText("←");
        leftBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftButActionPerformed(evt);
            }
        });

        rightBut.setText("→");
        rightBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightButActionPerformed(evt);
            }
        });

        newMazeBut.setText("New Maze");
        newMazeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMazeButActionPerformed(evt);
            }
        });

        jLabel1.setText("←difficulty");

        difSlider.setMaximum(50);
        difSlider.setValue(10);

        runGenomeButton.setText("Run Genome");
        runGenomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runGenomeButtonActionPerformed(evt);
            }
        });

        breedButton.setText("Breed");
        breedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breedButtonActionPerformed(evt);
            }
        });

        oneGen.setText("Go through 1 generation ");
        oneGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneGenActionPerformed(evt);
            }
        });

        fiveGen.setText("Go through 5 generations");
        fiveGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveGenActionPerformed(evt);
            }
        });

        tenGen.setText("10 generations");
        tenGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenGenActionPerformed(evt);
            }
        });

        twentyGen.setText("20 generations");
        twentyGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twentyGenActionPerformed(evt);
            }
        });

        mazeGen1.setText("New Maze 1 gen");
        mazeGen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mazeGen1ActionPerformed(evt);
            }
        });

        mazeGen5.setText("New Maze 5 gen");
        mazeGen5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mazeGen5ActionPerformed(evt);
            }
        });

        mazeGen10.setText("New Maze 10 gen");
        mazeGen10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mazeGen10ActionPerformed(evt);
            }
        });

        printMazeBut.setText("Print Maze");
        printMazeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printMazeButActionPerformed(evt);
            }
        });

        jLabel2.setText("Number of Cycles ↑");

        mazeGen20.setText("New Maze 20 gen");
        mazeGen20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mazeGen20ActionPerformed(evt);
            }
        });

        mazeGen500.setText("New Maze 500");
        mazeGen500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mazeGen500ActionPerformed(evt);
            }
        });

        fivehundredGen.setText("500 generations");
        fivehundredGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivehundredGenActionPerformed(evt);
            }
        });

        runOne.setText("Run Best Genome");
        runOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runOneActionPerformed(evt);
            }
        });

        jButton1.setText("Clean Maze");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Maze is 100x100. Minimum of 200 moves to reach end.");

        jLabel4.setText("Each specimen gets 300 moves to make it to the end.");

        jLabel5.setText("Generation");

        genLabel.setText("0");

        jLabel6.setText("←How close best is to end");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(675, 675, 675)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(printLastGenome)
                            .addComponent(splitGenome)
                            .addComponent(splitnPrint)
                            .addComponent(mutateButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cycleButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSlide, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cycleSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(makeGenome)
                            .addComponent(resetGenome)
                            .addComponent(printGenome)
                            .addComponent(jLabel2)
                            .addComponent(runOne))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(breedButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(oneGen)
                                .addGap(18, 18, 18)
                                .addComponent(mazeGen1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(twentyGen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tenGen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fiveGen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fivehundredGen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mazeGen5)
                                    .addComponent(mazeGen10)
                                    .addComponent(mazeGen20)
                                    .addComponent(mazeGen500)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(runGenomeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(upBut)
                                    .addComponent(newMazeBut)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(leftBut)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(downBut)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(difSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1))
                                    .addComponent(rightBut)))
                            .addComponent(printMazeBut)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(genLabel)))))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(difSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(newMazeBut)
                                .addComponent(jLabel1)))
                        .addGap(26, 26, 26)
                        .addComponent(upBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(leftBut)
                            .addComponent(rightBut)
                            .addComponent(downBut))
                        .addGap(18, 18, 18)
                        .addComponent(printMazeBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(runGenomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(breedButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oneGen)
                            .addComponent(mazeGen1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fiveGen)
                            .addComponent(mazeGen5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tenGen)
                            .addComponent(mazeGen10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twentyGen)
                            .addComponent(mazeGen20)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(makeGenome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetGenome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printGenome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printLastGenome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(splitGenome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(splitnPrint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mutateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cycleButton)
                            .addComponent(tfSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cycleSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(73, 73, 73)
                        .addComponent(runOne)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mazeGen500)
                    .addComponent(fivehundredGen))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(genLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(584, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BUTTONS AND INTERFACES

    private void makeGenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeGenomeActionPerformed
        theGA.genomeMaker();
        genCount = 0;
    }//GEN-LAST:event_makeGenomeActionPerformed

    private void printGenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printGenomeActionPerformed
        theGA.sort();
        theGA.printGenome();
    }//GEN-LAST:event_printGenomeActionPerformed

    private void printLastGenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printLastGenomeActionPerformed
        theGA.printGenomeAt(0);
        System.out.println(""+ theGA.genomes[0][theGA.len]);
    }//GEN-LAST:event_printLastGenomeActionPerformed

    private void splitGenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_splitGenomeActionPerformed
        theGA.splitGenome();
    }//GEN-LAST:event_splitGenomeActionPerformed

    private void splitnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_splitnPrintActionPerformed
        theGA.splitGenome();
        theGA.printGenome();
    }//GEN-LAST:event_splitnPrintActionPerformed

    private void mutateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutateButtonActionPerformed
        theGA.mutate();
        theGA.printGenome();
    }//GEN-LAST:event_mutateButtonActionPerformed

    private void cycleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cycleButtonActionPerformed
//        cycle = !cycle;
        int a = 0;
//        while (a<cycleSlider.getValue()) {
//            try{
//            binaryGA.altogether();
//            Thread.sleep(1000);
//            } catch (InterruptedException e){
//                e.printStackTrace();
//            }
//
//        }

        while (a < cycleSlider.getValue()) {
            theGA.altogether();
            a++;
            //System.out.println("" + a);
        }
    }//GEN-LAST:event_cycleButtonActionPerformed

    private void tfSlideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSlideActionPerformed

    }//GEN-LAST:event_tfSlideActionPerformed

    private void tfSlideMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSlideMouseMoved
        tfSlide.setText("" + cycleSlider.getValue());
    }//GEN-LAST:event_tfSlideMouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        tfSlide.setText("" + cycleSlider.getValue());

    }//GEN-LAST:event_formMouseMoved

    private void cycleSliderMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cycleSliderMouseMoved
        tfSlide.setText("" + cycleSlider.getValue());
    }//GEN-LAST:event_cycleSliderMouseMoved

    private void resetGenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetGenomeActionPerformed
        theGA.reset();
        genCount = 0;
    }//GEN-LAST:event_resetGenomeActionPerformed

    private void upButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButActionPerformed
        maze.mUp();
        showMaze();
    }//GEN-LAST:event_upButActionPerformed

    private void rightButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightButActionPerformed
//        maze.mRight();
        maze.mRight();
        showMaze();
    }//GEN-LAST:event_rightButActionPerformed

    private void downButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButActionPerformed
        maze.mDown();
        showMaze();
    }//GEN-LAST:event_downButActionPerformed

    private void leftButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftButActionPerformed
        maze.mLeft();
        showMaze();
    }//GEN-LAST:event_leftButActionPerformed

    private void newMazeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMazeButActionPerformed
        maze.newMaze(difSlider.getValue());
        for (int i = 0; i < theGA.pop; i++) {
//            xEnding[i] = 1;
//            yEnding[i] = 1;
        }
        showMaze();
    }//GEN-LAST:event_newMazeButActionPerformed

    private void runGenomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runGenomeButtonActionPerformed
        cleanMaze();
        runGenomes();
    }//GEN-LAST:event_runGenomeButtonActionPerformed

    private void breedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breedButtonActionPerformed
        breed();
    }//GEN-LAST:event_breedButtonActionPerformed

    private void oneGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneGenActionPerformed

        cleanMaze();
        runGenomes();
        breed();
    }//GEN-LAST:event_oneGenActionPerformed

    private void fiveGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveGenActionPerformed
        cleanMaze();
        maze.winCount = 0;
        for (int i = 0; i < 5; i++) {
            runGenomes();
            breed();
        }
        System.out.println("" + (100 * maze.winCount / 5));
    }//GEN-LAST:event_fiveGenActionPerformed

    private void tenGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenGenActionPerformed
        cleanMaze();
        maze.winCount = 0;
        for (int i = 0; i < 10; i++) {
            runGenomes();
            breed();
        }
        System.out.println("" + (100 * maze.winCount / 10));
    }//GEN-LAST:event_tenGenActionPerformed

    private void twentyGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twentyGenActionPerformed
        cleanMaze();
        maze.winCount = 0;
        for (int i = 0; i < 20; i++) {
            runGenomes();
            breed();
        }
        System.out.println("" + (100 * maze.winCount / 20));
    }//GEN-LAST:event_twentyGenActionPerformed

    private void mazeGen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mazeGen1ActionPerformed
        mazeAndGen();
    }//GEN-LAST:event_mazeGen1ActionPerformed

    private void mazeGen5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mazeGen5ActionPerformed
        maze.winCount = 0;
 //       clearEndings(xEnding, yEnding);
        for (int i = 0; i < 5; i++) {
            mazeAndGen();
        }
        System.out.println("" + (100 * maze.winCount / 5));
    }//GEN-LAST:event_mazeGen5ActionPerformed

    private void mazeGen10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mazeGen10ActionPerformed
        maze.winCount = 0;
        for (int i = 0; i < 10; i++) {
            mazeAndGen();
        }
        System.out.println("" + (100 * maze.winCount / 10));
    }//GEN-LAST:event_mazeGen10ActionPerformed

    private void printMazeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printMazeButActionPerformed
        maze.printMaze();
    }//GEN-LAST:event_printMazeButActionPerformed

    private void mazeGen20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mazeGen20ActionPerformed
        maze.winCount = 0;
        for (int i = 0; i < 20; i++) {
            mazeAndGen();
        }
        System.out.println("" + (100 * maze.winCount / 20));
    }//GEN-LAST:event_mazeGen20ActionPerformed

    private void mazeGen500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mazeGen500ActionPerformed
        maze.winCount = 0;
        for (int i = 0; i < 500; i++) {
            mazeAndGen();
        }
        System.out.println("" + (100 * maze.winCount / 500));
    }//GEN-LAST:event_mazeGen500ActionPerformed

    private void fivehundredGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivehundredGenActionPerformed
        cleanMaze();
        maze.winCount = 0;
        for (int i = 0; i < 500; i++) {
            runGenomes();
            breed();
        }
        System.out.println("" + (100 * maze.winCount / 500));    }//GEN-LAST:event_fivehundredGenActionPerformed

    private void runOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runOneActionPerformed
        theGA.sort();
        for (int i = 0; i < theGA.len; i++) {

            maze.machineAction(theGA.genomes[0][i]);
        }
    }//GEN-LAST:event_runOneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        maze.cleanMaze();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mazeAndGen() {
        maze.newMaze(difSlider.getValue());
        showMaze();
        runGenomes();
        breed();
    }

    private void cleanMaze() {
        maze.cleanMaze();
    }

    private void breed() {
        theGA.altogether();
        int k = 0;
        for (int i = 0; i < theGA.pop; i++) {
            if (k < theGA.genomes[i][theGA.len]) {
                k = theGA.genomes[i][theGA.len];
            }
        }
        progressBar.setValue((k * 100) / (maze.size * 2));
    }

//    private void clearEndings(int[] x, int[] y) {
//        for (int i = 0; i < xEnding.length; i++) {
//            maze.mazeArray[x[i]][y[i]] = 0;
//        }
//    }

    private void runGenomes() {
        cleanMaze();
        for (int i = 0; i < theGA.pop; i++) {
            for (int j = 0; j < theGA.len; j++) {
                if (!maze.winFlag) {
                    maze.machineAction(theGA.genomes[i][j]);
                }
            }

            if (maze.winFlag) {
                winCount++;
                theGA.genomes[i][theGA.len] = 1000;
            }
            
            if(!maze.winFlag){
                theGA.genomes[i][theGA.len] = maze.getFitness();
            }
            maze.winFlag = false;
            theGA.genomes[i][theGA.len] = maze.getFitness();
//            xEnding[i] = maze.xPos;
//            yEnding[i] = maze.yPos;
            maze.mazeArray[maze.xPos][maze.yPos] = 0;
            maze.xPos = 1;
            maze.yPos = 1;
        }
        genCount++;
        showMaze();
    }

//    private void runGenome() {
//        maze.xPos = 1;
//        maze.yPos = 1;
//        for (int j = 0; j < theGA.len; j++) {
//            maze.machineAction(theGA.genomes[0][j]);
//            showMaze();
//            try {
//                Thread.sleep(50);                 
//            } catch (InterruptedException ex) {
//                Thread.currentThread().interrupt();
//            }
//        }
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton breedButton;
    private javax.swing.JButton cycleButton;
    private javax.swing.JSlider cycleSlider;
    private javax.swing.JSlider difSlider;
    private javax.swing.JButton downBut;
    private javax.swing.JButton fiveGen;
    private javax.swing.JButton fivehundredGen;
    private javax.swing.JLabel genLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton leftBut;
    private javax.swing.JButton makeGenome;
    private javax.swing.JButton mazeGen1;
    private javax.swing.JButton mazeGen10;
    private javax.swing.JButton mazeGen20;
    private javax.swing.JButton mazeGen5;
    private javax.swing.JButton mazeGen500;
    private javax.swing.JButton mutateButton;
    private javax.swing.JButton newMazeBut;
    private javax.swing.JButton oneGen;
    private javax.swing.JButton printGenome;
    private javax.swing.JButton printLastGenome;
    private javax.swing.JButton printMazeBut;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JButton resetGenome;
    private javax.swing.JButton rightBut;
    private javax.swing.JButton runGenomeButton;
    private javax.swing.JButton runOne;
    private javax.swing.JButton splitGenome;
    private javax.swing.JButton splitnPrint;
    private javax.swing.JButton tenGen;
    private javax.swing.JTextField tfSlide;
    private javax.swing.JButton twentyGen;
    private javax.swing.JButton upBut;
    // End of variables declaration//GEN-END:variables
}
