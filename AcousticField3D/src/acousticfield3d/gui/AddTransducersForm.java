/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acousticfield3d.gui;

import acousticfield3d.math.M;
import acousticfield3d.math.Quaternion;
import acousticfield3d.math.Transform;
import acousticfield3d.math.Vector3f;
import acousticfield3d.scene.Entity;
import acousticfield3d.scene.Scene;
import acousticfield3d.simulation.Simulation;
import acousticfield3d.simulation.Transducer;
import acousticfield3d.utils.FileUtils;
import acousticfield3d.utils.Parse;
import acousticfield3d.utils.TextFrame;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asier
 */
public class AddTransducersForm extends javax.swing.JFrame {
    MainForm mf;
    Simulation simulation;
    Scene scene;
    
    public AddTransducersForm(MainForm mf, Simulation simulation, Scene scene) {
        this.scene = scene;
        this.mf = mf;
        this.simulation = simulation;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arrangementGroup = new javax.swing.ButtonGroup();
        spaceText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        colSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        rowSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        posText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rotText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sizeText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        wText = new javax.swing.JTextField();
        pText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        freqText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        phaseText = new javax.swing.JTextField();
        gridCheck = new javax.swing.JRadioButton();
        hexCheck = new javax.swing.JRadioButton();
        radialCheck = new javax.swing.JRadioButton();
        circleCheck = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Add Trasnducers");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        spaceText.setText("0.01");

        jLabel5.setText("Separation:");

        jLabel1.setText("Columns:");

        okButton.setText("Add Transducers");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        colSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        jLabel2.setText("Rows:");

        rowSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        jLabel3.setText("Position:");

        posText.setText("0.00 0.00 0.00");

        jLabel4.setText("Rotation");

        rotText.setText("0.00 0.00 0.00");

        jLabel6.setText("Size:");

        sizeText.setText("0.01 0.003 0.01");

        jLabel7.setText("Aperture (diam):");

        wText.setText("0.009");

        pText.setText("2.4");

        jLabel9.setText("Freq:");

        freqText.setText("40000");

        jLabel10.setText("Phase:");

        phaseText.setText("0");

        arrangementGroup.add(gridCheck);
        gridCheck.setSelected(true);
        gridCheck.setText("grid");

        arrangementGroup.add(hexCheck);
        hexCheck.setText("hex");

        arrangementGroup.add(radialCheck);
        radialCheck.setText("radial");

        arrangementGroup.add(circleCheck);
        circleCheck.setText("circle");

        jLabel11.setText("Power:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(posText)
                            .addComponent(rotText)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(freqText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pText))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phaseText))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sizeText))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(colSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rowSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gridCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hexCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radialCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(circleCheck))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spaceText, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(okButton))
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(colSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(rowSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gridCheck)
                    .addComponent(hexCheck)
                    .addComponent(radialCheck)
                    .addComponent(circleCheck))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(posText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(freqText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(pText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(wText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(phaseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sizeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spaceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(okButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    void importArray() {
        //x,y,z,nx,ny,nz,power,frequency,apperture,Type(0=circle,1=square),sx,sy,sz,phase
	
        String file = FileUtils.selectFile(this, "open", ".csv", null);
        if (file != null){
            try {
                String[] lines = FileUtils.getLinesFromFile( new File(file) );
                
                for(String l : lines){
                    String[] s = l.trim().split(",");
                    final int len = s.length;
                    
                    if (len >= 3){
                        Transducer t = createTransducer();

                        t.getTransform().getTranslation().parse(s[0], s[2], s[1]).multLocal(1, -1, 1);
                        
                        if (len >= 6){
                            final Vector3f normal = new Vector3f(s[3], s[5], s[4]).multLocal(1, -1, 1);
                            t.getTransform().getRotation().lookAt(normal, Vector3f.UNIT_Y);
                        }
                        if (len >= 9){
                            t.setPower( Parse.toFloat( s[6]) );
                            t.setFrequency(Parse.toFloat( s[7]) );
                            t.setApperture(Parse.toFloat( s[8]) );
                        }
                        if (len >= 14){
                            t.setType(Parse.toInt( s[9] ) );

                            t.getTransform().getScale().parse( s[10], s[12], s[11]).multLocal(1, -1, 1);

                            t.setPhase(Parse.toFloat(  s[13] ) / M.PI );
                        }
                        
                        mf.scene.getEntities().add(t);
                        mf.simulation.transducers.add(t);
                        mf.simulation.addTransToAnimationsKeys(t);
                    }  
                }
                
            } catch (IOException ex) {
                Logger.getLogger(AddTransducersForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        mf.needUpdate();
    }

    void exportArray() {
        String file = FileUtils.selectNonExistingFile(this, ".csv");
        if (file != null){
            
            StringBuilder sb = new StringBuilder();
            
            //x,y,z,nx,ny,nz,power,frequency,apperture,Type(0=circle,1=square),sx,sy,sz,phase
            for(Transducer t : mf.simulation.transducers){
                final Vector3f pos = t.getTransform().getTranslation();
                final Vector3f n = t.getTransform().getRotation().mult( Vector3f.UNIT_Y ).normalizeLocal();
                final Vector3f scale = t.getTransform().getScale();
                
                sb.append(pos.x + "," + (-pos.z) + "," + pos.y + ",");
                sb.append(n.x + "," + (-n.z) + "," + n.y + ",");
                
                sb.append(t.getPower() + ",");
                sb.append(t.getFrequency()+ ",");
                sb.append(t.getApperture()+ ",");
                sb.append(t.getType()+ ",");
                sb.append(scale.x + "," + scale.z + "," + scale.y + ",");
                sb.append(t.getPhase() * M.PI + "\n");
                
            }
                    
                    
            try {
                FileUtils.writeBytesInFile( file, sb.toString() );
            } catch (IOException ex) {
                Logger.getLogger(AddTransducersForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    void exportTransducersMatlab() {
        StringBuilder sb = new StringBuilder();

        sb.append("function field = Field_vortex(x,y,z,k)\n");
        sb.append("field = ...\n");
       
        //sPos, tPos, normal, amp, phase, aperture, k
        for (Transducer t : mf.simulation.transducers) {
            final Vector3f pos = t.getTransform().getTranslation();
            final Vector3f n = t.getTransform().getRotation().mult(Vector3f.UNIT_Y).normalizeLocal();
          
            sb.append("pistonModel([x y z],");
            sb.append("[" + pos.x + " " + (-pos.z) + " " + pos.y + "],");
            sb.append("[" + n.x + " " + (-n.z) + " " + n.y + "],");
            sb.append( t.getpAmplitude() + ",");
            sb.append( t.getPhase() * M.PI + ",");
            sb.append( t.getApperture()+ ",");
            sb.append( "k) + ...\n" );
        }
        sb.append("0;\n");
        sb.append("end\n");
        
        /*
        sb.append("function field = Field_vortex(x,y,z,k)\n");
        sb.append("field = ...\n");
       
        //sPos, tPos, normal, amp, phase, aperture, k
        for (Transducer t : mf.simulation.transducers) {
            final Vector3f pos = t.getTransform().getTranslation();
            final Vector3f n = t.getTransform().getRotation().mult(Vector3f.UNIT_Y).normalizeLocal();
          
            sb.append("pistonModel([x y z],");
            sb.append("[" + pos.x + " " + (-pos.z) + " " + pos.y + "],");
            sb.append("[" + n.x + " " + (-n.z) + " " + n.y + "],");
            sb.append( t.getpAmplitude() + ",");
            sb.append( t.getPhase() * M.PI + ",");
            sb.append( t.getApperture()+ ",");
            sb.append( "k) + ...\n" );
        }
        sb.append("0;\n");
        sb.append("end\n");
*/
        TextFrame.showText("Matlab field", sb.toString(), this);
        
//    function field = pistonModel(sPos, tPos, normal, amp, phase, aperture, k)
//    [l,c] = size(ones(size(sPos,1), size(sPos,2)/3));
//    sPos = [reshape(sPos(:,1:size(sPos,2)/3),l*c,1) ...
//        reshape(sPos(:,size(sPos,2)/3+1:2*size(sPos,2)/3),l*c,1) ...
//        reshape(sPos(:,2*size(sPos,2)/3+1:end),l*c,1)];
//    tOne = ones(l*c,1); tPos = [tPos(1)*tOne tPos(2)*tOne tPos(3)*tOne];
//    diff = tPos - sPos;
//    nd = sqrt(dot(diff, diff, 2));
//    normal = [normal(1)*tOne normal(2)*tOne normal(3)*tOne];
//    nn = sqrt(dot(normal, normal, 2));
//    angle = acos(dot(diff, normal, 2) ./ nd ./ nn);
//    dum = aperture * k * sin(angle);
//    dir =  besselj(1, dum) ./ dum;
//    field =  amp ./ nd .* exp(1i * (k*nd + phase)) .* dir;
//    field = reshape(field,l,c);
//end

    }
    
    
    
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        final boolean wasEmpty = mf.simulation.getTransducers().isEmpty();
        
        if (gridCheck.isSelected() || hexCheck.isSelected()){
            gridOrHexArrangement();
        }else if( radialCheck.isSelected() ){
            radialArrangement();
        }else if (circleCheck.isSelected()){
            simpleCircleArrangement();
        }
        
        if( wasEmpty ){
            mf.updateBoundaries();
            mf.adjustGUIGainAndCameras();
        }
        mf.needUpdate();
        
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setVisible( false );
    }//GEN-LAST:event_formWindowClosing

    private void radialArrangement() throws NumberFormatException {
        final int nPerCircle = (Integer)colSpinner.getValue();
        final int nPerRow = (Integer)rowSpinner.getValue();
        final float space = Float.parseFloat( spaceText.getText() );
        
        final Vector3f pos = new Vector3f().parse( posText.getText() );
        final Vector3f rot = new Vector3f().parse( rotText.getText() ).multLocal(M.PI / 180.0f);
        
        
        Quaternion q = new Quaternion().fromAngles(rot.x, rot.y, rot.z);
        Transform tr = new Transform(pos, q);
        
        final float angle = M.TWO_PI / nPerCircle;
        final float initRadious = space/2.0f * (1.0f / M.sin( angle / 2));
        
        for (int c = 0; c < nPerCircle; ++c){
            for(int r = 0; r < nPerRow; ++r){
                final float cAngle = angle * c;
                final float distance = initRadious + r*space;
                
                Transducer t = createTransducer();
                
                t.getTransform().setTranslation(M.cos(cAngle) * distance, 0 , M.sin(cAngle) * distance );
                tr.transformPoint( t.getTransform().getTranslation() , t.getTransform().getTranslation());
                t.getTransform().getRotation().set( q );
                
                addTransducer(t);
            }
        }
    }
    
    private void simpleCircleArrangement() throws NumberFormatException {
        final int nTransducers = (Integer)colSpinner.getValue();    
        final float space = Float.parseFloat( spaceText.getText() );
        final float radious = (Integer)rowSpinner.getValue() * space;
        
        final Vector3f pos = new Vector3f().parse( posText.getText() );
        final Vector3f rot = new Vector3f().parse( rotText.getText() ).multLocal(M.PI / 180.0f);
        
        Quaternion q = new Quaternion().fromAngles(rot.x, rot.y, rot.z);
        Transform tr = new Transform(pos, q);
        
        final float angle = M.TWO_PI / nTransducers;
        
        for (int c = 0; c < nTransducers; ++c){
                final float cAngle = angle * c;
                
                Transducer t = createTransducer();
                
                t.getTransform().setTranslation(M.cos(cAngle) * radious, 0 , M.sin(cAngle) * radious );
                
                tr.transformPoint( t.getTransform().getTranslation() , t.getTransform().getTranslation());
                t.getTransform().getRotation().set( q );
                
                addTransducer(t);
        }
    }
    
    private void gridOrHexArrangement() {
        final int columns = (Integer)colSpinner.getValue();
        final int row = (Integer)rowSpinner.getValue();
        final float space = Float.parseFloat( spaceText.getText() );
        final float sqrt3Half = M.sqrt(3.0f) / 2.0f;
        final float spaceOdd = space * sqrt3Half;
        final Vector3f pos = new Vector3f().parse( posText.getText() );
        final Vector3f rot = new Vector3f().parse( rotText.getText() ).multLocal(M.PI / 180.0f);
        
        boolean isHex = hexCheck.isSelected();
        
        Quaternion q = new Quaternion().fromAngles(rot.x, rot.y, rot.z);
        Transform tr = new Transform(pos, q);
        
        float cp = (columns-1) * space / 2.0f;
        for (int c = 0; c < columns; ++c){
            float cr = (row-1) * (isHex ? spaceOdd : space) / 2.0f;
            for(int r = 0; r < row; ++r){
                
                float actualCp = cp;
                if (isHex && r % 2 == 1){
                    actualCp -= space/2.0f;
                }
                Transducer t = createTransducer();
                
                t.getTransform().setTranslation( actualCp, 0 , cr );
                tr.transformPoint( t.getTransform().getTranslation() , t.getTransform().getTranslation());
                t.getTransform().getRotation().set( q );
                
                addTransducer(t);
                
                cr -= (isHex ? spaceOdd : space);
            }
            cp -= space;
        }
    }
    
    public void addTinyLevArrangement(final float radious, final float spread){
        
        /*
        for (int c = 0; c < nTransducers; ++c){
                final float cAngle = angle * c;
                
                Transducer t = createTransducer();
                
                t.getTransform().setTranslation(M.cos(cAngle) * radious, 0 , M.sin(cAngle) * radious );
                
                tr.transformPoint( t.getTransform().getTranslation() , t.getTransform().getTranslation());
                t.getTransform().getRotation().set( q );
                
                addTransducer(t);
        }*/
    }
    
    public void addTransducer(final Transducer t){
        mf.simulation.transducers.add(t);
        mf.scene.getEntities().add(t);
        mf.simulation.addTransToAnimationsKeys(t);
    }

    public Transducer createTransducer() {
        final float freq = Float.parseFloat(freqText.getText());
        final float apperture = Float.parseFloat(wText.getText());
        final float power = Float.parseFloat(pText.getText());
        final float phase = Float.parseFloat(phaseText.getText());
        
        final Vector3f size = new Vector3f().parse( sizeText.getText() );
        
        Transducer t = new Transducer();
        int tNumber = simulation.getTransducers().size();
        String name = "t" + tNumber;
        t.name = name;

        t.getTransform().setScale( size );
        t.apperture = apperture;
        t.amplitude = 1;
        t.phase = phase * M.PI;
        t.frequency = freq;
        t.power = power;
        t.setTag(Entity.TAG_TRANSDUCER);

        return t;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup arrangementGroup;
    private javax.swing.JRadioButton circleCheck;
    private javax.swing.JSpinner colSpinner;
    private javax.swing.JTextField freqText;
    private javax.swing.JRadioButton gridCheck;
    private javax.swing.JRadioButton hexCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField pText;
    private javax.swing.JTextField phaseText;
    private javax.swing.JTextField posText;
    private javax.swing.JRadioButton radialCheck;
    private javax.swing.JTextField rotText;
    private javax.swing.JSpinner rowSpinner;
    private javax.swing.JTextField sizeText;
    private javax.swing.JTextField spaceText;
    private javax.swing.JTextField wText;
    // End of variables declaration//GEN-END:variables

    
}
